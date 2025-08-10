package Assignment9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class City {
    String name;
    int population;

    City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String toString() {
        return name + " - Population: " + population;
    }
}

class PopulationComparator implements Comparator<City> {
    public int compare(City c1, City c2) {
        return Integer.compare(c1.population, c2.population); // Ascending
    }
}

public class Q9 {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Mumbai", 24500000));
        cities.add(new City("Delhi", 18400000));
        cities.add(new City("Pune", 14250000));
        cities.add(new City("Hyderabad", 13620000));
        cities.add(new City("Chennai", 7040000));

        System.out.println("Before sorting:");
        for (City city : cities) {
            System.out.println(city);
        }

        Collections.sort(cities, new PopulationComparator());

        System.out.println("\nSorted by Population (Ascending):");
        for (City city : cities) {
            System.out.println(city);
        }
    }
}