package dsa.project.functionality;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import dsa.project.utility.Lodash;

public class MetroMap {
	
	Lodash ld = new Lodash();
    
    public String city;
    
    public HashMap<String, MetroStation> allStations = new HashMap<>();
    public HashMap<String, List<MetroStation>> lines = new HashMap<>();
    
    public MetroStation createStation(String name) {
        if (allStations.containsKey(name)) {
            return allStations.get(name);
        }
        MetroStation station = new MetroStation(name);
        allStations.put(name, station);
        return station;
    }

    public void CreatePath(String s1, String s2, String line, int distance) {
    	
    	s1 = ld.toLodash(s1);
    	s2 = ld.toLodash(s2);
    	
    	line = ld.toLodash(line);
    	
        MetroStation st1 = createStation(s1);
        MetroStation st2 = createStation(s2);
        
        st1.connections.put(st2,distance);
        st2.connections.put(st1,distance);
        
        if(!lines.keySet().contains(line)) {
        	lines.put(line, new ArrayList());
        	lines.get(line).add(st1);
        	lines.get(line).add(st2);
        	return;
        }
        
        if(!lines.get(line).contains(st1)) {
        	lines.get(line).add(st1);
        }
        
        if(!lines.get(line).contains(st2)) {
        	lines.get(line).add(st2);
        }
        
    }
    
    public List<MetroStation> path(MetroStation start, MetroStation end) {
    	
        List<MetroStation> visited = new ArrayList<>();
        HashMap<MetroStation, Integer> distance = new HashMap<>();
        HashMap<MetroStation, MetroStation> previous = new HashMap<>();
        

        for (MetroStation station : allStations.values()) {
            distance.put(station, Integer.MAX_VALUE);
            previous.put(station, null);
        }

        distance.put(start, 0);

        while (!visited.contains(end)) {
            MetroStation current = null;
            int minDistance = Integer.MAX_VALUE;
            
            for (MetroStation station : allStations.values()) {
                if (!visited.contains(station) && distance.get(station) < minDistance) {
                    minDistance = distance.get(station);
                    current = station;
                }
            }

            if (current == null) {
                return null;
            }

            visited.add(current);

            for (MetroStation neighbor : current.connections.keySet()) {
                if (!visited.contains(neighbor)) {
                    int newDistance = distance.get(current) + current.connections.get(neighbor);
                    if (newDistance < distance.get(neighbor)) {
                        distance.put(neighbor, newDistance);
                        previous.put(neighbor, current);
                    }
                }
            }
        }

        List<MetroStation> shortestPath = new ArrayList<>();
        MetroStation tempSt = end;
        
        while (tempSt != null) {
            shortestPath.add(0, tempSt);
            tempSt = previous.get(tempSt);
        }

        return shortestPath;
    }

    
    public List<MetroStation> path(String start, String end) {
    	
    	start = ld.toLodash(start);
    	end = ld.toLodash(end);
    	
        List<MetroStation> shPath = path(allStations.get(start), allStations.get(end));
        System.out.println(pathInfo(shPath));
        return shPath;
    }
    
    public String getLine(MetroStation st1, MetroStation st2) {
    	
    	for(String line : lines.keySet()) {
    		if(lines.get(line).contains(st1) && lines.get(line).contains(st2))
    			return line;
    	}
    	return null;
    	
    }
    
    public String pathInfo(List<MetroStation> shortestPath) {
    	
    	String info = "\n";
		
    	if(shortestPath.size() == 1) {
    		
    		info += "Same station";
    		return info;
    	}
    	else {
    		
    		info += " " + ld.toNormal(shortestPath.get(0).name) + " (platform : " + shortestPath.get(0).platforms.get(shortestPath.get(1)) + ")";
    		info += "\n |\n | " + ld.toNormal(getLine(shortestPath.get(0), shortestPath.get(1))) +" Line\n | \n\\/";
    		
    		for(int i = 0; i < shortestPath.size(); i++) {
    			
    			MetroStation prev = null, next = null;
    			
    			if(i - 1 >= 0) {
    				prev = shortestPath.get(i - 1);
    			}
    			
    			if(i + 1 < shortestPath.size()) {
    				next = shortestPath.get(i + 1);
    			}
    			
    			if(shortestPath.get(i).connections.keySet().size() > 2) {
            		
            		if(getLine(prev, shortestPath.get(i)) == null) {
            			continue;
            		}
            		else if(getLine(shortestPath.get(i), next) == null) {
            			continue;
            		}
            		else if(!(getLine(prev, shortestPath.get(i)).equals(getLine(next, shortestPath.get(i))))){
            			
            			info += "\n " + ld.toNormal(shortestPath.get(i).name) ;
            			
            			info += "\n\n " + ld.toNormal(shortestPath.get(i).name) + " (platform : " + shortestPath.get(i).platforms.get(shortestPath.get(i + 1)) + ")";
            			
            			info += "\n |\n | " + ld.toNormal(getLine(shortestPath.get(i), next)) +" Line\n | \n\\/";
            			
            		}
            		
            	}
    			
    		}
    		
    		info += "\n " + ld.toNormal(shortestPath.get(shortestPath.size() - 1).name);
    		
    		info += "\n\n Total Distance : " + distanceCovered(shortestPath) + "KM";
    		
    	}
    	
    	return info;
    	
    }
    
    public void setPlatforms() {
    	HashMap<String, List<MetroStation>> statPlat = lines;
    	
    	for(String lin : statPlat.keySet()) {
    		
    		List<MetroStation> stations = lines.get(lin);
    		
    		for(int i = 0; i < stations.size(); i++) {
    			
    			if(i + 1 < stations.size()) {
    				
    				stations.get(i).platforms.put(stations.get(i + 1), (stations.get(i).platforms.size()) + 1);
    				
    			}
    			
    		}
    		
    		for(int i = stations.size()-1; i >= 0; i--) {
    			
    			if(i - 1 >= 0 ) {
    				
    				stations.get(i).platforms.put(stations.get(i - 1), (stations.get(i).platforms.size()) + 1);
    			}
    		}
    	}
    	
    }
    
    public int distanceCovered(List<MetroStation> path) {
    
    	int distance = 0;
    	for(int i = 0; i < path.size(); i++) {
    		
    		if(i + 1 < path.size()) {
    			distance += path.get(i).connections.get(path.get(i+1));
    		}
    	}
    	
    	return distance;
    	
    }
    
    public static void main(String args[]) {
        MetroMap metroMap = new MetroMap();
        
        metroMap.city = "Test";
        
        metroMap.CreatePath("nullA", "A", "red", 0);
        metroMap.CreatePath("A", "B", "red", 2);
        metroMap.CreatePath("B", "C", "red", 3);
        metroMap.CreatePath("C", "D", "red", 1);
        metroMap.CreatePath("D", "E", "red", 2);
        metroMap.CreatePath("E", "F", "red", 1);
        metroMap.CreatePath("F", "nullF", "red", 0);
        metroMap.CreatePath("nullE", "E", "yellow", 0);
        metroMap.CreatePath("E", "K", "yellow", 1);
        metroMap.CreatePath("K", "L", "yellow", 3);
        metroMap.CreatePath("L", "M", "yellow", 2);
        metroMap.CreatePath("M", "N", "yellow", 1);
        metroMap.CreatePath("N", "nullN", "yellow", 0);
        metroMap.CreatePath("nullC", "C", "green", 0);
        metroMap.CreatePath("C", "G", "green", 2);
        metroMap.CreatePath("G", "H", "green", 1);
        metroMap.CreatePath("H", "I", "green", 3);
        metroMap.CreatePath("I", "J", "green", 4);
        metroMap.CreatePath("J", "nullJ", "green", 0);
        metroMap.CreatePath("nullG", "G", "blue", 0);
        metroMap.CreatePath("G", "P", "blue", 5);
        metroMap.CreatePath("P", "O", "blue", 4);
        metroMap.CreatePath("O", "nullO", "blue", 0);
        metroMap.setPlatforms();
        
        System.out.println("\nDijkstra's Shortest Path from A to L:");
        List<MetroStation> shortestPath = metroMap.path("A", "O");
        
    }
}
