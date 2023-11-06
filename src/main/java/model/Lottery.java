package model;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Lottery {

    public Toys get(PriorityQueue<Toys> toys){
        int size = toys.size();
        int weight = 0;
        String[] name = new String[size];
        int[] probability = new int[size];
        int[] id = new int[size];
        int[] addWeight = new int[size];
        for (int i = 0; i < size; i++) {
            Toys toy = toys.remove();
            id[i] = toy.getId();
            name[i] = toy.getName();
            probability[i] = weight;
            addWeight[i] = toy.getProbability();
            weight += toy.getProbability();

        }

        Random random = new Random();
        int randInt = random.nextInt(weight);
        System.out.println(randInt);
        if (randInt == 0){
            return new Toys(id[0], name[0], addWeight[0]);
        }
        for (int i = 0; i < id.length; i++) {

            if (randInt < probability[i]){

                return new Toys(id[i-1], name[i-1], addWeight[i-1]);
            } else if (i == id.length-1 || randInt == probability[i]) {

                return new Toys(id[i], name[i], addWeight[i]);
            }
        }


        return toys.remove();

    }

}
