/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaDeSo_01;

/**
 *
 * @author nguye
 */
public class Teacher {
    //khai báo thuộc tính
    private int ID;
    private String MaGV;
    private String Nganh;
    
    //Khởi tạo contructor
    public Teacher(){}

    public Teacher(int ID, String MaGV, String Nganh) {
        this.ID = ID;
        this.MaGV = MaGV;
        this.Nganh = Nganh;
    }
    
    //getter và setter

    public int getID() {
        return ID;
    }

    public String getMaGV() {
        return MaGV;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }
    
    //Phương thức
    //những cái trong "" là những cái mà mình in ra
    public void InThongTin()
    {
        System.out.println("ID:" + ID + ", MAGV: " + MaGV+ ",Ngành: " + Nganh);
    }
    
}
