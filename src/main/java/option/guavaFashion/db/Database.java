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

        content.put(1,new Item(Optional.of(1),"item 1 couteau","description item1"));
        content.put(2,new Item(Optional.of(2),"item 2 poele","description item2"));
        content.put(2,new Item(Optional.of(3),"item 3 bateau","description item3"));
        content.put(5,new Item(Optional.of(5),"item 5 voiture","description item5"));
        content.put(9,new Item(Optional.of(9),"item 9 toiture","description item9"));
        content.put(12,new Item(Optional.of(12),"item 12 velo","description item12"));


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
