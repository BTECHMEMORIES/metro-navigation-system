# initator.py

from lodash_util import Lodash
from disp_stat import DispStat
from hyd_metro_map import HydMetroMap
from chennai_metro_map import ChennaiMetroMap
from kolkata_metro_map import KolkataMetroMap
from bengalore_metro_map import BengaloreMetroMap
from jaipur_metro_map import JaipurMetroMap
from gurgaon_metro_map import GurgaonMetroMap
from kochi_metro_map import KochiMetroMap


def main():
    ld = Lodash()
    dis = DispStat()

    cities = {
        "hyderabad": HydMetroMap(),
        "chennai": ChennaiMetroMap(),
        "kolkata": KolkataMetroMap(),
        "bengalore": BengaloreMetroMap(),
        "jaipur": JaipurMetroMap(),
        "gurgaon": GurgaonMetroMap(),
        "kochi": KochiMetroMap()
    }

    print("****** METRO TRANSIT GUIDE ******\n")

    while True:
        print("\nCities:")
        for city in cities.keys():
            print(ld.to_normal(city))

        city = input("\nEnter city to continue/ enter 'exit' to exit: ").strip()

        if not city:
            print("\nInvalid input. Please enter a city or 'exit'.")
            continue

        if ld.to_lodash(city) == "exit":
            print("\nThank You!")
            break

        if ld.to_lodash(city) not in cities:
            print("\nCity not found. Try Again!")
            continue

        met_city = cities[ld.to_lodash(city)]

        while True:
            print(f"\n{met_city.city} city Metro Stations:")
            print(dis.disp_list_str(met_city))

            src = ld.to_lodash(input("\nEnter starting Station: ").strip())
            dst = ld.to_lodash(input("Enter Destination Station: ").strip())

            if src in met_city.all_stations and dst in met_city.all_stations:
                met_city.path(src, dst)
            else:
                print("\nInvalid source and Destination! \nCheck the entered Source and Destination")

            print("\n1. To Select City\n2. Continue\n3. Exit")
            while True:
                try:
                    choice = int(input("\nEnter choice: ").strip())
                    if choice not in [1, 2, 3]:
                        print("\nInvalid Choice. Try again: ", end="")
                        continue
                    break
                except ValueError:
                    print("\nInvalid input. Enter a number.")

            if choice == 1:
                break
            elif choice == 2:
                continue
            else:
                print("\nThank You!")
                return


if __name__ == "__main__":
    main()
