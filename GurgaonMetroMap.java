package dsa.project.maps;

import dsa.project.functionality.MetroMap;

public class GurgaonMetroMap extends MetroMap {

    public GurgaonMetroMap() {
    	
    	city = "Gurgaon";
    	
        // Yellow Line
    	CreatePath("nullHuda City Center", "Huda City Center", "yellow", 0);
        CreatePath("Huda City Center", "IFFCO Chowk", "yellow", 4);
        CreatePath("IFFCO Chowk", "MG Road", "yellow", 2);
        CreatePath("MG Road", "Sikanderpur", "yellow", 3);
        CreatePath("Sikanderpur", "Guru Dronacharya", "yellow", 2);
        CreatePath("Guru Dronacharya", "Phase 2", "yellow", 3);
        CreatePath("Phase 2", "Belvedere Towers", "yellow", 1);
        CreatePath("Belvedere Towers", "Cyber City", "yellow", 2);
        CreatePath("Cyber City", "DLF Phase 3 Rapid Metro", "yellow", 1);
        CreatePath("DLF Phase 3 Rapid Metro", "DLF Phase 2", "yellow", 1);
        CreatePath("DLF Phase 2", "DLF Phase 1", "yellow", 1);
        CreatePath("DLF Phase 1", "Sikanderpur Rapid Metro", "yellow", 2);
        CreatePath("Sikanderpur Rapid Metro", "Vodafone Belvedere Towers", "yellow", 1); // Additional station
        CreatePath("Vodafone Belvedere Towers", "IndusInd Cyber City", "yellow", 2); 
        CreatePath("IndusInd Cyber City", "nullIndusInd Cyber City", "yellow", 0);// Additional station

        // Rapid Metro Line
        CreatePath("nullSikanderpur Rapid Metro", "Sikanderpur Rapid Metro", "blue", 0);
        CreatePath("Sikanderpur Rapid Metro", "DLF Phase 2", "blue", 1);
        CreatePath("DLF Phase 2", "DLF Phase 3 Rapid Metro", "blue", 1);
        CreatePath("DLF Phase 3 Rapid Metro", "Moulsari Avenue", "blue", 1);
        CreatePath("Moulsari Avenue", "DLF Phase 5", "blue", 2);
        CreatePath("DLF Phase 5", "Sector 53-54", "blue", 1);
        CreatePath("Sector 53-54", "Sector 54 Chowk", "blue", 2);
        CreatePath("Sector 54 Chowk", "Sector 55-56", "blue", 1);
        CreatePath("Sector 55-56", "Sector 56 Rapid Metro", "blue", 1);
        CreatePath("Sector 56 Rapid Metro", "nullSector 56 Rapid Metro", "blue", 0);

        setPlatforms();
    }
}