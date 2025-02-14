/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_OOP_01;

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args) {
        //phần 1: KHAI BÁO VÀ KHỞI TẠO ĐỐI TƯỢNG
        // nguoiyeucu: là tên class
        //nyc1: là tên đối tượng mà mình đặt
        //toán tử new: sử dụng để tạo đối tượng
        //Khai báo k có tham số
        NguoiYeuCu nyc1 = new NguoiYeuCu();
        //có tham số
        //khi add dữ liệu phải đảm bảo vị trí
        NguoiYeuCu nyc2 = new NguoiYeuCu("A",2008,90,60,90,"DHQG");
        
        //Phần 2: kết hợp hàm
        
        nyc2.InThongTin();
        
        //PHẦN 3; CÓ THỂ SỬ DỤNG HÀM SETTER ĐỂ ADD GIÁ TRỊ
        // vì setter dùng để gán còn get dùng để lấy
        nyc1.setTen("Tâm");
        nyc1.setNs(2008);
        nyc1.setV1(100);
        nyc1.setV2(200);
        nyc1.setV3(60);
        nyc1.InThongTin();
        
       /*BTVN: TẠO 1 CLASS SINH VIÊN BAO GỒM
          + THUỘC TÍNH: MSV, HOVATEN, NAMSINH, GIOITINH
           + PHUONG THUC: INTHONGTIN, NHAPTHONGTIN
        IN VÀ NHẬP THÔNG TIN SINH VIÊN
        */
       
    }
}
