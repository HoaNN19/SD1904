/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_VongLap_Ham;

/**
 *
 * @author nguye
 */
public class ForEach {
    //fore: dùng để duyệt vị trí của mảng : 6 vị trí
    //foreeach: dùng để duyệt phần tử của mảng
    //a[]= {x,y,z,a,b,c}
    //Công thức: for(<kiểu dữ liệu> + <tên biến> : <tên mảng))
    //var: không cần xác định kiểu dữ liệu
    //var a = 'c', 1,"string"
    public static void main(String[] args) {
        int[] arr= {10,20,30,50,40};
        //for
        for(int i =0; i< arr.length; i++)
        {
            System.out.println("Phần tử thứ "+ i +" ="+ arr[i] );
        }
        //forEach
        //x: đóng vai trò là từng phần tử của mảng
       //arr: là mảng
       //có thể dùng biến var vì k cần xác định kiểu dữ liệu
       System.out.println("---------");
        for(int x : arr)
        {
            
            System.out.println(x);
        }
        /*
            Khai báo 1 mảng chuỗi có 4 phần tử
            Gán giá trị cho từng phần tử
            In các giá trị của phần tử bằng 2 cách: for và foreach
        */
    }
    
    
    
}
