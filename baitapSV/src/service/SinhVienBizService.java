package service;

import entities.SinhVienBiz;

import java.util.Scanner;

public class SinhVienBizService {
public SinhVienBiz inputInfor(Scanner sc){
    System.out.println("moi b nhap ten cho sinh vien biz");
    String nameBiz = sc.nextLine();
    System.out.println("moi b nhap chuyen nganh cho sinh vien biz");
    String majorBiz = sc.nextLine();
    System.out.println("moi b nhap diem maketing cho sinh vien biz");
    double maketingScore = Double.parseDouble(sc.nextLine());
    System.out.println("moi b nhap diem sale cho sinh vien biz");
    double saleScore = Double.parseDouble(sc.nextLine());
    SinhVienBiz sinhVienBiz = new SinhVienBiz(nameBiz, majorBiz, maketingScore, saleScore);
    return sinhVienBiz;
}
}
