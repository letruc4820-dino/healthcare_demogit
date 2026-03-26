package bai_tap.student_management;

public class student {
    // học sinh = {id, hoTen, lop, diaChi, toan, ly, hoa}
    public String id;
    public String fullName;
    public String studentClass;
    public String address;
    public double math;
    public double physics;
    public double chemistry;


    //constructor
    public student(){
    }

    //constructor
    public student(String id, String fullName, String studentClass, String address, double math,
                   double physics, double chemistry){
        this.id = id;
        this.fullName = fullName;
        this.studentClass = studentClass;
        this.address = address;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;

    }

    //getId
    public String getId(){
        return id;
    }

    //display
    public void display() {
        System.out.println("ID: " + id +
                " | Full name: " + fullName +
                " | Class: " + studentClass +
                " | Address: " + address +
                " | Math score: " + math +
                " | Physics score: " + physics +
                " | Chemistry score: " + chemistry +
                " | Average score: " + ((math + physics + chemistry)/3));
    }

    //highest average score
    public double calculateAverageScore() {
        return ((math + physics + chemistry)/3);
    }

    //get full name
    public String getFullName() {
        return fullName;
    }

    //get total score
    public double calculateTotalScore() {
        return (math + physics + chemistry);
    }
}
