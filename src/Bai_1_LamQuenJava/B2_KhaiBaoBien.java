/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_1_LamQuenJava;

/**
 *
 * @author nguye
 */
public class B2_KhaiBaoBien {
    /*
       *********** Biến khái niệm cơ bản ***********
      Định nghĩa: Dùng để lưu trữ giá trị trong lập trình. Biến được lưu trữ ở trong Ram.
      Công thức:
    <kiểu dữ liệu> + <tên biến> [=giá trị khởi đầu]; VD: INT A= 5
      <kiểu dữ liệu>: Giúp định nghĩa giá trị muốn lưu trữ có kiểu dữ liệu là gì
      <tên biến>:Giúp định danh và gọi biến đó khi sử dụng. Có phân biệt chữ hoa chữ thường.
      [=giá trị khởi đầu]: Đưa giá trị đúng kiểu dữ liệu
  
      *********** Quy tắc đặt tên ***********
      Tên biến có phân biệt chữ hoa và chữ thường. Nên đặt tên biến bằng Tiếng Anh
         String firstname;// Kiểu Normal  //Sử dụng khi tên biến có 2 từ trở lên
         String FirstName; //Kiểu CamelCase //Sử dụng khi tên Class có 2 từ trở lên hoặc 1 từ
         String first_name; // Kiểu Underscores //Sử dụng khi tên biến có 2 từ trở lên 
         Lưu ý: đặt tên biến không được phép bắt đầu bởi số , có dấu gạch ngang, sử dụng từ khóa của java (int,if,long....)
         int int = 5; //Vi phạm nguyên tắc đặt biến
         Trong cùng 1 class thì biến phải sử dụng tên khác nhau và đặt sao cho đúng nghĩa đại diện
      *********** Các kiểu dữ liệu có trong java ***********  
            + Kiểu số nguyên:byte, short, long, int
            + Kiểu số thực:float, doubleB
            + Kiểu chuỗi và ký tự: String, char
            + Kiểu Logic: boolean (true, false)
            + Kiểu var: tự định nghĩa theo giá trị
     VAR A= 1 , VAR C= 'C', VAR S = "ABC"
    
      *********** Biến toàn cục và biến cục bộ ***********        
      + Biến toàn cục: Khai báo bên ngoài của phương thức
        - Bắt buộc phải khai báo có dấu gạch dưới _ trước tên biến:
        Ví dụ đặt tên: _firtName, _firstName;
      + Biến cục bộ: Khai báo bên trong phương thức. Biến cục bộ sẽ chỉ được sử dụng ở bên trong của 1 phương thức.  
   */
    
    
    int _abc ; // đây là biến toàn cục vì nó khai báo ngoài hàm
    public static void main(String[] args) {
        int a = 1 ; // biến cục bộ vì nó được khai báo trong phương thức
        
        //string: chuỗi
        String name1; // khái báo biến có kiểu là string và k tạo giá trị ban đầu
        String name2 = "abc"; // có khởi tạo giá trị ban đầu
        String a1,a2,a3 ="Nguyễn văn b";
        //boolean : logic
        boolean b1 = true ; //hoặc false
        
        //float, doube: số thực
        float f1 = 3.5f;
        double d1 = 3.5;
        
        //var: kiểu dữ liệu ngầm định ( xác định trong quá trình thực thi câu lênh)
        var v1 = true;
        var v2 = 'c';
        
        //1. ép kiểu string về số (CONVERT)
        String number1 = "100", number2 = "2", kq;
        kq = number1+ number2;
        System.out.println(kq);
        // muốn cộng số bình thường phải dùng thủ đoạn ép kiểu
        int kq2 = Integer.parseInt(number1) +Integer.parseInt(number2);
        System.out.println(kq2);
        
        //2. ép kiểu giữa số vs số
        int x =9;
        double b = 9.9;
        b=x; // ép kiểu tự động
                
        
        
    }
   
    
}
