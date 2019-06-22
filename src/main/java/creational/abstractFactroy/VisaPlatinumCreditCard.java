package creational.abstractFactroy;

public class VisaPlatinumCreditCard extends Card{

    @Override
    public String setCardType() {
        return this.type = "PLATINUM";
    }

    @Override
    public String toString() {
        return this.getClass().getName()+ super.toString();
    }
}

