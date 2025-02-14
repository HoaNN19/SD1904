/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class BaiTap_01 {
    /*
    Cho một số nguyên dương N bất kì: 
- Hiển thị các số lẻ từ 1 đến N sử dụng vòng lặp for
- Tính tổng S các số lẻ đó, và in kết quả tính được ra ngoài màn hình
- In ra số S đó là số chia hết cho 3 hay không? 
    Nếu có thì in ra kết quả phép chia lấy nguyên. 
    Nếu không thì in ra số S đó trừ 10.
Đầu vào: Số nguyên dương N
Đầu ra: In số đó ra ngoài màn hình, hiển thị các số lẻ từ 1 đến n và tổng các số đó, kiểm tra số đó có chia hết cho 3 không?
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int tong=0;
        do {
            System.out.println("Nhập số nguyên dương cần");
            n = sc.nextInt();         
        } while (n<=0);
        //LẤY CÁC SỐ LẺ TỪ 1-N => PHẢI DÙNG FOR ĐỂ DUYỆT
        System.out.println("Các số lẻ từ 1 đến "+ n+":");
        for(int i =1; i<=n; i+=2)
        {
            System.out.println(i + " ");    
            tong +=i;
        }
        System.out.println("Tổng các số lẻ từ 1 đến "+ n+ " là " + tong);
        //kiểm tra xem tổng có chia hết cho 3 hay không
        if(tong %3 ==0)
        {
            System.out.println("Tổng " +tong + " chia hết cho 3");
            System.out.println("Kết quả chia lấy nguyên là"+ (tong/3));
        }
        else{
            System.out.println("Tổng " +tong + " không chia hết cho 3");
            System.out.println("Tổng sau khi trừ 10 là"+ (tong-10));
        }
    }
}
