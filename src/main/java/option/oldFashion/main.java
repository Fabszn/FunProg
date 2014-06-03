package option.oldFashion;

import option.oldFashion.db.Database;
import option.oldFashion.db.Item;

/**
 * Created by fsznajderman on 02/06/2014.
 */
public class Main {


    public static void main(String[] args) {
        final Database db = new Database();

        final Item item = db.findById(1);

        if(item != null){
            System.out.println(item.getName());
        }else{
            System.out.println("no Item found");
        }

        final Item item1 = db.findById(1000);

        if(item1 != null){
            System.out.println(item1.getName());
        }else{
            System.out.println("no Item found");
        }

    }


}

