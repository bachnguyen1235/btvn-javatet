package entities;

public abstract class SinhVienTechMaster {
    private String name;
    private String major;

    public abstract double getScore();

    public SinhVienTechMaster(String name, String major) {
        this.name = name;
        this.major = major;
    }


    public String classify() {
        if (getScore() < 5) {
            return "D";
        } else if (getScore() >= 5 && getScore() < 6.5) {
            return "C";
        } else if (getScore() >= 6.5 && getScore() > 7.5) {
            return "B";
        } else {
            return "A";
        }
    }

    public void printInfor() {
        System.out.println("name: " + name);
        System.out.println("major: " + major);
        System.out.println("Score: " + getScore());
        System.out.println("rank: " + classify());
    }
}
