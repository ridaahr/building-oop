package org.ies.building.components;

import java.util.Scanner;

public class BuildingApp1 {
    private final Scanner scanner;
    private final BuildingReader buildingReader;

    public BuildingApp1(Scanner scanner, BuildingReader buildingReader) {
        this.scanner = scanner;
        this.buildingReader = buildingReader;
    }

    public void run() {
        var building = buildingReader.read();

        System.out.println("Introduce un piso:");
        var floor = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce una puerta:");
        var door = scanner.nextLine();

        building.showApartments(floor, door);
    }
}
