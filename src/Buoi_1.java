import java.util.Scanner;
public class Buoi_1 {
    //snippet code: gõ code nhanh
    //comment code: ctrl + /
    public static void main(String[] args) {
        //1. lệnh xuất dữ liệu (sout: tạo nhanh)
        // print cùng dòng/println xuống dòng
////        System.out.print("Hello Truc");
////        System.out.print("Hello khung long");
//        System.out.println("Hello Truc");
//        System.out.println("Hello Truc12345");
//        System.out.println("hi hi hi");

        //2. biến: khu vực lưu trữ dữ liệu trên bộ nhớ
        // cú pháp: <kiểu dữ liệu> <tên biến> = giá trị
        //chuỗi: string
        //số: int (số nguyên); số thập phânfloat (7-8 số sau dấu phẩy)/double (15-16 số sau dấu phẩy)
        //boolean: true/false

////        //vd tạo ra biến tên là 'name'
//        String name = "Khung long";
//        String diaChi = "111 Street ABC";
//        int namSinh = 2000;
////        System.out.println(diaChi);
////        System.out.println(namSinh);
//
//        Boolean isStudent = true;
//        Boolean isLogin = false;
//        System.out.println("Họ và tên: " + name);
//        System.out.println("Địa chỉ: " +diaChi);
//        System.out.println("Năm sinh: "+namSinh);

        //3. scanner: dùng để nhận dữ liêu từ người dùng
        Scanner sc = new Scanner (System.in);
//        System.out.println("Nhập họ và tên:");
//        String hoTen = sc.nextLine(); //nhận dữ liệu dạng chuỗi
//        System.out.println("Họ và tên: " + hoTen);

        //nhập và in thông tin học sinh: ho ten,tuổi, trường, lớp
//        System.out.println("Nhập thông tin học sinh");
//        System.out.println("Họ và tên:");
//        String hoTenHocSinh = sc.nextLine();

//        System.out.println("Tuổi:");
//        int tuoi = sc.nextInt();
//        sc.nextLine(); // nextInt sang nextLine cần xóa dòng
//        System.out.println("Trường:");
//        String truongHoc = sc.nextLine();
//
//        System.out.println("Lớp:");
//        String lopHoc = sc.nextLine();
//
//        System.out.println("Họ và tên học sinh: " + hoTenHocSinh);
//        System.out.println("Tuổi: " + tuoi);
//        System.out.println("Trường: "+ truongHoc);
//        System.out.println("Lớp: "+ lopHoc);

        //4. toán tử
        //4.1 toán tử số học + - * / % (chia lấy dư)
        int soA = 5;
        int soB = 10;
        int tinhTong = soA + soB;
        int tinhHieu = soA - soB;
        int tinhTich = soA * soB;
        int tinhThuong = soA / soB;
        int tinhDu = soA % soB;
        System.out.println("Tổng: " + tinhTong + ", Hiệu: " + tinhHieu + ", Thương: " + tinhThuong + ", Tích: " + tinhTich + ", Dư: " +tinhDu);

        //4.2 toán tử so sánh
        // so sánh ==
        Boolean ketQua1 = soA == soB;
        System.out.println("A bằng B: " +ketQua1);
        //so sanh khác !=
        Boolean ketQua2 = soA != soB;
        System.out.println("A khác B: "+ ketQua2);
        //so sanh lớn hơn, bé hơn, lớn hơn bằng, bé hơn bằng
        Boolean ketQua3 = soA > soB;
        Boolean ketQua4 = soA >= soB;
        System.out.println("A lớn hơn B: " +ketQua3);
        System.out.println("A lớn hơn bằng B: " +ketQua4);

        String a = "hello";
        String b = "hello";
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        String c = new String("hello"); //1 lớp đối tượng, khi gõ 'c' có đề xuất nhiều
        System.out.println(System.identityHashCode(c));

        Boolean ketQua5 = a == b;
       // Boolean ketQua6 = c == b;
        // không bằng do c có string pool riêng, có id riêng,  khi so sánh sẽ xét luôn id
        // để so sánh được string => dùng "equal: giá trị nội dung"
        Boolean ketQua6 = b.equals(c);
        Boolean ketQua7 = b == c;

        System.out.println("a = b: " + ketQua5);
        System.out.println("c = b: " + ketQua6);
        System.out.println("b = c: " + ketQua7);




    }

}