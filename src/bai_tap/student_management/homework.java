package bai_tap.student_management;

import bai_tap.buoi_5.quanly_nhanvien.employeeManagement;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        //Đề bài: Quản lý học sinh
// 1. Add a student
// 2. Display the student list
// 3. Delete a student by ID
// 4. Search for a student by ID
// 5. Find the student with the highest average score
// 6. Find the student with the lowest average score
// 7. Sort students by name
// 8. Update student information by ID
// 9. Display students with a total score of over 24
// 10. Display students with a total score below 18
// 11. Display students with excellent performance (average score > 8)
// 12. Exit the program
// học sinh = {id, hoTen, lop, diaChi, toan, ly, hoa}
        Scanner sc = new Scanner(System.in);
        studentManagement studentManagement = new studentManagement();
        int choice;
        do {
            System.out.println("==== Student Management ====");
            System.out.println("1. Add a new student.");
            System.out.println("2. Display the list of students.");
            System.out.println("3. Delete a student by ID.");
            System.out.println("4. Search for a student by ID.");
            System.out.println("5. Find the student with the highest average score.");
            System.out.println("6. Find the student with the lowest average score.");
            System.out.println("7. Sort students by name.");
            System.out.println("8. Update student information by ID.");
            System.out.println("9. Display students with a total score greater than 24.");
            System.out.println("10. Display students with a total score less than 18.");
            System.out.println("11. Display students with excellent performance (average score > 8).");
            System.out.println("12. Exit the program.");
            System.out.println("================================");
            System.out.println("Please enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    studentManagement.addStudent(sc);
                    break;
                case 2:
                    studentManagement.displayStudentList();
                    break;
                case 3:
                    studentManagement.deleteStudent(sc);
                    break;
                case 4:
                    studentManagement.findStudent(sc);
                    break;
                case 5:
                    studentManagement.highestAverageScore();
                    break;
                case 6:
                    studentManagement.lowestAverageScore();
                    break;
                case 7:
                    studentManagement.sortStudentByName();
                    break;
                case 8:
                    studentManagement.updateStudentInfoById(sc);
                    break;
                case 9:
                    studentManagement.totalScoreGreaterThan24();
                    break;
                case 10:
                    studentManagement.totalScoreLessThan18();
                    break;
                case 11:
                    studentManagement.excellentPerformance();
                    break;
                case 12:
                    System.out.println("You have exited the program!");
                    break;
                default:
                    System.out.println("Your choice is invalid. Please enter again.");
            }
        } while (choice != 12);
    }
}
