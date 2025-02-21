/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaDeSo_01;

import OnTapTongHop.NguoiYeuMoiService;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //khởi tạo 1 đối tượng nymservice để sử dụng được các hàm của nó
        Service teachSer = new Service();
        int luaChon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập danh sách");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Tìm teacher có ngành là udpm");
            System.out.println("4. Sap xep theo nganh");
            System.out.println("5.Kế thừa");
            System.out.println("6. Kết thúc");
            System.out.print("Chọn chức năng: ");
            luaChon = sc.nextInt();
            
            switch (luaChon) {
                case 1:
                    teachSer.NhapDanhSach();
                    break;
                case 2:
                    teachSer.XuatDanhSach();
                    break;
                case 3:
                    teachSer.TimGVUDPM();
                    break;
                case 4:
                    teachSer.SapXepTheoNganh();
                    break;
                case 5:
                     teachSer.KeThua();
                     break;
                
                case 6:
                    System.out.println("Chuong trinh ket thuc doi");
                    break;

                default:
                    System.out.println("Moi ban chon lai, lua chon khong hop le");

            }

        }  while(luaChon !=6);
    }
    
}
