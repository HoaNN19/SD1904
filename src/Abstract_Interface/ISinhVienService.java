/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract_Interface;

/**
 *
 * @author nguye
 */
/*
            1. Trong interfave không thể sử dụng priavte
            2. Mặc định sẽ là phạm vi truy cấp public
            3. Các phương thức ở trong interface đều là abstract
    // ấn chuột phải vào packget -> java interface
nếu lỡ tay chọn java class thì xóa chữ class sửa thành interface
khi tạo class interface công thức tạo tên: I_name
*/
public interface ISinhVienService {
    void ThemSv();   //kiểu k trả về k có phạm vi truy cấp
    String suaSv(SinhVien sv);  // kiểu trả về k có phạm vi truy cập
    public void TimSinhVien();   // kiểu k trả về có pvtc
    
}
