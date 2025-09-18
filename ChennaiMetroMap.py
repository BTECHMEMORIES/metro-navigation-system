package dsa.project.maps;

import dsa.project.functionality.MetroMap;

public class ChennaiMetroMap extends MetroMap {

    public ChennaiMetroMap() {
    	
    	city = "Chennai";
        // Blue Line
    	CreatePath("nullAirport", "Airport", "blue", 0);
        CreatePath("Airport", "Meenambakkam", "blue", 1);
        CreatePath("Meenambakkam", "Guindy", "blue", 2);
        CreatePath("Guindy", "Little Mount", "blue", 3);
        CreatePath("Little Mount", "Alandur", "blue", 2);
        CreatePath("Alandur", "Nandanam", "blue", 3);
        CreatePath("Nandanam", "Saidapet", "blue", 1);
        CreatePath("Saidapet", "Guindy", "blue", 2);
        CreatePath("Guindy", "Ekkatuthangal", "blue", 1);
        CreatePath("Ekkatuthangal", "Ashok Nagar", "blue", 1);
        CreatePath("Ashok Nagar", "Vadapalani", "blue", 2);
        CreatePath("Vadapalani", "Koyambedu", "blue", 1);
        CreatePath("Koyambedu", "CMBT", "blue", 2);
        CreatePath("CMBT", "Thirumangalam", "blue", 3);
        CreatePath("Thirumangalam", "Anna Nagar Tower", "blue", 2);
        CreatePath("Anna Nagar Tower", "Anna Nagar East", "blue", 1);
        CreatePath("Anna Nagar East", "Anna Nagar West", "blue", 2);
        CreatePath("Anna Nagar West", "Chennai Central", "blue", 1);
        CreatePath("Chennai Central", "Egmore", "blue", 1);
        CreatePath("Egmore", "Chetpet", "blue", 1);
        CreatePath("Chetpet", "Nungambakkam", "blue", 2);
        CreatePath("Nungambakkam", "Kodambakkam", "blue", 1);
        CreatePath("Kodambakkam", "Mambalam", "blue", 2);
        CreatePath("Mambalam", "Saidapet", "blue", 3);
        CreatePath("Saidapet", "Saidapet West", "blue", 1); // Additional station
        CreatePath("Saidapet West", "Guindy", "blue", 1); // Additional station
        CreatePath("Guindy", "Guindy Industrial Estate", "blue", 1); // Additional station
        CreatePath("Guindy Industrial Estate", "Thillai Ganga Nagar", "blue", 1); // Additional station
        CreatePath("Thillai Ganga Nagar", "nullThillai Ganga Nagar", "blue", 0);
        
        // Green Line
        CreatePath("nullSt Thomas Mount", "St Thomas Mount", "green", 0);
        CreatePath("St Thomas Mount", "Guindy", "green", 1);
        CreatePath("Guindy", "Adambakkam", "green", 2);
        CreatePath("Adambakkam", "Nanganallur Road", "green", 1);
        CreatePath("Nanganallur Road", "Meenambakkam", "green", 1);
        CreatePath("Meenambakkam", "Chromepet", "green", 2);
        CreatePath("Chromepet", "Tambaram Sanatorium", "green", 1);
        CreatePath("Tambaram Sanatorium", "Tambaram", "green", 2);
        CreatePath("Tambaram", "Perungalathur", "green", 1);
        CreatePath("Perungalathur", "Vandalur", "green", 2);
        CreatePath("Vandalur", "Guduvancheri", "green", 1);
        CreatePath("Guduvancheri", "Urapakkam", "green", 2);
        CreatePath("Urapakkam", "Vandalur", "green", 3);
        CreatePath("Vandalur", "Kattankulathur", "green", 1); // Additional station
        CreatePath("Kattankulathur", "Potheri", "green", 2); // Additional station
        CreatePath("Potheri", "nullPotheri", "green", 0);
        
        // Orange Line
        CreatePath("nullChennai Central", "Chennai Central", "orange", 0);
        CreatePath("Chennai Central", "Park Town", "orange", 1);
        CreatePath("Park Town", "Government Estate", "orange", 1);
        CreatePath("Government Estate", "Washermanpet", "orange", 2);
        CreatePath("Washermanpet", "Mannadi", "orange", 1);
        CreatePath("Mannadi", "High Court", "orange", 1);
        CreatePath("High Court", "Chennai Fort", "orange", 1);
        CreatePath("Chennai Fort", "Beach", "orange", 1);
        CreatePath("Beach", "Thiruvallikeni", "orange", 2);
        CreatePath("Thiruvallikeni", "Chepauk", "orange", 1);
        CreatePath("Chepauk", "Mundakanni Amman Koil", "orange", 1);
        CreatePath("Mundakanni Amman Koil", "Mandaveli", "orange", 2);
        CreatePath("Mandaveli", "Greenways Road", "orange", 1);
        CreatePath("Greenways Road", "Kotturpuram", "orange", 2);
        CreatePath("Kotturpuram", "Adyar", "orange", 1);
        CreatePath("Adyar", "Thiruvanmiyur", "orange", 2);
        CreatePath("Thiruvanmiyur", "Indira Nagar", "orange", 1);
        CreatePath("Indira Nagar", "Kasturba Nagar", "orange", 1);
        CreatePath("Kasturba Nagar", "Maraimalai Nagar", "orange", 2);
        CreatePath("Maraimalai Nagar", "nullMaraimalai Nagar", "orange", 2);
        
        setPlatforms();
    }
    
}
