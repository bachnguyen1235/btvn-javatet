import entities.SinhVienBiz;
import entities.SinhVienIT;
import service.SinhVienBizService;
import service.SinhVienItService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVienBizService sinhVienBizService = new SinhVienBizService();
        SinhVienBiz sinhVienBiz = sinhVienBizService.inputInfor(sc);
        sinhVienBiz.printInfor();
        SinhVienItService sinhVienItService = new SinhVienItService();
        SinhVienIT sinhVienIT = sinhVienItService.inputInfor(sc);
        sinhVienIT.printInfor();
    }
}