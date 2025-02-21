/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract_Interface;

/**
 *
 * @author nguye
 */
//1. Khi lớp con kế thừa 1 lớp abstract thì bắt buộc phải ghi đè các phương thức abstract
public class SinhVien extends Nguoi {
    private String a3;
    public SinhVien()
    {
        
    }
    public SinhVien(String a1, String a2, String a3)
    {
        super(a1,a2);
        this.a3= a3;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }
    //ghi đè thì nhớ : @Override

    @Override
    public int method2(int a, int b) {
        return super.method2(a, b); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void method1() {
        super.method1(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    //khi mà ghi đè phương thức abstract rồi thì triển khai như bình thường

    @Override
    public int method3(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void method4() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
