/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaDe_02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class DongVatService {
    private ArrayList<DongVat>  lstDongVat= new ArrayList<DongVat>();
    private Scanner sc = new Scanner(System.in);
    
     //Muốn thực thi hàm fakedat khởi tạo contructor
    public DongVatService()
    {
        FakeData();
    }
    
    //Nếu dư thời gian thì tạo hàm fakedata
    public void FakeData()
    {
        lstDongVat.add(new DongVat("dv01", "CHÓ", 30,"Cầu Giay"));
        lstDongVat.add(new DongVat("dv02", "Mèo", 30,"Cầu Giay"));
        lstDongVat.add(new DongVat("dv03", "Bò", 30,"Cầu Giay"));
    }
    //Nhập và Thêm đối tượng vào arrayList
    public void NhapDongVat()
    {
        
        String luaChon;
        do
        {
            DongVat dv = new DongVat();// khởi tạo 1 đối tượng động vật
                         //mục đích: để lưu trữ dữ liệu thuộc tính của từng đối tượng dv trong listDv
            
            System.out.println("Nhập mã động vật");
            dv.setMaDongVat(sc.nextLine());
            System.out.println("Nhập tên động vật");
            dv.setTenDongVat(sc.nextLine());
            int canNang=0;
            do{
                System.out.println("Nhập cân nặng  ");
                canNang = sc.nextInt();
                dv.setCanNang(canNang);
                
            }while(canNang < 0 );
            sc.nextLine();
            System.out.println("Nhập nơi sống");
            dv.setNoiSong(sc.nextLine());
            lstDongVat.add(dv);
             System.out.println("Có muốn nhập tiếp hay k:(y/n) ");
             luaChon= sc.nextLine();
            
            
        }while(luaChon.equalsIgnoreCase("Y"));
    }
    
    //hiển thị ds động vật
    public void HienThiDV()
    {
        for(DongVat dv : lstDongVat)
        {
           dv.inThongTin();
        }
    }
    
    //nhập cân nặng ở mức tối thiểu hiển thị dv có cân nặng > mức tối thiểu
    public void hienThiDVTrenMucToiThieu()
    {
        int canNangTT;
        System.out.println("Mời bạn nhập cân nặng tối thiểu");
        canNangTT = sc.nextInt();
        for(DongVat dv : lstDongVat)
        {
            if(dv.getCanNang()> canNangTT)
            {
                dv.inThongTin();
            }
        }
    }
    public void KeThua()
    {
        Meo meo= new Meo("meo", "dv05", "Mèo nhỏ",100, "Hà nội");
        meo.inThongTin();
    }
    
}
