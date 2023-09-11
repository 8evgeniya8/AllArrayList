import allArrayList.Converting.ConvertingArrayListToArray;
import allArrayList.add.AddArrayList;
import allArrayList.checkEmpty.CheckArrayListIsEmpty;
import allArrayList.methodsOfCleaning.MethodsCleaningArrayList;
import allArrayList.metodToAccessElements.HowToAccessElementsArrayList;
import allArrayList.sort.SortArrayList;

import java.util.List;

public class Main {


    public static void main(String[]args) {
//        Додавання в ArrayList
        AddArrayList addArrayList = new AddArrayList();
        List<String> addlist1 = addArrayList.simpleAddArrayList();
        addArrayList.printArrayList(addlist1);
        System.out.println();
        List<String> addlist2 = addArrayList.initializeArrayListWithCollection();
        addArrayList.printArrayList(addlist2);
        System.out.println();
        List<String> addlist3 = addArrayList.combineArrayList(addlist1,addlist2);
        addArrayList.printArrayList(addlist3);
        System.out.println();

//        Отримання доступа до елементів у ArrayList
        HowToAccessElementsArrayList howToAccessElementsArrayList =
                new HowToAccessElementsArrayList();
        howToAccessElementsArrayList.foreachMetod();
        System.out.println();
        String seachgetIndex = howToAccessElementsArrayList.getIndexMethod();
        System.out.println(seachgetIndex);
        System.out.println();
        howToAccessElementsArrayList.iteraorMetod();
        System.out.println();

//       Методи для перевірки, чи ArrayList порожній
        CheckArrayListIsEmpty checkArrayListIsEmpty =
                new CheckArrayListIsEmpty();
        checkArrayListIsEmpty.isEmptyMetod();
        checkArrayListIsEmpty.sizeMetod();
        System.out.println();

//      Методи по очищенню ArrayList
        MethodsCleaningArrayList methodsClean =
                new MethodsCleaningArrayList();
        List<String> cleanedArrayList1 = methodsClean.methodsClearArrayList();
        System.out.println("Після методу Clear() "+ cleanedArrayList1);
        List<String> cleanedArrayList2 = methodsClean.methodsRemoveAllArrayList();
        System.out.println("Після методу RemoveAll() "+ cleanedArrayList2);
        List<String> cleanedArrayList3 = methodsClean.methodsNewArrayList();
        System.out.println("Після методу NewArrayList() "+ cleanedArrayList3);
        System.out.println();

//      Перетворення ArrayList в Array може знадобитись
//      коли працюєш із застарілим кодом або API
//        Є ще три варіанта крім цього
        ConvertingArrayListToArray converting = new ConvertingArrayListToArray();
        converting.containToArray();
        System.out.println();
        converting.anotherContainToArray();
        System.out.println();

//        Сортування в ArrayList
        SortArrayList sortArrayList = new SortArrayList();
        sortArrayList.methodsCollectionsSort();
        sortArrayList.methodsComparatorSort();
        sortArrayList.methodStreamSort();
    }
}
