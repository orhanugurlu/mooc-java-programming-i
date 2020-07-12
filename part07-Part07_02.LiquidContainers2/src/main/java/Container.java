public class Container {

    private final static int MAX_AMOUNT = 100;
    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return amount;
    }
    
    public void add(int newAmount) {
        if (newAmount < 0) {
            return;
        }
        if ((amount + newAmount) > MAX_AMOUNT) {
            amount = MAX_AMOUNT;
        } else {
            amount += newAmount;
        }
    }
    
    public void remove(int amountToRemove) {
        if (amountToRemove > amount) {
            amount = 0;
        } else {
            amount -= amountToRemove;
        }
    }

    @Override
    public String toString() {
        return amount + "/" + MAX_AMOUNT;
    }
    
}
