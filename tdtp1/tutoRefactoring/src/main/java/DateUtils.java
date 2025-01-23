import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        LocalDate localDateNow = LocalDate.now();
        return localDateNow.isAfter(startingDate)
                &&
                localDateNow.isBefore(endingDate);
    }

    private static boolean isDateBetween(LocalDate startingDate, LocalDate endingDate, LocalDate localDateNow, boolean inclusive) {
        LocalDate startingDay;
        LocalDate endingDay;

        if (inclusive) {
            startingDay = startingDate.minusDays(1);
            endingDay = endingDate.plusDays(1);
        }
        else {
            startingDay = startingDate;
            endingDay = endingDate;
        }

        return localDateNow.isAfter(startingDate)
                &&
                localDateNow.isBefore(endingDate);
    }
}