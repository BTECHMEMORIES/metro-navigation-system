from metro_map import MetroMap

class GurgaonMetroMap(MetroMap):
    def __init__(self):
        super().__init__()
        self.city = "Gurgaon"

        self.create_path("nullHuda City Center", "Huda City Center", "yellow", 0)
        self.create_path("Huda City Center", "IFFCO Chowk", "yellow", 4)
        self.create_path("IFFCO Chowk", "MG Road", "yellow", 2)
        self.create_path("MG Road", "Sikanderpur", "yellow", 3)
        self.create_path("Sikanderpur", "Guru Dronacharya", "yellow", 2)
        self.create_path("Guru Dronacharya", "Phase 2", "yellow", 3)
        self.create_path("Phase 2", "Belvedere Towers", "yellow", 1)
        self.create_path("Belvedere Towers", "Cyber City", "yellow", 2)
        self.create_path("Cyber City", "DLF Phase 3 Rapid Metro", "yellow", 1)
        self.create_path("DLF Phase 3 Rapid Metro", "DLF Phase 2", "yellow", 1)
        self.create_path("DLF Phase 2", "DLF Phase 1", "yellow", 1)
        self.create_path("DLF Phase 1", "Sikanderpur Rapid Metro", "yellow", 2)
        self.create_path("Sikanderpur Rapid Metro", "Vodafone Belvedere Towers", "yellow", 1)
        self.create_path("Vodafone Belvedere Towers", "IndusInd Cyber City", "yellow", 2)
        self.create_path("IndusInd Cyber City", "nullIndusInd Cyber City", "yellow", 0)

        self.create_path("nullSikanderpur Rapid Metro", "Sikanderpur Rapid Metro", "blue", 0)
        self.create_path("Sikanderpur Rapid Metro", "DLF Phase 2", "blue", 1)
        self.create_path("DLF Phase 2", "DLF Phase 3 Rapid Metro", "blue", 1)
        self.create_path("DLF Phase 3 Rapid Metro", "Moulsari Avenue", "blue", 1)
        self.create_path("Moulsari Avenue", "DLF Phase 5", "blue", 2)
        self.create_path("DLF Phase 5", "Sector 53-54", "blue", 1)
        self.create_path("Sector 53-54", "Sector 54 Chowk", "blue", 2)
        self.create_path("Sector 54 Chowk", "Sector 55-56", "blue", 1)
        self.create_path("Sector 55-56", "Sector 56 Rapid Metro", "blue", 1)
        self.create_path("Sector 56 Rapid Metro", "nullSector 56 Rapid Metro", "blue", 0)

        self.set_platforms()
