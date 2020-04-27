import java.util.*;
import java.util.Random;
import java.io.*;

public class FinalProjectCOS{
    public static void main(String[] args) throws FileNotFoundException {
        File intro = new File("C:\\Users\\Jean-DanielRaymondLi\\Desktop\\Computer Science Java\\Intro.txt");
        Scanner scnr = new Scanner(intro);

        while(scnr.hasNextLine()){
            System.out.println(scnr.nextLine());
        }

    }
}