/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5_ArrayList_List;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author nguye
 */
public class b5_ArrayList {
    public static void main(String[] args) {
        //PHẦN 1: CÓ 2 LOẠI ĐỊNH KIỂU VÀ K ĐỊNH KIỂU
        //1.1: kHÔNG ĐỊNH KIỂU: CÓ THỂ CHỨA BẤT KÌ KIỂU DỮ LIỆU NÀO
        ArrayList arrKhongDinhKieu = new ArrayList();
        
        //1.2: Định kiểu: chứa các phần tử có kiểu đã chỉ định
        //k truyền đc int = mà phải truyền Integer
        ArrayList<Integer> arrListInt = new ArrayList<>();
        //khai báo tường mình
        ArrayList<Double> arrListDouble = new ArrayList<Double>();
         ArrayList<String> arrListString = new ArrayList<>();
         
        //PHẦN 2: SỬ DỤNG PHWPNG THỨC
        //2.1: THÊM ĐỐI TƯỢNG VÀO DANH SÁCH
        //nếu là arrlisst k định kiểu thì add kiểu dữ liệu nào cũng đc
        arrKhongDinhKieu.add(1); // THÊM 1 VÀO ARRLIST
        arrKhongDinhKieu.add("abc");
        arrKhongDinhKieu.add('c');
        arrKhongDinhKieu.add(2.5); // 1,"abc",'c', 2.5
        // chèn số 9 vào vị trí thử 0 và dịch chuyển giá trị
        //index 0 ban đầu sang index 1
        // 5,6,7,4 -> 9,5,6,7,4
        arrKhongDinhKieu.add(0, 9); //-> 9,1,"abc",'c',2.5
        //nếu arrList có định kiểu thì phải truyền đúng dữ liệu
        //arrListString.add(1);//k đúng kiểu dữ liệu
        arrListString.add("abc");
        arrListString.add("1");
        
        //xuất dánh sách phần tử
//        for(var x : arrKhongDinhKieu )
//        {
//            System.out.println(x);
//        }
        //2.2 Hàm lấy giá trị: GET
        //System.out.println(arrKhongDinhKieu.get(3));
        // HÀM TÍNH KÍCH THƯỚC MẢNG: SIZE
//        for(int i=0; i< arrKhongDinhKieu.size(); i++)
//        {
//            System.out.println(arrKhongDinhKieu.get(i)+ " ");
//        }
        //Sắp xếp mì ăn liền: hàm sort -> theo thứ tự từ bé đến lớn
        Collections.sort(arrListString);
        for(var x : arrListString )
      {
            System.out.println(x);
       }
        //hàm đảo ngược: reverse
        Collections.reverse(arrListString);
        
        //hàm check rỗng: isEmpty
        if(arrListInt.isEmpty())
        {
            System.out.println("Rỗng bạn ê");
        }
        
    }
}
