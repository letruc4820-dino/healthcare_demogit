package bai_tap;

import java.util.Scanner;

public class bai_tap_buoi2a {
    public static void main(String[] args) {
        //v1i dụ: xếp loại học sinh dựa trên điểm tb
        // đtb < 5.0: học sinh yếu
        //5.0 <= đtb < 7.0: trung bình
        //7.0 <= dtb < 8.5: khá
        //8.5 <= dtb <= 10: giỏi
        // cho nhập điểm 3 môn: toán, văn, anh và họ tên

        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập họ và tên:");
//        String hoTen = sc.nextLine();
//        System.out.println("Điểm toán:");
//        double diemToan = sc.nextDouble();
//        System.out.println("Điểm văn:");
//        double diemVan = sc.nextDouble();
//        System.out.println("Điểm anh:");
//        double diemAnh = sc.nextDouble();
//
//        //process
//        double dtb = (diemAnh + diemToan + diemVan) / 3;
//        String xepLoai = "";
//
//        if (dtb < 5.0 ) {
//            xepLoai = "Yếu";
//        } else if (dtb >= 5.0 && dtb < 7.0) {
//            xepLoai = "Trung bình";
//        } else if (dtb >= 7.0 && dtb < 8.5) {
//            xepLoai = "Khá";
//        } else if (dtb >= 8.5 && dtb <= 10) {
//            xepLoai = "Giỏi";
//        } else {
//            xepLoai = "Điểm không hợp lệ - vui lòng nhập lại";
//        }
//        System.out.println("Hoc sinh: " + hoTen + " có xếp loại là: " +xepLoai);

        //bai tap 2: tính tiền diện
        //điều kiện: nếu số tiêu thụ <= 50kwh thì giá điện là 1000đ/kw
        //nếu số điên tiêu thụ <=100 thì giá điện là 1200d/kw
        //nếu số điện tiêu thụ > 100 thì giá điêện là 1500
//        System.out.println("Nhập số điện tiêu thụ: ");
//        double soDien = sc.nextDouble();
//
//        double tienDien = 0;
//        if (soDien <= 50) {
//            tienDien = soDien * 1000;
//        } else if (soDien > 50 && soDien <= 100) {
//            tienDien = soDien * 1200;
//        } else if (soDien > 100) {
//            tienDien = soDien * 1500;
//        } else {
//            System.out.println("Số điện tiêu thụ không hợp lệ - vui lòng nhập lại");
//        }
//        System.out.println("Số điện tiêu thụ: " + soDien);
//        System.out.println("Tiền điện: " + tienDien);

        //bài tập 3: tính tiền taxi
        //điều kiện: km đầu tiên là 20000
        //km tiếp theo từ 2-5km là 15000/km
        //km tiếp theo từ 5-10km là 12k
        //km tiếp theo > 10 là 10k
        System.out.println("Nhập số km:");
        double soKm = sc.nextDouble();

        double tienTaxi = 0;
        if (soKm < 2) {
            tienTaxi = soKm * 20000;
        } else if (soKm >= 2 && soKm <= 5) {
            tienTaxi = 20000 + (soKm - 1) * 15000;
        } else if (soKm >= 5 && soKm <= 10) {
            tienTaxi = 20000 + 4 * 15000 + (soKm - 5) * 12000;
        } else if (soKm > 10) {
            tienTaxi = 20000 + 4 * 15000 + 5 * 12000 + (soKm - 10) * 10000;
        } else {
            System.out.println("Số km không hợp lệ - vui lòng nhập lại");
        }
        System.out.println("Số tiền Taxi: "+tienTaxi);
        }

    }












