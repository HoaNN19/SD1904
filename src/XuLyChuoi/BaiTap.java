/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XuLyChuoi;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class BaiTap {
    /*
       Bài 1: Viết 1 chương trình nhập vào full name sau đó viết chữ cái đầu của từ lên
        ví dụ: nguYễn thị tÂm=> Nguyễn Thị Tẩm
      Bài 2: Viết 1 chương trình gen tự động như sinh viên PTCD
      ví dụ: nguyễn Thị tâm => PH TamNT
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName, outPut="" ;
        System.out.println("Mơi ban nhap full name:");
        fullName = sc.nextLine();
        //cắt chuỗi ban đầu ra thành các mảng để xử lí
        String[] arrName = fullName.split("\\s"); //cắt chuỗi theo khaorng trắng
        for(String x: arrName)
        {
            outPut += vietHoaChuCaiDau(x)+ " ";
        }
        System.out.printf("Tên viết hoa chữ cái đầu là : %s", outPut);
        System.out.println("++++++++++");
        System.out.printf("mã là : %s",genMa(fullName) );
        
        
    }
    //hàm này chỉ xử lí cho 1 phần tử chuỗi
    public static String vietHoaChuCaiDau(String name)
    {
        String temp = name.trim().toLowerCase();// chuyển hết về chữ cái thường
        return String.valueOf(temp.charAt(0)).toUpperCase()+ temp.substring(1);
    }
    public static String genMa(String name)
    {
        //phtamnt
        //chuyển hết chữ về in thường
        String tem = name.trim().toLowerCase();
        //tách chuỗi thành mảng
        String[] arrNames = tem.split("\\s"); //cắt theo khoảng trắng
        String mssv = vietHoaChuCaiDau(arrNames[arrNames.length-1]); //tam=> Tam
        for(int i=0; i< arrNames.length-1; i++)
        {
            mssv+= String.valueOf(arrNames[i].charAt(0)).toUpperCase();
        }
        return "PH" + mssv;
        
                
    }
}
