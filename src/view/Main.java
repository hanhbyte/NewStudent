package view;

import controller.Manager;
import model.School;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Manager manager = new Manager(studentList, "KA");
        Scanner scan = new Scanner(System.in);
        int number = 1;
        while (number != 0){
            System.out.println("1. Add student : ");
            System.out.println("2. Show students present in school : ");
            System.out.println("3. Show students born in 1985 and forgotten in Thai Nguyen :");
            System.out.println("4. Show students of class 10A1");
            System.out.println("0. EXIT");
            int numbers = scan.nextInt();
            switch (numbers){
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter name : ");
                    String name = scanner.nextLine();
                    System.out.println("Enter hometown : ");
                    Scanner can = new Scanner(System.in);
                    String dateBirth = can.nextLine();
                    System.out.println("Enter datebirth : ");
                    String hometown = scanner.nextLine();
                    Scanner scanner1 = new Scanner(System.in);
                    String grade = scanner1.nextLine();
                    System.out.println("Enter name grade : ");
                    Scanner scanner2 = new Scanner(System.in);
                    String course = scanner2.nextLine();
                    System.out.println("Enter the course : ");
                    Scanner scanner3 = new Scanner(System.in);
                    String semester = scanner3.nextLine();
                    System.out.println("Enter Semester admission : ");
                    Student student1 = new Student(name, hometown, dateBirth, grade, course, semester);
                    manager.add(student1);
                    break;
                case 2:
                    System.out.println("show students born in 1985 and born in Thai Nguyen");
                case 3:
                case 4:
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("NOOOOOOOO");
                    break;
            }
        }
//
//        Student van = getNewStudent();
//        manager.add(van);
//        for (Student student: studentList
//             ) {
//            System.out.println(student);
//        }

    }
//    static Student getNewStudent(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter name : ");
//        String name = scanner.nextLine();
//        System.out.println("Enter hometown : ");
//        Scanner can = new Scanner(System.in);
//        String dateBirth = can.nextLine();
//        System.out.println("Enter datebirth : ");
//        String hometown = scanner.nextLine();
//        Student student1 = new Student(name, hometown, dateBirth);
//        return student1;
////    }
}