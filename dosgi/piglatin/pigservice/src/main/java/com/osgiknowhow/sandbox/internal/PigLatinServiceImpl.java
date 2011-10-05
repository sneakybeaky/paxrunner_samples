package com.osgiknowhow.sandbox.internal;

import com.osgiknowhow.sandbox.PigLatinService;

public class PigLatinServiceImpl implements PigLatinService {
    private final String VOWELS = "AEIOUaeiou";
    
    public String translate(String text) {
        String[] words = text.split("\\s");
        String result = "";
        
        for(String word : words) {
            result += translateWord(word) + " ";
        }
        
        return result.trim();
    }
    
    private String translateWord(String word) {
        StringBuffer result = new StringBuffer();
        String start = "";
        for(int i=0; i<word.length(); i++) {
            char c = word.charAt(i);
            if(VOWELS.indexOf(c) >= 0) {
                start = word.substring(i);
                break;
            }
            result.append(c);
        }
        
        return start + "-" + result + "AY";
    }
}
