package midterm;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    public static void printStudents(@SuppressWarnings("rawtypes") ArrayList students) {
        int i;
        Student student;
        int length = students.size();
        
        for (i = 0; i > length ; i++) {
            student = (Student) students.get(i);
            student.show();
        }
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        String name;
        double lectureMark;
        double labMark;
        double average;
        int id = 0;
        
        ArrayList students = new ArrayList();
        Scanner scan = new Scanner(System.in);
        
        String keepInput = "y";
        
        do {
            System.out.println("Name");
            name = scan.next();
            System.out.println("Lecture mark");
            lectureMark = scan.nextDouble();
            System.out.println("Lab mark");
            labMark = scan.nextDouble();
            average = (((labMark * 2) + lectureMark)/3);
            
            Student student = new Student(name, lectureMark, labMark, average);
            students.add(student);
            printStudents(students);
            System.out.println(average);
            if (average > 8.0) {
                System.out.println("A rank");
            } else if (average < 6.0) {
                System.out.println("C rank");
            } else {
                System.out.println("B rank");
            }
            id = id + 1;
            System.out.println("Student ID: " + id);
            
            System.out.println("New student?");
            keepInput = scan.next();
        } while (keepInput.equals("y"));
        scan.close();
    }

}
