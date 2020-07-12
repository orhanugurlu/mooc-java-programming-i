public class Calculator {

    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void sum(int number) {
        this.value = this.value + number;
    }

    public void substract(int number) {
        this.value = this.value - number;
    }

    public int getValue() {
        return this.value;
    }
}