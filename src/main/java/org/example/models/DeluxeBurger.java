package org.example.models;

import org.example.models.enums.BreadRollType;


public class DeluxeBurger extends Hamburger{
    private Drink drink;
    private Cips cips;

    public DeluxeBurger(BreadRollType breadRollType,Drink drink, Cips cips) {
        super("DELUXE BURGER","DOUBLE",19.90,breadRollType );
        this.drink = drink;
        this.cips = cips;
    }

    public Drink getDrink() {
        return drink;
    }

    public Cips getCips() {
        return cips;
    }

    @Override
    public void addAddtiton(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder deluxeBurgerStringBuilder = new StringBuilder();
        deluxeBurgerStringBuilder.append("DRINK: "+drink.getDrinkType()+ "\n");
        deluxeBurgerStringBuilder.append("CIPS: "+cips.getCipsType()+ "\n");
        System.out.println(deluxeBurgerStringBuilder);
        super.itemizeHamburger();
    }
}
