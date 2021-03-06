package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static HashMap<Integer,String> map = new HashMap<>();
    public static void main(String[] args) {
	// write your code here
        while (true){
            menu();
        }
    }

    public static void menu(){
        System.out.println("-----------------------\ndanh sach menu : ");
        System.out.println("1 : them ");
        System.out.println("2 : xuat danh sach :");
        System.out.println("3 : sua danh sach : ");
        System.out.println("4 : xoa danh sach : ");
        System.out.println("5 : tim kiem : ");

        System.out.println("moi ban chon menu : ");
        int chon = new Scanner(System.in).nextInt();
        switch (chon){
            case 1 :
                themDanhSach();
                break;
            case 2 :
                xuatDanhSach();
                break;
            case 3 :
                suaDanhSach();
                break;
            case 4 :
                xoaDanhSach();
                break;
            case 5 :
                timKiem();
                break;
            default:
                System.err.println("cam on ban");
                System.exit(0);
                break;
        }
    }

    public static void timKiem() {
        // 1 : tim kiem theo ma cuon sach
//        System.out.println("nhap ma cuon sach ban muon tim : ");
//        int ma = new Scanner(System.in).nextInt();
//        if(map.containsKey(ma) == false){
//            System.out.println("cuon sach ban tim ko co trong array");
//        }else{
//            System.out.println("sach ban dang tim kiem la : " + map.get(ma));
//        }

        // 2 : tim kiem theo cac ky tu co trong ten cuon sach
        System.out.println("nhap ten cuon sach ma ban muon tim : ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("thong tin ve cuon sach ban muon tim la :");
        int count = 0;
        for(Map.Entry<Integer,String> item : map.entrySet()){
            if(item.getValue().contains(ten)){
                System.out.println(item.getKey() + "\t" + item.getValue());
                count++;
            }
        }
        if(count == 0){
            System.out.println("cuon sach ban dang tim ko ton tai trong hash map");
        }
    }

    public static void xoaDanhSach() {
        System.out.println("nhap ma sach can xoa : ");
        int ma = new Scanner(System.in).nextInt();
        if(map.containsKey(ma) == false){
            System.out.println("ma sach chua ton tai");
        }else{
            map.remove(ma);
        }
        System.out.println("danh sach sach sau khi xoa bot phan tu : ");
        xuatDanhSach();
    }

    public static void suaDanhSach() {
        System.out.println("moi ban nhap ma sach can sua : ");
        int ma = new Scanner(System.in).nextInt();
        if(map.containsKey(ma) == false){
            System.out.println("ma sach chua ton tai trong array list");
        }else{
            System.out.println("nhap ten moi cua sach : ");
            String ten = new Scanner(System.in).nextLine();
            map.put(ma,ten);
        }
        System.out.println("danh sach sach sau khi sua la : ");
        xuatDanhSach();
    }

    public static void xuatDanhSach() {
        for (Map.Entry<Integer,String>item : map.entrySet()){
            System.out.println(item.getKey() + "\t" + item.getValue());
        }
    }

    public static void themDanhSach() {
        System.out.println("moi ban nhap ma : ");
        int ma = new Scanner(System.in).nextInt();
        System.out.println("moi ban nhap ten sach : ");
        String ten = new Scanner(System.in).nextLine();
        if(map.containsKey(ma) == false){
            map.put(ma,ten);
        }
    }

}
