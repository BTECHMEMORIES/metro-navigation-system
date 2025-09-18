class MetroStation:
    def __init__(self, name):
        self.name = name
        self.visited = False
        self.connections = {}  # Equivalent to Map<MetroStation, Integer>
        self.platforms = {}    # Equivalent to HashMap<MetroStation, Integer>
