package com.company;

public class Store {

    private String name;
    private Warehouse warehouse;
    private CashRegister cashRegister;

    public Store(String name, Warehouse warehouse, CashRegister cashRegister) {
        this.name = name;
        this.warehouse = warehouse;
        this.cashRegister = cashRegister;
    }

    @Override
    public String toString() {
        return "Store name: " + this.name + ", Size of warehouse: " + this.warehouse.getAreaInSquareMeters() + "m², Amount of cash in register: €" + this.cashRegister.getMoney();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public CashRegister getCashRegister() {
        return cashRegister;
    }

    public void setCashRegister(CashRegister cashRegister) {
        this.cashRegister = cashRegister;
    }
}
