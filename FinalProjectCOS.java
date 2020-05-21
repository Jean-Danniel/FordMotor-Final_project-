/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package better_final_project;

/**
 *
 * @author danny
 */
import java.util.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.io.*;

import java.awt.BorderLayout;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.JPanel;

public class FinalProjectCOS extends javax.swing.JFrame{
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    
    private Map<String,Integer> numbers_SALE;
    private Map<String,Integer> numbers_PRODS;
    private Map<String,Integer> numbers_RAW;
    
    
    
    public FinalProjectCOS(Map<String,Integer> elements_SALE, Map<String,Integer> elements_PRODS ,Map<String,Integer> elements_RAW) {
        numbers_SALE = elements_SALE;
        numbers_PRODS = elements_PRODS;
        numbers_RAW = elements_RAW;
        
        initComponents(numbers_SALE,numbers_PRODS,numbers_RAW);
    }
    
    private void initComponents(Map<String,Integer> numbers_SALE, Map<String,Integer> numbers_PRODS,Map<String,Integer> numbers_RAW) {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));
        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            
        });
        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Show Sales/day");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt,numbers_SALE);
            }
        });

        jButton2.setText("Shows products/employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt,numbers_PRODS);
            }
        });

        jButton3.setText("Shows Raw Materials usage");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt,numbers_RAW);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.BorderLayout(40, 50));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold> 
    
    
        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt, Map<String,Integer> numbers_SALES) {                                         
        // TODO add your handling code here:
        DefaultCategoryDataset salesChart = new DefaultCategoryDataset();
        Set< Map.Entry< String,Integer> > at = numbers_SALES.entrySet();
        for(Map.Entry<String,Integer> current:at){
            salesChart.setValue(current.getValue(),"Sales Growth",current.getKey());
        }
        
        
        
        //JFreeChart salesBarData = ChartFactory.createBarChart("Sales growth", "Days", "US Dollars", salesChart, PlotOrientation.VERTICAL, false, true, false);
        JFreeChart salesBarData = ChartFactory.createLineChart("Sales Growth", "Days", "US DOLLARS", salesChart);
        CategoryPlot sales = salesBarData.getCategoryPlot();
        sales.setRangeGridlinePaint(Color.ORANGE);
        sales.setBackgroundPaint(Color.LIGHT_GRAY);
        
        ChartPanel barPanel = new ChartPanel(salesBarData);
        jPanel5.removeAll();
        jPanel5.add(barPanel, BorderLayout.CENTER);
        jPanel5.validate();
                
        
    }
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt,Map<String,Integer> numbers_RAW) {                                         
        // TODO add your handling code here:
        DefaultCategoryDataset RawGoodsUsage = new DefaultCategoryDataset();
//        RawGoodsUsage.setValue(34500,"Raw Goods Usage","Day 1");
//        RawGoodsUsage.setValue(75000,"Raw Goods Usage","Day 2");
//        RawGoodsUsage.setValue(180000,"Raw Goods Usage","Day 3");
        Set< Map.Entry< String,Integer> > st = numbers_RAW.entrySet();
        for(Map.Entry<String,Integer> current:st){
            RawGoodsUsage.setValue(current.getValue(),"Raw materials inventory",current.getKey());
        }



        //JFreeChart Raw_goods_data = ChartFactory.createLineChart3D("Usage of Raw Goods", "Days", "Amount", RawGoodsUsage);
        JFreeChart Raw_goods_data = ChartFactory.createLineChart("Usage of Raw Goods", "Days", "Amount", RawGoodsUsage);
        CategoryPlot salary_plot = Raw_goods_data.getCategoryPlot();
        salary_plot.setRangeGridlinePaint(Color.YELLOW);
        salary_plot.setBackgroundPaint(Color.LIGHT_GRAY);
        
        ChartPanel salaryPanel = new ChartPanel(Raw_goods_data);
        jPanel5.removeAll();
        jPanel5.add(salaryPanel, BorderLayout.CENTER);
        jPanel5.validate();
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt,Map<String,Integer> numbers_PRODS) {                                         
        // TODO add your handling code here:
        
        //This is going to be materials used
        DefaultCategoryDataset productsChart = new DefaultCategoryDataset();
        
        Set< Map.Entry< String,Integer> > dt = numbers_PRODS.entrySet();
        for(Map.Entry<String,Integer> current:dt){
            productsChart.setValue(current.getValue(),"Production Efficiency",current.getKey());
        }
        
//        JFreeChart prodData = ChartFactory.createLineChart("Products Total", "Days", "Finished Products", productsChart);
        JFreeChart prodData = ChartFactory.createBarChart("Products Total", "Employee", "Finished Products", productsChart, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot prod_plot = prodData.getCategoryPlot();
        prod_plot.setRangeGridlinePaint(Color.YELLOW);
        prod_plot.setBackgroundPaint(Color.LIGHT_GRAY);
        
        ChartPanel prodPanel = new ChartPanel(prodData);
        jPanel5.removeAll();
        jPanel5.add(prodPanel, BorderLayout.CENTER);
        jPanel5.validate();
             
        
    }
        
    
    
    
    
    public static void main(String[] args) throws FileNotFoundException {
//        File intro = new File("C:\\Users\\Jean-DanielRaymondLi\\Desktop\\Computer Science Java\\Intro.txt");
//        File actions = new File("C:\\Users\\Jean-DanielRaymondLi\\Desktop\\Computer Science Java\\Actions.txt");
//        Scanner actionscnr = new Scanner(actions);
//        Scanner scnr = new Scanner(intro);
        Scanner input = new Scanner(System.in);
        

//        while(scnr.hasNextLine()){
//            System.out.println(scnr.nextLine());
//        }

        Personel employee1 = new Personel("Neil DeGrasse",62,101,23.0,6,5);
        Personel employee2 = new Personel("Veroni",43,102,20.0,7,5);
        Personel employee3 = new Personel("Jam",32,103,18.0,7,5);
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
        System.out.println("Input a 3 digit number that begins with 4(this will be your id number): ");
        int id;
        id = input.nextInt();
        System.out.println("Input a  number between (35-40) (this will be your hourly wage): ");
        double wage;
        wage = input.nextDouble();
        System.out.println("Input a number between (5-8)(this will be the hours you work in a day): ");
        int hours;
        hours = input.nextInt();
        System.out.println("Input a number between (3-5)(this will be the number of days you work in a week): ");
        int days;
        days = input.nextInt();
        Supervisor supervisor = new Supervisor(name,age,id,wage,hours,days);

        supervisor.setSales(500000);

        
        TreeMap<Integer,String> activity = new TreeMap<Integer,String>();
        activity.put(1,"Buy");
        activity.put(2,"Sell");
        activity.put(3,"Hire");
        activity.put(4,"Fire");
        // activity.put(5,"TasktoGoods");
        //activity.put(6,"isTaskComplete");   //Not really necessary
        
        
        System.out.println("You have a total of 500000$ as a starting funds");
        //TimeUnit.SECONDS.sleep(1);
        System.out.println("You have no raw goods/materials to complete tasks\n");
        System.out.println("Here is a list of actions you can take: \n");   //Exiting to files
//        while(actionscnr.hasNextLine()){
//            System.out.println(actionscnr.nextLine());  //Show as a file/GUI
//        }
        
        int status = 5;     //Numbers of run of the code, 3 times
        int daily = 3;        //Number of actions in one day, probably 3 
        int activities;
        //int initial_days = status;
        
        //For raw goods data points
        int raw_that_day;
        String raw_good_day;
        Map<String,Integer> RAW = new HashMap<String,Integer>();
        
        //For sales data representation
        int sales_that_day;
        Map<String,Integer> SALES = new HashMap<String,Integer>();
        
        //For Productivity data representation
        Map<String,Integer> PRODS = new HashMap<String,Integer>();
        
        
        
        while(status > 0){
            System.out.println("New DAy...");
            daily = 3;
            while(daily > 0){
                Random rand = new Random();

                System.out.println("Input the action you desire to execute: ");
                activities = input.nextInt();
                if(activity.containsKey(activities)){
                    System.out.println("You have chosen the action to" + activity.get(activities)); //works
                }
                else{
                    System.out.println("This number doesn't belong in the list, please try again later"); //works

                }
                //Here starts the many if statements
                if(activities == 1){
                    //Print the company sales
                    //Print number of raw materials 
                    supervisor.buying(); //Figure out what do when unable to do a purchase
                }
                if(activities == 2){
                    supervisor.selling();
                }
                if(activities == 3){
                    supervisor.hiring(options, g1, g2); //Method to be modified...Method modified + Completed
                }
                if(activities == 4){
                    supervisor.firing(g1, g2); //Method to be modified...Method modified + Completed
                }
                
                // if(activities == 5){
                //     supervisor.taskToGoods(g1);  //Method to be modified...wording could be better
                //     supervisor.taskToGoods(g2);  //Method to be modified...wording could be better    
                // }
                // if(activities == 6){
                //     for(int i = 1; i < g1.size(); i++){
                //         supervisor.isTasksComplete(g1.get(i)); //Method to be modified
                //     }
                //     for(int j = 1; j < g2.size(); j++){
                //         supervisor.isTasksComplete(g2.get(j));
                //     }
                // }
                //the randomization processes of employees
                for(int i = 1; i < g1.size();  i++){
                    int to_do = rand.nextInt(16); 
                    g1.get(i).completeTask(to_do);  //for group 1
                    g1.get(i).setCompTasks(to_do);  

                }
                //supervisor.taskToGoods(g1);  //Method to be modified...wording could be better
                
                for(int i = 1; i < g2.size(); i++){
                    int to_do = rand.nextInt(16); 
                    g2.get(i).completeTask(to_do); //for group 2
                    g2.get(i).setCompTasks(to_do);
                }
                if(supervisor.getRaw_goods() > 60){
                    supervisor.taskToGoods(g1);  //Method to be modified...wording could be better
                    supervisor.taskToGoods(g2);  //Method to be modified...wording could be better
                    
                }else{
                    System.out.println();
                    System.out.println("Your supplies are running low...");
                    System.out.println("You might want to buy more raw goods!");
                }
//                supervisor.taskToGoods(g1);  //Method to be modified...wording could be better
//                supervisor.taskToGoods(g2);  //Method to be modified...wording could be better    
                
                daily--;
            }
//            System.out.println("Before day over subtract " + supervisor.getRaw_goods());
            supervisor.setRaw(-20);
            if(status == 2){
                raw_good_day = "Day 4";
                raw_that_day = supervisor.getRaw_goods();
                sales_that_day = supervisor.getSales();
                SALES.put(raw_good_day,sales_that_day);
                RAW.put(raw_good_day,raw_that_day);
            }
            if(status == 1){
                raw_good_day = "Day 5";
                raw_that_day = supervisor.getRaw_goods();
                sales_that_day = supervisor.getSales();
                SALES.put(raw_good_day,sales_that_day);
                RAW.put(raw_good_day,raw_that_day);
            }
//            if(status == 8){
//                raw_good_day = "Day 6";
//                raw_that_day = supervisor.getRaw_goods();
//                sales_that_day = supervisor.getSales();
//                SALES.put(raw_good_day,sales_that_day);
//                RAW.put(raw_good_day,raw_that_day);
//            }
//            if(status == 7){
//                raw_good_day = "Day 7";
//                raw_that_day = supervisor.getRaw_goods();
//                sales_that_day = supervisor.getSales();
//                SALES.put(raw_good_day,sales_that_day);
//                RAW.put(raw_good_day,raw_that_day);
//            }
//            if(status == 6){
//                raw_good_day = "Day 8";
//                raw_that_day = supervisor.getRaw_goods();
//                sales_that_day = supervisor.getSales();
//                SALES.put(raw_good_day,sales_that_day);
//                RAW.put(raw_good_day,raw_that_day);
//            }
//            if(status == 5){
//                raw_good_day = "Day 9";
//                raw_that_day = supervisor.getRaw_goods();
//                sales_that_day = supervisor.getSales();
//                SALES.put(raw_good_day,sales_that_day);
//                RAW.put(raw_good_day,raw_that_day);
//            }
//            if(status == 4){
//                raw_good_day = "Day 10";
//                raw_that_day = supervisor.getRaw_goods();
//                sales_that_day = supervisor.getSales();
//                SALES.put(raw_good_day,sales_that_day);
//                RAW.put(raw_good_day,raw_that_day);
//            }
            
            if(status == 5){
                raw_good_day = "Day 1";
                raw_that_day = supervisor.getRaw_goods();
                sales_that_day = supervisor.getSales();
                
                SALES.put(raw_good_day,sales_that_day);
                RAW.put(raw_good_day,raw_that_day);
            }
            if(status == 4){
                raw_good_day = "Day 2";
                raw_that_day = supervisor.getRaw_goods();
                sales_that_day = supervisor.getSales();
                
                SALES.put(raw_good_day,sales_that_day);
               
                RAW.put(raw_good_day,raw_that_day);
            }
            if(status == 3){
                raw_good_day = "Day 3";
                raw_that_day = supervisor.getRaw_goods();
                sales_that_day = supervisor.getSales();
             
                SALES.put(raw_good_day,sales_that_day);
                
                RAW.put(raw_good_day,raw_that_day);
            }
                
//            System.out.println("After day over subtract " + supervisor.getRaw_goods());
            System.out.println("DAy over...");
            status--;
        }
        // for(int i = 1; i < g1.size(); i++){
        //     System.out.println(g1.get(i).getTasks()); //it does work it is random
        // }
        //System.out.println(supervisor.getRaw_goods());
        
        
        for(int i = 1; i < g1.size(); i++){
            PRODS.put(g1.get(i).getName(),g1.get(i).getCompTasks());
        }
        for(int j = 1; j < g2.size(); j++){
            PRODS.put(g2.get(j).getName(), g2.get(j).getCompTasks());
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new FinalProjectCOS(SALES,PRODS,RAW).setVisible(true);
                }
            });
        
 
    }
    
        
}
