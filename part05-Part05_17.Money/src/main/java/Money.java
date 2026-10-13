
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

    public boolean lessThan(Money compared) {
        if (compared.euros == this.euros) {
            return this.cents < compared.cents;
        }
        return this.euros < compared.euros;
    }

    public Money plus(Money addition) {
        Money ret;
        if (this.cents + addition.cents >= 100)
            ret = new Money(this.euros + addition.euros + 1, this.cents + addition.cents - 100);
        else
            ret = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return ret;
    }

    public Money minus(Money addition) {
        if (this.lessThan(addition)) {
            return new Money(0, 0);
        }

        Money ret;
        if (this.cents - addition.cents < 0)
            ret = new Money(this.euros - addition.euros - 1, this.cents - addition.cents + 100);
        else
            ret = new Money(this.euros - addition.euros, this.cents - addition.cents);
        return ret;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
