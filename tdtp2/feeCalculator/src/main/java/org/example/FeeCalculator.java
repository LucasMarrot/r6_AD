package org.example;

import java.util.List;

public class FeeCalculator {

    private static List<FeeStrategy> strategies = List.of (new ChildrenFeeStrategy(), new AdultFeeStrategy());

    public static double calculateFee(Visitor visitor, TicketType ticketType) {
        double fee = 0.0;
        FeeStrategy strategy = null;
        int i = 0;
        boolean trouve = false;

        while (i != strategies.size()){

            strategy = strategies.get(i); // element courant de la liste

            if (strategy.accepts(visitor)){
                trouve = true;
                break;
            }
            i++;
        }

        if (trouve) fee = strategy.calculate(ticketType); // calcul de la stratégie trouvée


        return fee;
    }

}
