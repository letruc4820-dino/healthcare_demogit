package bai_tap;

import java.util.Scanner;

public class baitap_buoi3 {
    public static void main(String[] args) {
        //BT1: quản lý chi tiêu cá nhân trong 7 ngày
        //cho phép người dùng nhập vào chi tiêu, sau đó in ra tổng chi tiêu và trung bình chi tiêu mỗi ngày
        //in ra chi tiêu cao nhất và thấp nhất trong 7 ngày
        Scanner sc = new Scanner(System.in);
//        double[] chiTieu = new double[7];
//
//        for(int i = 0; i < chiTieu.length; i++){
//            System.out.println("nhập vào chi tiêu ngày " + (i + 1) + " : ");
//            chiTieu[i] = sc.nextDouble();
//        }
//        double  tongChiTieu = 0;
//        double chiTieuTrungBinh = 0;
//        double chiTieuCaoNhat = chiTieu[0];
//        double chiTieuThapNhat = chiTieu[0];
//        for (double chiTieuNgay : chiTieu){
//            tongChiTieu += chiTieuNgay; //tong chi tieu = tong chi tieu + chi tieu ngay
//            if (chiTieuNgay > chiTieuCaoNhat){
//                chiTieuCaoNhat = chiTieuNgay;
//            }
//            if (chiTieuNgay < chiTieuThapNhat){
//                chiTieuThapNhat = chiTieuNgay;
//            }
//        }
//        chiTieuTrungBinh = tongChiTieu / chiTieu.length;
//        System.out.println("Tổng chi tiêu trong 7 ngày: " + tongChiTieu);
//        System.out.println("Trung bình chi tiêu 1 ngày: " + chiTieuTrungBinh);
//        System.out.println("Chi tiêu cao nhất: " + chiTieuCaoNhat);
//        System.out.println("Chi tiêu thấp nhất: " + chiTieuThapNhat);

        //BT2: quản lý điểm số học sinh, cho phép người dùng nhập điểm 5 môn
        // in ra điểm trung bình, điểm cao nhất và thấp nhất,
        // và số môn học có điểm số >= 5.0;
//        double[] diemMonHoc = new double[5];
//        for(int i = 0; i < diemMonHoc.length; i++) {
//            System.out.println("Nhập vào điểm môn " + (i + 1) + " : ");
//            diemMonHoc[i] = sc.nextDouble();
//        }
//        double diemTrungBinh = 0;
//        double diemTong = 0;
//        double diemCaoNhat = diemMonHoc[0];
//        double diemThapNhat = diemMonHoc[0];
//        int soMonLonHonBang5 = 0;
//        for (double diem : diemMonHoc){
//            diemTong += diem;
//            if (diem > diemCaoNhat){
//                diemCaoNhat = diem;
//            }
//            if (diem < diemThapNhat){
//                diemThapNhat = diem;
//            }
//            if (diem >= 5){
//                soMonLonHonBang5++;
//            }
//        }
//        diemTrungBinh= diemTong / diemMonHoc.length;
//
//        System.out.println("Điểm trung bình: " + diemTrungBinh);
//        System.out.println("Điểm cao nhất: " + diemCaoNhat);
//        System.out.println("Điểm thấp nhất: " + diemThapNhat);
//        System.out.println("Số môn có điểm >= 5: " + soMonLonHonBang5);

        //BT3: quản lý thông tin nhân viên, cho phép người dùng nhập thông tin nhân viên
        // số giờ làm mỗi ngày trong tuần, sau  đó in ra tổng giờ làm trong tuần, trung bình số giờ làm mỗi ngày
        // và số ngày làm việc có số giờ làm >= 8 giờ.
        int[] soGioLam = new int[7];
        for(int i = 0; i < soGioLam.length; i++) {
            System.out.println("Nhập số giờ làm ngày thứ " + (i + 1) + " : ");
            soGioLam[i] = sc.nextInt();
        }
        int tongSoGioLam = 0;
        double soGioLamTrungBinh = 0;
        int soNgayLamViecLonHonBang8 = 0;

        for (int gio : soGioLam){
            tongSoGioLam += gio;
            if (gio >= 8){
                soNgayLamViecLonHonBang8++;
            }
        }
        soGioLamTrungBinh = (double) tongSoGioLam /soGioLam.length; //int -> ép kiểu sang double
        System.out.println("Tổng số giờ làm trong tuần: " + tongSoGioLam);
        System.out.println("Trung bình số giờ làm mỗi ngày: " + soGioLamTrungBinh);
        System.out.println("Số ngày laàm việc có số giờ làm >= 8 giờ: " + soNgayLamViecLonHonBang8);



    }
}
