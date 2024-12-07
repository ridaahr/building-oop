package org.ies.building.model;

import java.util.Arrays;
import java.util.Objects;

public class Building {
    private String Address;
    private String municipality;
    private Apartment[] apartments;

    public Building(String address, String municipality, Apartment[] apartments) {
        Address = address;
        this.municipality = municipality;
        this.apartments = apartments;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    public void apartmentData() {
        for (var apartament: apartments) {
            apartament.apartmentData();
        }
    }

    public void buildingInfo() {
        System.out.println("Dirección: " + getAddress() + ". Municipio: " + getMunicipality());
        System.out.println("Apartamentos: ");
        apartmentData();
    }

    public Apartment apartmentInfo(int floor, int door) {
        for (var apartment: apartments) {
            if (apartment.getFloor() == floor || apartment.getDoor() == door) {
                return apartment;
            }
        }
        return null;
    }

    public Apartment apartmentInfoFloor(int floor) {
        for (var apartment: apartments) {
            if (apartment.getFloor() == floor) {
                return apartment;
            }
        }
        return null;
    }

    public Apartment apartmentFloorDoor(int floor, int door) {
        var apartment = apartmentInfo(floor, door);
        if (apartment != null) {
            return apartment;
        }
        return null;
    }

    public void apartmentFloor(int floor) {
        var apartment = apartmentInfoFloor(floor);
        if (apartment != null) {
            apartmentData();
        } else {
            System.out.println("No hay apartamentos");
        }
    }

    public Owner apartmentOwners(int floor, int door) {
        var apartment = apartmentFloorDoor(floor, door);
        if (apartment != null) {
            apartment.getOwners();
        }
        return null;
    }

    public void showApartments(int floor, int door) {
        var apartment = apartmentFloorDoor(floor, door);

        if (apartment != null) {
            apartment.apartmentData();
        } else {
            System.out.println("No existe el apartamento");
        }
    }

    public void showApartmentOwners(int floor, int door) {
        var apartment = apartmentFloorDoor(floor, door);

        if (apartment != null) {
            apartment.showOwners();
        } else {
            System.out.println("No existe el apartamento");
        }
    }

    @Override
    public String toString() {
        return "Building{" +
                "Address='" + Address + '\'' +
                ", municipality='" + municipality + '\'' +
                ", apartments=" + Arrays.toString(apartments) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(Address, building.Address) && Objects.equals(municipality, building.municipality) && Objects.deepEquals(apartments, building.apartments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Address, municipality, Arrays.hashCode(apartments));
    }
}
