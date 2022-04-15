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

        System.out.println("-----------------------------------------------------");

        SuperWarehouse superWarehouse1 = new SuperWarehouse(250);
        SuperCashRegister superCashRegister1 = new SuperCashRegister(15700);
        SuperStore superStore1 = new SuperStore("Super Hornbach",superWarehouse1, superCashRegister1);

        System.out.println(superStore1);
        System.out.println();

        System.out.println("The following example instead creates a deep copy of superStore1, superStore2, a deep copy creates new instances of complex attributes within the \"higher\" class as well,");
        System.out.println("so both SuperStore.java objects don't refer to the very same instances of SuperWarehouse.java and SuperCashRegister.java, so the attributes of those sub-classes can be changed individually.");
        System.out.println();

        SuperStore superStore2 = superStore1.clone();

        System.out.println(superStore1);
        System.out.println(superStore2);
        System.out.println();

        System.out.println("superStore2.setName(\"Super Obi\");");
        System.out.println("superStore2.getWarehouse().setAreaInSquareMeters(350);");
        System.out.println("superStore2.getCashRegister().setMoney(17300);");
        System.out.println();

        superStore2.setName("Super Obi");
        superStore2.getWarehouse().setAreaInSquareMeters(350);
        superStore2.getCashRegister().setMoney(17300);

        System.out.println(superStore1);
        System.out.println(superStore2);
        System.out.println();

        System.out.println("-----------------------------------------------------");

        MegaWarehouse megaWarehouse1 = new MegaWarehouse(500);
        MegaCashRegister megaCashRegister1 = new MegaCashRegister(54000);
        MegaStore megaStore1 = new MegaStore("Mega Hornbach", megaWarehouse1, megaCashRegister1);

        System.out.println(megaStore1);
        System.out.println();

        System.out.println("The following example achieves the same as above, but creates the deep copy of megaStore1, megaStore2, with a copy constructor method instead of Cloneable.java.");
        System.out.println();

        MegaStore megaStore2 = new MegaStore(megaStore1);

        System.out.println(megaStore1);
        System.out.println(megaStore2);
        System.out.println();

        System.out.println("megaStore2.setName(\"Mega Obi\");");
        System.out.println("megaStore2.getWarehouse().setAreaInSquareMeters(600);");
        System.out.println("megaStore2.getCashRegister().setMoney(69000);");
        System.out.println();

        megaStore2.setName("Mega Obi");
        megaStore2.getWarehouse().setAreaInSquareMeters(600);
        megaStore2.getCashRegister().setMoney(69000);

        System.out.println(megaStore1);
        System.out.println(megaStore2);
        System.out.println();
    }
}
