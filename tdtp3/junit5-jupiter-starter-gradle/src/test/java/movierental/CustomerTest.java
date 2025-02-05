package movierental;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void pour_un_customer_avec_pour_name_Bob_alors_getName_doit_renvoyer_Bob() {
        // GIVEN
        Customer customer = new Customer("Bob");

        // WHEN
        String expected = "Bob";

        // THEN
        assertEquals(expected, customer.getName());
    }

    @Test
    public void la_fonction_statement_doit_renvoyer_le_rental_record() {
        // GIVEN
        Customer customer = new Customer("Bob");
        customer.addRental(new Rental(new Movie("Jaws", Movie.REGULAR), 2));
        customer.addRental(new Rental(new Movie("Golden Eye", Movie.REGULAR), 3));
        customer.addRental(new Rental(new Movie("Short New", Movie.NEW_RELEASE), 1));
        customer.addRental(new Rental(new Movie("Long New", Movie.NEW_RELEASE), 2));
        customer.addRental(new Rental(new Movie("Bambi", Movie.CHILDREN), 3));
        customer.addRental(new Rental(new Movie("Toy Story", Movie.CHILDREN), 4));

        // WHEN
        String expected = "" +
                "Rental Record for Bob\n" +
                "\tJaws\t2.0\n" +
                "\tGolden Eye\t3.5\n" +
                "\tShort New\t3.0\n" +
                "\tLong New\t6.0\n" +
                "\tBambi\t1.5\n" +
                "\tToy Story\t3.0\n" +
                "Amount owed is 19.0\n" +
                "You earned 7 frequent renter points";

        // THEN
        assertEquals(expected, customer.statement());
    }
}