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

    @PostMapping("/word/add")
    public void addWord(@RequestBody Word word){
        wordList.add(word);
    }

    @GetMapping("/word")
    public Word getWord(){
        int listL = wordList.size();
        Random rand = new Random();
        int randomIndex = rand.nextInt(0, listL);
        Word word = wordList.get(randomIndex);

        return word;
    }

}
