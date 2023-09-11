package allArrayList.addingAllElementsFromAnotherCollection;

import java.util.ArrayList;
import java.util.List;

public class AddingAllFromAnotherCollection {
//    Mетод addAll простий і легкий.
//      використовує внутрішню оптимізацію в ArrayList класі.
public void methodaddAll(){
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    list2.add("rabbit");
    list2.add("chicken");
    list2.add("horse");
    list1.addAll(list2);
    System.out.println("Перекидання всіх данних за " +
            "допомогою addAll з ArrayList2 до ArrayList1");
    for (String element:
         list1) {
        System.out.println(element);
        }
    }

//    Перекидати данні можно через потоки java
//      Не ефективно для дуже великих колекцій.
public void methodFlows(){
    List<String> list1 = new ArrayList<>();
    List<String> list2 = List.of("Apple","Ananas","Cherry");
    list2.stream().forEach(list1::add);
    System.out.println("Перекидання всіх данних за " +
            "допомогою потоку з list2 до list1 ");
    for (String element:list1) {
        System.out.println(element);
    }
}

// "Є можливість зробити через збирачі потоків
// він передбачає створення проміжного списку
// для збору елементів із вихідної колекції,
// не ефективно з точки зору використання пам’яті.
//    розглядати не буду
//    ------------------------------------------------

//  Можно використовувати цикли
//  Вони не дуже читабельні, але ефективні для великих колекцій,
//  дозволяють уникнути накладних витрат на створення потоку
public void methodLoop(){
    List<String> list1 = new ArrayList<>();
    List<String> list2 = List.of("Wolf","Hyena","Tiger");
    for (String element:list2) {
        list1.add(element);
    }
    System.out.println("Перекидання всіх данних за " +
            "допомогою цикла з list2 до list1 ");
    for (String element:list1) {
        System.out.println(element);
    }
}
}
