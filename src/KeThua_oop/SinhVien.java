/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeThua_oop;

/**
 *
 * @author nguye
 */
/*
 class sinh viên gọi là class con
- sử dụng từ khóa extends để kế thừa thuộc và phương thức của lớp cha
-- java chỉ có đơn kế thừa
*/
public class SinhVien extends Nguoi {
    // chỉ khai báo thuộc tính mà class nguoi không có
    //Phần 1: khai báo thuộc tính
    private String MSSV;
    private String NganhHoc;
    
    //phần 2: Khổi tạo contructor

    public SinhVien() {
    }

    public SinhVien(String MSSV, String NganhHoc) {
        this.MSSV = MSSV;
        this.NganhHoc = NganhHoc;
    }
    //ấn chuột phải -> contructor ->
// dùng tool nhớ select cả 2 bên
    public SinhVien(String MSSV, String NganhHoc, String ten, String Sdt, String cmt) {
        super(ten, Sdt, cmt);
        this.MSSV = MSSV;
        this.NganhHoc = NganhHoc;
    }
    /*Kế thừa phương thức của lớp cha chính là hành động ghi đè của
    phương thức trong tính chất đa hình của OOP
    alt+ insert => override mothod hoặc ấn chuột phải-> insert code -> override
    Ghi đè phương thức thì bên lớp con có thể code lại nội dung phương thức ghi đè
    
*/

    @Override
    public int method2() {
        return super.method2(); 
           }

    @Override
    public void method1() {
        super.method1();
        System.out.println(MSSV + "-"+ NganhHoc);
         System.out.println("Hí anh em");

    }
    
    
}
