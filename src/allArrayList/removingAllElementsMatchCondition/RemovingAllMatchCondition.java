package allArrayList.removingAllElementsMatchCondition;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingAllMatchCondition {
//    видалення всіх елементів у ArrayList, які відповідають певній умові

//    метод removeIf. В цьому прикладі видаляємо всі парні
    public void metodRemoveIf(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println("Оригінальний список "+ numbers);
        numbers.removeIf(numb ->numb % 2 == 0);
        System.out.println("Видалення всіх парних чисел " +
                "використовуючи removeIf" + numbers);
    }

//    Mетод Stream API . В цьому прикладі повидаляємо
//    всі імена, які починаються на букву "Г"
    public void metodStream(){
        List<String> names = new ArrayList<>();
        names.add("Валентина");
        names.add("Ганна");
        names.add("Олександра");
        names.add("Віталій");
        names.add("Глеб");
        names.add("Костянтин");
        System.out.println("Список імен " + names);
        List<String> filtrNames = names.stream()
                .filter(nam ->!nam.startsWith("Г"))
                .collect(Collectors.toList());
        System.out.println("Змінений лист без імен які починаються на \"Г\" \n " +
                "використовуючи метод Stream" + filtrNames);
    }
}
