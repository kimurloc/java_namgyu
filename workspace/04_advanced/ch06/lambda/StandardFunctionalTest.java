package ch06.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StandardFunctionalTest {
    void main(){
        Predicate<Integer> checkLimit = num -> num <= 100;
        System.out.println(checkLimit.test(120));
        System.out.println(checkLimit.test(70));

        //Consumer<String> writeLog = msg -> System.out.println("log : " + msg);
        Consumer<String> writeLog = System.out::println;
        writeLog.accept("user login");
        writeLog.accept("write post");
        writeLog.accept("log out");

        //Function<String, Integer> convert = str -> Integer.parseInt(str);
        Function<String, Integer> convert = Integer::parseInt;
        System.out.println("change string to int: " + convert.apply("100"));

        //Supplier randomVal = () -> Math.random();
        Supplier randomVal = Math::random;
        System.out.println("random number : " + randomVal.get());
        System.out.println("random number : " + randomVal.get());
        System.out.println("random number : " + randomVal.get());

        Function<Integer, Integer> dice = num -> (int)(Math.random()*num + 1);
        System.out.println(dice.apply(6));
        System.out.println(dice.apply(4));

        Function<String, Integer> strLength = String::length;
        System.out.println("length num : " + strLength.apply("hello"));
        System.out.println("length num : " + strLength.apply("spring framework"));
    }
}