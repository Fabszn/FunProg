package option.guavaFashion;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import option.guavaFashion.db.Database;
import option.guavaFashion.db.Item;

/**
 * Created by fsznajderman on 02/06/2014.
 */
public class main {


    public static void main(String[] args) {
        final Database db = new Database();

        final Optional<Item> item = db.findById(1);

        System.out.println(item.transform(new Function<Item, String>() {
            @Override
            public String apply(Item input) {
                return input.getName();
            }
        }).or("No Item found"));

        final Optional<Item> item1 = db.findById(1000);

        System.out.println(item1.transform(new Function<Item, String>() {
            @Override
            public String apply(Item input) {
                return input.getName();
            }
        }).or("No Item found"));


    }


}

