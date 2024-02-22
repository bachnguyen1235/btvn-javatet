import java.util.Scanner;

public class SinhVienBiz extends SinhVienTechMaster{
    private double diemMarketting,diemSales,diem;
    @Override
    public void getDiem() {

    }
    public double setDiem(){
        return diem ;
    }

    public double getDiemMarketting() {
        return diemMarketting;
    }

    public void setDiemMarketting(double diemMarketting) {
        this.diemMarketting = diemMarketting;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    public SinhVienBiz(String hoten,String nganh ,double diemMarketting, double diemSales, double diem) {
        super.setHoTen(hoten);
        super.setNganh(nganh);
        this.diemMarketting = diemMarketting;
        this.diemSales = diemSales;
        this.diem = diem;
    }
}
