package pl.sda.ex2;

import java.util.Arrays;
import java.util.List;

class App {
    public static void main(String[] args) {
        ValueSeekerFactory factory = new ValueSeekerFactory();
        ValueSeeker seekerMin = factory.produce(ValueType.MIN);

        List<Integer> elements = Arrays.asList(43, 3535, 2313, 2465, 6, 5353, 23, 34534543);

        System.out.println("Najmniejsza liczba spośród; " + elements + ", to: " + seekerMin.find(elements));

        ValueSeeker seekerMax = factory.produce(ValueType.MAX);
        System.out.println("Największa liczba spośród: " + elements + ", to: " + seekerMax.find(elements));
    }

}
