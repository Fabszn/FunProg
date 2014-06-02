package option.oldFashion.db;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fsznajderman on 02/06/2014.
 */
public class Database{


    private Map<Integer, Item> content = new HashMap<Integer, Item>();

    private Integer index = 1000;


    public Database() {

        content.put(1,new Item(1,"item1","description item1"));
        content.put(2,new Item(2,"item2","description item2"));
        content.put(2,new Item(3,"item3","description item3"));
        content.put(5,new Item(5,"item5","description item5"));
        content.put(9,new Item(9,"item9","description item9"));
        content.put(12,new Item(12,"item12","description item12"));


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
