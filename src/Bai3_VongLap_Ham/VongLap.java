/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_VongLap_Ham;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class VongLap {
    public static void main(String[] args) {
        //1.While : wh+ tab
//        int i=0;
//        while (i<5) {
//            System.out.println("Tôi muốn qua môn Java 1");
//            i++;
//        }
        
        //2. do white : do + tab
//        do {
//            System.out.println("Hí anh em");
//            i++;
//            
//        } while (i<5);
        //NHẬP SỐ NGUYÊN DƯƠNG TỪ BÀN PHÍM 
        //Ý TƯỞNG: NHẬP ĐẾN BAO GIỜ VI PHẠM ĐK THÌ MỚI DỪNG VÒNG LĂP
//        Scanner sc = new Scanner (System.in);
//        int n;
//        do {
//            System.out.println("Mời bạn nhập");
//            n = sc.nextInt();
//        } while (n>0);
        
        // FOR: for+ tab
//        for (int j = 1; j <= 5; j+=2) {
//            System.out.println("Chào mừng bạn đã đến với bình nguyên vô tận");
//        }
        
        //SỬ DỤNG VÒNG LẶP FOR VIẾT BẢNG CỬU CHƯƠNG
        for (int i = 2; i < 10; i++) {
            System.out.println("Bảng cửu chương "+i + ":");
            for(int j = 1; j<=10; j++)
            {
                System.out.println(i+ "x"+ j +"="+(i*j));
                
            }
            System.out.println("-----");
        }
        
    }
}
