package option.oldFashion.db;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fsznajderman on 02/06/2014.
 */
public class Database{


    private Map<Integer, Item> content = new HashMap<Integer, Item>();

    private Integer index = 1000;


    public Database() {

        content.put(1,new Item(1,"item 1 couteau","description item1"));
        content.put(2,new Item(2,"item 2 poele","description item2"));
        content.put(2,new Item(3,"item 3 bateau","description item3"));
        content.put(5,new Item(5,"item 5 voiture","description item5"));
        content.put(9,new Item(9,"item 9 toiture","description item9"));
        content.put(12,new Item(12,"item 12 velo","description item12"));

    }

    public Item findById(final Integer id){


        return content.get(id);

    }

    public void  saveOrUpdateItem(final Item i){

        if(i.getId() != null){
            content.put(i.getId(), i);

        }else{
            final Integer next = index++;
            content.put(next, new Item(next, i.getName(), i.getDesc()));
        }


    }

}
