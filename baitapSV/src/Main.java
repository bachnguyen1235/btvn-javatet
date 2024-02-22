import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap so luong hoc sinh:");
        int n = sc.nextInt();
        System.out.println("ban muon nhap thong tin cua sinh vien gi? (sinhvienIT/sinhvienBiz)");
        String typeSinhvien = sc.nextLine();
        SinhVienTechMaster sinhVienTechMaster [] = new SinhVienTechMaster[n];

        for (int i=0;i<n;i++){
            if (typeSinhvien.equals("sinhvienIT")){
                System.out.println("nhap ho ten:");
                String hoTen = sc.nextLine();
                System.out.println("nhap nhanh: ");
                String nganh = sc.nextLine();
                System.out.println("nhap diem html:");
                double diemHtml = Double.parseDouble(sc.nextLine());
                System.out.println("nhap diem css");
                double diemCss = Double.parseDouble(sc.nextLine());
                System.out.println("nhap diem java");
                double diemJava = Double.parseDouble(sc.nextLine());
                double diem = (2*diemJava+diemHtml+diemCss)/4;
                sinhVienTechMaster[i]=new SinhVienIT(hoTen,nganh,diemJava,diemHtml,diemCss,diem);
            } else if (typeSinhvien.equals("sinhvienBiz")) {
                System.out.println("nhap ho ten:");
                String hoTen = sc.nextLine();
                System.out.println("nhap nhanh: ");
                String nganh = sc.nextLine();
                System.out.println("nhap diem Marketting");
                double diemMarketting = Double.parseDouble(sc.nextLine());
                System.out.println("nhap diem sales");
                double diemSales = Double.parseDouble(sc.nextLine());
                double diem = (2*diemMarketting+diemSales)/3;
                sinhVienTechMaster[i]= new SinhVienBiz(hoTen,nganh, diemMarketting,diemSales,diem);
            }
        }
        for (int i=0;i<n;i++){
            sinhVienTechMaster[i].xuat();
        }
    }
}