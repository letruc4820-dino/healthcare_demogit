package bai_tap;

import java.util.Scanner;

public class bai_tap_buoi1 {
    public static void main(String[] args) {
        //bài 1: tính điềm trung bình của học sinh, cho phép nhập vào họ và tên, điểm toán, lý, hóa
        // sau đó in ra thông tin của học sinh đó
        //bài 2: tính lương nhân viên, cho phép nhập vào họ tên, lương cơ bản, số ngày làm việc.
        // sau đó in ra thông tin của nhân viên
//
//        //bài 1:
        Scanner sc = new Scanner (System.in);
//        //nhập họ tên:
//        System.out.println("Nhập thông tin học sinh:");
//        System.out.println("Họ và tên: ");
//        String hoTen = sc.nextLine();
//        //nhập điểm toán, lý, hóa:
//        System.out.println("Điểm toán: ");
//        int diemToan = sc.nextInt(); //hoặc là float số thập phân
//        System.out.println("Điểm lý: ");
//        int diemLy = sc.nextInt();
//        System.out.println("Điểm hóa: ");
//        int diemHoa = sc.nextInt();
//        //tính điềm trung bình
//        float dtb = (diemToan + diemLy + diemHoa)/3;
//        System.out.println("Điểm trung bình: " + dtb);
//
//        System.out.println("Thông tin học sinh:");
//        System.out.println("Họ và tên: " + hoTen);
//        System.out.println("Điểm toán: " + diemToan);
//        System.out.println("Điểm lý: " + diemLy);
//        System.out.println("Điểm hóa: " + diemHoa);
//        System.out.println("Điểm trung bình 3 môn: " +dtb);
//
        //sử dụng mô hình IPO (Input, Process, Output)

        //bài 2:
        //nhập thông tin nhân viên:
        System.out.println("Nhập thông tin nhân viên:");
        System.out.println("Họ và tên nhân viên: ");
        String hoTenNV = sc.nextLine();
        //nhập lương cơ bản
        System.out.println("Lương cơ bản của 1 ngày: ");
        float luongCB = sc.nextFloat(); //hoặc là int, double
        System.out.println("Số ngày làm việc: ");
        float ngay = sc.nextFloat();
        //tính lương:
        float luong = luongCB * ngay;

        System.out.println("Thông tin nhân viên:");
        System.out.println("Họ và tên: "+hoTenNV);
        System.out.println("Lương cơ bản: "+ luongCB + " VND");
        System.out.println("Số ngày làm việc: "+ngay + " ngày");
        System.out.println("Lương thực nhận: "+luong + " VND");

    }
}
