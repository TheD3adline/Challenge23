package com.company;

public class SuperCashRegister implements Cloneable {

    private int money;

    public SuperCashRegister(int money) {
        this.money = money;
    }

    @Override
    public SuperCashRegister clone() {
        try {
            return (SuperCashRegister) super.clone();
        } catch(CloneNotSupportedException e) {
            System.out.println("Unexpected problem during clone process of EvenBetterCarEngine.java");
        }
        return null;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
