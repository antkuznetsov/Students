package models.pojo;

/**
 * Created by Kuznetsov on 18/04/2017.
 */

public class Journal {
    int id;
    int lessonId;
    int studentId;
    Lesson lesson;
    Student student;

    public Journal(int id, int lessonId, int studentId, Lesson lesson, Student student) {
        this.id = id;
        this.lessonId = lessonId;
        this.studentId = studentId;
        this.lesson = lesson;
        this.student = student;
    }

    public Journal() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
