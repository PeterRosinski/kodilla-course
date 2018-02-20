package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Sex;

import java.util.stream.Collectors;
import java.util.Map;

import java.time.Period;
import java.time.LocalDate;


public class StreamMain {
    public static void main(String[] args) {

        //Modul 7.1
        System.out.println("-------------------\nModuł 7.1!\n-------------------");
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

        //Modul 7.3
        System.out.println("-------------------\nModuł 7.3!\n-------------------");
        Forum forum = new Forum();

        Map<Integer,ForumUser> theResultMapOfForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == Sex.M)
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(),LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getNumberOfPublishedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId,forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
