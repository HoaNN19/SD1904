/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import static Lab5.QuanLyDanhSachHoTen.nhapDanhSach;
import static Lab5.QuanLyDanhSachHoTen.sapXepGiamDan;
import static Lab5.QuanLyDanhSachHoTen.timVaXoa;
import static Lab5.QuanLyDanhSachHoTen.xuatDanhSach;
import static Lab5.QuanLyDanhSachHoTen.xuatDanhSachNgauNhien;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Main_bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Kết thúc");
            System.out.print("Chọn chức năng: ");
            luaChon = sc.nextInt();
            
            switch (luaChon) {
                case 1:
                    nhapDanhSach();
                    break;
                case 2:
                    xuatDanhSach();
                    break;
                case 3:
                    xuatDanhSachNgauNhien();
                    break;
                case 4:
                    sapXepGiamDan();
                    break;
                case 5:
                    timVaXoa();
                    break;
                case 6:
                    System.out.println("Chuong trinh ket thuc doi");
                    break;

                default:
                    System.out.println("Moi ban chon lai, lua chon khong hop le");

            }

        }  while(luaChon != 6);

    }

   

}
