class MetroStation:
    def __init__(self, name):
        self.name = name
        self.visited = False
        self.connections = {}  
        self.platforms = {}    

