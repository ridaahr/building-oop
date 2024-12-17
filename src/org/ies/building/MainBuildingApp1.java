package org.ies.building;
import java.util.Scanner;

import org.ies.building.components.ApartmentReader;
import org.ies.building.components.BuildingApp1;
import org.ies.building.components.BuildingReader;
import org.ies.building.components.OwnerReader;

public class MainBuildingApp1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var ownerReader = new OwnerReader(scanner);
        var apartmentReader = new ApartmentReader(scanner, ownerReader);
        var buildingReader = new BuildingReader(scanner, apartmentReader);
        var buildingApp1 = new BuildingApp1(scanner, buildingReader);

        buildingApp1.run();
    }
}
