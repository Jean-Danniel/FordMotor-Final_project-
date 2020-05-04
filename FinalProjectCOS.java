import java.util.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class FinalProjectCOS{
        
    
    public static void main(String[] args) throws FileNotFoundException {
        File intro = new File("C:\\Users\\Jean-DanielRaymondLi\\Desktop\\Computer Science Java\\Intro.txt");
        File actions = new File("C:\\Users\\Jean-DanielRaymondLi\\Desktop\\Computer Science Java\\Actions.txt");
        Scanner actionscnr = new Scanner(actions);
        Scanner scnr = new Scanner(intro);
        Scanner input = new Scanner(System.in);

        while(scnr.hasNextLine()){
            System.out.println(scnr.nextLine());
        }

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
        Personel option2 = new Personel("DeVanny Tan",23,112,12.50,3,7);
        Personel option3 = new Personel("Yamila Shukran",34,113,22.50,6,5);
        Personel option4 = new Personel("Johnson Johnson",59,114,23.0,6,5);
        Personel option5 = new Personel("Stephanie Newton",36,115,20.0,6,5);

        Manager mngr1 = new Manager("Mngr.Elizabeth Meyers",64,201,30.45,6,5);
        Manager mngr2 = new Manager("Mngr.Carlos Volvoteres",60,202,30.25,6,5);

        ArrayList<Personel> g1 = new ArrayList<Personel>();
        g1.add(mngr1);
        g1.add(employee1);
        g1.add(employee3);
        g1.add(employee5);
        g1.add(employee7);
        g1.add(employee9);

        ArrayList<Personel> g2 = new ArrayList<Personel>();
        g2.add(mngr2);
        g2.add(employee2);
        g2.add(employee4);
        g2.add(employee6);
        g2.add(employee8);
        g2.add(employee10);

        ArrayList<Personel> options = new ArrayList<Personel>();
        options.add(option1);
        options.add(option2);
        options.add(option3);
        options.add(option4);
        options.add(option5);

        System.out.println("Input your name: ");
        String name;
        name = input.nextLine();
        System.out.println("Input your age: ");
        int age;
        age = input.nextInt();
        System.out.println("Input a 3 digit number that begins with 3: ");
        int id;
        id = input.nextInt();
        System.out.println("Input a  number between (35-40): ");
        double wage;
        wage = input.nextDouble();
        System.out.println("Input a number between (5-8): ");
        int hours;
        hours = input.nextInt();
        System.out.println("Input a number between (3-5): ");
        int days;
        days = input.nextInt();
        Supervisor supervisor = new Supervisor(name,age,id,wage,hours,days);

        supervisor.setSales(500000);

        //This is for the initial display of employees not necessary right now
        // try{
        // FileWriter preData = new FileWriter("Statistics.txt");
        // preData.write("Here is a clear description of each team and their members: ");
        // preData.write("G1: ");
        //     for(int i = 0; i < g1.size(); i++){
        //     preData.write(g1.get(i).getName + " is" + g1.get(i).getAge());
        //     }
        // }
        
        TreeMap<Integer,String> activity = new TreeMap<Integer,String>();
        activity.put(1,"Buy");
        activity.put(2,"Sell");
        activity.put(3,"Hire");
        activity.put(4,"Fire");
        activity.put(5,"TasktoGoods");
        activity.put(6,"isTaskComplete");   //Not really necessary
        
        
        System.out.println("You have a total of 500000$ as a starting funds");
        //TimeUnit.SECONDS.sleep(1);
        System.out.println("You have no raw goods/materials to complete tasks\n");
        System.out.println("Here is a list of actions you can take: \n");   //Exiting to files
        while(actionscnr.hasNextLine()){
            System.out.println(actionscnr.nextLine());  //Show as a file/GUI
        }
        
        int status = 1;     //Numbers of run of the code, 3 times
        int daily = 1;        //Number of actions in one day, probably 3 
        int activities;
        supervisor.setFin_goods(2);  //Testing..Testing..Testing
        g1.get(1).setCompTasks(24);
        while(status > 0){
            while(daily > 0){
                System.out.println("Input the action you desire to execute: ");
                activities = input.nextInt();
                if(activity.containsKey(activities)){
                    System.out.println("You have chosen the action to" + activity.get(activities)); //works
                }
                else{
                    System.out.println("This number doesn't belong in the list, please try again"); //works

                }
                //Here starts the many if statements
                if(activities == 1){
                    //Print the company sales
                    //Print number of raw materials 
                    supervisor.buying(); //Figure out what do when unable to do a purchase
                }
                if(activities == 2){
                    System.out.println("You have " + supervisor.getFin_goods() + " finished goods");
                    supervisor.selling();
                }
                if(activities == 3){
                    supervisor.hiring(options, g1, g2); //Method to be modified...Method modified + Completed
                }
                if(activities == 4){
                    supervisor.firing(g1, g2); //Method to be modified...Method modified + Completed
                }
                if(activities == 5){
                    supervisor.taskToGoods(g1);  //Method to be modified...wording could be better
                    supervisor.taskToGoods(g2);  //Method to be modified...wording could be better
                    
                }
                if(activities == 6){
                    for(int i = 1; i < g1.size(); i++){
                        supervisor.isTasksComplete(g1.get(i)); //Method to be modified
                    }
                    for(int j = 1; j < g2.size(); j++){
                        supervisor.isTasksComplete(g2.get(j));
                    }
                }
                //the randomization processes of employees
                daily--;
            }
            status--;
        }
       
    }
}
