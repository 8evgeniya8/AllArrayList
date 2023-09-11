package allArrayList.checkingTwoArrayListsEqua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class СheckingTwoEqua {
//    перевірка рівності двох ArrayLists

    //    Через метод equals за за своїми елементами,
//    які повинні бути в одному порядку
    public void equalsСheckingTwoList() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        boolean isEqals = list1.equals(list2);
        System.out.println("Чи однакові значння в одному порядку? " +
                "використання методу equals " + isEqals);
    }

    //     Метод containsAll, перевіряє усі елементи іншого ArrayList.
//     Не вимагає, щоб елементи були в одному порядку.
    public void containsAll() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 2, 1));
        boolean isEqals = list1.containsAll(list2) && list2.containsAll(list1);
        System.out.println("Чи однакові значння в одному порядку? " +
                "використання методу containsAll " + isEqals);
    }

    //  Порівняння вручну
    public void manualComparison() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        boolean isEqals = true;
        if (list1.size() != list2.size()) {
            isEqals = false;
        } else {
            for (int i = 0; i < list1.size(); i++) {
                if (!list1.get(i).equals(list2.get(i))) {
                    isEqals = false;
                    break;
                }
            }
        }
        System.out.println("Чи дорівнюють значення у двох ArrayList?" +
                "Перевірка вручну " + isEqals);
    }
}
