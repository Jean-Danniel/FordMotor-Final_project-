public class Personel{
    private String name;
    private int age;
    private int id;
    private double wage;
    private int hours;
    private int days;
    private int tasks = 0;
    private int mood = 3; //Might be changed to a map collections && Randomized 
    private int energy = 2; //Randomized at first but later on change according to algorithm


    public Personel(){
        name = "George Lama";
        age = 30;
        id = 1001;
        wage = 15.0;
        hours = 7;
        days = 5;
        tasks = 0;
        mood = 3;
        energy = 2;
    }
    public Personel(String NAME, int AGE, int ID, double WAGE, int HOURS, int DAYS){
        name = NAME;
        age = AGE;
        id = ID;
        wage = WAGE;
        hours = HOURS;
        days = DAYS;
    }

    //Basci toString method
    public String toString(){
        String printing = " ";
        printing = "This is " + name + " he is " + age + " his id number is " + id + " , he makes " + wage + " $ an hour" + " for " + hours + " hours and " + days + " days.";
        return printing; 
    }
    
    
    //Basic Get Methods for private variables
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
    public double getWage(){
        return wage;
    }
    public int getHours(){
        return hours;
    }
    public int getDays(){
        return days;
    }
    public int getTasks(){
        return tasks;
    }

    //Basic set methods for private variables
    public void setWage(double k){
        wage = wage + k;
    }
    public void setTasks(int h){
        tasks = tasks + h;
    }
    public void setMood(int j){
        mood = j;
    }
    public void setEnergy(Map feeling){
        System.out.println(name + " is feeling : " + feeling.get(mood) + " today");
        energy = mood * 10;
    }

    //The only ability of employee, completing a task
    public void completeTask(int tcomplete){
        tasks = tasks - tcomplete;
    }
}
