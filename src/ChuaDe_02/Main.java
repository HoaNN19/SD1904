/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaDe_02;

import ChuaDeSo_01.Service;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        //khởi tạo 1 đối tượng nymservice để sử dụng được các hàm của nó
        DongVatService dv = new DongVatService();
        int luaChon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập danh sách");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Tìm dv nặng hơn cân nặng tối thiểu");
            System.out.println("4. Động vật mèo");
            
            System.out.println("5. Kết thúc");
            System.out.print("Chọn chức năng: ");
            luaChon = sc.nextInt();
            
            switch (luaChon) {
                case 1:
                   dv.NhapDongVat();
                    break;
                case 2:
                   dv.HienThiDV();
                    break;
                case 3:
                    dv.hienThiDVTrenMucToiThieu();
                    break;
                case 4:
                   dv.KeThua();
                    break;
              
                case 5:
                    System.out.println("Chuong trinh ket thuc doi");
                    break;

                default:
                    System.out.println("Moi ban chon lai, lua chon khong hop le");

            }

        }  while(luaChon !=5);
    }
}
