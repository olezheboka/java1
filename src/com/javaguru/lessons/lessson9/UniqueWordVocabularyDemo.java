package com.javaguru.lessons.lessson9;

public class UniqueWordVocabularyDemo {

    public static void main(String[] args) {
        UniqueWordVocabulary vocabulary = new UniqueWordVocabulary();

        vocabulary.addWord("test");
        vocabulary.addWord("test2");
        vocabulary.addWord("");
        vocabulary.addWord("test");
        vocabulary.getWordsCount();
        vocabulary.printVocabulary();
    }
}
