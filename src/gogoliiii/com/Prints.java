package gogoliiii.com;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import gogoliiii.com.Vertex.*;
import gogoliiii.com.Edge.*;

public class Prints {
    static Extractor e = new Extractor();
    static Finder f = new Finder();
    public static void printAccounts(){
        String [] columns = {"SSN" ,"Bank Name" , "IBAN" , "Account ID"};
        int i=0;
        Object [][] s = new Object[e.ListOfAccounts.size()][4];
        for(Account a : e.ListOfAccounts){
            s[i][0] = a.SSN;
            s[i][1] = a.bank_name;
            s[i][2] = a.IBAN;
            s[i][3] = a.account_id;
            i++;
        }
        JTable table = new JTable(s , columns);
        JFrame f = new JFrame();
        f.setTitle("Accounts");
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void printPeople(){
        String [] columns = {"First Name" ,"Last Name" , "SSN" , "Birthday" , "City" , "Work"};
        int i=0;
        Object [][] s = new Object[e.ListOfPeople.size()][6];
        for(People a : e.ListOfPeople){
            s[i][0] = a.first_name;
            s[i][1] = a.last_name;
            s[i][2] = a.SSN;
            s[i][3] = a.birthday;
            s[i][4] = a.city;
            s[i][5] = a.work;
            i++;
        }
        JTable table = new JTable(s , columns);
        JFrame f = new JFrame();
        f.setTitle("People");
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void printHomes(){
        String [] columns = {"SSN" ,"Price" , "Postal Code" , "Size" , "Address"};
        int i=0;
        Object [][] s = new Object[e.ListOfHomes.size()][5];
        for(Homes a : e.ListOfHomes){
            s[i][0] = a.SSN;
            s[i][1] = a.price;
            s[i][2] = a.postal_code;
            s[i][3] = a.size;
            s[i][4] = a.address;
            i++;
        }
        JTable table = new JTable(s , columns);
        JFrame f = new JFrame();
        f.setTitle("Homes");
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void printCars(){
        String [] columns = {"Plate" ,"SSN" , "Model" , "Color"};
        int i=0;
        Object [][] s = new Object[e.ListOfCars.size()][4];
        for(Cars a : e.ListOfCars){
            s[i][0] = a.plate;
            s[i][1] = a.SSN;
            s[i][2] = a.model;
            s[i][3] = a.color;
            i++;
        }
        JTable table = new JTable(s , columns);
        JFrame f = new JFrame();
        f.setTitle("Cars");
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void printPhones(){
        String [] columns = {"SSN" ,"Number" , "Operator"};
        int i=0;
        Object [][] s = new Object[e.ListOfPhones.size()][3];
        for(Phones a : e.ListOfPhones){
            s[i][0] = a.SSN;
            s[i][1] = a.number;
            s[i][2] = a.operator;
            i++;
        }
        JTable table = new JTable(s , columns);
        JFrame f = new JFrame();
        f.setTitle("Phones");
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void printCalls(){
        String [] columns = {"From" ,"To" , "Call ID" ,"Date" ,"Duration"};
        int i=0;
        Object [][] s = new Object[e.ListOfCalls.size()][6];
        for(Calls a : e.ListOfCalls){
            s[i][0] = a.from;
            s[i][1] = a.to;
            s[i][2] = a.call_id;
            s[i][3] = a.date;
            s[i][4] = a.duration;
            i++;
        }
        JTable table = new JTable(s , columns);
        JFrame f = new JFrame();
        f.setTitle("Calls");
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void printOwns(){
        String [] columns = {"From" ,"To" , "Owneship ID" ,"Date" ,"Amount"};
        int i=0;
        Object [][] s = new Object[e.ListOfOwns.size()][6];
        for(Ownerships a : e.ListOfOwns){
            s[i][0] = a.from;
            s[i][1] = a.to;
            s[i][2] = a.ownership_id;
            s[i][3] = a.date;
            s[i][4] = a.amount;
            i++;
        }
        JTable table = new JTable(s , columns);
        JFrame f = new JFrame();
        f.setTitle("Ownerships");
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void printRels(){
        String [] columns = {"From" ,"To" , "Relation" ,"Date"};
        int i=0;
        Object [][] s = new Object[e.ListOfRels.size()][4];
        for(Relationships a : e.ListOfRels){
            s[i][0] = a.from;
            s[i][1] = a.to;
            s[i][2] = a.relation;
            s[i][3] = a.date;
            i++;
        }
        JTable table = new JTable(s , columns);
        JFrame f = new JFrame();
        f.setTitle("Relationships");
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void printTrans(){
        String [] columns = {"From" ,"To" , "Transaction ID" ,"Date" , "Amount"};
        int i=0;
        Object [][] s = new Object[e.ListOfTrans.size()][5];
        for(Transactions a : e.ListOfTrans){
            s[i][0] = a.from;
            s[i][1] = a.to;
            s[i][2] = a.transaction_id;
            s[i][3] = a.date;
            s[i][3] = a.amount;
            i++;
        }
        JTable table = new JTable(s , columns);
        JFrame f = new JFrame();
        f.setTitle("Transactions");
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void printMafia(){
        String [] columns = {"First Name" ,"Last Name" , "SSN" , "Birthday" , "City" , "Work"};
        int i=0;
        Object [][] s = new Object[f.ListOfMafia.size()][6];
        for(People a : f.ListOfMafia){
            s[i][0] = a.first_name;
            s[i][1] = a.last_name;
            s[i][2] = a.SSN;
            s[i][3] = a.birthday;
            s[i][4] = a.city;
            s[i][5] = a.work;
            i++;
        }
        JTable table = new JTable(s , columns);
        JFrame f = new JFrame();
        f.setTitle("Ghachaghchi Ha");
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void printGomroki(){
        String [] columns = {"First Name" ,"Last Name" , "SSN" , "Birthday" , "City" , "Work"};
        int i=0;
        Object [][] s = new Object[f.ListGomroki.size()][6];
        for(People a : f.ListGomroki){
            s[i][0] = a.first_name;
            s[i][1] = a.last_name;
            s[i][2] = a.SSN;
            s[i][3] = a.birthday;
            s[i][4] = a.city;
            s[i][5] = a.work;
            i++;
        }
        JTable table = new JTable(s , columns);
        JFrame f = new JFrame();
        f.setTitle("Ghachaghchi Ha");
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void printSuspects(){
        String [] columns = {"First Name" ,"Last Name" , "SSN" , "Birthday" , "City" , "Work"};
        int i=0;
        Object [][] s = new Object[f.ListOfMaznoon.size()][6];
        for(People a : f.ListOfMaznoon){
            s[i][0] = a.first_name;
            s[i][1] = a.last_name;
            s[i][2] = a.SSN;
            s[i][3] = a.birthday;
            s[i][4] = a.city;
            s[i][5] = a.work;
            i++;
        }
        JTable table = new JTable(s , columns);
        JFrame f = new JFrame();
        f.setTitle("Suspects");
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void printSpies(){
        String [] columns = {"First Name" ,"Last Name" , "SSN" , "Birthday" , "City" , "Work"};
        int i=0;
        Object [][] s = new Object[f.ListSpy.size()][6];
        for(People a : f.ListSpy){
            s[i][0] = a.first_name;
            s[i][1] = a.last_name;
            s[i][2] = a.SSN;
            s[i][3] = a.birthday;
            s[i][4] = a.city;
            s[i][5] = a.work;
            i++;
        }
        JTable table = new JTable(s , columns);
        JFrame f = new JFrame();
        f.setTitle("Final Suspects");
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void print_Money_Suspects(){
        String [] columns = {"First Name" ,"Last Name" , "SSN" , "Birthday" , "City" , "Work"};
        int i=0;
        Object [][] s = new Object[f.ListOfMoney.size()][6];
        for(People a : f.ListOfMoney){
            s[i][0] = a.first_name;
            s[i][1] = a.last_name;
            s[i][2] = a.SSN;
            s[i][3] = a.birthday;
            s[i][4] = a.city;
            s[i][5] = a.work;
            i++;
        }
        JTable table = new JTable(s , columns);
        JFrame f = new JFrame();
        f.setTitle("Money Suspects");
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
}
