package setup6.LambdaCalculus.Stream;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @Program: ThinkingInJava
 * @Description:
 * @Author: YiMing
 * @Created: 2020/06/02 23:05
 */
public class StreamFilterForObject {

    public static void main(String[] args) {
        Stream.generate(new LocalDateSupplier())
                .limit(31)
                .filter(localDate ->
                        localDate.getDayOfWeek() == DayOfWeek.SATURDAY
                                || localDate.getDayOfWeek() == DayOfWeek.SUNDAY)
                .forEach(System.out::println);
    }
}

class LocalDateSupplier implements Supplier<LocalDate> {

    LocalDate ld = LocalDate.of(2020, 1, 1);
    int n = -1;

    @Override
    public LocalDate get() {
        n++;
        return ld.plusDays(n);
    }
}