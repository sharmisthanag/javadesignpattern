package creational.abstractFactroy;

public abstract class CardFactory {
    public static CardFactory getCardFactory(CardType cardType) {
        Class cardTypeClass = cardType.cardTypeClass;
        try {
            return (CardFactory) cardTypeClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Illegal Card Type");
    }
    public abstract TypedCardFactory getCardVariationFactory(CardVariety variety);
}
