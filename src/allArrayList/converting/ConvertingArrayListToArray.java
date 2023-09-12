package allArrayList.converting;

import java.util.ArrayList;
import java.util.List;

public class ConvertingArrayListToArray {
    //      Перетворення ArrayList в Array може знадобитись
//      коли працюєш із застарілим кодом або API

//    Один з методів через toArray()
//    Можно передати порожній масив
//    потрібного типу.
public Integer[] containToArray() {
    List<Integer> listContain = new ArrayList<>();
    listContain.add(1);
    listContain.add(2);
//    перетворення
    Integer[] arrayContain = listContain.toArray(new Integer[0]);
    for (Integer item : listContain) {
        System.out.println(item);

    }
    return arrayContain;
}
//      Інший варіант методу toArray()дозволяє
//      передавати масив потрібного типу як аргумент
    public Integer[] anotherContainToArray () {
        List<Integer> anotherList = new ArrayList<>();
        anotherList.add(3);
        anotherList.add(4);
//    перетворення
        Integer[] array = new Integer[anotherList.size()];
        anotherList.toArray(array);
        for (Integer item : anotherList) {
            System.out.println(item);
        }
        return array;
////  Ще є три варіанта зміни ArrayList на масив
//    1. Через потоки;
//    2. Через бібліотеку Apache Commons Lang, метод ArrayUtils;
//    3. Через бібліотеку Guava (Google Guava) клас ObjectArrays;
    }
}