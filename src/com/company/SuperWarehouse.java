package com.company;

public class SuperWarehouse implements Cloneable {

    private int areaInSquareMeters;

    public SuperWarehouse(int areaInSquareMeters) {
        this.areaInSquareMeters = areaInSquareMeters;
    }

    @Override
    public SuperWarehouse clone() {
        try {
            return (SuperWarehouse) super.clone();
        } catch(CloneNotSupportedException e) {
            System.out.println("Unexpected problem during clone process of SuperWarehouse.java");
        }
        return null;
    }

    public int getAreaInSquareMeters() {
        return areaInSquareMeters;
    }

    public void setAreaInSquareMeters(int areaInSquareMeters) {
        this.areaInSquareMeters = areaInSquareMeters;
    }
}
