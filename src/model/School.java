package model;

public class School {
    private String grade;
    private String course;
    private String semester;

    public School() {
    }

    public School(String grade, String course, String semester) {
        this.grade = grade;
        this.course = course;
        this.semester = semester;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "School{" +
                "grade='" + grade + '\'' +
                ", course='" + course + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }
}
