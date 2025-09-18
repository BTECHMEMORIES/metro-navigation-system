from typing import List, Dict, Optional
from collections import defaultdict
from lodash_util import Lodash
from metro_station import MetroStation

class MetroMap:
    def __init__(self):
        self.ld = Lodash()
        self.city: str = ""
        self.all_stations: Dict[str, MetroStation] = {}
        self.lines: Dict[str, List[MetroStation]] = {}

    def create_station(self, name: str) -> MetroStation:
        if name in self.all_stations:
            return self.all_stations[name]
        station = MetroStation(name)
        self.all_stations[name] = station
        return station

    def create_path(self, s1: str, s2: str, line: str, distance: int):
        s1 = self.ld.to_lodash(s1)
        s2 = self.ld.to_lodash(s2)
        line = self.ld.to_lodash(line)

        st1 = self.create_station(s1)
        st2 = self.create_station(s2)

        st1.connections[st2] = distance
        st2.connections[st1] = distance

        if line not in self.lines:
            self.lines[line] = [st1, st2]
            return

        if st1 not in self.lines[line]:
            self.lines[line].append(st1)
        if st2 not in self.lines[line]:
            self.lines[line].append(st2)

    def path(self, start: MetroStation, end: MetroStation) -> Optional[List[MetroStation]]:
        visited = []
        distance = {station: float('inf') for station in self.all_stations.values()}
        previous = {station: None for station in self.all_stations.values()}

        distance[start] = 0

        while end not in visited:
            current = None
            min_distance = float('inf')
            for station in self.all_stations.values():
                if station not in visited and distance[station] < min_distance:
                    min_distance = distance[station]
                    current = station
            if current is None:
                return None

            visited.append(current)

            for neighbor, dist in current.connections.items():
                if neighbor not in visited:
                    new_distance = distance[current] + dist
                    if new_distance < distance[neighbor]:
                        distance[neighbor] = new_distance
                        previous[neighbor] = current

        # Build shortest path
        shortest_path = []
        temp = end
        while temp:
            shortest_path.insert(0, temp)
            temp = previous[temp]

        return shortest_path

    def path_by_name(self, start: str, end: str) -> Optional[List[MetroStation]]:
        start = self.ld.to_lodash(start)
        end = self.ld.to_lodash(end)
        shortest_path = self.path(self.all_stations[start], self.all_stations[end])
        if shortest_path:
            print(self.path_info(shortest_path))
        return shortest_path

    def get_line(self, st1: MetroStation, st2: MetroStation) -> Optional[str]:
        for line, stations in self.lines.items():
            if st1 in stations and st2 in stations:
                return line
        return None

    def path_info(self, shortest_path: List[MetroStation]) -> str:
        info = "\n"
        if len(shortest_path) == 1:
            info += "Same station"
            return info

        info += f" {self.ld.to_normal(shortest_path[0].name)} (platform : {shortest_path[0].platforms[shortest_path[1]]})"
        info += f"\n |\n | {self.ld.to_normal(self.get_line(shortest_path[0], shortest_path[1]))} Line\n | \n\\/"

        for i in range(len(shortest_path)):
            prev = shortest_path[i-1] if i-1 >= 0 else None
            next_ = shortest_path[i+1] if i+1 < len(shortest_path) else None

            if len(shortest_path[i].connections) > 2:
                if prev and next_ and self.get_line(prev, shortest_path[i]) != self.get_line(shortest_path[i], next_):
                    info += f"\n {self.ld.to_normal(shortest_path[i].name)}"
                    info += f"\n\n {self.ld.to_normal(shortest_path[i].name)} (platform : {shortest_path[i].platforms[next_]})"
                    info += f"\n |\n | {self.ld.to_normal(self.get_line(shortest_path[i], next_))} Line\n | \n\\/"

        info += f"\n {self.ld.to_normal(shortest_path[-1].name)}"
        info += f"\n\n Total Distance : {self.distance_covered(shortest_path)}KM"
        return info

    def set_platforms(self):
        for stations in self.lines.values():
            for i in range(len(stations)):
                if i + 1 < len(stations):
                    stations[i].platforms[stations[i+1]] = len(stations[i].platforms) + 1
            for i in range(len(stations)-1, -1, -1):
                if i - 1 >= 0:
                    stations[i].platforms[stations[i-1]] = len(stations[i].platforms) + 1

    def distance_covered(self, path: List[MetroStation]) -> int:
        distance = 0
        for i in range(len(path)-1):
            distance += path[i].connections[path[i+1]]
        return distance


if __name__ == "__main__":
    metro_map = MetroMap()
    metro_map.city = "Test"

    metro_map.create_path("nullA", "A", "red", 0)
    metro_map.create_path("A", "B", "red", 2)
    metro_map.create_path("B", "C", "red", 3)
    metro_map.create_path("C", "D", "red", 1)
    metro_map.create_path("D", "E", "red", 2)
    metro_map.create_path("E", "F", "red", 1)
    metro_map.create_path("F", "nullF", "red", 0)
    metro_map.create_path("nullE", "E", "yellow", 0)
    metro_map.create_path("E", "K", "yellow", 1)
    metro_map.create_path("K", "L", "yellow", 3)
    metro_map.create_path("L", "M", "yellow", 2)
    metro_map.create_path("M", "N", "yellow", 1)
    metro_map.create_path("N", "nullN", "yellow", 0)
    metro_map.create_path("nullC", "C", "green", 0)
    metro_map.create_path("C", "G", "green", 2)
    metro_map.create_path("G", "H", "green", 1)
    metro_map.create_path("H", "I", "green", 3)
    metro_map.create_path("I", "J", "green", 4)
    metro_map.create_path("J", "nullJ", "green", 0)
    metro_map.create_path("nullG", "G", "blue", 0)
    metro_map.create_path("G", "P", "blue", 5)
    metro_map.create_path("P", "O", "blue", 4)
    metro_map.create_path("O", "nullO", "blue", 0)

    metro_map.set_platforms()

    print("\nDijkstra's Shortest Path from A to O:")
    shortest_path = metro_map.path_by_name("A", "O")
