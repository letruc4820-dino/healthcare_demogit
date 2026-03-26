package bai_tap.buoi_5.quanly_nhanvien;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class employeeManagement {
    private ArrayList<employee> employeesList = new ArrayList<>();

    //1. add employee
//    public void addEmployee(Scanner sc) {
//        employee em = new employee();
//        em.input(sc);
//        employeesList.add(em);
//        System.out.println("Thêm nhân viên thành công!");
//    }
    public void addEmployee(Scanner sc) {
        System.out.println("Nhập ID nhân viên");
        String id = sc.nextLine();

        // kiểm tra id đã tồn tại hay chưa, nếu khác null => đã tồn tại => không cho thêm
        if (findEmployeeId(id) != null) {
            System.out.println("ID đã tồn tại. Vui lòng nhập ID khác.");
            return; // dừng phương thức nếu ID đã tồn tại
        }

        // nếu chưa tồn tại thì thêm mới
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Nhập lương/giờ: ");
        int salaryPerHours = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số giờ làm: ");
        int totalWorkingHours = Integer.parseInt(sc.nextLine());
        employee em = new employee(id, name, age, address, salaryPerHours, totalWorkingHours);
        employeesList.add(em);
        System.out.println("Thêm nhân viên thành công!");
    }

    //2. display
    public void employeesListData() {
        if (employeesList.isEmpty()) {
            System.out.println("Danh sách nhân viên rỗng.");
            return;
        }
        for (employee em : employeesList) {
            em.display();
        }
    }

    //3. remove
    public void removeEmployee(Scanner sc) {
        System.out.println("Nhập vào id nhân viên cần xóa: ");
        String id = sc.nextLine();
        boolean found = false;
        for (employee em : employeesList) {
            if ((em.getId()).equals(id)) {
                System.out.println("Xóa nhân viên thành công!");
                employeesList.remove(em);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy nhân viên với id " + id);
        }
    }

    //4. find employee
    public void findEmployee(Scanner sc) {
        System.out.println("Nhập vào id nhân viên cần tìm:");
        String id = sc.nextLine();
        boolean found = false;
        for (employee em : employeesList) {
            if ((em.getId()).equals(id)) {
                System.out.println("Thông tin nhân viên cần tìm: ");
                em.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên với id " + id);
        }
    }

    // tìm nhân viên theo id
    public employee findEmployeeId(String id) {
        for (employee em : employeesList) {
            if (em.getId().equals(id)) {
                return em;
            }
        }
        return null;
    }

    //5. employee has MAX salary
    public void findEmployeeHasMaxSalary() {
        //kiểm tra rỗng
        if (employeesList.isEmpty()) {
            System.out.println("Danh sách nhân viên trống.");
            return;
        }
        employee maxEm = employeesList.get(0);

        //tìm kiếm
        for (employee em : employeesList) {
            if (em.calculateSalary() > maxEm.calculateSalary()) {
                maxEm = em;
            }
        }
        System.out.println("Nhân viên có lương cao nhất: ");
        maxEm.display();
    }

    //6. employee has MIN total working hours
    public void findEmployeeHasMinTotalWorkingHours() {
        // kiểm tra rỗng
        if (employeesList.isEmpty()) {
            System.out.println("Danh sách nhân viên rỗng");
            return;
        }

        employee minEm = employeesList.get(0);

        // tìm kiếm
        for (employee em : employeesList) {
            if (em.getTotalWorkingHours() < minEm.getTotalWorkingHours()) {
                minEm = em;
            }
            System.out.println("Nhân viên có số giờ làm thấp nhất: ");
            minEm.display();
        }
    }

    //7. sort employee by name
    public void sortEmployeeByName() {
        // kiểm tra rỗng
        if (employeesList.isEmpty()) {
            System.out.println("Danh sách nhân viên rỗng");
            return;
        }
        //sort name
        //cú pháp sort trên arrayList
        //arrayList.sort( (phần tử 1, phần tử 2) -> { //thực hiện logic so sánh giữa phần tử 1 và phần tử 2)
        // sẽ -1 nếu phần tử 1 < phần tử 2
        // sẽ 0 nếu phần tử 1 = phần tử 2
        // sẽ 1 nếu phần tử 1 > phần tử 2
        employeesList.sort((em1, em2) -> em1.getName().compareTo(em2.getName()));
        System.out.println("Danh sách nhân viên sắp xếp theo tên: ");
        employeesListData();
    }

    //8. sort employee by total working hours
    public void sortEmployeeByTotalWokingHours() {
        // kiểm tra rỗng
        if (employeesList.isEmpty()) {
            System.out.println("Danh sách nhân viên rỗng");
            return;
        }
        employeesList.sort((em1, em2) -> Integer.compare(em1.getTotalWorkingHours(), em2.getTotalWorkingHours()));
        System.out.println("Danh sách nhân viên sắp xếp theo tổng giờ làm: ");
        employeesListData();
    }

    //9. update employee info by id
    public void updateEmployeeInfo(Scanner sc) {
        // kiểm tra rỗng
        if (employeesList.isEmpty()) {
            System.out.println("Danh sách nhân viên rỗng");
            return;
        }
        // tìm thấy nhân viên cần được cập nhật theo id
        System.out.println("Nhập vào id nhân viên cần cập nhật thông tin: ");
        String id = sc.nextLine();
        employee em = findEmployeeId(id);
        //kiểm tra có tìm thấy nhân viên hay không
        if (em == null) {
            System.out.println("Không tìm thấy nhân viên với ID: " + id);
            return;
        }
        // nếu tìm thấy thì update info:
        System.out.println("Nhập tên mới: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi mới: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ mới: ");
        String address = sc.nextLine();
        System.out.println("Nhập lương/giờ mới: ");
        int salaryPerHours = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tổng số giờ làm mới: ");
        int totalWorkingHours = Integer.parseInt(sc.nextLine());

        //cập nhật thông tin bằng cách tạo ra một đối tượng nhân viên mới với thông tin đã cập nhật
        em = new employee(id, name, age, address, salaryPerHours, totalWorkingHours);

        //cập nhật lại thông tin nhân viên trong danh sách
        for (int i = 0; i < employeesList.size(); i++) {
            if (employeesList.get(i).getId().equals(id)) {
                employeesList.set(i, em); // cập nhật thông tin nhân viên tại vị trí i
                break;
            }
        }
        System.out.println("Cập nhật thông tin nhân viên thành công.");
    }

//
//        boolean found = false;
//
//        for (int i = 0; i < employeesList.size(); i++) {
//            employee em = employeesList.get(i);
//            if (em.getId().equals(id)) {
//                em.input(sc); // nhập lại thông tin
//                employeesList.set(i, em); // cập nhật vào list
//                found = true;
//                System.out.println("Cập nhật thông tin nhân viên thành công!");
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("Không tìm thấy nhân viên với id: " + id);
//        }
//    }

    //10. update total working hours by employee id

    //11. display employees with total working hours greater than 120 hour
    public void workingHoursGreaterThan120Hrs (){
        //kiểm tra rỗng
        if (employeesList.isEmpty()) {
            System.out.println("Danh sách nhân viên rỗng.");
            return;
        }
        System.out.println("Danh sách nhân viên có tổng số giờ làm việc lớn hơn 120 giờ: ");
        //lưu ý: tạo ra 1 danh sách mới để lưu trữ
        ArrayList<employee> employeeListTotalWorkingHoursGreaterThan120Hrs = new ArrayList<>();
        for (employee em : employeesList){
            if (em.getTotalWorkingHours() > 120){
                employeeListTotalWorkingHoursGreaterThan120Hrs.add(em);
            }
        }
        //duyệt mảng mới để hiển thị thông tin nhân viên đạt yêu cầu
        if (employeeListTotalWorkingHoursGreaterThan120Hrs.isEmpty()){
            System.out.println("Không có nhân viên nào có tổng số giờ làm lớn hơn 120 giờ.");
        } else {
            for (employee em : employeesList){
                em.display();
            }
        }
    }

    //12. display employees with total working hours less than 80hrs
    public void workingHoursLessThan80Hrs (){
        //kiểm tra rỗng
        if (employeesList.isEmpty()) {
            System.out.println("Danh sách nhân viên rỗng.");
            return;
        }
        System.out.println("Danh sách nhân viên có tổng số giờ làm việc ít hơn 80 giờ: ");
        //lưu ý: tạo ra 1 danh sách mới để lưu trữ
        ArrayList<employee> employeeListTotalWorkingHoursLessThan80Hrs = new ArrayList<>();
        for (employee em : employeesList){
            if (em.getTotalWorkingHours() < 80){
                employeeListTotalWorkingHoursLessThan80Hrs.add(em);
            }
        }
        //duyệt mảng mới để hiển thị thông tin nhân viên đạt yêu cầu
        if (employeeListTotalWorkingHoursLessThan80Hrs.isEmpty()){
            System.out.println("Không có nhân viên nào có tổng số giờ làm ít hơn 80 giờ.");
        } else {
            for (employee em : employeesList){
                em.display();
            }
        }
    }

}
