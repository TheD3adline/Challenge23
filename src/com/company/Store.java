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
        return "Store name: " + this.name + " / Size of warehouse: " + this.warehouse.getAreaInSquareMeters() + "m² / Amount of cash in register: €" + this.cashRegister.getMoney();
    }
}
