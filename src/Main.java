import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Pair> allPairs = new ArrayList<>();
        for (int first = 2; first <= 9; first++) {
            for (int second = first; second <= 9; second++) {
                allPairs.add(new Pair(first, second));
            }
        }
        Collections.shuffle(allPairs);
        List<Pair> chosenPairs = allPairs.subList(0, 15);

        System.out.println(chosenPairs);
    }

    //проверяем имеются повторяющиеся значения или нет (пример 2*3 и 3*2)
    static void ran() {
        int a[] = new int[15];
        int b[] = new int[15];
        int count = 1;
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = 0; j < b.length; j++) {
                if (((a[i] == b[j]) && (a[j] == b[i])) && (a[i] != b[i])) {
                    a[i] = (int) (Math.random() * 7) + 2;
                    ran();
                }
            }
        }
    }
}