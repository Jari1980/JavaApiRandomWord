package com.Jari.API_RandomWord;

public class Word {
    String Word ="";
    int counter = 0;

    public String getWord() {
        return Word;
    }

    public void setWord(String word) {
        Word = word;
    }

    public Word(){

    }
    public Word(String word) {
        Word = word;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void AddCounter() {
        this.counter++;
    }
}
