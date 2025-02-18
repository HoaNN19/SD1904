/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapTongHop;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //khởi tạo 1 đối tượng nymservice để sử dụng được các hàm của nó
        NguoiYeuMoiService _nymSer = new NguoiYeuMoiService();
        int luaChon;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhập danh sách nym");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Tìm kiếm");
            System.out.println("4. Xóa");
            System.out.println("5. Sửa");
            System.out.println("6. Kết thúc");
            System.out.print("Chọn chức năng: ");
            luaChon = sc.nextInt();
            
            switch (luaChon) {
                case 1:
                    _nymSer.ThemNym();;
                    break;
                case 2:
                    _nymSer.xuatDs();
                    break;
                case 3:
                    _nymSer.TimKiem();
                    break;
                case 4:
                    _nymSer.Xoa();
                    break;
                case 5:
                    _nymSer.Sua();
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
