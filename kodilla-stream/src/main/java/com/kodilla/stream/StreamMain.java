package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.decorate("example text", (textToBeautify -> "ABC " + textToBeautify + " ABC"));
        poemBeautifier.decorate("we want to be upper", (textToBeautify -> textToBeautify.toUpperCase()));
        poemBeautifier.decorate("NOW WE WOULD LIKE TO BE lower", (textToBeautify -> textToBeautify.toLowerCase()));
        poemBeautifier.decorate("And Now maybe MIX", ((textToBeautify) ->
            {
                char[] charTextToBeautify = textToBeautify.toCharArray();
                String str = "";
                for(int i=0;i<charTextToBeautify.length;i++) {
                    if(i%2==0)
                        charTextToBeautify[i] = Character.toUpperCase(charTextToBeautify[i]);
                    else
                        charTextToBeautify[i] = Character.toLowerCase(charTextToBeautify[i]);
                    str+=charTextToBeautify[i];
                }
                return str;
            }
            )
        );
    }
}
