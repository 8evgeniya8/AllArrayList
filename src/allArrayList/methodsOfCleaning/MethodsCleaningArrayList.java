package allArrayList.methodsOfCleaning;

import java.util.ArrayList;
import java.util.List;

public class MethodsCleaningArrayList {
    public List<String> methodsClearArrayList(){
        List<String> clearArrayList = new ArrayList<>();
        clearArrayList.add("item1");
        clearArrayList.add("item2");
        clearArrayList.add("item3");
        clearArrayList.clear();
        return clearArrayList;
    }
//    Використання removeAll()методу
    public List<String> methodsRemoveAllArrayList(){
        List <String> removeAllList = new ArrayList<>();
        removeAllList.add("element1");
        removeAllList.add("element2");
        removeAllList.add("element3");
        removeAllList.removeAll(removeAllList);
        return removeAllList;
    }

//    Створення нового ArrayList - також очистить лист
public List<String> methodsNewArrayList(){
        List<String> newArrayList = new ArrayList<>();
        newArrayList.add("element1");
        newArrayList.add("element2");
        newArrayList.add("element3");
        newArrayList = new ArrayList<>();
        return newArrayList;
}

}
