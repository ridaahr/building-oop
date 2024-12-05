package org.ies.building.components;

import org.ies.building.model.Apartment;
import org.ies.building.model.Building;

import java.util.Scanner;

public class BuildingReader {
    private final Scanner scanner;
    private final ApartmentReader apartmentReader;

    public BuildingReader(Scanner scanner, ApartmentReader apartmentReader) {
        this.scanner = scanner;
        this.apartmentReader = apartmentReader;
    }

    public Building read() {
        System.out.println("Introduce la dirección");
        var address = scanner.nextLine();

        System.out.println("Introduce el municipio");
        var municipality = scanner.nextLine();

        System.out.println("¿Cuántos apartamentos tiene?");
        var size = scanner.nextInt();
        scanner.nextLine();

        Apartment[] apartments = new Apartment[size];
        for (int i = 0; i < size; i++) {
            apartments[i] = apartmentReader.read();
        }

        return new Building(
                address,
                municipality,
                apartments
        );
    }
}
