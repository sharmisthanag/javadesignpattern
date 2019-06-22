package creational.abstractFactroy;

public class AmexDebitCardFactory extends DebitTypedCardFactory{
    @Override
    public Card getCard(int points) {

        return new AmexGoldDebitCard();
    }
}
