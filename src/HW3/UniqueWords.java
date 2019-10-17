package HW3;

import java.util.*;

public class UniqueWords {
//      Создаем массив со словами
    public static void main(String[] args){
        String [] collectionOfWords = new String[14];
        for(int i = 0;i<14;i++){
            if(i%4==0){
                collectionOfWords[i] = ("Hi");
            } else if (i%3==0){
                collectionOfWords[i] = ("Bye");
            } else
                collectionOfWords[i] = ("word" + i);
        } for(int i = 0;i<14;i++){
//            Проверка работы программы
//            System.out.println(collectionOfWords[i]);
        }


//      Создаем необходимую для "очистки" массива мапу
        LinkedHashMap<String, Integer> uniqueWords = new LinkedHashMap<>();
        for(int i = 0; i<collectionOfWords.length;i++) {
        Integer quantity = uniqueWords.get(collectionOfWords[i]);
        if(quantity == null){
            quantity = 0;
        }
        uniqueWords.put(collectionOfWords[i],quantity+1);
        }
        System.out.println(uniqueWords);
    }


}
