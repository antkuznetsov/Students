package main.models.pojo;

/**
 * Created by Kuznetsov on 18/04/2017.
 */

public class Group {
    int id;
    String name;

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Group() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
