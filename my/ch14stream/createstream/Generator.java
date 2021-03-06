package my.ch14stream.createstream;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Stream.generate() 将对象转换为流
public class Generator implements Supplier<String>{
    Random rand = new Random(47);
    char[] letters =
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    @Override public String get() {
        return "" + letters[rand.nextInt(letters.length)];
    }
    public static void main(String[] args) {
        String word = Stream.generate(new Generator())
            .limit(30)
            .collect(Collectors.joining());
        System.out.println(word);
    }

}
