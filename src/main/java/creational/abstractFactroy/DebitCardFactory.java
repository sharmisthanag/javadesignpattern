package creational.abstractFactroy;

public class DebitCardFactory extends CardFactory {
    @Override
    public DebitTypedCardFactory getCardVariationFactory(CardVariety variety) {
        try {
            return (DebitTypedCardFactory)variety.getCardVariationType().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Illegal Card variation Type");
    }
}
