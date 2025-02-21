/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaDeSo_01;

/**
 *
 * @author nguye
 */
public class GVMamNon extends Teacher {
    public int namSinh;
    public GVMamNon(){}

    public GVMamNon(int namSinh) {
        this.namSinh = namSinh;
    }

    public GVMamNon(int namSinh, int ID, String MaGV, String Nganh) {
        super(ID, MaGV, Nganh);
        this.namSinh = namSinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public void InThongTin() {
        super.InThongTin(); 
        System.out.println("Nam sinh: "+ namSinh);
    }
    
    
    
    
    
}
