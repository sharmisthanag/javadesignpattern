package creational.abstractFactroy;

public class AmexCreditCardFactory extends CreditTypedCardFactory {
    @Override
    public Card getCard(int points) {
        if (points>1000) return new AmexPlatinumCreditCard();
        return new AmexGoldCreditCard();
    }
}
