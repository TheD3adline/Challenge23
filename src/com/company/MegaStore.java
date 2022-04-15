package com.company;

public class MegaStore {

    private String name;
    private MegaWarehouse warehouse;
    private MegaCashRegister cashRegister;

    public MegaStore(String name, MegaWarehouse warehouse, MegaCashRegister cashRegister) {
        this.name = name;
        this.warehouse = warehouse;
        this.cashRegister = cashRegister;
    }

    public MegaStore(MegaStore other) {
        //primitive attributes
        this.name = other.getName();

        //complex attributes
        MegaWarehouse warehouseOther = new MegaWarehouse(other.getWarehouse().getAreaInSquareMeters());
        this.warehouse = warehouseOther;
        MegaCashRegister cashRegisterOther = new MegaCashRegister(other.getCashRegister().getMoney());
        this.cashRegister = cashRegisterOther;
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

    public MegaWarehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(MegaWarehouse warehouse) {
        this.warehouse = warehouse;
    }

    public MegaCashRegister getCashRegister() {
        return cashRegister;
    }

    public void setCashRegister(MegaCashRegister cashRegister) {
        this.cashRegister = cashRegister;
    }
}
