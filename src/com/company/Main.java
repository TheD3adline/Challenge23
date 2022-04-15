package com.company;

public class Main {

    public static void main(String[] args) {

        Warehouse warehouse1 = new Warehouse(150);
        CashRegister cashRegister1 = new CashRegister(9200);
        Store store1 = new Store("Hornbach", warehouse1, cashRegister1);

        System.out.println(store1);
        System.out.println();
        System.out.println("The following example creates a shallow copy of store1, namely store2, the problem with a shallow copy here is that it only creates a copy of the primitive attributes of Store.java,");
        System.out.println("while still referencing to the very same objects created during initialization of store1, so if we try to change the complex attributes of store2 after that, we also change them for store1.");
        System.out.println();

        Store store2 = store1.clone();

        System.out.println(store1);
        System.out.println(store2);
        System.out.println();

        System.out.println("store2.setName(\"Obi\");");
        System.out.println("store2.getWarehouse().setAreaInSquareMeters(200);");
        System.out.println("store2.getCashRegister().setMoney(8700);");
        System.out.println();

        store2.setName("Obi");
        store2.getWarehouse().setAreaInSquareMeters(200);
        store2.getCashRegister().setMoney(8700);

        System.out.println(store1);
        System.out.println(store2);
        System.out.println();

        System.out.println("");
        System.out.println("");
        System.out.println();
    }
}
