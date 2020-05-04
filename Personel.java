public class Personel{
    private String name;
    private int age;
    private int id;
    private double wage;
    private int hours;
    private int days;
    private int tasks = 0;
    private int completed_Tasks = 0;

    public Personel(){
        name = "George Lama";
        age = 30;
        id = 1001;
        wage = 15.0;
        hours = 7;
        days = 5;
        tasks = 0;
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
        printing = name + " is " + age + ", " + id + " is the corresponding id number." + " They make " + wage + " $ an hour" + " for " + hours + " hours and " + days + " days.";
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
    public int getCompTasks(){
        return completed_Tasks;
    }

    //The only ability of employee, completing a task
    public void setTasks(int to_do){
        tasks = tasks + to_do;
    }
    
    public void completeTask(int tcomplete){
        tasks = tasks - tcomplete;
        completed_Tasks = completed_Tasks + tcomplete;
    }
    public void setCompTasks(int compTasks){
        completed_Tasks = completed_Tasks + compTasks;
    }

    //Salary method , new method
    public double getSalary(){
        double total_yearly = wage * hours * days * 52;
        return total_yearly;
    }

}
