

from metro_map import MetroMap


class BengaloreMetroMap(MetroMap):
    def __init__(self):
        super().__init__()
        self.city = "Bengalore"
        self.create_path("nullMysore Road", "Mysore Road", "purple", 0)
        self.create_path("Mysore Road", "Deepanjali Nagar", "purple", 2)
        self.create_path("Deepanjali Nagar", "Attiguppe", "purple", 2)
        self.create_path("Attiguppe", "Vijayanagar", "purple", 3)
        self.create_path("Vijayanagar", "Hosahalli", "purple", 2)
        self.create_path("Hosahalli", "Magadi Road", "purple", 3)
        self.create_path("Magadi Road", "Srirampura", "purple", 1)
        self.create_path("Srirampura", "Kempegowda Interchange", "purple", 2)
        self.create_path("Kempegowda Interchange", "City Railway Station", "purple", 1)
        self.create_path("City Railway Station", "Majestic", "purple", 1)
        self.create_path("Majestic", "Chickpete", "purple", 1)
        self.create_path("Chickpete", "K.R. Market", "purple", 2)
        self.create_path("K.R. Market", "National College", "purple", 1)
        self.create_path("National College", "Lalbagh", "purple", 2)
        self.create_path("Lalbagh", "South End Circle", "purple", 1)
        self.create_path("South End Circle", "Jayanagar", "purple", 1)
        self.create_path("Jayanagar", "R.V. Road", "purple", 1)
        self.create_path("R.V. Road", "Banashankari", "purple", 1)
        self.create_path("Banashankari", "Jayanagar 4th Block", "purple", 2)
        self.create_path("Jayanagar 4th Block", "Jayanagar 5th Block", "purple", 1)
        self.create_path("Jayanagar 5th Block", "Jayanagar 7th Block", "purple", 1)
        self.create_path("Jayanagar 7th Block", "Swayamabhoo Road", "purple", 2)
        self.create_path("Swayamabhoo Road", "Yelachenahalli", "purple", 1)
        self.create_path("Majestic", "Mantri Square Sampige Road", "purple", 3)  # Additional station
        self.create_path("Mantri Square Sampige Road", "Srirampura", "purple", 2)
        self.create_path("Srirampura", "nullSrirampura", "purple", 0)  # Additional station

       
        self.create_path("nullNagasandra", "Nagasandra", "green", 0)
        self.create_path("Nagasandra", "Dasarahalli", "green", 1)
        self.create_path("Dasarahalli", "Jalahalli", "green", 2)
        self.create_path("Jalahalli", "Peenya Industry", "green", 3)
        self.create_path("Peenya Industry", "Peenya", "green", 2)
        self.create_path("Peenya", "Goraguntepalya", "green", 3)
        self.create_path("Goraguntepalya", "Yeshwanthpur", "green", 1)
        self.create_path("Yeshwanthpur", "Sandal Soap Factory", "green", 2)
        self.create_path("Sandal Soap Factory", "Mahalakshmi", "green", 1)
        self.create_path("Mahalakshmi", "Rajajinagar", "green", 1)
        self.create_path("Rajajinagar", "Kuvempu Road", "green", 2)
        self.create_path("Kuvempu Road", "Srirampura", "green", 1)
        self.create_path("Srirampura", "Mantri Square Sampige Road", "green", 2)
        self.create_path("Mantri Square Sampige Road", "Malleshwaram", "green", 1)
        self.create_path("Malleshwaram", "Swami Vivekananda Road", "green", 2)
        self.create_path("Swami Vivekananda Road", "Majestic", "green", 1)
        self.create_path("Majestic", "nullMajestic", "green", 0)

    
        self.create_path("nullBaiyappanahalli", "Baiyappanahalli", "red", 0)
        self.create_path("Baiyappanahalli", "Swami Vivekananda Road", "red", 3)
        self.create_path("Swami Vivekananda Road", "Indiranagar", "red", 2)
        self.create_path("Indiranagar", "Ulsoor", "red", 1)
        self.create_path("Ulsoor", "Trinity", "red", 2)
        self.create_path("Trinity", "Mahatma Gandhi Road", "red", 1)
        self.create_path("Mahatma Gandhi Road", "Cubbon Park", "red", 1)
        self.create_path("Cubbon Park", "Vidhana Soudha", "red", 1)
        self.create_path("Vidhana Soudha", "Sir M. Visveshwaraya", "red", 2)
        self.create_path("Sir M. Visveshwaraya", "Kempegowda Interchange", "red", 1)
        self.create_path("Kempegowda Interchange", "K.R. Market", "red", 2)
        self.create_path("K.R. Market", "South End Circle", "red", 1)
        self.create_path("South End Circle", "Jayanagar", "red", 1)
        self.create_path("Jayanagar", "Puttenahalli", "red", 2)  
        self.create_path("Puttenahalli", "Yelachenahalli", "red", 1) 
        self.create_path("Yelachenahalli", "nullYelachenahalli", "red", 0)

        self.set_platforms()
