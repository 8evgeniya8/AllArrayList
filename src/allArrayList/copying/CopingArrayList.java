package allArrayList.copying;

import java.util.ArrayList;
import java.util.List;

public class CopingArrayList {
//    Методи копіювання

//    Метод shallow copy, створює поверхневу копію
    public void shallowСopy(){
        List<String> originalList = new ArrayList<>();
        originalList.add("Kharkiv");
        originalList.add("Odesa");
        originalList.add("Lviv");
        ArrayList<String> copiedList = new ArrayList<>(originalList);
        copiedList.add("Roze");
        System.out.println("Оригінальний лист " + originalList);
        System.out.println("Поверхнева копія " + copiedList);
    }

//    Використання бібліотеки Apache Commons Collections
//    використовуючи клас ListUtils який дозволяє копіювати список.
//    Гарно коли використовуєш компоненти Apache
//    Використовує метод утіліти

//    public void listUtils() {
//        List<String>originalList = new ArrayList<>();
//        originalList.add("rain");
//        originalList.add("red");
//        originalList.add("room");
//        List<String> copiedList = new ArrayList<>(ListUtils.copy(originalList));         //не працює copy
//        copiedList.add("Fru");
//        System.out.println("Оригінальний лист" + originalList);
//        System.out.println("Копія лист" + copiedList);
//    }
}
