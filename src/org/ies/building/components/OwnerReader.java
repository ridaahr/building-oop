package org.ies.building.components;

import org.ies.building.model.Owner;

import java.util.Scanner;

public class OwnerReader {
    private final Scanner scanner;

    public OwnerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Owner read() {
        System.out.println("Introduce el NIF:");
        var nif = scanner.nextLine();

        System.out.println("Introduce el nombre:");
        var name = scanner.nextLine();

        System.out.println("Introduce los apellidos");
        var surname = scanner.nextLine();

        return new Owner(
                nif,
                name,
                surname
        );
    }
}
