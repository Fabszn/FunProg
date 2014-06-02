package option.guavaFashion.db;

import com.google.common.base.Optional;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fsznajderman on 02/06/2014.
 */
public class Database{


    private Map<Integer, Item> content = new HashMap<Integer, Item>();

    private Integer index = 1000;


    public Database() {

        content.put(1,new Item(Optional.of(1),"item1","description item1"));
        content.put(2,new Item(Optional.of(2),"item2","description item2"));
        content.put(2,new Item(Optional.of(3),"item3","description item3"));
        content.put(5,new Item(Optional.of(5),"item5","description item5"));
        content.put(9,new Item(Optional.of(9),"item9","description item9"));
        content.put(12,new Item(Optional.of(12),"item12","description item12"));


    }

    public Optional<Item> findById(final Integer id){

        return Optional.fromNullable(content.get(id));

    }

    public void  saveOrUpdateItem(final Item i){

        if(i.getId().isPresent()){
            content.put(i.getId().get(), i);
        }else{
            final Integer next = index++;
            content.put(next, new Item(Optional.of(next), i.getName(), i.getDesc()));
        }


    }

}
