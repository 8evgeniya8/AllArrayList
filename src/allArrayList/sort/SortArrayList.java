package allArrayList.sort;

import java.util.*;
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
        System.out.println("Метод Collections.sort() в порядоку зростання чисел "+numbersSort);
}

//  Сортування на основі довжини у
//  зворотному порядку за допомогою Comparator
//  в Collections.sort()
public void methodsComparatorSort(){
    List<String> name = new ArrayList<>();
    name.add("Anna");
    name.add("Olga");
    name.add("Mariya");                                    //не працює
    name.add("Blada");
        Comparator<String> lenghtComparator
                = (str1,str2)->str1.length()-str2.length();
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

//    Cортування списку рядків у порядку спадання
public List<String> sortString(){
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
    names.sort((s1,s2) -> s2.compareTo(s1));
    return names;
    }

}

