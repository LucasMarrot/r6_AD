import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        LocalDate localDateNow = LocalDate.now();
        return localDateNow.isAfter(startingDate)
                &&
                localDateNow.isBefore(endingDate);
    }

    private static boolean isDateBetween(LocalDate startingDate, LocalDate endingDate, LocalDate localDateNow) {
        return localDateNow.isAfter(startingDate)
                &&
                localDateNow.isBefore(endingDate);
    }
}