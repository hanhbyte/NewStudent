package controller;

import model.School;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    public List<Student> student = new ArrayList<>();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Student student){
        this.student.add(student);
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public Manager(List<Student> student, String name) {
        this.student = student;
        this.name = name;
    }

    public void delete(int index){
        this.student.remove(index);
    }

    public void update(int index, Student student){
        this.student.set(index, student);
    }

    public void showAll(String name){
        for (Student student : student) {
            System.out.println(student);
        }
    }
}
