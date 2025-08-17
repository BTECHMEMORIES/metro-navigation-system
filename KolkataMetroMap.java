package dsa.project.maps;

import dsa.project.functionality.MetroMap;

public class KolkataMetroMap extends MetroMap {

    public KolkataMetroMap() {
    	
    	city = "Kolkata";
    	
        // North-South Line
    	CreatePath("nullDumdum", "Dumdum", "blue", 0);
        CreatePath("Dumdum", "Belgachia", "blue", 3);
        CreatePath("Belgachia", "Shyambazar", "blue", 2);
        CreatePath("Shyambazar", "Esplanade", "blue", 3);
        CreatePath("Esplanade", "Park Street", "blue", 2);
        CreatePath("Park Street", "Maidan", "blue", 3);
        CreatePath("Maidan", "Rabindra Sadan", "blue", 1);
        CreatePath("Rabindra Sadan", "Kalighat", "blue", 2);
        CreatePath("Kalighat", "Netaji Bhavan", "blue", 1);
        CreatePath("Netaji Bhavan", "Jatin Das Park", "blue", 1);
        CreatePath("Jatin Das Park", "Rabindra Sarobar", "blue", 2);
        CreatePath("Rabindra Sarobar", "Tollygunge", "blue", 1); // Additional station
        CreatePath("Tollygunge", "nullTollygunge", "blue", 0);
        
        // East-West Line
        CreatePath("nullSalt Lake Sector 5", "Salt Lake Sector 5", "green", 0);
        CreatePath("Salt Lake Sector 5", "Karunamoyee", "green", 1);
        CreatePath("Karunamoyee", "Central Park", "green", 2);
        CreatePath("Central Park", "City Centre", "green", 1);
        CreatePath("City Centre", "Bidhannagar", "green", 1);
        CreatePath("Bidhannagar", "Nicco Park", "green", 1);
        CreatePath("Nicco Park", "Salt Lake Stadium", "green", 1);
        CreatePath("Salt Lake Stadium", "Phoolbagan", "green", 1);
        CreatePath("Phoolbagan", "Sealdah", "green", 2);
        CreatePath("Sealdah", "Esplanade", "green", 2);
        CreatePath("Esplanade", "Chandni Chowk", "green", 1);
        CreatePath("Chandni Chowk", "nullChandni Chowk", "green", 0);

        // Circular Line
        CreatePath("nullMahanayak Uttam Kumar", "Mahanayak Uttam Kumar", "orange", 0);
        CreatePath("Mahanayak Uttam Kumar", "Tollygunge", "orange", 1);
        CreatePath("Tollygunge", "New Alipore", "orange", 2);
        CreatePath("New Alipore", "Rabindra Sarobar", "orange", 2);
        CreatePath("Rabindra Sarobar", "Kalighat", "orange", 1);
        CreatePath("Kalighat", "Jatin Das Park", "orange", 1);
        CreatePath("Jatin Das Park", "Netaji Bhavan", "orange", 2);
        CreatePath("Netaji Bhavan", "Maidan", "orange", 2);
        CreatePath("Maidan", "Park Street", "orange", 1);
        CreatePath("Park Street", "Esplanade", "orange", 1);
        CreatePath("Esplanade", "Sealdah", "orange", 2);
        CreatePath("Sealdah", "Phoolbagan", "orange", 1);
        CreatePath("Phoolbagan", "Salt Lake Stadium", "orange", 1);
        CreatePath("Salt Lake Stadium", "Karunamoyee", "orange", 2);
        CreatePath("Karunamoyee", "Salt Lake Sector 5", "orange", 1);
        CreatePath("Salt Lake Sector 5", "Kolkata International Airport", "orange", 2); 
        CreatePath("Kolkata International Airport", "nullKolkata International Airport", "orange", 2);// Additional station

        setPlatforms();
    }
}