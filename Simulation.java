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

        Personel option1 = new Personel("Kevin Francis",44,111,17.35,5,5);
        Personel option2 = new Personel("DeVanny Tan",23,112,12.45,3,7);
        Personel option3 = new Personel("Yamila Shukran",34,113,22.50,6,5);
        Personel option4 = new Personel("Johnson Johnson",59,114,23.0,6,5);
        Personel option5 = new Personel("Stephanie Newton",36,115,20.0,6,5);

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

        ArrayList<Personel> possible_person = new ArrayList<Personel>();
        possible_person.add(option1);
        possible_person.add(option2);
        possible_person.add(option3);
        possible_person.add(option4);
        possible_person.add(option5);

        //LISTS of employees in groups
        ArrayList<Personel>g2 = new ArrayList<Personel>();
        g2.add(mngr2);
        g2.add(employee2);
        g2.add(employee4);
        g2.add(employee6);
        g2.add(employee8);
        g2.add(employee10);
        

        ArrayList<Personel> g1 = new ArrayList<Personel>();
        g1.add(mngr1);
        g1.add(employee1);
        g1.add(employee3);
        g1.add(employee5);
        g1.add(employee7);
        g1.add(employee9);
        
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
        

        mngr1.firing(g1,employee1);  //This method works
        mngr1.displayTeam(g1);  //This method works it displays the team
        mngr1.hiring(g1, possible_person,option5);
        mngr1.displayTeam(g1); //This method works
        
        System.out.println("\n");
        Supervisor supervisor = new Supervisor("Johnny Deep",56,301,69.0,3,3);
        System.out.println(supervisor.getDays()); //Most of the basic method for age,name, etc work

        //Supervisor class methods
        System.out.println(supervisor.getRaw_goods());

        supervisor.setSales(2000);
        //System.out.println(supervisor.getSales());
        supervisor.setFin_goods(5000);
        supervisor.sell(4999);   //sell method works properly
        //System.out.println(supervisor.getFin_goods());  Just making sure

        supervisor.setRaw(100);
        supervisor.buying(25); //buying method works
        //System.out.println(supervisor.getRaw_goods()); works yields 125 as expected

        //Examples 
        employee2.setTasks(10);
        employee2.completeTask(8);

        supervisor.taskToGoods(employee2);  //Method works
        System.out.println(employee2.getCompTasks());

        
    }
}
