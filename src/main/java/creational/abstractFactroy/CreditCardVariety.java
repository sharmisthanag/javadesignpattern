package creational.abstractFactroy;

public enum CreditCardVariety implements CardVariety {
    VISA(VisaCreditCardFactory.class), AMEX(AmexCreditCardFactory.class);
    Class cardVariation;

    CreditCardVariety(Class clazz) {
        this.cardVariation = clazz;
    }

    @Override
    public Class getCardVariationType() {
        return this.cardVariation;
    }
}
