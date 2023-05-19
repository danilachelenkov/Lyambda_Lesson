import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Мадрид","Париж","Москва","Токио");
       /* Collections.sort(cities, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        Collections.sort(cities,(o1, o2)-> o1.compareTo(o2));

        OnDoneListener listener = (v -> System.out.println(v));
        Test test = new Test(listener);
        test.execute();

    }
}

@FunctionalInterface
interface ISum {
    int sum(int a, int b);
}

@FunctionalInterface
interface OnDoneListener <T>{
    void onDone(T v);
}