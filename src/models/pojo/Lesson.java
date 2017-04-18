package models.pojo;

import java.util.Date;

/**
 * Created by Kuznetsov on 18/04/2017.
 */

public class Lesson {
    int id;
    int groupId;
    Group group;
    Date lessonDate;
    int room;
    String description;

    public Lesson(int id, int groupId, Date lessonDate, int room, String description) {
        this.id = id;
        this.groupId = groupId;
        this.lessonDate = lessonDate;
        this.room = room;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Date getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(Date lessonDate) {
        this.lessonDate = lessonDate;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
