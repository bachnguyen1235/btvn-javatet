package entities;

public class SinhVienBiz extends SinhVienTechMaster {
    private double maketingScore;
    private double saleScore;

    public SinhVienBiz(String name, String major, double maketingScore, double saleScore) {
        super(name, major);
        this.maketingScore = maketingScore;
        this.saleScore = saleScore;
    }

    public SinhVienBiz(String name, String major) {
        super(name, major);
    }

    public double getMaketingScore() {
        return maketingScore;
    }

    public void setMaketingScore(double maketingScore) {
        this.maketingScore = maketingScore;
    }

    public double getSaleScore() {
        return saleScore;
    }

    public void setSaleScore(double saleScore) {
        this.saleScore = saleScore;
    }

    @Override
    public double getScore() {
        return (2 * maketingScore + saleScore) / 3;
    }


}
