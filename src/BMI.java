public class BMI {
    public String name;
    public int weight;
    public double height;
    private double bmi;

    public double getBmi() {
        return bmi;
    }


//     calcBmi의 경우 외부에서 사용이 불가능하지만 setMyInfo에서 우회적으로 사용가능
    public void setMyInfo(int height,int weight) {
        this.height = height / 100.0;
        this.weight = weight;
        calcBmi(this.height, this.weight);
    }

    private void calcBmi(double height, int weight) {
        this.bmi = (double)weight / (height * height);
    }
}
