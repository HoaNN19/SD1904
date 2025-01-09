/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_1_LamQuenJava;

import java.util.Scanner;

/**
 *
 * @author nguye
 * 
 */
//nhập mã sinh viên,  tên sinh viên và năm sinh sau đó in ra màn hình
public class BaiTap {
    public static void main(String[] args) {
//        //Nhập từ bàn phím
//        //Khởi tạo đối tượng Scanner
        Scanner sc = new Scanner(System.in);
//        String MSV, Ten;
//        int ns;
//        System.out.println("Moi ban nhap ma sinh vien");
//        MSV = sc.nextLine();
//        System.out.println("Moi ban nhap ten");
//        Ten = sc.nextLine();
//        System.out.println("Moi ban nhap nam sinh");
//        ns = sc.nextInt();
//        
//        //còn 1 cách khác đó là coi năm sinh ( kiểu int) như dạng string
//        //ĐÂY CHÍNH LÀ DẠNG CONVERT KIỂU DỮ LIỆU
//        //ns= Integer.parseInt(sc.nextLine());
//        System.out.printf("Chao ban %s | %s |%d", MSV,Ten, ns);
        try
        {
            int a = sc.nextInt();
            System.out.println("Chuc ban da nhap dung");
        }
        catch(Exception ex)
        {
            System.out.println("nhap sai roi");
        }
        
        
    }
    
}
