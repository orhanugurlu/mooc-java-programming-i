public class Container {

    private final static int MAX_AMOUNT = 100;
    private String name;
    private int amount;

    public Container(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
    
    public void addAmount(int newAmount) {
        if (newAmount < 0) {
            return;
        }
        if ((amount + newAmount) > MAX_AMOUNT) {
            amount = MAX_AMOUNT;
        } else {
            amount += newAmount;
        }
    }
    
    public int removeAmount(int amountToRemove) {
        int result = 0;
        if (amountToRemove > amount) {
            result = amount;
            amount = 0;
        } else {
            result = amountToRemove;
            amount -= amountToRemove;
        }
        return result;
    }

    @Override
    public String toString() {
        return name + ": " + amount + "/" + MAX_AMOUNT;
    }
    
}
