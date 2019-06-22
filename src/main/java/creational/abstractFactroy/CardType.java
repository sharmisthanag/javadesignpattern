package creational.abstractFactroy;

public enum CardType {
    CREDIT(CreditCardFactory.class),DEBIT(DebitCardFactory.class);
    public Class cardTypeClass;
    CardType(Class cardTypeClass){
        this.cardTypeClass = cardTypeClass;
    }

}
