package allArrayList.checkEmpty;

import java.util.ArrayList;
import java.util.List;

public class CheckArrayListIsEmpty {
//   Перевірка за допомогою isEmpty()метода, чи ArrayList порожній
    public void isEmptyMetod(){
        List<String> listEmpty = new ArrayList<>();
        if (listEmpty.isEmpty()){
            System.out.println("Порожній");
        }else {
            System.out.println("Не порожній");
        }
        return ;
    }
    public void sizeMetod(){
        List<String> listSizeMetod = new ArrayList<>();
        if (listSizeMetod.size() == 0) {
            System.out.println("Порожній");
        } else {
            System.out.println("Не порожній");
        }
    }
}
