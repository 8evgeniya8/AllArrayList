package allArrayList.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayList {
//    Метод Collections.sort() сортує
//    ArrayList в порядоку зростання чисел,
//             лексикографічному порядоку рядків
public void methodsCollectionsSort(){
    List<Integer> numbersSort = new ArrayList<>();
    numbersSort.add(5);
    numbersSort.add(3);
    numbersSort.add(2);
    numbersSort.add(4);
        Collections.sort(numbersSort);
        System.out.println("Метод Collections.sort() "+numbersSort);
}

//  Сортування у порядку спадання або якось
//  по своєму за допомогою Comparator
//  в Collections.sort()
public void methodsComparatorSort(){
    List<String> name = new ArrayList<>();
    name.add("Anna");
    name.add("Olga");
    name.add("Mariya");
    name.add("Blada");
        Comparator<String> lenghtComparator
                = (str1,str2)->str2.length();
        Collections.sort(name,lenghtComparator);
        System.out.println("Метод сортування Comparator порівнює " +
                "довжини рядків у зворотному порядку "+name);

    }
//    Або краще використати Stream сортування
public void methodStreamSort(){
    List<String> fruits = new ArrayList<>();
    fruits.add("Strawberry");
    fruits.add("Banana");
    fruits.add("Cherry");
    fruits.add("Kivi");
    List<String> sortedFruits = fruits.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
        System.out.println("Метод сортування Stream в " +
                "алфавітному порядку зі зворотною послідовністю "+sortedFruits);
    }
}
