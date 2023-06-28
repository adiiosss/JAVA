package PPJ18.task1;

import java.time.LocalDate;
import java.time.YearMonth;

public class TASK1 {

    public static void main(String[] args) {

        printMonth(12,2022);

    }
    public static void printMonth (int m, int y){

        YearMonth ym = YearMonth.of(y, m);

        int counter = 1;

        int dayValue = LocalDate.of(y, m, 1).getDayOfWeek().getValue();
        if (dayValue != 7)
            for (int i = 0; i < dayValue; i++, counter++) {
                System.out.printf("%-4s", "");
            }

        for (int i = 1; i <= ym.getMonth().length(ym.isLeapYear()); i++, counter++) {
            System.out.printf("%-4d", i);

            if (counter % 7 == 0) {
                System.out.println();
            }
        }
    }
}

