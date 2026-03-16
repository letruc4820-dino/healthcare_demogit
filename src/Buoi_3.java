import java.util.Arrays;

public class Buoi_3 {
    public static void main(String[] args) {
//        int soA = 10;
//        int soB = 20;
        //array: mảng, là 1 cấu trúc dữ liệu dùng để lưu nhiều giá trị cùng kiểu dữ liệu
        //cùng mục đích sử dụng;
        //khai báo biến: kiểu dữ liệu tenBien = giá trị;
//        //khai báo mảng: kiểu dữ liệu [] tenMang = new kiểu dữ liệu [kích thước]; -> số lượng phân tử của mảng
//        int[] mangSo = new int [5];
//        // vị trí của giá trị trong 1 mảng được gọi là index, bắt đầu từ 0
//        mangSo[0] = 1;
//        mangSo[1] = 2;
//        mangSo[2] = 3;
//        mangSo[3] = 4;
//        mangSo[4] = 5;
//
//        System.out.println("Giá trị của phần tử có index 0: " + mangSo[2]);
//        System.out.println("Giá trị của mảng: " + Arrays.toString(mangSo));
//
//        //khai báo mảng: kiểu dữ liệu[] tenMang = {giá trị 1, giá trị 2,...};
//        String[] mangTen = {"khung long", "abc"};
//        mangTen[0] = "Gấu"; //dùng update mảng[0] ban đầu đã khai báo: khung long => Gấu
//        System.out.println("Giá trị của mảng có index 0: "+mangTen[0]);
//        System.out.println("Số lượng phần tử của mảng: " + mangTen.length);
//        //.length: trả về số lượng phần tử của mảng
//
//        //duyệt mảng: sử dụng vòng lặp để duyệt qua tất cả phần tử của mảng
//        for(int i = 0; i < mangTen.length; i++){
//            System.out.println("Phần tử có index " + i + " là: " + mangTen[i]);
//        }
//        //for .. each
//        //cú pháp: for (kiểu dữ liệu tenBien : tenMang){logic sử dụng tenBien}
//        for (String ten : mangTen){
//            System.out.println("Tên học sinh: " + ten);
//        }
        //if else statement
        // ví dụ:
        int diem = 85;
        if (diem >= 80){
            System.out.println("Học sinh đạt điều kiện.");
        } else {
            System.out.println("Học sinh không đạt điều kiện.");
        }
        //toán tử 3 ngôi:
        // cú pháp: điều kiện đúng? trả ra logic A : trả ra logic B
//        System.out.println(diem >= 80 ? "Học sinh đạt điều kiện" : "Học sinh không đạt điều kiện");
        String ketQua = diem >= 80 ? "Học sinh đạt điều kiện" : "Học sinh không đạt điều kiện";
        System.out.println(ketQua);

        //ép kiểu dữ liệu: chuyển đổi từ kiểu dữ liệu này sang kiểu dữ liệu khác
        //ép kiểu ngầm định: tự động chuyển đổi kiểu d liệu nhỏ sang lớn hơn của cùng loại dữ kiệu
        //kiểu dữ liệu số: byte < short < int < long < float < double
        byte so1 = 10;
        int so2 = so1; //ép kiểu ngầm định từ byte sang int
        System.out.println("Giá trị của số 2: " + so2);

        //ép kiều tường minh: tự động chuyển đổi kiểu dữ liệu lớn hơn sang nhỏ hơn của cùng 1 loại dữ liệu
        //cú pháp: <kiểu dữ liệu cần chuyển> tenBien = (kiểu dữ liệu cần chuyển) giá trị cần chuyển
        double so3 = 3.14;
        int so4 = (int)so3; // ép kiểu tường minh từ double sang int
        System.out.println("giá trị của số 4: " +so4);

        //ép kiểu từ số sang chuỗi hoặc ngược lại
        int so5 = 100;
        String str5 = Integer.toString(so5); //ép từ số sang chuỗi
        System.out.println("Giá trị của st5: " + str5);

        String str6 = "200";
        int so6 = Integer.parseInt(str6); //ép từ chuỗi sang số
        System.out.println("Giá trị của st6: " + str6);
        //cú pháp: kiểu dữ liệu cần chuyển.parseKieu dữ liệu cần chuyển(giá trị cần chuyển)


        //testtttt






    }
}
