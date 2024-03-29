package com.javaguru.lessons.lesson9.homework.level1;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {

    Set<String> words = new HashSet<>();


    public void addWord(String word) {
        if (!word.equals("")) {
            words.add(word);
        }
    }

    public int getWordsCount() {
        System.out.println("Number of unique words: " + words.size());
        return words.size();
    }

    public void printVocabulary() {
        System.out.println("Words in vocabulary: " + words);
    }

}
