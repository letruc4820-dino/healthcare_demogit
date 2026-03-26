package bai_tap.student_management;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class studentManagement {
    private ArrayList<student> studentList = new ArrayList<>();

    //1. add student
    public void addStudent(Scanner sc) {
        System.out.println("Please enter the student ID: ");
        String id = sc.nextLine();

        //check student id
        if (findStudentId(id) != null) {
            System.out.println("This student ID already exists. Please enter another ID.");
            return;
        }

        //if student id = null
        System.out.println("Please enter the student's full name: ");
        String fullName = sc.nextLine();
        System.out.println("Please enter the student's class: ");
        String studentClass = sc.nextLine();
        System.out.println("Please enter the student's address: ");
        String address = sc.nextLine();
        System.out.println("Please enter the student's Math score: ");
        double math = Double.parseDouble(sc.nextLine());
        System.out.println("Please enter the student's Physics score: ");
        double physics = Double.parseDouble(sc.nextLine());
        System.out.println("Please enter the student's Chemistry score: ");
        double chemistry = Double.parseDouble(sc.nextLine());
        student st = new student(id, fullName, studentClass, address, math, physics, chemistry);
        studentList.add(st);
        System.out.println("The student has been added successfully!");
    }

    //find student id
    public student findStudentId(String id) {
        for (student st : studentList) {
            if (st.getId().equals(id)) {
                return st;
            }
        }
        return null;
    }

    // 2. Display the student list
    public void displayStudentList() {
        if (studentList.isEmpty()) {
            System.out.println("The student list is empty.");
            return;
        }
        for (student st : studentList) {
            st.display();
        }
    }

    // 3. Delete a student by ID
    public void deleteStudent(Scanner sc) {
        System.out.println("Please enter the ID of the student to be deleted: ");
        String id = sc.nextLine();
        boolean found = false;
        for (student st : studentList) {
            if (st.getId().equals(id)) {
                studentList.remove(st);
                System.out.println("The student has been deleted successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("This student ID does not exists. Please enter another ID.");
        }
    }

    // 4. Search for a student by ID
    public void findStudent(Scanner sc) {
        System.out.println("Please enter the student ID: ");
        String id = sc.nextLine();
        boolean found = false;
        for (student st : studentList) {
            if (st.getId().equals(id)) {
                System.out.println("Student information: ");
                st.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("This student ID does not exists. Please enter another ID.");
        }
    }

    // 5. Find the student with the highest average score
    public void highestAverageScore() {
        if (studentList.isEmpty()) {
            System.out.println("The student list is empty.");
            return;
        }

        student highestStu = studentList.get(0);

        for (student st : studentList) {
            if (st.calculateAverageScore() > highestStu.calculateAverageScore()) {
                highestStu = st;
            }
        }
        System.out.println("The student with the highest average score: ");
        highestStu.display();
    }

    // 6. Find the student with the lowest average score
    public void lowestAverageScore() {
        if (studentList.isEmpty()) {
            System.out.println("The student list is empty.");
            return;
        }

        student lowestStu = studentList.get(0);

        for (student st : studentList) {
            if (st.calculateAverageScore() < lowestStu.calculateAverageScore()) {
                lowestStu = st;
            }
        }

        System.out.println("The student with the lowest average score: ");
        lowestStu.display();
    }

    // 7. Sort students by name
    public void sortStudentByName() {
        if (studentList.isEmpty()) {
            System.out.println("The student list is empty.");
            return;
        }

        studentList.sort((st1, st2) -> st1.getFullName().compareTo(st2.getFullName()));
        System.out.println("The list of students sorted by name: ");
        displayStudentList();
    }

    // 8. Update student information by ID
    public void updateStudentInfoById(Scanner sc) {
        if (studentList.isEmpty()) {
            System.out.println("The student list is empty.");
            return;
        }

        System.out.println("Please enter the ID of the student to be updated: ");
        String id = sc.nextLine();
        student st = findStudentId(id);

        if (st == null) {
            System.out.println("This student ID does not exists. Please enter another ID.");
            return;
        }

        System.out.println("Please enter new student's full name: ");
        String fullName = sc.nextLine();
        System.out.println("Please enter the new student's class: ");
        String studentClass = sc.nextLine();
        System.out.println("Please enter the new student's address: ");
        String address = sc.nextLine();
        System.out.println("Please enter the new student's Math score: ");
        double math = Double.parseDouble(sc.nextLine());
        System.out.println("Please enter the new student's Physics score: ");
        double physics = Double.parseDouble(sc.nextLine());
        System.out.println("Please enter the new student's Chemistry score: ");
        double chemistry = Double.parseDouble(sc.nextLine());

        st = new student(id, fullName, studentClass, address, math, physics, chemistry);

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.set(i, st);
                break;
            }

            System.out.println("Student information has been updated successfully!");
        }
    }

    // 9. Display students with a total score greater than 24
    public void totalScoreGreaterThan24() {
        if (studentList.isEmpty()) {
            System.out.println("The student list is empty.");
            return;
        }

        System.out.println("Students with a total score greater than 24:");
        ArrayList<student> studentWithTotalScoreGreaterThan24 = new ArrayList<>();

        for (student st : studentList) {
            if (st.calculateTotalScore() > 24) {
                studentWithTotalScoreGreaterThan24.add(st);
            }
        }

        if (studentWithTotalScoreGreaterThan24.isEmpty()) {
            System.out.println("There is no student with a total score greater than 24.");
        } else {
            for (student st : studentWithTotalScoreGreaterThan24) {
                st.display();
            }
        }
    }

    // 10. Display students with a total score less than 18
    public void totalScoreLessThan18() {
        if (studentList.isEmpty()) {
            System.out.println("The student list is empty.");
            return;
        }

        System.out.println("Students with a total score less than 18:");
        ArrayList<student> studentWithTotalScoreLessThan18 = new ArrayList<>();

        for (student st : studentList) {
            if (st.calculateTotalScore() < 18) {
                studentWithTotalScoreLessThan18.add(st);
            }
        }

        if (studentWithTotalScoreLessThan18.isEmpty()) {
            System.out.println("There is no student with a total score less than 18.");
        } else {
            for (student st : studentWithTotalScoreLessThan18) {
                st.display();
            }
        }
    }

    // 11. Display students with excellent performance (average score > 8)
    public void excellentPerformance() {
        if (studentList.isEmpty()) {
            System.out.println("The student list is empty.");
            return;
        }

        System.out.println("Students with excellent performance (average score > 8).");
        ArrayList<student> studentWithExcellentPerformance = new ArrayList<>();

        for (student st : studentList) {
            if (st.calculateAverageScore() > 8) {
                studentWithExcellentPerformance.add(st);
            }
        }

        if (studentWithExcellentPerformance.isEmpty()) {
            System.out.println("There is no student with excellent performance (average score > 8).");
        } else {
            for (student st : studentWithExcellentPerformance) {
                st.display();
            }
        }
    }
}
    // 12. Exit the program


