package subject2;

public class Calculator {
    private int num1;
    private int num2;
    private int result;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = 0;
    }

    public  void sum() {
        this.result = this.num1 + this.num2;
        System.out.println(result);
    }

    public void sub() {
        result = this.num1 - this.num2;
        System.out.println(result);
    }

    public void multi() {
        result = this.num1 * this.num2;
        System.out.println(result);
    }

    public void div() {
        result = this.num1 / this.num2;
        System.out.println(result);
    }
}
