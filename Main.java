package HomeWork151;

import java.util.OptionalDouble;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Main {
    private static int SIZE = 10;
    private static int MIN_VALUE = 20;
    private static int MAX_VALUE = 30;

    public static void main(String[] args) {
        createArrayAndAverage();
    }

    private static void createArrayAndAverage() {
                OptionalDouble integers = IntStream.range(0, SIZE)
                .mapToObj(s -> ThreadLocalRandom.current()
                .nextInt(MIN_VALUE, MAX_VALUE))              // create random array;
                .map(s -> (int) Math.pow(s, 2))             // mathematical pow of array numbers;
                .mapToInt(Integer::intValue)
                .average();                                // mathematical average of array.

        System.out.println(integers);
    }
}
