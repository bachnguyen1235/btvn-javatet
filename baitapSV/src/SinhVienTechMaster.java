import java.util.Scanner;

public abstract class  SinhVienTechMaster {
    private String hoTen;
    private String nganh;

    private double diem;

    private String hocluc;
    public abstract void getDiem();


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void getHocLuc(){
        

    }

    public void xuat(){
        System.out.println("ho ten: "+hoTen);
        System.out.println("nganh: "+nganh);
        System.out.println("diem: "+diem);
        if (diem<0 || diem>10){
            System.out.println("nhap diem loi, moi nhap lai");
        }else {
            if(diem<5){
                hocluc="yeu";
            }else if(diem>5 && diem<6.5){
                hocluc="trung binh";
            } else if (diem>6.5 && diem<7.5) {
                hocluc="kha";
            }else {
                hocluc="gioi";
            }
        }
        System.out.println("hoc luc: "+hocluc);
    }




//    @Override
//    public String toString() {
//        return "SinhVienTechMaster{" +
//                "hoTen='" + hoTen + '\'' +
//                ", nganh='" + nganh + '\'' +
//                '}';
//    }
}
