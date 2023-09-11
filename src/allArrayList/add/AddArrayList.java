package allArrayList.add;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddArrayList {
// 1.   Просте додавання в ArrayList
    public List<String> simpleAddArrayList(){
        List<String> myList = new ArrayList<>();
        myList.add("Banana");
        myList.add("Apple");
        return myList;
    }


//    2. Використання ініціалізації колекції
    public List<String> initializeArrayListWithCollection(){
        return new ArrayList<>
                (Arrays.asList("Сherry","Strawberry"));
    }

//    3. Використання `addAll`"комбінація"
//    методу для об'єднання ArrayLists
    public List<String> combineArrayList(List<String>list1,List<String>list2){
        List<String> combinedList = new ArrayList<>(list1);
        combinedList.addAll(list2);
        return combinedList;
    }
    public void printArrayList(List<String>list){
        for (String item:
             list) {
            System.out.println(item);
        }
    }
}
