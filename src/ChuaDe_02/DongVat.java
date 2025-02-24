/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaDe_02;

/**
 *
 * @author nguye
 */
public class DongVat {
    //b1: tạo thuộc thuộc tính
    private String maDongVat;
    private String tenDongVat;
    private int canNang;
    private String noiSong;
    //contructor: hàm khởi tạo
    public DongVat(){}
  
    public DongVat(String maDongVat, String tenDongVat, int canNang, String noiSong) {
        this.maDongVat = maDongVat;
        this.tenDongVat = tenDongVat;
        this.canNang = canNang;
        this.noiSong = noiSong;
    }
//get: lấy giá trị
    public String getMaDongVat() {
        return maDongVat;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public int getCanNang() {
        return canNang;
    }

    public String getNoiSong() {
        return noiSong;
    }
    //setter: gán giá trị

    public void setMaDongVat(String maDongVat) {
        this.maDongVat = maDongVat;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public void setNoiSong(String noiSong) {
        this.noiSong = noiSong;
    }
    
    //hàm inthongitn
    public void inThongTin()
    {
        System.out.println("Mã động vật : "+ maDongVat+"- tên động vật: "+ tenDongVat
        + "- Cân nặng : "+ canNang + "Nơi sống: "+ noiSong);
    }
    
    
    
    
    
    
}
