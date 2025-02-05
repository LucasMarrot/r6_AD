package org.example;

public interface FeeStrategy {
    double calculate(TicketType ticketType);
    // But : calcule et retourne le  prix du ticket pour le visiteur géré par la classe

    boolean accepts (Visitor visitor);
    // retourne vrai si le visiteur passé en parametre est accepté par cette clessa
    // retourne faux sinon
}
