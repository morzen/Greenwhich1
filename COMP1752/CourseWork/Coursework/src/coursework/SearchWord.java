package coursework;

import java.util.Scanner;
import java.util.*;



class SearchWord extends Arraylists{



    public void Search(){

        Scanner user_input = new Scanner( System.in );
        String Word;
        Word = user_input.next( );

        Set<String> set = new HashSet<String>(words);

        if (set.contains(Word))
        {
            System.out.println("String found!");

        }
        else{
            System.out.println("String Not found!");
        }
    }
}
