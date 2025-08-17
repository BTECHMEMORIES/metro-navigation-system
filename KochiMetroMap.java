package dsa.project.maps;

import dsa.project.functionality.MetroMap;

public class KochiMetroMap extends MetroMap {

    public KochiMetroMap() {
    	
    	city = "Kochi";
    	
        // Blue Line
    	CreatePath("nullAluva", "Aluva", "blue", 0);
        CreatePath("Aluva", "Pulinchodu", "blue", 1);
        CreatePath("Pulinchodu", "Companypady", "blue", 2);
        CreatePath("Companypady", "Ambattukavu", "blue", 3);
        CreatePath("Ambattukavu", "Muttom", "blue", 2);
        CreatePath("Muttom", "Kalamassery", "blue", 3);
        CreatePath("Kalamassery", "Cochin University", "blue", 1);
        CreatePath("Cochin University", "Pathadipalam", "blue", 2);
        CreatePath("Pathadipalam", "Edappally", "blue", 1);
        CreatePath("Edappally", "Changampuzha Park", "blue", 1);
        CreatePath("Changampuzha Park", "Palarivattom", "blue", 2);
        CreatePath("Palarivattom", "Jawaharlal Nehru Stadium", "blue", 1);
        CreatePath("Jawaharlal Nehru Stadium", "Kaloor", "blue", 2);
        CreatePath("Kaloor", "Lissie", "blue", 1);
        CreatePath("Lissie", "MG Road", "blue", 2);
        CreatePath("MG Road", "Maharaja's College", "blue", 1);
        CreatePath("Maharaja's College", "Ernakulam South", "blue", 1);
        CreatePath("Ernakulam South", "Kadavanthra", "blue", 1);
        CreatePath("Kadavanthra", "Elamkulam", "blue", 2);
        CreatePath("Elamkulam", "Vyttila", "blue", 1);
        CreatePath("Vyttila", "Thaikoodam", "blue", 1);
        CreatePath("Thaikoodam", "Petta", "blue", 2);
        CreatePath("Petta", "Kakkanad", "blue", 1);
        CreatePath("Kakkanad", "JLN Stadium", "blue", 1);
        CreatePath("JLN Stadium", "Infopark", "blue", 1);
        CreatePath("Infopark", "Technocity", "blue", 1);
        CreatePath("Technocity", "Kinfra", "blue", 1);
        CreatePath("Kinfra", "Cusat", "blue", 2);
        CreatePath("Cusat", "Pathadipalam", "blue", 3); 
        CreatePath("Pathadipalam", "nullPathadipalam", "blue", 0);// Additional station

        // Purple Line
        CreatePath("nullJawaharlal Nehru Stadium", "Jawaharlal Nehru Stadium", "purple", 0);
        CreatePath("Jawaharlal Nehru Stadium", "Kaloor", "purple", 3);
        CreatePath("Kaloor", "Kadavanthra", "purple", 2);
        CreatePath("Kadavanthra", "Ernakulam South", "purple", 3);
        CreatePath("Ernakulam South", "Kochi Marina", "purple", 2);
        CreatePath("Kochi Marina", "Thevara", "purple", 3);
        CreatePath("Thevara", "Kundannoor", "purple", 1);
        CreatePath("Kundannoor", "Pettah", "purple", 2);
        CreatePath("Pettah", "Kacheripady", "purple", 1);
        CreatePath("Kacheripady", "Changampuzha Park", "purple", 2); // Additional station
        CreatePath("Changampuzha Park", "Palarivattom", "purple", 3);
        CreatePath("Palarivattom", "nullPalarivattom", "purple", 0);// Additional station

        setPlatforms();
    }
}
