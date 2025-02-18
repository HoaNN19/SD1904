/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XuLyChuoi;

/**
 *
 * @author nguye
 */
public class LyThuyet {
    public static void main(String[] args) {
        //Kí tự đặt biệt: \t = tab; \r = về đầu dòng; \n xuống dòng
        System.out.println("\t+ họ và tên: Tâm\r\n\t+ tuoi 19");
        System.out.println("+++++++++++++++++++++");
        String name = "  Ptcd Fpt 2025 ";// 2 khoảng trắn
        //hiển thị chữ về chữ thường: ToLowerCase
        String temp = name.toLowerCase();
        System.out.println(temp);
        //hiển thị in hoa: ToUpperCase
        System.out.println(name.toUpperCase());
        //xóa khoảng trắng đầu và cuối: trim()
        System.out.println(name.trim());
        //Đo độ dài của chuỗi: length()
        System.out.println(name.length());
        //Cắt chuỗi trả về 1 chuỗi mới: SubString()
        /*
            Dạng 1: SubString(beginIndex) => Hiển thị ra chuỗi con sẽ bắt đầu
                              từ vị trí đó đến hết chuỗi
            Dạng 2: SubString(beginIndex, endIndex)=> hiển thị ra chuỗi con sẽ bắt
                   đầu từ vị trí đó cho đến vị trí endIndex-1 (không tính index)
        BginIndex: chỉ mục bắt đầu của chuỗi(tính từ0)
        EndIndex : chỉ mục kết thúc chuỗi
             a= "abcxyz123"
             subString(5) = "z123"
              subString(3,7)= "xyz1"
        */
        String a = "abcxyz123";
        System.out.println(a.substring(5));
        System.out.println(a.substring(3,7));
        //charAt(index): hiển thị phần tử ở vị trí thứ index
        System.out.println(a.charAt(3));
        //replaceAll(find, replace) : hoán đổi
        System.out.println(a.replace("abc", "hí"));
        //Hàm tách chuỗi: split()+> tách chuỗi thành nhiều phần tử trong mảng
       //sau khi tách lưu trữ thành dạng mảng
        String[] words = name.split("\s"); // tách chuỗi dựa trên khaorng trắng
       for(String x : words)
       {
           System.out.println(x);
       }
       //equal(): thay dâu = và sử dụng vs String= so sánh tuyệt đối
       //contrain(): hàm chứa = tương đối
        System.out.println("+++++++++++++++++++++");
        String name1= "abcxyz";
        String name2= "abc";
        if(name1.equals(name2))
        {
            System.out.println("bằng nhau");
        }
        if(name1.contains(name2))
        {
            System.out.println("Chứa nhau");
        }
        
        //equalsIgnoreCase: hàm này so sánh như equal nhưng k phân biệt in hoa và in thường
        //Kiểm tra có bắt đầu bởi hay k: startWith()=> sẽ ra true/false
        System.out.println(name1.startsWith("a"));
        //Kiểm tra có kết thúc vởi hay k: endWith();
        //indexOf(): tìm vị trí đầu tiên của chuỗi con, nếu k thấy trả về -1
        System.out.println("+++++++8");
        System.out.println(name1.indexOf('z'));
        //lastIndexOf: trả về chỉ số cuối của kí tự hoặc chuỗi con, k có trả -1
        System.out.println(name1.lastIndexOf('x'));
    }
}
