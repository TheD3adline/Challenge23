package com.company;

public class SuperStore implements Cloneable {

    private String name;
    private SuperWarehouse warehouse;
    private SuperCashRegister cashRegister;

    public SuperStore(String name, SuperWarehouse warehouse, SuperCashRegister cashRegister) {
        this.name = name;
        this.warehouse = warehouse;
        this.cashRegister = cashRegister;
    }

    @Override
    public String toString() {
        return "Store name: " + this.name + ", Size of warehouse: " + this.warehouse.getAreaInSquareMeters() + "m², Amount of cash in register: €" + this.cashRegister.getMoney();
    }

    @Override
    public SuperStore clone() {
        try {
            SuperStore storeCopy = (SuperStore) super.clone();
            storeCopy.warehouse = (SuperWarehouse) storeCopy.warehouse.clone();
            storeCopy.cashRegister = (SuperCashRegister) storeCopy.cashRegister.clone();
            return storeCopy;
        } catch(CloneNotSupportedException e) {
            System.out.println("Unexpected exception during cloning of Store.java");
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SuperWarehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(SuperWarehouse warehouse) {
        this.warehouse = warehouse;
    }

    public SuperCashRegister getCashRegister() {
        return cashRegister;
    }

    public void setCashRegister(SuperCashRegister cashRegister) {
        this.cashRegister = cashRegister;
    }
}
