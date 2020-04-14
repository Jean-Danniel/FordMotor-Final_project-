import java.util.*;
import java.util.Random;

public class Simulation{
    public static void main(String[] args){
        Personel employee1 = new Personel("Neil DeGrasse",62,101,23.0,6,5);
        Personel employee2 = new Personel("Veronica Wright",43,102,20.0,7,5);
        Personel employee3 = new Personel("Jamal Daquivuos",32,103,18.0,7,5);
        Personel employee4 = new Personel("Bobe Ndimbe",50,104,21.5,6,5);
        Personel employee5 = new Personel("Julio Bonitez",27,105,17.25,8,5);
        Personel employee6 = new Personel("Ruth Klin",29,106,19.75,8,5);
        Personel employee7 = new Personel("Maria Vasqez",41,107,22.0,7,5);
        Personel employee8 = new Personel("Phillip LeBlanc",45,108,19.0,7,5);
        Personel employee9 = new Personel("Frank CatFish",36,109,16.5,7,5);
        Personel employee10 = new Personel("Luisa Ywuvs",22,110,15.0,8,5);

        Personel option1 = new Personel();
        Personel option2 = new Personel();
        Personel option3 = new Personel();
        Personel option4 = new Personel();
        Personel option5 = new Personel();

        Manager mngr1 = new Manager("Elizabeth Meyers",64,201,30.45,6,5);
        Manager mngr2 = new Manager("Carlos Volvoteres",60,202,30.25,6,5);

        //Everything "methods" for personnel works
        employee1.setTasks(5);
        System.out.println(employee1.getTasks());
        employee1.completeTask(2);
        System.out.println(employee1.getTasks());
        System.out.println(employee1.getCompTasks()); //Num of completed tasks
        employee1.completeTask(2);
        System.out.println(employee1.getTasks());



        // Personel[] g2 = {employee2,employee4,employee6,employee8,employee10,mngr2};

        ArrayList<Personel> g1 = new ArrayList<Personel>();
        g1.add(employee1);
        g1.add(employee3);
        g1.add(employee5);
        g1.add(employee7);
        g1.add(employee9);
        g1.add(mngr1);
        //To generate random amount of tasks to employees
        int to_do = (int)(Math.random() * 5) + 1;
        
        //Testing out the isTasksComplete method
        // for(int i = 0; i < g1.length - 1; i++){
        //     boolean answer = mngr1.isTasksComplete(g1[i]);
        //     if( answer == true){
        //         System.out.println(g1[i].getName() + " completed their tasks");
        //     }
        //     else{
        //         System.out.println(g1[i].getName() + " didn't complete their tasks"); 
        //     }
        // }

        g1 = mngr1.firing(g1,employee1);
        
    }
}
