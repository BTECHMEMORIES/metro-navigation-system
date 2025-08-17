package dsa.project.functionality;

import java.util.Map;
import java.util.HashMap;

public class MetroStation {

    public Map<MetroStation, Integer> connections = new HashMap<>();
    String name;
    boolean visited;
    public HashMap <MetroStation, Integer> platforms = new HashMap<>();
    

    MetroStation(String name) {
        this.name = name;
        this.visited = false;
    }
}