package dsa.project.maps;

import dsa.project.functionality.MetroMap;

public class BengaloreMetroMap extends MetroMap {

    public BengaloreMetroMap() {
    	
    	city = "Bengalore";
    	
        // Purple Line
    	CreatePath("nullMysore Road", "Mysore Road", "purple", 0);
        CreatePath("Mysore Road", "Deepanjali Nagar", "purple", 2);
        CreatePath("Deepanjali Nagar", "Attiguppe", "purple", 2);
        CreatePath("Attiguppe", "Vijayanagar", "purple", 3);
        CreatePath("Vijayanagar", "Hosahalli", "purple", 2);
        CreatePath("Hosahalli", "Magadi Road", "purple", 3);
        CreatePath("Magadi Road", "Srirampura", "purple", 1);
        CreatePath("Srirampura", "Kempegowda Interchange", "purple", 2);
        CreatePath("Kempegowda Interchange", "City Railway Station", "purple", 1);
        CreatePath("City Railway Station", "Majestic", "purple", 1);
        CreatePath("Majestic", "Chickpete", "purple", 1);
        CreatePath("Chickpete", "K.R. Market", "purple", 2);
        CreatePath("K.R. Market", "National College", "purple", 1);
        CreatePath("National College", "Lalbagh", "purple", 2);
        CreatePath("Lalbagh", "South End Circle", "purple", 1);
        CreatePath("South End Circle", "Jayanagar", "purple", 1);
        CreatePath("Jayanagar", "R.V. Road", "purple", 1);
        CreatePath("R.V. Road", "Banashankari", "purple", 1);
        CreatePath("Banashankari", "Jayanagar 4th Block", "purple", 2);
        CreatePath("Jayanagar 4th Block", "Jayanagar 5th Block", "purple", 1);
        CreatePath("Jayanagar 5th Block", "Jayanagar 7th Block", "purple", 1);
        CreatePath("Jayanagar 7th Block", "Swayamabhoo Road", "purple", 2);
        CreatePath("Swayamabhoo Road", "Yelachenahalli", "purple", 1);
        CreatePath("Majestic", "Mantri Square Sampige Road", "purple", 3); // Additional station
        CreatePath("Mantri Square Sampige Road", "Srirampura", "purple", 2);
        CreatePath("Srirampura", "nullSrirampura", "purple", 0);// Additional station

        // Green Line
        CreatePath("nullNagasandra", "Nagasandra", "green", 0);
        CreatePath("Nagasandra", "Dasarahalli", "green", 1);
        CreatePath("Dasarahalli", "Jalahalli", "green", 2);
        CreatePath("Jalahalli", "Peenya Industry", "green", 3);
        CreatePath("Peenya Industry", "Peenya", "green", 2);
        CreatePath("Peenya", "Goraguntepalya", "green", 3);
        CreatePath("Goraguntepalya", "Yeshwanthpur", "green", 1);
        CreatePath("Yeshwanthpur", "Sandal Soap Factory", "green", 2);
        CreatePath("Sandal Soap Factory", "Mahalakshmi", "green", 1);
        CreatePath("Mahalakshmi", "Rajajinagar", "green", 1);
        CreatePath("Rajajinagar", "Kuvempu Road", "green", 2);
        CreatePath("Kuvempu Road", "Srirampura", "green", 1);
        CreatePath("Srirampura", "Mantri Square Sampige Road", "green", 2);
        CreatePath("Mantri Square Sampige Road", "Malleshwaram", "green", 1);
        CreatePath("Malleshwaram", "Swami Vivekananda Road", "green", 2);
        CreatePath("Swami Vivekananda Road", "Majestic", "green", 1);
        CreatePath("Majestic", "nullMajestic", "green", 0);
        // Red Line
        
        CreatePath("nullBaiyappanahalli", "Baiyappanahalli", "red", 0);
        CreatePath("Baiyappanahalli", "Swami Vivekananda Road", "red", 3);
        CreatePath("Swami Vivekananda Road", "Indiranagar", "red", 2);
        CreatePath("Indiranagar", "Ulsoor", "red", 1);
        CreatePath("Ulsoor", "Trinity", "red", 2);
        CreatePath("Trinity", "Mahatma Gandhi Road", "red", 1);
        CreatePath("Mahatma Gandhi Road", "Cubbon Park", "red", 1);
        CreatePath("Cubbon Park", "Vidhana Soudha", "red", 1);
        CreatePath("Vidhana Soudha", "Sir M. Visveshwaraya", "red", 2);
        CreatePath("Sir M. Visveshwaraya", "Kempegowda Interchange", "red", 1);
        CreatePath("Kempegowda Interchange", "K.R. Market", "red", 2);
        CreatePath("K.R. Market", "South End Circle", "red", 1);
        CreatePath("South End Circle", "Jayanagar", "red", 1);
        CreatePath("Jayanagar", "Puttenahalli", "red", 2); // Additional station
        CreatePath("Puttenahalli", "Yelachenahalli", "red", 1); // Additional station
        CreatePath("Yelachenahalli", "nullYelachenahalli", "red", 0);
        
        setPlatforms();
    }
}