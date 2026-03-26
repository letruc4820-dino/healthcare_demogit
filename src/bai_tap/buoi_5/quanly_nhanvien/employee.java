package bai_tap.buoi_5.quanly_nhanvien;

import java.util.Scanner;

public class employee {
    //nhân viên = {id, name, age, address, salaryPerHours, totalWorkingHours}
    private String id;
    private String name;
    private int age;
    private String address;
    private int salaryPerHours;
    private int totalWorkingHours;

    //constructor mặc định không có tham số
    public employee() {
    }

    //constructor
    public employee(String id, String name, int age, String address, int salaryPerHours, int totalWorkingHours) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salaryPerHours = salaryPerHours;
        this.totalWorkingHours = totalWorkingHours;
    }

    //phương thức
// phương thức input đê nhận thông tin nhân viên
//    public void input(Scanner sc) {
//        System.out.println("Nhập id nhân viên: ");
//        this.id = sc.nextLine();
//        System.out.println("Nhập tên nhân viên: ");
//        this.name = sc.nextLine();
//        System.out.println("Nhập tuổi nhân viên: ");
//        this.age = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Nhập địa chỉ của nhân viên: ");
//        this.address = sc.nextLine();
//        System.out.println("Nhập lương/giờ (VNĐ): ");
//        this.salaryPerHours = sc.nextInt();
//        System.out.println("Nhập tổng số giờ làm: ");
//        this.totalWorkingHours = sc.nextInt();
//        sc.nextLine();
//    }

    //phương thức display để hiển thị thông tin nhân viên
    public void display() {
        System.out.println("ID: " + id +
                " | Tên: " + name +
                " | Tuổi: " + age +
                " | Địa chỉ: " + address +
                " | Lương/giờ (VNĐ): " + salaryPerHours +
                " | Tổng số giờ làm: " + totalWorkingHours +
                " | Tổng lương: " + totalWorkingHours * salaryPerHours);
    }

    //phương thức getID đế lấy id nhân  viên
    public String getId() {
        return id;
    }

    //phương thức tính lương
    public int calculateSalary(){
        return totalWorkingHours * salaryPerHours;
    }

    //phương thức getSalaryPerHours
    public int getSalaryPerHours() {
        return salaryPerHours;
    }

    //phương thức getTotalWorkingHours
    public int getTotalWorkingHours() {
        return totalWorkingHours;
    }

    //phương thức getName
    public String getName() {
        return name;
    }
}