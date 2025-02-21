/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuaDeSo_01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Service {
    //khai báo và khởi tạo list danh sách teacher có tên là lstTeacher
    public ArrayList<Teacher> lstTeacher = new ArrayList<>();
    
    //Muốn thực thi hàm fakedat khởi tạo contructor
    public Service()
    {
        FakeData();
    }
    
    //Nếu dư thời gian thì tạo hàm fakedata
    public void FakeData()
    {
        lstTeacher.add(new Teacher(1, "GV01", "CNTT"));
        lstTeacher.add(new Teacher(2, "GV02", "Maketing"));
        lstTeacher.add(new Teacher(3, "GV03", "Dồ Họa"));
        lstTeacher.add(new Teacher(4, "GV04", "UDPM"));
    }
    //Nhập ds đối tượng
    public void NhapDanhSach()
    {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Mời bạn nhập số lượng teacher cần nhập: ");
        input = sc.nextInt();
        String luaChon;
        do
        {
            //dùng vòng lặp for để duyệt từng teacher để nhập từng thuộc tính của từng đối tượng
            for(int i=0; i< input; i++)
            {
                Teacher tc= new Teacher(); // khởi tạo đối tượng teacher
                System.out.println("Mời bạn nhập Id");
                //do teacher có hàm set dùng để gán đối tượng
                tc.setID(sc.nextInt());
                //nếu trên nhập int thì thêm dòng này
                sc.nextLine();
                System.out.println("Mời bạn nhập mã gv");
                tc.setMaGV(sc.nextLine());
                System.out.println("Mời bạn nhập tên ngành");
                tc.setNganh(sc.nextLine());
                
                //sau khi nhập xong thì add đối tượng tc vào list danh sách lstTeacher
                lstTeacher.add(tc);
            }
            System.out.println("Bạn có muốn nhập tiếp hay không (y/n");
            luaChon = sc.nextLine().toUpperCase();
            
        }while(luaChon.equals("Y"));
    }
    
    //Xuất danh sách
    public void XuatDanhSach()
    {
        //t đóng vai trò là đối tượng của teacher, nên t dùng đc mọi thuộc tính và phường thức
        for(Teacher t : lstTeacher)
        {
            t.InThongTin();
        }
    }
    //tìm gv có ngành udpm
    public void TimGVUDPM()
    {
        for(Teacher t: lstTeacher)
        {
            //cách 1
//            if(t.getNganh().toUpperCase().equals("UDPM"))
//            {
//                
//               t.InThongTin();
//            }
            //cách 2
            //hàm equalsIgnoreCase so sánh k phân biệt in thường hay in hoa
             if (t.getNganh().equalsIgnoreCase("UDPM")) {
                t.InThongTin();
            }
        }
        
    }
    
    //Sắp xếp theo ngành
    public void SapXepTheoNganh()
    {
        //Lambda là tính năng giúp các bạn viết code nhanh hơn
        //Teacher :: getNganh tương đường (Teacher t) -> t.getNganh
        lstTeacher.sort(Comparator.comparing(Teacher :: getNganh));
        System.out.println("Đã sắp xếp");
        XuatDanhSach();
        
        //cách 2
//         Comparator<Teacher> t = new Comparator<Teacher>() {
//            @Override
//            public int compare(Teacher o1, Teacher o2) {
//                return o2.getNganh().compareTo(o1.getNganh()); // Sắp xếp giảm dần
//            }
        
        
    }
    
    public void KeThua()
    {
        GVMamNon gv = new GVMamNon(2000,1,"GV90","CNTT");
        gv.InThongTin();
    }
    
}
