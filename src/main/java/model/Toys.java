package model;

import java.util.Objects;

public class Toys implements Comparable<Toys>{
    private int id;
    private String name;
    private int probability;

    public Toys(int id, String name, int probability) {
        this.id = id;
        this.name = name;
        this.probability = probability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toys toys = (Toys) o;
        return id == toys.id && probability == toys.probability && Objects.equals(name, toys.name);
    }


    @Override
    public int compareTo(Toys o) {
        return this.getProbability() - o.getProbability();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, probability);
    }
}
