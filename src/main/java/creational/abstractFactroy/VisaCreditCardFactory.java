package creational.abstractFactroy;

public class VisaCreditCardFactory extends CreditTypedCardFactory {
    @Override
    public Card getCard(int points) {
        if (points>1000) return new VisaPlatinumCreditCard();
        return new VisaGoldDebitCard();
    }
}
