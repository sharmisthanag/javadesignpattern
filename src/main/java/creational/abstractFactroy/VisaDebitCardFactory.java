package creational.abstractFactroy;

public class VisaDebitCardFactory extends DebitTypedCardFactory{
    @Override
    public Card getCard(int points) {
        return new VisaGoldDebitCard();
    }
}
