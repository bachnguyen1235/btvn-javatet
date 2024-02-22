import java.util.Scanner;

public class SinhVienIT extends SinhVienTechMaster{
    private double diemJava, diemHtml,diemCss,diem;

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("diem java la: "+diemJava);
        System.out.println("diem html la: "+diemHtml);
        System.out.println("diem css la: "+diemCss);

    }

    @Override
    public void getDiem() {

    }

    public double setDiem(){
        return diem ;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public SinhVienIT(String hoten,String nganh ,double diemJava, double diemHtml, double diemCss, double diem) {
        super.setHoTen(hoten);
        super.setNganh(nganh);
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
        this.diem = diem;
    }
}
