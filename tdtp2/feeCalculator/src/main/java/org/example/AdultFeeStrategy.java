package org.example;

public class AdultFeeStrategy implements FeeStrategy {
    static final double ADULT_PRICE_BASE = 100.0;
    static final double HALF_DAY_COEF = 0.6;
    static final double FULL_DAY_COEF = 1.2;
    private static final int ADULT_AGE = 14;

    @Override
    public double calculate(TicketType ticketType) {
        double fee = 0.0;
        if (TicketType.HALF_DAY == ticketType) {
            fee = ADULT_PRICE_BASE * HALF_DAY_COEF;
        } else if (TicketType.FULL_DAY == ticketType) {
            fee = ADULT_PRICE_BASE * FULL_DAY_COEF;
        }

        return fee;
    }

    @Override
    public boolean accepts(Visitor visitor) {
        return AdultFeeStrategy.ADULT_AGE <= visitor.getAge();
    }
}