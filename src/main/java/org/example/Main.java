package org.example;

import org.example.models.*;
import org.example.models.enums.BreadRollType;
import org.example.models.enums.CipsType;
import org.example.models.enums.DrinkType;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Normal", 3.56, BreadRollType.WRAP);

        hamburger.addAddtiton("Tomato", 0.27);

        hamburger.addAddtiton("Lettuce", 0.75);

        hamburger.addAddtiton("Cheese", 1.13);

        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger",5.67,BreadRollType.SANDWICH);

        healthyBurger.addAddtiton("Egg", 5.43);

        healthyBurger.addAddtiton("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger(BreadRollType.DOUBLE_BURGER, new Drink(DrinkType.COKE), new Cips(CipsType.CURLY));

        db.addAddtiton("Should not do this", 50.53);

        db.itemizeHamburger();
    }
}