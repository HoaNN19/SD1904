/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class QuanLySanPham {
    // Lớp sản phẩm
    private static class SanPham {
        String ten;
        Double donGia; // Kiểu Double để sử dụng compareTo()
        //su dung controtor co tham so vi de bai yeu cau nhap tu ban phim
        //nen can tham so de luu tru du lieu nhap
        // Constructor
        public SanPham(String ten, Double donGia) {
            this.ten = ten;
            this.donGia = donGia;
        }
    }

    // Danh sách sản phẩm
    private static ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        int luaChon;
        do {
              System.out.println("\n===== MENU =====");
        System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
        System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
        System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
        System.out.println("4. Xuất giá trung bình của các sản phẩm");
        System.out.println("5. Xuất danh sách sản phẩm");
        System.out.println("6. Kết thúc");
            System.out.print("Chọn chức năng: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống

            switch (luaChon) {
                case 1:
                    nhapDanhSachSanPham();
                    break;
                case 2:
                    sapXepGiamDanTheoGia();
                    break;
                case 3:
                    timVaXoaSanPham();
                    break;
                case 4:
                    xuatGiaTrungBinh();
                    break;
                case 5:
                    xuatDanhSachSanPham();
                    break;
                case 6:
                    System.out.println("Chương trình kết thúc!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (luaChon != 6);
    }
  

    // 1️⃣ Nhập danh sách sản phẩm
    private static void nhapDanhSachSanPham() {
        String luaChon;
        do {
            System.out.print("Nhập tên sản phẩm: ");
            String ten = scanner.nextLine();
            System.out.print("Nhập giá sản phẩm: ");
            Double gia = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ dòng trống
            danhSachSanPham.add(new SanPham(ten, gia));// contructor
            // dung new de khoi tao ra 1 doi tuong sanpham moi rồi add vào danhsachSanPham ban đầu add

            System.out.print("Bạn có muốn nhập thêm sản phẩm không? (Y/N): ");
            luaChon = scanner.nextLine().trim().toUpperCase();
        } while (luaChon.equals("Y"));
    }
     // 5️⃣ Xuất danh sách sản phẩm - Đề bài k yêu cầu làm hàm xuất nhưng nên làm để dùng chung cho nhiều phương thức khác
    private static void xuatDanhSachSanPham() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        } 

        System.out.println("\nDanh sách sản phẩm:");
        for (SanPham sp : danhSachSanPham) {
            System.out.println("Tên sản phẩm: " + sp.ten + ", Giá: " + sp.donGia);
        }
    }

    // 2️⃣ Sắp xếp sản phẩm theo giá giảm dần
    private static void sapXepGiamDanTheoGia() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }

        // Comparator để sắp xếp theo giá giảm dần
        //Khi triển khai Comparator bằng cách tạo một lớp tùy chỉnh, bắt buộc phải override phương thức compare() để định nghĩa cách so sánh hai đối tượng.
        //Do Comparator là 1 Interface
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o2.donGia.compareTo(o1.donGia); // Sắp xếp giảm dần
            }
        };

        // Sắp xếp danh sách
        Collections.sort(danhSachSanPham, comp);
        System.out.println("Đã sắp xếp danh sách theo giá giảm dần!");
        xuatDanhSachSanPham();
    }

    // 3️⃣ Tìm và xóa sản phẩm theo tên
    private static void timVaXoaSanPham() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }

        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String tenCanXoa = scanner.nextLine();
  // có thể làm như bài 2 cô đã chưa
  //Tuy nhiên cô muốn check nếu không tìm thấy tên cần xóa thì hiển thị ra thông báo
  //Cô sẽ tạo ra 1 biến daXoa kiểu boolean( là kiểu dạng đúng sai (true/false)
        boolean daXoa = false;  // khai báo và gán giá trị mặc định là false
        for (int i = 0; i < danhSachSanPham.size(); i++) {
            if (danhSachSanPham.get(i).ten.equalsIgnoreCase(tenCanXoa)) {
                danhSachSanPham.remove(i);
                daXoa = true;   // nếu tìm thấy và xóa thành công daXoa -> True
                System.out.println("Đã xóa sản phẩm: " + tenCanXoa);
                break;
            }
        }
        // daXoa sau khi chạy vào dòng 142 thì nó thành true rồi nên !=true thì sẽ là false=> là không tìm thấy đó các cháu
     
        if (!daXoa) {
            System.out.println("Không tìm thấy sản phẩm với tên: " + tenCanXoa);
        }
    }
    

    // 4️⃣ Xuất giá trung bình của sản phẩm
    private static void xuatGiaTrungBinh() {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }

        double tongGia = 0;
        for (SanPham sp : danhSachSanPham) {
            tongGia += sp.donGia;
        }

        double giaTrungBinh = tongGia / danhSachSanPham.size();   // hàm size dùng để đếm, công thức tính TBC= TỔNG / SỐ lượng
        System.out.println("Giá trung bình của các sản phẩm là: " + giaTrungBinh);
    }

    
}
