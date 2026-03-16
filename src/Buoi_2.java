import java.sql.SQLOutput;
import java.util.Scanner;

public class Buoi_2 {
    public static void main(String[] args) {
        //4.3 toán tử gán: "=:
//        String ngay = "thứ 2: 09.03.2026";
//        int soA = 10;
//        // soA = soA + 5 => soA +=5
//        soA += 5; //tương đương soA = soA + 5
//        System.out.println("SoA: " + soA);
//        soA -= 3; //tương đương soA = soA - 3
//        System.out.println("SoA: " + soA);
//        soA *= 2; //tương đương soA = soA * 2
//        System.out.println("SoA: " + soA);
//        soA /= 1; //tương đương soA = soA / 1
//        System.out.println("SoA: " + soA);
// 4.4 toán tử kiểu logic" &&, ||, !: sử dụng những biến kiểu Boolean
//        //&& kết hợp tất cả các điều kiện
//        Boolean logicA = true;
//        Boolean logicB = true;
//        Boolean logicC = false;
//        Boolean ketQua1 = logicA && logicB && logicC; //vì C false nên kết quả là Fasle
//        System.out.println("ket qua 1 = " +ketQua1);
//
//        // || hoặc logicA hoặc logicB
//        Boolean logicD = false;
//        Boolean logicE = false;
//        Boolean logicF = true; // chỉ cần 1 cái true thì tất cả true
//        Boolean ketQua2 = logicD || logicE || logicF;
//        System.out.println("Ket qua 2 = "+ketQua2);
//
//        // ! phủ định: đảo ngược giá trị của logic
//        Boolean logicG = true;
//        Boolean ketQua3 = !logicG;
//        System.out.println("Ket qua 3 = "+ketQua3);

        //tiền tố và hậu tố

        // cấu trúc câu điều kiện
        // if statement:
        // if (điều kiện đúng){thực hiện logic}
//        int thu = 2;
//        if(thu == 2 || thu == 6){
//            System.out.println("Hôm nay bạn cần đi học");}
        //if else statement:
        //if(điều kiện đúng) {logic A} else {logic B}

        //bài tập: kiểm tra sinh viên có qua môn học hay không, với điều kiện là điểm >= 5.0,
        // và không được nghỉ quá 3 buổi

        //input: dtb, số buổi nghỉ
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập điểm trung bình: ");
//        double dtb = sc.nextDouble();
//        System.out.println("Số buổi nghỉ: ");
//        int soBuoiNghi = sc.nextInt();
//
//        //process: kiểm tra điều kiện
//        Boolean isQuaMon = dtb >= 5.0 && soBuoiNghi <= 3;
//        if (isQuaMon) {
//            System.out.println("Sinh viên đã qua môn");
//        } else {
//            System.out.println("Sinh viên không qua môn");
//        }

            //output: in ra kết quả
//        System.out.println("Kết quả học sinh có qua môn hay không: "+ isQuaMon);
        //if else if statement
        //if (A đúng) {logic A} else if {B đúng} {logic B} else {logic C}
        //switch case statement:
        //switch (điều kiện cần kiểm tra)
        //case giá trị 1: thực hiện logic 1; break;
        //case giá trị 2: thực hiện logic 2; break;
        //case giá trị 3: thực hiện logic 3; break;
        //default: thực hiện logic mặc định; break;
        //default chỉ xảy ra khi không có giá trị nào thỏa với điều kiện cần kiểm tra

//        int soC = 8;
//        switch (soC) {
//            case 1:
//                System.out.println("Số C là 1");
//                break;
//            case 2:
//                System.out.println("Số C là 2");
//                break;
//            case 3:
//                System.out.println("Số C là 3");
//                break;
//        }

//        switch (soC) {
//            case 1:
//                System.out.println("Số C là 1");
//                break;
//            case 2:
//            case 3:
//                System.out.println("SỐ C là 2 hoặc 3");
//                break;
//            default:
//                System.out.println("Số C không phải là 1, 2 hoặc 3");
//                break;
//        }
        // vòng lặp While
        // cú pháp: while (điều kiện đúng) {thực hiện logic}
        // miễn là điều kiện luôn đúng thì vòng lặp sẽ tiếp tục thực hiện
//        int soD = 2;
//        while (soD <=10) {
//            System.out.println("soD: " + soD);
//            soD += 2;
//        }
//        int soE = 1;
//        while (soE <= 5) {
//            System.out.println("soE: " + soE);
//            soE ++; // soE ++ -> tăng 1 đơn vị, soE -- -> giảm 1 đơn vị => hậu tố (giải quyết trước đó và kết thúc với ++ -- là hậu tố)
//        }
         // vòng lặp do ... while
        // cú pháp: do {thực hiện logic} while (điều kiện đúng);
        // logic sẽ được thực hiện ít nhất 1 lần dù điều kện đúng hay sai

//        int soF = 1;
//        do {
//            System.out.println("số F: " + soF);
//            soF ++;
//        } while ( soF <= 3);// điều kiện = false thì vòng lặp mới dừng

        // vòng lặp For (*)
        // cú pháp: For (giá trị khởi tạo; điều kiện đúng, giá tr thay đổi) {thực hiện logic}
        // lưu ý: dùng khi biết số lần lặp cụ thể

        for (int i = 1; i < 5; i ++){
            System.out.println("i: "+i);
        }





    }
    }
