/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapTongHop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class NguoiYeuMoiService {

    //khai báo các biến toàn cục lên đầu: dùng chung cho toàn bộ class, khai báo 1 lần rồi dùng mãi
    Scanner sc = new Scanner(System.in);
    List<NguoiYeuMoi> _lstNym;  // khai báo list danh sách nym
    NguoiYeuMoi _nym; // khai báo 1 đối tượng nym
    String _input; //dùng chung cho mọi tham số nhập vào

    //tạo contructor nymserrvice
    //công thức tạo contructor public + tên class
    public NguoiYeuMoiService() {
        //khởi tạo 1 đối tượng list nym
        _lstNym = new ArrayList<>();
        FakeData();
    }

    //fix cứng dữ liệu
    public void FakeData() {
        //khi nhập đảm báo đúng thứ tự thuộc tính của contructor có tham số ở bên clas nym
        _lstNym.add(new NguoiYeuMoi(90, "Nấu ăn", "0123456", "A", 2006, "Nữ"));
        _lstNym.add(new NguoiYeuMoi(45, "ăn", "123455", "B", 2007, "Nam"));
        _lstNym.add(new NguoiYeuMoi(96, "múa", "5555", "A", 2008, "Nam"));
        _lstNym.add(new NguoiYeuMoi(100, "hát", "66666", "A", 2009, "Nữ"));

    }

    //nhập danh sách nym bằng bàn phím
    public void ThemNym() {
        System.out.println("Mời bạn chọn số lượng nym cần nhập");
        _input = sc.nextLine();
        String luaChon;
        do {
            //dùng vòng lặp for để duyệt từng nym để nhập
            // ví dụ input="3" -> dạng string -> convert về int
            for (int i = 0; i < Integer.parseInt(_input); i++) {
                //khởi tạo đối tượng nym
                _nym = new NguoiYeuMoi();// mỗi lần thêm phải khởi tạo lại đối tượng vậy nên cô để vào vòng for
                System.out.println("Mời nhập tên: ");
                //k thể lôi thuộc tính họ tên ra đc mà phải gọi thông qua đối tượng
                _nym.setHoTen(sc.nextLine());
                System.out.println("Mòi nhâp năm sinh");
                _nym.setNamSinh(sc.nextInt());
                System.out.println("Moi ban nhập giới tính");
                _nym.setGioiTinh(sc.nextLine());
                System.out.println("moi nhap cmt");
                _nym.setCmt(sc.nextLine());
                System.out.println("moi nhap v1");
                _nym.setV1(sc.nextDouble());
                System.out.println("Moi nhạp sở thích");
                _nym.setSoThich(sc.nextLine());
                //sau khi nhập xong thì add đối tượng _nym vào danh sách _lstNym
                _lstNym.add(_nym);
            }
            System.out.println("May co muon them tiep ho ten khong (Y/n");
            luaChon = sc.nextLine().toUpperCase();// chuyen in thuong thanh in hoa
        } while (luaChon.equals("Y"));

    }
    
    //xuất danh sách
   public void xuatDs() {
        for (NguoiYeuMoi x : _lstNym) {
            x.InThongTin();
            System.out.println("\n");
           
        }
    }
   
   //Tìm kiếm ny
   public void TimKiem()
   {
       System.out.println("Moi ban nhap cmt cần tìm");
       _input= sc.nextLine();
       //dùng vòng lặp for để duyệt từng phần tử của nym xem có tìm thấy trùng với dữ liệu _input nhập vào
       //get(i): lấy ra phần tử thứ i
       //_lstNym.get() => lấy ra đối tượng nym thứ i trong danh sách
       //sau đó .getCmt()-> lấy ra dữ liệu của cmt của đối tượng nym được get ở trên
       for(int i=0; i<_lstNym.size(); i++ )
       {
           if(_lstNym.get(i).getCmt().equals(_input))
           {
               _lstNym.get(i).InThongTin();
           }
       }
   }
   
   //Xóa nym
   //trc khi xóa phải tìm đối tượng muốn xóa
   public void Xoa()
   {
       
       System.out.println("Moi ban nhap cmt cần tìm");
       _input= sc.nextLine();
       //dùng vòng lặp for để duyệt từng phần tử của nym xem có tìm thấy trùng với dữ liệu _input nhập vào
       //get(i): lấy ra phần tử thứ i
       //_lstNym.get() => lấy ra đối tượng nym thứ i trong danh sách
       //sau đó .getCmt()-> lấy ra dữ liệu của cmt của đối tượng nym được get ở trên
       for(int i=0; i<_lstNym.size(); i++ )
       {
           if(_lstNym.get(i).getCmt().equals(_input))
           {
               _lstNym.remove(i);
               System.out.println("Đã xóa thành công");
               return;
           }
          
       }
       System.out.println("Không tìm thấy đối tượng muốn xóa");
   }
   
   //SỬA ĐỐI TƯỢNG
   //trc khi sửa phải tìm đối tượng cần sửa
   public void Sua()
   {
       
       System.out.println("Moi ban nhap cmt cần tìm");
       _input= sc.nextLine();
       //dùng vòng lặp for để duyệt từng phần tử của nym xem có tìm thấy trùng với dữ liệu _input nhập vào
       //get(i): lấy ra phần tử thứ i
       //_lstNym.get() => lấy ra đối tượng nym thứ i trong danh sách
       //sau đó .getCmt()-> lấy ra dữ liệu của cmt của đối tượng nym được get ở trên
       for(int i=0; i<_lstNym.size(); i++ )
       {
           if(_lstNym.get(i).getCmt().equals(_input))
           {
               //nếu bài toán k chỉ ra cần sửa thuộc tính gì thì làm như này
               //còn nếu chỉ rõ ràng thì sửa luôn
               System.out.println("1.Sửa tên");
               System.out.println("2.Sở thích");
               System.out.println("Mời bạn chọn thuộc tính cần sửa");
               String chon;
               chon = sc.nextLine();
               switch (chon) {
                   case "1":
                       System.out.println("Moi bạn nhập tên cần sửa");
                       //lấy ra đối tượng cần sửa
                       //dùng hàm setHoten = gán giá trị 
                       _lstNym.get(i).setHoTen(sc.nextLine());
                       break;
                    case "2":
                       System.out.println("Moi bạn nhập tên cần sở thích");
                      
                       _lstNym.get(i).setSoThich(sc.nextLine());
                       break;
                   default:
                       throw new AssertionError();
               }
               System.out.println("Đã sửa thành công");
               return;
               
           }
       }
       System.out.println("Không tìm thấy đối tượng muốn sửa");
   }
}
