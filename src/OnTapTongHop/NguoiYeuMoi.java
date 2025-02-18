/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapTongHop;

/**
 *
 * @author nguye
 */
//nếu muốn kế thừa thì dùng extends
public class NguoiYeuMoi extends Nguoi {
    private double v1;
    private String soThich;

    public NguoiYeuMoi() {
    }

    public NguoiYeuMoi(double v1, String soThich, String Cmt, String HoTen, int NamSinh, String GioiTinh) {
        super(Cmt, HoTen, NamSinh, GioiTinh);
        this.v1 = v1;
        this.soThich = soThich;
    }

    public double getV1() {
        return v1;
    }

    public String getSoThich() {
        return soThich;
    }
    //coi nó là 1 hàm= phương thức
    //get: lấy giá trị
    public String getTrangThai()
    {
        return v1<50? "Bình thường" :v1<90? "không bình thường" : "rất bình thường";
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }
    //double : %f

    @Override
    public void InThongTin() {
        super.InThongTin(); 
        System.out.printf("V1: %f "+"Sở thích: %s"+ "Trạng thái:"+ getTrangThai(), v1,soThich );
        // v1: 90 trạng thái: bình thươdng
    }
    
    
    
     
    
}
