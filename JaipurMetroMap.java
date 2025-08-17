package dsa.project.maps;

import dsa.project.functionality.MetroMap;

public class JaipurMetroMap extends MetroMap {

    public JaipurMetroMap() {
    	
    	city = "JaiPur";
    	
        // Pink Line
    	CreatePath("nullMansarovar", "Mansarovar", "pink", 0);
        CreatePath("Mansarovar", "New Aatish Market", "pink", 1);
        CreatePath("New Aatish Market", "Vivek Vihar", "pink", 2);
        CreatePath("Vivek Vihar", "Shyam Nagar", "pink", 3);
        CreatePath("Shyam Nagar", "Ram Nagar", "pink", 2);
        CreatePath("Ram Nagar", "Civil Lines", "pink", 3);
        CreatePath("Civil Lines", "Sindhi Camp", "pink", 1);
        CreatePath("Sindhi Camp", "Chandpole", "pink", 2);
        CreatePath("Chandpole", "Gangauri Bazaar", "pink", 1);
        CreatePath("Gangauri Bazaar", "Hawa Mahal", "pink", 1);
        CreatePath("Hawa Mahal", "Tripolia Bazaar", "pink", 2);
        CreatePath("Tripolia Bazaar", "Badi Chaupar", "pink", 1);
        CreatePath("Badi Chaupar", "Choti Chaupar", "pink", 2);
        CreatePath("Choti Chaupar", "Ramganj", "pink", 1);
        CreatePath("Ramganj", "Ghat Gate", "pink", 2);
        CreatePath("Ghat Gate", "Moti Dungri", "pink", 1);
        CreatePath("Moti Dungri", "Rambagh", "pink", 1);
        CreatePath("Rambagh", "SJ Public School", "pink", 1);
        CreatePath("SJ Public School", "Tonk Phatak", "pink", 2);
        CreatePath("Tonk Phatak", "Gandhinagar Mod", "pink", 1);
        CreatePath("Gandhinagar Mod", "Durgapura", "pink", 1);
        CreatePath("Durgapura", "Mahaveer Nagar", "pink", 2);
        CreatePath("Mahaveer Nagar", "Gopalpura", "pink", 1);
        CreatePath("Gopalpura", "NRI Circle", "pink", 1);
        CreatePath("NRI Circle", "World Trade Park", "pink", 1);
        CreatePath("World Trade Park", "Ep", "pink", 1);
        CreatePath("Ep", "Sitapura", "pink", 2);
        CreatePath("Sitapura", "nullSitapura", "pink", 0);

        // Blue Line
        CreatePath("nullBadi Chaupar", "Badi Chaupar", "blue", 0);
        CreatePath("Badi Chaupar", "Chandpole", "blue", 3);
        CreatePath("Chandpole", "Ramganj", "blue", 2);
        CreatePath("Ramganj", "Sindhi Camp", "blue", 3);
        CreatePath("Sindhi Camp", "Civil Lines", "blue", 1);
        CreatePath("Civil Lines", "Railway Station", "blue", 2);
        CreatePath("Railway Station", "Ram Nagar", "blue", 1);
        CreatePath("Ram Nagar", "Dadi ka Phatak", "blue", 2);
        CreatePath("Dadi ka Phatak", "Sikar Road", "blue", 1);
        CreatePath("Sikar Road", "Vishwakarma", "blue", 1);
        CreatePath("Vishwakarma", "New Atish Market", "blue", 1);
        CreatePath("New Atish Market", "nullNew Atish Market", "blue", 1);
        
        setPlatforms();
    }
}