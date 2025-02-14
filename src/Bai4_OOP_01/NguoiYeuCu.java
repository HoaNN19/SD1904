/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_OOP_01;

/**
 *
 * @author nguye
 */
//Class = LỚP -> tạo đối tượng và tên đối tượng bắt buộc phải
//viết hoa chữ cái đầu
public class NguoiYeuCu {
    //phần 1: LIỆT KỆ CÁC THUỘC TÍNH ĐỐI TƯỢNG CẦN
    public String ten;
    public int ns;
    public double v1;
    public double v2;
    public double v3;
    public String truongHoc = "FPT"; // có thể fix cứng dữ liệu bình thường
    /*phần 2: KHỞI TẠO CONTRUCTOR
    + CONTRUCTOR:LÀ HÀM TẠO DÙNG ĐỂ TẠO CÁC ĐỐI TƯỢNG
    + CÓ 2 LOẠI: CÓ THAM SỐ VÀ KHÔNG CÓ THAM SỐ
    + CONTRUCTOR CÓ THAM SỐ:  DÙNG ĐỂ KHỞI TẠO ĐỐI TƯỢNG
    CÓ NGAY GIÁ TRỊ
    + CONTRUCTOR K CÓ THAM SỐ: DÙNG ĐỂ KHỞI TẠO ĐỘI TƯỢNG CÓ 
    GIÁ TRỊ TỪ NGAY BAN ĐẦU
     */  
    //2.1 CONTRUCTOR K CÓ THAM SỐ: alt + insert 
          // hoặc chuột phải-> insert code -> contructor

    public NguoiYeuCu() {
    }
    //2.2 contructor có tham số
   // trong ngoặc là tham số truyền vào
    //this : đại diện cho đối tượng hiện tại
    public NguoiYeuCu(String ten, int ns, double v1, double v2, double v3
                               ,String truongHoc) {
        this.ten = ten;
        this.ns = ns;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.truongHoc = truongHoc;
    }
    //NẾU THUỘC TÍNH BỊ PRIVATE THÌ MS DÙNG ĐẾN GETTER VÀ SETTER 
    //CÒN NẾU ĐỂ PUBLIC THÌ CHỈ DỪNG Ở CONTRUCTOR CÓ THAM SỐ
    //PHẦN 3 : GETTER VÀ SETTER 
    /*VÌ KHI THUỘC TÍNH BỊ PRIVATE THÌ KHI MUỐN LẤY VÀ GÁN GIÁ TRỊ CHO NÓ 
       THÌ PHẢI SỬ DỤNG
    ALT + INSERT -> GETTER VÀ SETTER
    HOẶC CHUỘT PHẢI -> INSERT CODE -> GETTER VÀ SETTER
    */ 
//GETTER: LẤY GIÁ TRỊ
    //VI DỤ:KHI MUỐN LẤY TÊN CỦA NYC THÌ PHẢI THÔNG QUA HÀM GETtEN
    public String getTen() {
        return ten;
    }

    public int getNs() {
        return ns;
    }

    public double getV1() {
        return v1;
    }

    public double getV2() {
        return v2;
    }

    public double getV3() {
        return v3;
    }

    public String getTruongHoc() {
        return truongHoc;
    }
    
  //SETTER: GÁN GIÁ TRỊ

    public void setTen(String ten)// tham số truyền vào
    {
        this.ten = ten;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    public void setV3(double v3) {
        this.v3 = v3;
    }

    public void setTruongHoc(String truongHoc) {
        this.truongHoc = truongHoc;
    }
    
   //PHẦN THỨ 4: TRIỂN KHAI PHƯƠNG THỨC THEO YÊU CẦU
    //IN THÔNG TIN
    public void InThongTin()
    {
        System.out.printf("%s - %d - %f -%f- %f- %s\n"
                , ten, ns, v1,v2,v3, truongHoc);
    }
    
    
    
}
