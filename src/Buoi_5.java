public class Buoi_5 {
    public static void main(String[] args) {
        //4 tính chất của oop: tính đóng gói, tính kế thừa, tính đa hình, tính trừu tượng

        //tiính đóng gói
        student st1 = new student("Isaac",18, "12a5");
        String name = st1.getName();
        System.out.println("Họ tên học sinh: " + name);
        //tính kế thừa
        giamDoc gd1 = new giamDoc("Isaac",30,"Phòng kinh doanh", "Boss");
      //  gd1.thongTinGiamDoc();
        gd1.thongTinNhanVien();
    }
}

//tính đóng gói: chỉ cho phép truy cập các thuộc tính của đối tượng thông qua các phương thức
class student {
    //thuộc tính
    private String name;
    private int age;
    private String grade;

    //constructor
    public student (String name, int age, String grade) {
        this.name = name; //(this = student; .name = name thuộc tính; name = name constructor)
        this.age = age;
        this.grade = grade;
    }

    //tạo ra phương thức đế truy cập vào thuộc tính
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGrade(){
        return grade;
    }
    // có 3 cách để gắn giá trị cho thuộc tính
    //1. gán trực tiếp vào trong class (không sử dụng constructor)
    //2. gán trực tiếp khi tạo đối tượng (sử dụng constructor) (phổ biến nhất)
    //3. gán thông qua phương thức setter (sử dụng phương thức có giá trị trả về) (ít sử dụng)
//    public void setName(String name) {
//        this.name = name;
    }

    //tính kế thừa: cho phép tạo lớp mói từ lớp đã tồn tại và kế thừa toàn bộ thuộc tính của lớp cha, có thể
// có thêm các thuộc tính và phương thức mới
class nhanVien {
    //thuộc tính
        public String name;
        private int age;
        private String room;
        //constructor
        public nhanVien(String name, int age, String room) {
            this.name = name;
            this.age = age;
            this.room = room;
        }
        //phương thức
        public void thongTinNhanVien(){
            System.out.println("Đây là nhân viên");
        }
    }

class giamDoc extends nhanVien { // kế thừa từ employee, chỉ cần nêu thuộc tính cho cái mới, constructor thêm super
    //thuộc tính
    private String chucVu;

    //constructor
    public giamDoc(String name, int age, String room, String chucVu){
       //super: dùng để gọi constructor của lớp cha, phải được đặt đầu tiên của constructor lớp con
        super(name,age,room);
        this.chucVu = chucVu;
    }//gọi constructor của lớp cha để khởi
    //phương thức
//    public void thongTinGiamDoc(){
//        System.out.println("Đây là giám đốc");
//    }
    @Override
    public void thongTinNhanVien(){
        System.out.println("Đây là giám đốc");
    }
}
//tính đa hình: một hành động/phương thức có nhiều cách thực hiện khác nhau
//tính trừu tượng:
//tính diện tích của 1 hình trong hình học
abstract class hinhHoc {
    public String tenHinh;
    public int canhA;
    public int canhB;

    public hinhHoc(String tenHinh, int canhA, int canhB){
        this.tenHinh = tenHinh;
        this.canhA = canhA;
        this.canhB = canhB;
    }
    //phương thức
abstract public int tinhDienTich(); //phương thức trừu tượng
}

class hinhChuNhat extends hinhHoc {
    public hinhChuNhat(String tenHinh, int canhA, int canhB){
        super(tenHinh, canhA, canhB);
    }
    //triển khai phương thức trừu tượng
    public int tinhDienTich(){
        return canhA * canhB;
    }
}

class hinhVuong extends hinhHoc {
    //constructor
    public hinhVuong(String tenHinh, int canhA, int canhB) {
        super(tenHinh, canhA, canhB);
    }
    //triển khai phương thức trừu tượng
        public int tinhDienTich() {
            return canhA * canhB;
        }
    }
