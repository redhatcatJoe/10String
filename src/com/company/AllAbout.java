package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllAbout {

    public String longestString = "";
    public String shortestString;
    public int longestStringIndex;
    public int shorterStringIndex;

  public   List<String> listOfString = new ArrayList ();
  Scanner inputReader = new Scanner (System.in);
   public void readInput(){
       for (int i = 0; i <5 ; i++) {
           listOfString.add (inputReader.nextLine ());
       }
   }

   public void findShortestAndLongest(){
       for (int i = 0; i <listOfString.size () ; i++) {                     //ищем самую длинную строку
           if (listOfString.get (i).length ()>longestString.length ()) {
               longestString = listOfString.get (i);
               longestStringIndex=i;

           }
       }

       System.out.println ("--LONGEST--" + longestString+ "--index--"+ longestStringIndex );

         shortestString = listOfString.get (0);                            //ищем самую короткую строку
       for (int i = 0; i <listOfString.size () ; i++) {
           if (listOfString.get (i).length ()< shortestString.length ()){
               shortestString= listOfString.get (i);
               shorterStringIndex=i;
           }

       }
       System.out.println ("--SHortest--" + shortestString+ "--index--"+ shorterStringIndex );

       if (longestStringIndex>shorterStringIndex){                             //находим какая строка встречается раньше
           System.out.println (listOfString.get (shorterStringIndex) );
       }
       else {
           System.out.println (listOfString.get (longestStringIndex) );
       }

   }






}
