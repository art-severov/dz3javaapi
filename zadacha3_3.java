package dzseminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class zadacha3_3 {
    Random random = new Random();
        String[] list = {"Меркурий","Венера","Земля","Марс","Юпитер","Сатурн","Уран","Нептун"};
        List<String> newList = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            newList.add(list[random.nextInt(list.length)]);
        }
}
