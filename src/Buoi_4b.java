import java.security.spec.RSAOtherPrimeInfo;

public class Buoi_4b {
    public static void main(String[] args) {
        //object và class
        //class: là 1 khuôn mẫu để tạo ra đối tượng, nó định nghĩa các thuộc tính và phương thức dùng chung của đối tượng
        //object: là 1 thực thể cụ thể được tạo ra từ class, nó có các thuộc tính và phương thức riêng của nó
        // class là bản thiết kế ngôi nhà, object là ngôi nhà được xây dựng từ bản thiết kế đó

        //ví dụ: tạo class sinh viên: tên, tuổi, điểm hóa, toán, lý, trung bình, xếp loại
        //tạo đối tượng sinh vie6n từ class sinhVien
        //tenclass tenDoiTuong = new tenClass (giá trị thuộc tính);
        sinhVien sv1 = new sinhVien("Tuấn Tài", 18, 8, 7, 6);
        sinhVien sv2 = new sinhVien("Isaac", 19, 8.5, 7.5, 6.5);

        //truy cập vào các thuôc tính và phương thức của ối tượng
        double dtb1 = sv1.tinhDiemTrungBinh();
        System.out.println("Điểm trung bình của sinh viên " +sv1.ten + " là: " + dtb1);
        sv1.xeploai();
      //  System.out.println("số tuổi của " +sv1.ten + "là: " +sv1.tuoi);
        //lỗi vì thuộc tính tuổi là private, không thể truy cập trực tiếp từ bên ngoài class
    }
}
//public: là 1 phạm vi truy cập, cho phép truy cập từ bất kỳ đâu trong chương trình
//private: là 1 phạm vi truy cập, phải thông qua phương thức mới đọc thuộc tính được (truy cập từ bên trong class)
//readonly: chỉ cho phép truy cập từ bên trong class, không cho phép sửa đổi giá trị thuộc tính
class sinhVien {
    //thuộc tính
    public String ten;
    private int tuoi;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    //constructor: là một phương thức đặc biệt được sử dụng được khởi tạo đối tượng, nó có cùng tên với class
    public sinhVien(String ten, int tuoi, double diemToan, double diemLy, double diemHoa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    //phương thức
    //tạo hàm hay là tạo phương thức
    // 1. có giá trị trả về; public kiểu dữ liệu tenPhuongThuc() {Logic sử dụng các thuộc tính của đối tượng, return giá trị}
    // 2. không có giá trị trả về (void): public void tenPhuongThuc() {logic sử dụng các thuộc tính của đối tượng}

    // tính điểm trung bình: sử dụng phương thức có giá trị trở về
    public double tinhDiemTrungBinh() {
        double diemTrungBinh = (diemHoa + diemLy + diemToan) / 3;
        return diemTrungBinh;
    }

    public void xeploai() {
        double diemTrungBinh = tinhDiemTrungBinh();
        if (diemTrungBinh >= 8) {
            System.out.println("Học sinh đạt loại giỏi");
        } else if (diemTrungBinh >= 6.5) {
            System.out.println("Học sinh đạt loại khá");
        } else if (diemTrungBinh >= 5) {
            System.out.println("Học sinh đạt loại trung bình");
        } else {
            System.out.println("Học sinh đạt loại yếu");
        }
    }
}
