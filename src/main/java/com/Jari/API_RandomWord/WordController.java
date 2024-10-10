package com.Jari.API_RandomWord;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@RestController
@CrossOrigin
public class WordController {
    //static ArrayList<String> wordList = new ArrayList<>(Arrays.asList("Katrineholm", "Stockholm", "Växjö"));
    static ArrayList<Word> wordList = new ArrayList<>(Arrays.asList(
            new Word("Katrineholm"),
            new Word("Stockholm"),
            new Word("Växjö")
    ));
    static Word thisWord = new Word();

    @PostMapping("/word/add")
    public void addWord(@RequestBody Word word){
        wordList.add(word);
    }

    @GetMapping("/word")
    public Word getWord(){
        if (thisWord.getWord().equals("")){
            int listL = wordList.size();
            Random rand = new Random();
            int randomIndex = rand.nextInt(0, listL);
            thisWord = wordList.get(randomIndex);
        }

        return thisWord;
    }

    @PostMapping("/counter/add")
    public void counterAdd(){
        thisWord.AddCounter();
    }

    @GetMapping("/counter")
    public int getCounter(){
        return thisWord.getCounter();
    }

}
