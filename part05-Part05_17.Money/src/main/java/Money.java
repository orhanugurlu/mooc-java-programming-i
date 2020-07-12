
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        return new Money(euros + addition.euros(),
                         cents + addition.cents());
    }

    public boolean lessThan(Money compared) {
        if (euros < compared.euros()) {
            return true;
        } else if (euros == compared.euros()) {
            return cents < compared.cents();
        }
        return false;
    }

    public int allAsCents() {
        return 100 * euros + cents;
    }
    
    public Money minus(Money decreaser) {
        int cents = allAsCents() - decreaser.allAsCents();
        if (cents < 0) {
            cents = 0;
        }
        return new Money(0, cents);
    }    

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
