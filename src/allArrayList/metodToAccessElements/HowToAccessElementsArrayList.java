package allArrayList.metodToAccessElements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Отримання доступа до елементів у ArrayList

public class HowToAccessElementsArrayList {
     public String getIndexMethod(){
//         отримання через індекс
         List<String> list = new ArrayList<>();
         list.add("Kitten");
         list.add("Puppy");
         list.add("Turtle");
         String homeAnimal = list.get(1);
         return homeAnimal;
     }

//отримання через цикл foreach
// для перебирання кожного елементу
public List<Integer> foreachMetod(){
         List<Integer> numbers = new ArrayList<>();
         numbers.add(1);
         numbers.add(2);
         numbers.add(3);
         numbers.add(2);
    for (int numb:
         numbers) {
        System.out.println(numb);
    }
    return numbers;
}

//отримання через ітератор
    public List<Double> iteraorMetod(){
         List<Double> praice = new ArrayList<>();
         praice.add(9.99);
         praice.add(0.99);
         praice.add(5.99);
         Iterator<Double> iteratorPraice = praice.iterator();
         while (iteratorPraice.hasNext()){
             Double praiceNextWhile = iteratorPraice.next();
             System.out.println(praiceNextWhile);
         }
        return praice;
    }
}
