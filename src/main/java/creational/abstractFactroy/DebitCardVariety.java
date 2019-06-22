package creational.abstractFactroy;

public enum DebitCardVariety implements CardVariety {
    VISA(VisaDebitCardFactory.class), AMEX(AmexDebitCardFactory.class);
    Class cardVariation;

    DebitCardVariety(Class clazz) {
        this.cardVariation = clazz;
    }

    @Override
    public Class getCardVariationType() {
        return this.cardVariation;
    }
}
