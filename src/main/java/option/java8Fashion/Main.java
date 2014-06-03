package option.java8Fashion;


import option.java8Fashion.db.Database;
import option.java8Fashion.db.Item;

import java.util.Optional;

/**
 * Created by fsznajderman on 02/06/2014.
 */
public class Main {


    public static void main(String[] args) {
        final Database db = new Database();

        final Optional<Item> item = db.findById(1);

        System.out.println(item.map(input -> input.getName()).orElse("No Item found"));

        final Optional<Item> item1 = db.findById(1000);  //oneliner

        System.out.println(item1.map(input -> input.getName()).orElse("No Item found"));


    }


}

