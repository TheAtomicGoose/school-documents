import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
import java.lang.Math;

import java.util.*;

class t2_lesson04_template{
     
     
     public static void main (String str[]) throws IOException {
          
        Book b = new Book ("James and the Giant Peach", "Roald Dahl", 1961);
        
        System.out.println(b);

        Book b2 = new Book();
        System.out.println(b2);

        Book b3 = new Book("Matilda");
        System.out.println(b3);
     }
}
