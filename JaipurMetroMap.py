# jaipur_metro_map.py

from metro_map import MetroMap

class JaipurMetroMap(MetroMap):
    def __init__(self):
        super().__init__()
        self.city = "Jaipur"

        self.create_path("nullMansarovar", "Mansarovar", "pink", 0)
        self.create_path("Mansarovar", "New Aatish Market", "pink", 1)
        self.create_path("New Aatish Market", "Vivek Vihar", "pink", 2)
        self.create_path("Vivek Vihar", "Shyam Nagar", "pink", 3)
        self.create_path("Shyam Nagar", "Ram Nagar", "pink", 2)
        self.create_path("Ram Nagar", "Civil Lines", "pink", 3)
        self.create_path("Civil Lines", "Sindhi Camp", "pink", 1)
        self.create_path("Sindhi Camp", "Chandpole", "pink", 2)
        self.create_path("Chandpole", "Gangauri Bazaar", "pink", 1)
        self.create_path("Gangauri Bazaar", "Hawa Mahal", "pink", 1)
        self.create_path("Hawa Mahal", "Tripolia Bazaar", "pink", 2)
        self.create_path("Tripolia Bazaar", "Badi Chaupar", "pink", 1)
        self.create_path("Badi Chaupar", "Choti Chaupar", "pink", 2)
        self.create_path("Choti Chaupar", "Ramganj", "pink", 1)
        self.create_path("Ramganj", "Ghat Gate", "pink", 2)
        self.create_path("Ghat Gate", "Moti Dungri", "pink", 1)
        self.create_path("Moti Dungri", "Rambagh", "pink", 1)
        self.create_path("Rambagh", "SJ Public School", "pink", 1)
        self.create_path("SJ Public School", "Tonk Phatak", "pink", 2)
        self.create_path("Tonk Phatak", "Gandhinagar Mod", "pink", 1)
        self.create_path("Gandhinagar Mod", "Durgapura", "pink", 1)
        self.create_path("Durgapura", "Mahaveer Nagar", "pink", 2)
        self.create_path("Mahaveer Nagar", "Gopalpura", "pink", 1)
        self.create_path("Gopalpura", "NRI Circle", "pink", 1)
        self.create_path("NRI Circle", "World Trade Park", "pink", 1)
        self.create_path("World Trade Park", "Ep", "pink", 1)
        self.create_path("Ep", "Sitapura", "pink", 2)
        self.create_path("Sitapura", "nullSitapura", "pink", 0)

        self.create_path("nullBadi Chaupar", "Badi Chaupar", "blue", 0)
        self.create_path("Badi Chaupar", "Chandpole", "blue", 3)
        self.create_path("Chandpole", "Ramganj", "blue", 2)
        self.create_path("Ramganj", "Sindhi Camp", "blue", 3)
        self.create_path("Sindhi Camp", "Civil Lines", "blue", 1)
        self.create_path("Civil Lines", "Railway Station", "blue", 2)
        self.create_path("Railway Station", "Ram Nagar", "blue", 1)
        self.create_path("Ram Nagar", "Dadi ka Phatak", "blue", 2)
        self.create_path("Dadi ka Phatak", "Sikar Road", "blue", 1)
        self.create_path("Sikar Road", "Vishwakarma", "blue", 1)
        self.create_path("Vishwakarma", "New Atish Market", "blue", 1)
        self.create_path("New Atish Market", "nullNew Atish Market", "blue", 1)

        self.set_platforms()
