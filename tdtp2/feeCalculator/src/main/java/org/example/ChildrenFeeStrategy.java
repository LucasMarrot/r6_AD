package org.example;

public class ChildrenFeeStrategy implements FeeStrategy {
    static final double CHILD_PRICE_BASE = 100.0;
    static final double HALF_DAY_COEF = 0.2;
    static final double FULL_DAY_COEF = 0.5;
    private static final int ADULT_AGE = 14;

    @Override
    public double calculate(TicketType ticketType) {
        double fee = 0.0;
        if (TicketType.HALF_DAY == ticketType) {
            fee = CHILD_PRICE_BASE * HALF_DAY_COEF;
        } else if (TicketType.FULL_DAY == ticketType) {
            fee = CHILD_PRICE_BASE * FULL_DAY_COEF;
        }

        return fee;
    }

    @Override
    public boolean accepts(Visitor visitor) {
        return ChildrenFeeStrategy.ADULT_AGE > visitor.getAge();
    }
}