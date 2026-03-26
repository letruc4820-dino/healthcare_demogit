import java.util.ArrayList;
import java.util.Collections;

public class Buoi_4 {
    public static void main(String[] args) {
        //arraylist: là một cấu trúc dữ liệu động, có the thay đổi kích thước trong quá trình thực thi chương trình
        //cú pháp: ArrayList<kiểu dữ liệu> tenArrayList = new ArrayList<>();

        //v dụ: mảng điện thoại: iphone, samsung, oppo, xiaomi, realme
        ArrayList<String> mangDienThoai = new ArrayList<>();

        //CRUD cho ArrayList: create, read, update, delete
        //thêm phần tử vào arrayList: sử dụng phương thức add()
        //cú pháp: tenArrayList.add(giá trị);
        mangDienThoai.add("samsung"); //mangDienThoai = ["samsung"]
        mangDienThoai.add("iphone"); //mangDienThoai = ["samsung", "iphone"]
        mangDienThoai.add("realme");
        mangDienThoai.add("oppo");
        mangDienThoai.add("xiaomi");
        System.out.println("Giá trị của mảng điện thoại: " +mangDienThoai);

        //thêm vào vị trí cụ thể: sử dụng phương thức add(index, giá trị);
        mangDienThoai.add(1, "nokia"); //mangDienThoai = ["samsung", "nokia"]
        System.out.println("Giá trị của mảng điện thoại sau khi thêm nokia vào vị trí index 1: " +mangDienThoai);

        //cập nhật giá trị trong mảng: sử dụng set(index, giá trị);
        mangDienThoai.set(3, "GG Pixel");
        System.out.println("Giá trị của mảng điện thoại sau khi thay GG Pixel vào vị trí index 3:" + mangDienThoai);

        //Xóa phan26 tử trong mảng: remove(index)
        mangDienThoai.remove(0);
        System.out.println("Giá trị của mảng điện thoại sau remove vị trí index 0:" + mangDienThoai);

        //duyệt mảng
        for (String dienThoai :  mangDienThoai){
            System.out.println("Tên điện thoại: " +dienThoai);
        }

        //đếm số lượng phần tử trong mảng: phương thức size();
        System.out.println("SỐ lượng phần tử trong mảng điện thoại: " + mangDienThoai.size());
        //hoặc
        int soLuong = mangDienThoai.size();
        System.out.println("SỐ lượng phần tử trong mảng điện thoại: " +soLuong);

        ArrayList<Integer> mangSo = new ArrayList<>();
        mangSo.add(5);
        mangSo.add(8);
        mangSo.add(1);
        mangSo.add(2);
        //sắp xếp phần tử trong mảng: sort()
        Collections.sort(mangSo); //sắp xếp theo thứ tự tăng dần
        System.out.println("Giá trị của mảng sau khi sort: " + mangSo);
        // sau khi tăng dần rồi đảo ngược mảng: reverse()
        Collections.reverse(mangSo); //sắp xếp theo thứ tự tăng dần
        System.out.println("Giá trị của mảng sau khi reverse: " + mangSo);
        //tìm kiếm phần tử trong mảng: sử dụng phương thức contains()
        boolean ketQua = mangDienThoai.contains("iphone");
        boolean ketQua2 = mangSo.contains(2);
        System.out.println("kết quả tìm kié phần tử 'iphone' trong mảng đth: " + ketQua);
        System.out.println("kết quả tìm kié phần tử '2' trong mảng số: " + ketQua2);

        //object và class
        //class: là 1 khuôn mẫu để tạo ra đối tượng, nó định nghĩa các thuộc tính và phương thức dùng chung của đối tượng
        //object: là 1 thực thể cụ thể được tạo ra từ class, nó có các thuộc tính và phương thức riêng của nó
        // class là bản thiết kế ngôi nhà, object là ngôi nhà được xây dựng từ bản thiết kế đó





    }
}
