/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class QuanLyDanhSachHoTen {
    //private static: kiểu khai báo là cú pháp để khai báo biến toàn cục
    //biến toàn cục: là biến dùng chung cho toàn bộ class, _name
      private static ArrayList<String> danhSachHoTen = new ArrayList<>();
      private static Scanner sc = new Scanner(System.in);
      //Nhập danh sách
      public static void nhapDanhSach()
      {
          //nguyen VAWN A -> UPPER _>LOWER
          String luaChon;
          do
          {
              System.out.println("Nhap ho ten");
              String hoTen = sc.nextLine();
              danhSachHoTen.add(hoTen); // them hoten vao list danh sach
              
              System.out.println("May co muon them tiep ho ten khong (Y/n");
              luaChon = sc.nextLine().toUpperCase();// chuyen in thuong thanh in hoa
              
          }while(luaChon.equals("Y"));
          
      }
      //xuat danh sach
      public static void xuatDanhSach()
      {
          if(danhSachHoTen.isEmpty())
          {
              System.out.println("Danh sach rong");
              return;
          }
          //dung vong lap for
//          for(int i=0; i< danhSachHoTen.size(); i++)
//          {
//              System.out.println(danhSachHoTen.get(i));
//          }
          //dung vong lap foreach
          for(String item :danhSachHoTen )
          {
              System.out.println("-"+item);
          }
          
      }
      
      // Xuất danh sách ngẫu nhiên 
      public static void xuatDanhSachNgauNhien()
      {
          //tao 1 arraylist chua danh sach ngau nhien co du lieu cua danh sach ban dau
          ArrayList<String> dsNgauNhien = new ArrayList<>(danhSachHoTen);
          Collections.shuffle(dsNgauNhien);// dung shuffle de dao ngau nhien
          for(String item : dsNgauNhien)
          {
              System.out.println(" - " + item);
          }
      }
      
      //Sap xep giam dan
      public static void sapXepGiamDan()
      {
          //dung sort de sapxep tw be den lon
          //sau do dung reverseOrder() de dao chieu
          danhSachHoTen.sort(Collections.reverseOrder());
          System.out.println("Danh sach sau khi sap xep la");
          //xuat sanh sach
          //vi da lam ham xuatdanhsach cua danhsachhoten o tren roi nen chi can goi lai ham
          xuatDanhSach();
      }
      //Tim kiem va xoa
      public static void timVaXoa()
      {
          //nhap hoten muon xoa
          System.out.println("nhap ten muon xoa");
          //ham trim(): dung de cat khoang trang 2 dau
          String tenXoa = sc.nextLine().toLowerCase().trim(); //chuyen thanh in thuong
          //cach dung vong lap for
//          for(int i=0; i<danhSachHoTen.size(); i++ )
//          {
//              //i la vi tri => get(i)=> lay gia tri cua vi tri thu i
//              //neu tenXoa = vs du lieu o trong danhSachHoTen thi xoa
//              if(danhSachHoTen.get(i).toLowerCase().equals(tenXoa))
//              {
//                  danhSachHoTen.remove(i); // xoa phan tu thu i
//                  System.out.println("Da xoa thanh cong: " + tenXoa);
//                  break;// thoat khoi vong lap sau khi xoa
//              }
//          }
          //cach dung foreach
          for(String item: danhSachHoTen)
          {
              if(item.toLowerCase().equals(tenXoa))
              {
                  danhSachHoTen.remove(item); // xoa phan tu thu i
                  System.out.println("Da xoa thanh cong: " + tenXoa);
                  break;// thoat khoi vong lap sau khi xoa
              }
          }
      }
}

