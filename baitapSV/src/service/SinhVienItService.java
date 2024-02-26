package service;

import entities.SinhVienBiz;
import entities.SinhVienIT;

import java.util.Scanner;

public class SinhVienItService {
    public SinhVienIT inputInfor(Scanner sc){
        System.out.println("moi b nhap ten cho sinh vien IT");
        String nameIT = sc.nextLine();
        System.out.println("moi b nhap chuyen nganh cho sinh vien IT");
        String majorIT = sc.nextLine();
        System.out.println("moi b nhap diem html cho sinh vien IT");
        double htmlScore = Double.parseDouble(sc.nextLine());
        System.out.println("moi b nhap diem css cho sinh vien IT");
        double cssScore = Double.parseDouble(sc.nextLine());
        System.out.println("moi b nhap diem java cho sinh vien IT");
        double javaScore = Double.parseDouble(sc.nextLine());
        SinhVienIT sinhVienIT = new SinhVienIT(nameIT, majorIT,javaScore,htmlScore, cssScore);
        return sinhVienIT;
    }
}
