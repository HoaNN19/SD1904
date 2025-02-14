/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_VongLap_Ham;

/**
 *
 * @author nguye
 */
public class Mang {
    public static void main(String[] args) {
        //. Phần 1: Khai báo biến
        int a =5;
        //phẦN 2: mảng: LƯU TRỮ NHIỀU PHẦN TỬ CÓ CÙNG KIỂU DỮ LIỆU
        
        //cách 1:
        int[] arrNumber1; // khai báo mảng
        arrNumber1 = new int[5]; // khở tạo kích thước mảng
        //có thể gộp int[] arrNumber1 = new int[5]
        // Làm gộp của cách 1: NÊN LÀM CÁCH NÀY
        String[] arrString = new String[6];
        
        //CÁCH 2:
        String[] b = {"java1", "java2","java3"};
        //tạo ra 1 mảng b có kiểu là string và có 3 phần tử
        //có thể khai báo tường minh hơn
        String[] b1 = new String[]{"java1", "java2","java3"};
        //Phần 3: Gán giá trị cho mảng cần biết index
        //index: vị trí trong mảng : vị trí sẽ chạy từ 0
        arrNumber1[0]= 1;// gán giá trị vào vị trí thứ 0
        arrNumber1[1]= 2;
        arrNumber1[2]= 3;
        arrNumber1[3]= 4;
        arrNumber1[4]= 5; // gán giá trị vào vị trí thứ 4
        //-> mảng : 1,2,3,4,5
        arrNumber1[2]= 10;// ghi đè giá trị vào vị trí, ghi đè k phân việt lớn nhỏ
        //=> 1,2,10,4,5
        arrNumber1[4]= 1; //1,2,10,4,1
        arrNumber1[2]= 20;
        arrNumber1[0]= 34;
        arrNumber1[4]= 8;
        //Mảng: 34,2,20,4,8
        
        //PHẦN 4: LẤY PHẦN TỬ TRONG MẢNG 
       // System.out.println(arrNumber1[4]);
        
        //IN TOÀN BỘ PHẦN TỬ TRONG MẢNG
        //name_Mang.lenght => lấy ra độ dài của mảng
        //i: vị trị trong mảng
        for (int i = 0; i < arrNumber1.length; i++) {
            System.out.println("Mảng arrNumber1["+i+"] ="  +arrNumber1[i]);
        }
        
    }
    
}
