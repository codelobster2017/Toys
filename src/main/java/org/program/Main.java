package org.program;

import model.Lottery;
import model.Save;
import model.Shop;
import model.Toys;


public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop(new Lottery());
        shop.add(new Toys(1, "Dragon", 9));
        shop.add(new Toys(2, "Dragon2", 5));
        shop.add(new Toys(3, "Dragon3", 4));
        shop.add(new Toys(4, "Dragon4", 7));
        shop.add(new Toys(5, "Dragon5", 8));

        System.out.println(shop.getToys());
        Save save = new Save(shop.getRand());
    }
}