from metro_map import MetroMap

class KolkataMetroMap(MetroMap):
    def __init__(self):
        self.city = "Kolkata"

        # North-South Line
        self.CreatePath("nullDumdum", "Dumdum", "blue", 0)
        self.CreatePath("Dumdum", "Belgachia", "blue", 3)
        self.CreatePath("Belgachia", "Shyambazar", "blue", 2)
        self.CreatePath("Shyambazar", "Esplanade", "blue", 3)
        self.CreatePath("Esplanade", "Park Street", "blue", 2)
        self.CreatePath("Park Street", "Maidan", "blue", 3)
        self.CreatePath("Maidan", "Rabindra Sadan", "blue", 1)
        self.CreatePath("Rabindra Sadan", "Kalighat", "blue", 2)
        self.CreatePath("Kalighat", "Netaji Bhavan", "blue", 1)
        self.CreatePath("Netaji Bhavan", "Jatin Das Park", "blue", 1)
        self.CreatePath("Jatin Das Park", "Rabindra Sarobar", "blue", 2)
        self.CreatePath("Rabindra Sarobar", "Tollygunge", "blue", 1)
        self.CreatePath("Tollygunge", "nullTollygunge", "blue", 0)

        # East-West Line
        self.CreatePath("nullSalt Lake Sector 5", "Salt Lake Sector 5", "green", 0)
        self.CreatePath("Salt Lake Sector 5", "Karunamoyee", "green", 1)
        self.CreatePath("Karunamoyee", "Central Park", "green", 2)
        self.CreatePath("Central Park", "City Centre", "green", 1)
        self.CreatePath("City Centre", "Bidhannagar", "green", 1)
        self.CreatePath("Bidhannagar", "Nicco Park", "green", 1)
        self.CreatePath("Nicco Park", "Salt Lake Stadium", "green", 1)
        self.CreatePath("Salt Lake Stadium", "Phoolbagan", "green", 1)
        self.CreatePath("Phoolbagan", "Sealdah", "green", 2)
        self.CreatePath("Sealdah", "Esplanade", "green", 2)
        self.CreatePath("Esplanade", "Chandni Chowk", "green", 1)
        self.CreatePath("Chandni Chowk", "nullChandni Chowk", "green", 0)

        # Circular Line
        self.CreatePath("nullMahanayak Uttam Kumar", "Mahanayak Uttam Kumar", "orange", 0)
        self.CreatePath("Mahanayak Uttam Kumar", "Tollygunge", "orange", 1)
        self.CreatePath("Tollygunge", "New Alipore", "orange", 2)
        self.CreatePath("New Alipore", "Rabindra Sarobar", "orange", 2)
        self.CreatePath("Rabindra Sarobar", "Kalighat", "orange", 1)
        self.CreatePath("Kalighat", "Jatin Das Park", "orange", 1)
        self.CreatePath("Jatin Das Park", "Netaji Bhavan", "orange", 2)
        self.CreatePath("Netaji Bhavan", "Maidan", "orange", 2)
        self.CreatePath("Maidan", "Park Street", "orange", 1)
        self.CreatePath("Park Street", "Esplanade", "orange", 1)
        self.CreatePath("Esplanade", "Sealdah", "orange", 2)
        self.CreatePath("Sealdah", "Phoolbagan", "orange", 1)
        self.CreatePath("Phoolbagan", "Salt Lake Stadium", "orange", 1)
        self.CreatePath("Salt Lake Stadium", "Karunamoyee", "orange", 2)
        self.CreatePath("Karunamoyee", "Salt Lake Sector 5", "orange", 1)
        self.CreatePath("Salt Lake Sector 5", "Kolkata International Airport", "orange", 2)
        self.CreatePath("Kolkata International Airport", "nullKolkata International Airport", "orange", 2)

        self.setPlatforms()
