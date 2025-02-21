/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract_Interface;

/**
 *
 * @author nguye
 * 
 */
/*
     1. Lớp abstract cũng như các class cha khác
     2. Đã có lớp abstract thì các phương thức cũng phải abtract
*/
public abstract class Nguoi {
    private String a1;
    private String a2;
    
    public Nguoi(){}

    public Nguoi(String a1, String a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public String getA1() {
        return a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }
    
    public void method1() //hàm k trả về: void  
    {
        System.out.println("abc");
    }
    public int method2(int a, int b) // hàm trả về: public + dataType
    {
        return 0;
    }
    /*
      Phương thức abstract
        1. Không có body code
        2. Phương thức phải bao gồm từ khóa abstract
    */
    public abstract int method3(int a,int b);
    public abstract void method4();
    
    
    
    
}
