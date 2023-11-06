package model;

import java.io.FileWriter;
import java.io.IOException;

public class Save {
    public Save(Toys toy) {
        try(FileWriter writer = new FileWriter("result.txt", false))
        {
            writer.write("ID: " + toy.getId() + " | Name: " + toy.getName());
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
