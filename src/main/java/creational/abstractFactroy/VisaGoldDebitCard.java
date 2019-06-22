package creational.abstractFactroy;

public class VisaGoldDebitCard extends Card{

    @Override
    public String setCardType() {
        return this.type = "GOLD";
    }

    @Override
    public String toString() {
        return this.getClass().getName() + super.toString();
    }
}

