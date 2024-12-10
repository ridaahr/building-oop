package org.ies.building.components;

import java.util.Scanner;

public class BuildingApp {
    private final Scanner scanner;
    private final BuildingReader buildingReader;

    public BuildingApp(Scanner scanner, BuildingReader buildingReader) {
        this.scanner = scanner;
        this.buildingReader = buildingReader;
    }



    public void run() {
        var building = buildingReader.read();
        int option;
        do {
            option = chooseOption();
            if (option == 1) {
                building.buildingInfo();
            } else if (option == 2) {
                System.out.println("Introduce el piso");
                int floor = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduce la puerta");
                int door = scanner.nextInt();
                scanner.nextLine();
                var building1 = building.findApartment(floor, door);
                System.out.println(building1);
            } else if (option == 3) {
                System.out.println("Introduce el piso");
                int floor = scanner.nextInt();
                scanner.nextLine();
                building.apartmentFloor(floor);
            } else if (option == 4) {
                System.out.println("Introduce el piso");
                int floor = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduce la puerta");
                int door = scanner.nextInt();
                scanner.nextLine();
                var owners = building.apartmentOwners(floor, door);
                System.out.println(owners);
            } else if (option == 5) {
                System.out.println("Introduce el piso");
                int floor = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduce la puerta");
                int door = scanner.nextInt();
                scanner.nextLine();
                building.showApartments(floor, door);
            } else if (option == 6) {
                System.out.println("Introduce el piso");
                int floor = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduce la puerta");
                int door = scanner.nextInt();
                scanner.nextLine();
                building.showApartmentOwners(floor, door);
            }
        } while (option != 7);
    }

    private int chooseOption() {
        int option;
        do {
            System.out.println("1. Muestra toda la información del edificio");
            System.out.println("2. Devuelve el apartamento en planta y puerta que indiques");
            System.out.println("3. Mostrar apartamentos de una planta");
            System.out.println("4. Devolver propietarios de una planta y puerta");
            System.out.println("5. Mostrar datos del apartamento de una planta y puerta");
            System.out.println("6. Mostrar propietarios de un apartamento situado en una planta y puerta dados");
            System.out.println("7. Salir");
            option = scanner.nextInt();
            scanner.nextLine();
        } while (option < 1 || option > 7);
        return option;
    }
}
