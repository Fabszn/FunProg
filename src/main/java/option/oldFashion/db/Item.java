package option.oldFashion.db;

/**
 * Created by fsznajderman on 02/06/2014.
 */
public class Item {


    private Integer id;
    private String name;
    private String desc;

    Item(Integer id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
