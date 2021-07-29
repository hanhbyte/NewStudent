package model;

public class Student {
    private String name;
    private String dateBirth;
    private String hometown;

    public Student(String name, String hometown, String dateBirth, String grade, String course, String semester) {
    }

    public Student(String name, String dateBirth, String hometown) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", datebirth='" + dateBirth + '\'' +
                ", hometown='" + hometown + '\'' +
                '}';
    }
}
