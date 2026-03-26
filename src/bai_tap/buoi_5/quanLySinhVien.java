package bai_tap.buoi_5;

import java.util.ArrayList;
import java.util.Scanner;

//sinh vien = {id, name, age, address, score} => array [] hoặc ArrayList <dynamic>
public class quanLySinhVien {
    //thuộc tính
    private ArrayList<sinhVien> danhSachSinhVien = new ArrayList<>();

    //phương thức thêm sinh viên
    public void themSinhVien (Scanner sc){
        //tạo đối tượng sinh viên từ lớp đối tượng
        sinhVien sv = new sinhVien();
        //gọi phương thức input để nhập thông tin sinh viên
        sv.input(sc);
        //thêm sinh viên vào danh sách
        danhSachSinhVien.add(sv);
        System.out.println("Thêm sinh viên thành công!");
    }

    //phương thức hiển thị danh sách SV
    public void hienThiDanhSachSinhVien(){
        //2 trường hợp sẽ xảy ra
        //nếu ds sinh viên rỗng => thong6 báo rỗng
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng~");
        }   else {
            //nếu ds sinh viên không rỗng thì in ds sinh viên
            for (sinhVien sv : danhSachSinhVien){
                sv.display();
            }
        }
    }

    //phương thức xóa sinh viên dựa vào id
    public void xoaSinhVien (Scanner sc){
        System.out.println("Nhập vào id sinh viên cần xóa: ");
        String id = sc.nextLine();
        // giải quyết baài toán theo phương pháp đặt cờ hiệu (flag)
        boolean found = false; //chưa tìm thấy sinh viên cần xóa
        for (sinhVien sv : danhSachSinhVien){
            if ((sv.getId()).equals(id)){
                danhSachSinhVien.remove(sv);
                System.out.println("Xóa sinh viên thành công!");
                found = true; // đã tìm thấy sinh viên cần xóa
                break;
            }
        }
        if (!found){
            System.out.println("Không tìm thấy sinh viên với id: " + id);
        }
    }

    //phương thức tìm sinh viên dựa vào id
    public void timSinhVien(Scanner sc){
        System.out.println("Nhập vào id sinh viên cần tìm: ");
        String id = sc.nextLine();
    boolean found = false;
    for (sinhVien sv : danhSachSinhVien){
        if ((sv.getId()).equals(id)){
            System.out.println("Thông tin sinh viên cần tìm: ");
            sv.display();
            found = true;
            break;
        }
    }
    if (!found){
        System.out.println("Không tìm thấy sinh viên theo id: " + id);
    }
    }
}
