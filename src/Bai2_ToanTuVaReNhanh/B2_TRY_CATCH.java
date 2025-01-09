/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_ToanTuVaReNhanh;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class B2_TRY_CATCH {
       //Cách gõ: try + tab
        /*
     1. Không sử dụng try catch khi đang lập trình.
     2. Ở môi trường học tập chỉ dùng try catch khi các bạn nộp bài, mang bài lên chấm, đi bảo vệ....
     3. Trong môi trương làm việc: Chỉ khi nào đóng gói cho Tester hoặc đóng gói cho khách hàng thì bắt buộc phải dùng. 
         */
        /*
            try {
                Thực thi câu lệnh nếu xảy ra lỗi sẽ đẩy xuống catch
            } catch (Exception e) {
                Thực hiện 1 hành động nào đó khi câu lệnh trên xảy ra lỗi
            }
         */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          try
        {
            int a = sc.nextInt();
            System.out.println("Chuc ban da nhap dung");
        }
        catch(Exception ex)
        {
            System.out.println("nhap sai roi");
        }
    }
    
}
