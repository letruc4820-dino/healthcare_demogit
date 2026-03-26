package bai_tap.buoi_5.quanly_nhanvien;

import bai_tap.buoi_5.quanLySinhVien;

import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        //BT quản lý nhân viên với menu
        //1. thêm nhân viên
        //2. display
        //3. remove
        //4. tìm nhân viên theo id
        //5. tìm nhân viên có mức lương cao nhất
        //6. tìm nhân viên có giờ làm thấp nhất
        //7. sort theo tên
        //8. sort theo giờ làm
        //9. cập nhât thông tin nhân viên dựa vào id
        //10. cập nhật số giờ làm của nhân viên dựa vào id
        //11. hiển thị ra nhân viên có tổng số giờ làm lớn hơn 120hrs
        //12. hiển thị ra nhân viên có tổng số giờ làm nhỏ hơn 80hrs
        //13. thoát khỏi chương trình
        //nhân viên = {id, name, age, address, salaryPerHours, totalWorkingHours}
        Scanner sc = new Scanner(System.in);
        employeeManagement employeeManagement = new employeeManagement();
        int choice;
        do {
            System.out.println("==== Quản lý nhân viên ====");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Xóa nhân viên theo id");
            System.out.println("4. Tìm nhân viên theo id");
            System.out.println("5. Tìm nhân viên có mức lương cao nhất");
            System.out.println("6. Tìm nhân viên có số giờ làm thấp nhất");
            System.out.println("7. Sắp xếp nhân viên theo tên");
            System.out.println("8. Sắp xếp nhân viên theo tổng số giờ làm");
            System.out.println("9. Cập nhât thông tin nhân viên dựa vào id");
            System.out.println("10. Cập nhật số giờ làm của nhân viên dựa vào id");
            System.out.println("11. Hiển thị danh sách nhân viên có tổng số giờ làm lớn hơn 120 giờ");
            System.out.println("12. Hiển thị danh sách nhân viên có tổng số giờ làm nhỏ hơn 80 giờ");
            System.out.println("13. Thoát chương trình");
            System.out.println("================================");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    employeeManagement.addEmployee(sc);
                    break;
                case 2:
                    employeeManagement.employeesListData();
                    break;
                case 3:
                    employeeManagement.removeEmployee(sc);
                    break;
                case 4:
                    employeeManagement.findEmployee(sc);
                    break;
                case 5:
                    employeeManagement.findEmployeeHasMaxSalary();
                    break;
                case 6:
                    employeeManagement.findEmployeeHasMinTotalWorkingHours();
                    break;
                case 7:
                    employeeManagement.sortEmployeeByName();
                    break;
                case 8:
                    employeeManagement.sortEmployeeByTotalWokingHours();
                    break;
                case 9:
                    employeeManagement.updateEmployeeInfo(sc);
                    break;
//                case 10:
//
                case 11:
                    employeeManagement.workingHoursGreaterThan120Hrs();
                    break;
                case 12:
                    employeeManagement.workingHoursLessThan80Hrs();
                    break;
                case 13:
                    System.out.println("Bạn đã thoát chương trình!");
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }} while (choice != 13);
    }
}

