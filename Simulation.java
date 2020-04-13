import java.util.*;
public class Simulation{
    public static void main(String[] args){
        Personel employee1 = new Personel();
        
        //System.out.println(employee1.toString());
        //Set method tests
        employee1.setWage(2.0);
        System.out.println(employee1.getWage()); // It worked, yields 17

        employee1.setTasks(6);
        System.out.println(employee1.getTasks()); //It worked, yields 6

        //Creating a collection representing moods of a person
        Map<Integer, String> moods = new HashMap<Integer, String>();
        moods.put(0,"Sad");
        moods.put(1,"Angry");
        moods.put(2,"Anxious");
        moods.put(3,"Fearful");
        moods.put(4,"Neutral");
        moods.put(5,"Happy");
        moods.put(6,"Excitted");

        //Testing out the Map collection
        System.out.println(moods.get(4));
        

    }
}
