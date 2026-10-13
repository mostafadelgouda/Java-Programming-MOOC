public class PaymentTerminal {

    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000;
    }

    // Cash payment: affordable meal
    public double eatAffordably(double payment) {
        if (payment >= 2.5) {
            this.money += 2.5;
            this.affordableMeals++;
            return payment - 2.5;
        }

        return payment;
    }

    // Cash payment: hearty meal
    public double eatHeartily(double payment) {
        if (payment >= 4.3) {
            this.money += 4.3;
            this.heartyMeals++;
            return payment - 4.3;
        }

        return payment;
    }

    // Card payment: affordable meal
    public boolean eatAffordably(PaymentCard payment) {
        if (payment.takeMoney(2.5)) {
            this.affordableMeals++;
            return true;
        }

        return false;
    }

    // Card payment: hearty meal
    public boolean eatHeartily(PaymentCard payment) {
        if (payment.takeMoney(4.3)) {
            this.heartyMeals++;
            return true;
        }

        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }

    }

    @Override
    public String toString() {
        return "money: " + money
                + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}