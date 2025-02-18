/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapTongHop;

/**
 *
 * @author nguye
 */
public class Nguoi {
    //b1: khai báo các thuộc tính
    private String Cmt;
    private String HoTen;
    private int NamSinh;
    private String GioiTinh;
    //b2: Tạo contructor
    public Nguoi(){}
 //contructor có tham số
    // chuột phải -> insert code -> contructor -> select all -> gennerate
    public Nguoi(String Cmt, String HoTen, int NamSinh, String GioiTinh) {
        this.Cmt = Cmt;
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.GioiTinh = GioiTinh;
    }
    //b3: tạo getter và setter
    //getter: dùng để lấy dữ liệu
    public String getCmt() {
        return Cmt;
    }

    public String getHoTen() {
        return HoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setCmt(String Cmt) {
        this.Cmt = Cmt;
    }
//setter dùng để gán dữ liệu
    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    //b4: Phương thức 
    //in ra chuỗi : %s, in ra số: %d
    //hàm không trả về : void
    
    public void InThongTin()
    {
        System.out.printf("Ten:%s - Năm sinh : %d - giới tính: %s- CMT : %s \n", HoTen,NamSinh, GioiTinh, Cmt);
    }
    
    //hàm trả về: string, int, double
    //bắt buộc phải return về giá trị cần trả về
//    public String InThongTin1()
//    {
//        return "+ ten=" + HoTen + ", nam sinh= "+ NamSinh;
//    }
    
}
