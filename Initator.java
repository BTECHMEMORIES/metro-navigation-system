package dsa.project.metorsystem;

import java.util.HashMap;
import java.util.Scanner;
import dsa.project.functionality.*;
import dsa.project.maps.*;
import dsa.project.utility.*;

public class Initator {

    public static void main(String args[]) {

        Lodash ld = new Lodash();
        DispStat dis = new DispStat();
        Scanner sc = new Scanner(System.in);

        HashMap<String, MetroMap> cities = new HashMap<>();
        cities.put("hyderabad", new HydMetroMap());
        cities.put("chennai", new ChennaiMetroMap());
        cities.put("kolkata", new KolkataMetroMap());
        cities.put("bengalore", new BengaloreMetroMap());
        cities.put("jaipur", new JaipurMetroMap());
        cities.put("gurgaon", new GurgaonMetroMap());
        cities.put("kochi", new KochiMetroMap());
        
        System.out.println("****** METRO TRANSIST GUIDE ******\n");
        
        while (true) {

            System.out.println("\nCities:");

            for (String city : cities.keySet()) {

                System.out.println(ld.toNormal(city));
            }

            System.out.print("\nEnter city to continue/ enter 'exit' to exit:");
            String city = sc.nextLine();

            if (city.isEmpty()) {
                System.out.println("\nInvalid input. Please enter a city or 'exit'.");
                continue;
            }

            if (ld.toLodash(city).equals("exit")) {

                System.out.println("\nThank You!");
                System.exit(0);
            }

            if (!cities.containsKey(ld.toLodash(city))) {

                System.out.println("\nCity not found. Try Again!");
                continue;
            }

            MetroMap MetCity = cities.get(ld.toLodash(city));

            while (true) {

                System.out.println(MetCity.city + " city Metro Stations:");
                System.out.println(dis.dispListStr(MetCity));

                System.out.print("\nEnter starting Station: ");
                String src = ld.toLodash(sc.nextLine());
                System.out.print("Enter Destination Station: ");
                String dst = ld.toLodash(sc.nextLine());

                if (MetCity.allStations.containsKey(src) && MetCity.allStations.containsKey(dst)) {

                    MetCity.path(src, dst);
                } else {

                    System.out.println("\nInvalid source and Destination! \nCheck the entered Source and Destination");

                }

                System.out.println("\n1.To Select City\n"
                        + "2.Continue\n"
                        + "3.Exit");
                System.out.print("\nEnter choice: ");

                int choice;

                while (true) {
                    choice = sc.nextInt();
                    sc.nextLine(); // Consume the newline character

                    if (choice < 0 || choice > 3) {
                        System.out.print("\nInvalid Choice. Try again: ");
                        continue;
                    } else {
                        break;
                    }

                }

                if (choice == 1) {
                    break;
                } else if (choice == 2) {
                    continue;
                } else {
                	System.out.println("\nThank You!");
                    System.exit(0);
                }

            }

        }

    }

}

