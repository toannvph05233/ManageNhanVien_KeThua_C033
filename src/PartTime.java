public class PartTime extends NhanVien {
    private int numberTime;

    public PartTime() {

    }

    public PartTime(int id, String name, int age, int numberTime) {
        super(id, name, age);
        this.numberTime = numberTime;
    }

    @Override
    public double tinhLuong() {
        return numberTime * 200;
    }

    public int getNumberTime() {
        return numberTime;
    }

    public void setNumberTime(int numberTime) {
        this.numberTime = numberTime;
    }

    @Override
    public String toString() {
        return "PartTime{" +
                "numberTime=" + numberTime + super.toString() +
                '}';
    }
}
