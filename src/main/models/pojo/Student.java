package main.models.pojo;

/**
 * Created by Kuznetsov on 18/04/2017.
 */

public class Student {
    int id;
    String name;
    int age;
    int groupId;
    //Group group;

    public Student(int id, String name, int age, int groupId/*, Group group*/) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.groupId = groupId;
        //this.group = group;
    }

    public Student() {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    /*
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
    */
}
