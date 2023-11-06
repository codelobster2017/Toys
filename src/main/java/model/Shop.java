package model;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Shop {
    private PriorityQueue<Toys> toys;
    private Lottery lottery;

    public Shop(Lottery lottery) {
        this.lottery = lottery;
        toys = new PriorityQueue<>();
    }
    public Toys getRand(){
        return lottery.get(toys);
    }

    public void add(Toys toy){
        toys.add(toy);
    }

    public Queue<Toys> getToys() {
        ArrayList<String> strings = new ArrayList<>();
        for (Toys toy : toys) {
            System.out.println(toy.getProbability());
        }
        return toys;
    }
}
