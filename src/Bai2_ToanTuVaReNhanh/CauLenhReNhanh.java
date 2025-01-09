/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_ToanTuVaReNhanh;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class CauLenhReNhanh {
    public static void main(String[] args) {
//        double diem = 9;
//        if(diem <5)
//        {
//            System.out.println("Chúc tú đã mất 3 củ ");
//        }
//        else if(5<=diem && diem <8)
//        {
//            System.out.println("Chúc mừng bạn đã đạt điểm khá");
//        }
//        else
//        {
//            System.out.println("Chúc mừng bạn đã điểm giỏi");
//        }
//Viết chương trình tính thuế thu nhập. Giả sử thu nhập gồm lương và thưởng
//Thuế thu nhập được tính như sau
//Dưới 9 triệu: không đóng thuế
//Từ 9 đến 15 triệu: thuế 10% 
//Từ 15 đến 30 triệu: 15%
//Trên 30 triệu: 20%
        Scanner sc = new Scanner(System.in);
        double luong;
        double thuNhap;
        double thuong;
        double thue;
        System.out.println("Mời bạn nhập lương");
        luong= sc.nextDouble();
         System.out.println("Mời bạn nhập thuong");
        thuong= sc.nextDouble();
        thuNhap = luong + thuong;
        if(thuNhap < 9000)
        {
            System.out.println("Nghèo mà bày đặt đóng thuế");
        }
        else if(thuNhap>=9000 && thuNhap <15000)
        {
            thue = thuNhap*0.1;
            System.out.println("Thuế là :  "+ thue);
        }
         else if(thuNhap>=15000 && thuNhap <30000)
        {
            thue = thuNhap*0.15;
            System.out.println("Thuế là :  "+ thue);
        }
         else{
             thue = thuNhap*0.2;
            System.out.println("Thuế là :  "+ thue);
         }
        
    }
}
