package dsa.project.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import dsa.project.functionality.MetroMap;
import dsa.project.maps.*;

public class DispStat {
    
    Lodash ld = new Lodash();
    
    ArrayList<ArrayList<String>> dispList(List<String> allStations) {
        ArrayList<ArrayList<String>> dispList = new ArrayList<>();
        ArrayList<String> stats = new ArrayList<>();

        List<String> allStat = new ArrayList<>(allStations);
        Collections.sort(allStat);

        char chr = '@';

        for (String stat : allStat) {
            if (stat.charAt(0) == chr) {
                stats.add(stat);
            } else {
                dispList.add(new ArrayList<>(stats));
                stats.clear();
                stats.add(stat);
                chr = stat.charAt(0);
            }
        }

        dispList.add(new ArrayList<>(stats)); 
        
        return dispList;
    }
    
    public String dispListStr(MetroMap station) {
    	
    	List<String> allStations = new ArrayList(station.allStations.keySet());
    	
    	allStations.removeIf(stat -> stat.contains("null"));
    	
    	ArrayList<ArrayList<String>> dis = dispList(allStations);
    	
    	String dispStr = "";
    	
    	for (ArrayList<String> disLis : dis) {
            for (String statLis : disLis) {
            	
                dispStr += ld.toNormal(statLis) + "  ,";
            }
            dispStr += "\n";
        }
    	
    	dispStr = dispStr.substring(0,dispStr.length()-2);
    	
    	return dispStr;
    	
    }

    public static void main(String args[]) {
        DispStat obj = new DispStat();

        ArrayList<ArrayList<String>> dis;

        System.out.print(obj.dispListStr(new HydMetroMap()));

    }
}
