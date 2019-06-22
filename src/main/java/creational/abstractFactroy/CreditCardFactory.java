package creational.abstractFactroy;

public class CreditCardFactory extends CardFactory {
    @Override
    public CreditTypedCardFactory getCardVariationFactory(CardVariety variety) {
        try {
            return (CreditTypedCardFactory)variety.getCardVariationType().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Illegal Card variation Type");
    }
}
