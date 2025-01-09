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
public class Swish_case {
    public static void main(String[] args) {
        //sw+ tab
        //Viết chương trình nhập 1 số  xuất ra màn hình thứ tự trong tuần
//Nhập 1 => “Chủ nhật”
//Nhập 7 =>”Thứ bảy”
        Scanner sc = new Scanner(System.in);
        int so;
        do
        {
            
             System.out.println("Mời bạn nhập số mình muốn");
             so = sc.nextInt();
            switch (so) {
            case 1:
                System.out.println("Chủ nhật");
                break;
            case 2:
                System.out.println("Thứ 2");
                break;
            case 3:
                System.out.println("Thứ 3");
                break;
            case 4:
                System.out.println("Thứ 4");
                break;
             case 5:
                System.out.println("Thứ 5");
                break;
            case 6:
                System.out.println("Thứ 6");
                break;
            case 7:
                System.out.println("Thứ 7");
                break;
            
            default:
                System.out.println("Không thỏa mãn");
                
        }
        }while(so!=0);
        
        
    }
    
}
