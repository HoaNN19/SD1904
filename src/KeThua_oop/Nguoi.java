/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeThua_oop;

/**
 *
 * @author nguye
 */
//Tính chất kế thừa: Class con sẽ kế thừa thuộc tính và phường thức của lớp cha
// lớp cha sẽ k được hưởng gì của class con hết
//Coi là lớp cha
public class Nguoi {
    //PHẦN 1: LIỆT KÊ CÁC THUỘC TÍNH MÀ ĐỐI TƯỢNG CẦN
    private String ten;
    private String Sdt;
    private String cmt;
    
    //PHẦN 2: KHỞI TẠO CONTRUCTOR

    public Nguoi() {
    }

    public Nguoi(String ten, String Sdt, String cmt) {
        this.ten = ten;
        this.Sdt = Sdt;
        this.cmt = cmt;
    }
    
    //PHẦN 3: Tạo getter và setter
    //getter: lấy giá trị
    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return Sdt;
    }

    public String getCmt() {
        return cmt;
    }
    //setter: gán giá trị

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }
    //Phần 3: triển khai phương thức
    //phương thức k trả về
    public void method1()
    {
        System.out.println("Phương thức lớp cha in ra");
        System.out.println(ten + " -"+ Sdt + " " + cmt);
    }
    //phương thức trả về:< phạm vi truy cập> + datatype+ tên
    //bắt buộc phải return
    public int method2(){
        return 2008;
    }
    
    
    
}
