package com.company;

public class Main {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse(150);
        CashRegister cashRegister = new CashRegister(9200);
        Store store = new Store("Hornbach", warehouse, cashRegister);

        System.out.println(store);
    }
}
