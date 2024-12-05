package org.ies.building.components;

import org.ies.building.model.Apartment;
import org.ies.building.model.Owner;

import java.util.Scanner;

public class ApartmentReader {
    private final Scanner scanner;
    private final OwnerReader ownerReader;

    public ApartmentReader(Scanner scanner, OwnerReader ownerReader) {
        this.scanner = scanner;
        this.ownerReader = ownerReader;
    }

    public Apartment read() {
        System.out.println("Introduce la planta");
        var floor = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce la puerta");
        var door = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Cuántos propietarios tiene?");
        var size = scanner.nextInt();
        scanner.nextLine();
        Owner[] owners = new Owner[size];
        for (int i = 0; i < size; i++) {
            owners[i] = ownerReader.read();
        }

        return new Apartment(
                floor,
                door,
                owners
        );
    }
}
