package option.java8Fashion.db;

import java.util.Optional;

/**
 * Created by fsznajderman on 02/06/2014.
 */
public class Item {


    private Optional<Integer> id = Optional.empty();
    private String name;
    private String desc;

    public Item(Optional<Integer> id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public Optional<Integer> getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
