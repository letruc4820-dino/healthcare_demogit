package bai_tap.buoi_5;

import java.util.Scanner;

public class sinhVien {
    //thuộc tính
    private String id;
    private String name;
    private int age;
    private String address;
    private double score;

    //constructor mặc định không có tham số
    public sinhVien (){}

    //constructor
    public sinhVien(String id, String name, int age, String address, double score){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.score = score;
    }
    //phương thức
    //phương thức input đê nhận thông tin sinh viên
    public void input(Scanner sc){
        System.out.println("Nhập id: ");
        this.id = sc.nextLine();
        System.out.println("Nhập name: ");
        this.name = sc.nextLine();
        System.out.println("Nhập age: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập address: ");
        this.address = sc.nextLine();
        System.out.println("Nhập score: ");
        this.score = sc.nextDouble();
        sc.nextLine(); //để đọc bỏ dòng mới sau khi nhập score
    }
    //phương thức display để hiển thị thông tin sinh viên
    public void display(){
        System.out.println("ID: " + id +
                " | Name: " + name +
                " | Age: " + age +
                " | Address: " + address +
                " | Score: " + score);
    }

    //phương thức getID đế lấy id sinh viên
    public String getId(){
        return id;
        }
}
