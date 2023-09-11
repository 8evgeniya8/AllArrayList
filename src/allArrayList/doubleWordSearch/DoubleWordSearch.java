package allArrayList.doubleWordSearch;

import java.util.*;
import java.util.stream.Collectors;

public class DoubleWordSearch {
//    Методи пошуку задвоєних слів в ArrayList

//    Один з методів який може знайти однакові
//    слова - це використати HashSet
    public void metodHeshSet(){
        List<String> wordList = new ArrayList<>();
        wordList.add("Rick Sanchez");
        wordList.add("Morty Smith");
        wordList.add("Summer Smith");
        wordList.add("Rick Sanchez");
        wordList.add("Jerry Smith");
        wordList.add("Beth Smith");
        wordList.add("Morty Smith");
        Set<String> uniqueWords = new HashSet<>();
        List<String> duplicateWords = new ArrayList<>();
        for (String word:
             wordList) {
            if (!uniqueWords.add(word)){
                duplicateWords.add(word);
            }
        }
        System.out.println("Задвоєні слова через використання HeshSet : " + duplicateWords);
    }

//    Ще один метод пошуку через використання Streams
//    групує слова за їх кількістю та фільтрує

//    Але поки що я цього не розумію ((((
    public void streamsMetod(){
        List<String> wordList = new ArrayList<>();
        wordList.add("Jerry Smith");
        wordList.add("Rick Sanchez");
        wordList.add("Morty Smith");
        wordList.add("Beth Smith");
        wordList.add("Summer Smith");
        wordList.add("Jerry Smith");
        wordList.add("Beth Smith");
        List<String> dublicateWord = wordList.stream()
                .collect(Collectors.groupingBy
                        (word -> word, Collectors.counting()))
                .entrySet().stream()
                .filter(entry ->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Задвоєні слова через використання Steams : " + dublicateWord);
    }

//    Ще один метод з пошуку, який я не розумію
    public void mapMetod(){
        List<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("banana");
        wordList.add("apple");
        wordList.add("banana");
        wordList.add("cherry");
        wordList.add("cherry");
        Map<String,Integer> wordFrequencyMap = new HashMap<>();
        for (String word:
             wordList) {
            wordFrequencyMap.put(word,wordFrequencyMap
                    .getOrDefault(word,0)+1);
        }
        List<String> dublicatWords = new ArrayList<>();
        for (Map.Entry<String,Integer> entry:
             wordFrequencyMap.entrySet()) {
            if (entry.getValue()>1){
                dublicatWords.add(entry.getKey());
            }
        }
        System.out.println("Задвоєні слова через використання Steams : " + dublicatWords);
    }
}
