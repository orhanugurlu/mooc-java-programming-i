public class Counter {

    private int value;

    public Counter() {
        this(0);
    }

    public Counter(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
    
    public void increase() {
        increase(1);
    }
    
    public void decrease() {
        decrease(1);
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        }
    }
    
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        }
    }
    
}
