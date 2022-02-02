package gogoliiii.com;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import gogoliiii.com.Vertex.*;
import gogoliiii.com.Edge.*;

public class Extractor {
    static  ArrayList<Vertex.People> ListOfPeople =new ArrayList();
    static  ArrayList<Homes> ListOfHomes =new ArrayList();
    static  ArrayList<Cars> ListOfCars =new ArrayList();
    static  ArrayList<Account> ListOfAccounts =new ArrayList();
    static  ArrayList<Phones> ListOfPhones =new ArrayList();
    static  ArrayList<Transactions> ListOfTrans =new ArrayList();
    static  ArrayList<Relationships> ListOfRels=new ArrayList();
    static  ArrayList<Ownerships> ListOfOwns =new ArrayList();
    static  ArrayList<Calls> ListOfCalls =new ArrayList();
    public static void CallsEx(File f){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(f+"//calls.csv"));
            String lin = reader.readLine();
            while (reader.ready()){
                String line = reader.readLine();
                String[]s = line.split(",");
                for(int i=0 ; i<s.length ; i++)
                    s[i] = s[i].replaceAll("^\"+|\"+$", "");
                Calls call =new Calls(s[0],s[1],s[2],s[3],s[4]);
                ListOfCalls.add(call);
            }
            reader.close();
        }
        catch (IOException e){
            System.out.print("Error");
        }
    }
    public static void OwnershipsEx(File f){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(f+"//ownerships.csv"));
            String lin = reader.readLine();
            while (reader.ready()){
                String line = reader.readLine();
                String[]s = line.split(",");
                for(int i=0 ; i<s.length ; i++)
                    s[i] = s[i].replaceAll("^\"+|\"+$", "");
                Ownerships own =new Ownerships(s[0],s[1],s[2],s[3],s[4]);
                ListOfOwns.add(own);
            }
            reader.close();
        }
        catch (IOException e){
            System.out.print("Error");
        }
    }
    public static void RelationshipsEx(File f){
        try{

            BufferedReader reader = new BufferedReader(new FileReader(f+"//relationships.csv"));
            String lin = reader.readLine();
            while (reader.ready()){
                String line = reader.readLine();
                String[]s = line.split(",");
                for(int i=0 ; i<s.length ; i++)
                    s[i] = s[i].replaceAll("^\"+|\"+$", "");
                Relationships rel =new Relationships(s[0],s[1],s[2],s[3]);
                ListOfRels.add(rel);
            }
            reader.close();
        }
        catch (IOException e){
            System.out.print("Error");
        }
    }
    public static void TransactionsEx(File f){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(f+"//transactions.csv"));
            String lin = reader.readLine();
            while (reader.ready()){
                String line = reader.readLine();
                String[]s = line.split(",");
                for(int i=0 ; i<s.length ; i++)
                    s[i] = s[i].replaceAll("^\"+|\"+$", "");
                Transactions tran =new Transactions(s[0],s[1],s[2],s[3],s[4]);
                ListOfTrans.add(tran);
            }
            reader.close();
        }
        catch (IOException e){
            System.out.print("Error");
        }
    }
    public static void PhonesEx(File f){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(f+"//phones.csv"));
            String lin = reader.readLine();
            while (reader.ready()) {
                String line = reader.readLine();
                String[]s = line.split(",");
                for(int i=0 ; i<s.length ; i++)
                    s[i] = s[i].replaceAll("^\"+|\"+$", "");
                Phones phone=new Phones(s[0],s[1],s[2]);
                ListOfPhones.add(phone);


            }

            reader.close();
        }
        catch (IOException e) {
            System.out.print("Error");
        }
    }
    public static void AccountEx(File f){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(f+"//accounts.csv"));
            String lin = reader.readLine();
            while (reader.ready()) {
                String line = reader.readLine();
                String[]s = line.split(",");
                for(int i=0 ; i<s.length ; i++)
                    s[i] = s[i].replaceAll("^\"+|\"+$", "");
                Account account=new Account(s[0],s[1],s[2] , s[3]);
                ListOfAccounts.add(account);
            }

            reader.close();
        }
        catch (IOException e) {
            System.out.print("Error");
        }
    }
    public static void CarsEx(File f){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(f+"//cars.csv"));
            String lin = reader.readLine();
            while (reader.ready()) {
                String line = reader.readLine();
                String[]s = line.split(",");

                for(int i=0 ; i<s.length ; i++)
                    s[i] = s[i].replaceAll("^\"+|\"+$", "");
                Cars car=new Cars(s[0],s[1],s[2],s[3]);
                ListOfCars.add(car);


            }

            reader.close();
        }
        catch (IOException e) {
            System.out.print("Error");
        }
    }
    public static void HomeEx(File f){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(f+"//homes.csv"));
            String lin = reader.readLine();
            while (reader.ready()) {
                String line = reader.readLine();
                String[]s = line.split(",");
                for(int i=0 ; i<s.length ; i++)
                    s[i] = s[i].replaceAll("^\"+|\"+$", "");
                Homes home =new Homes(s[0],s[1],s[2],s[3],s[4]);
                ListOfHomes.add(home);

            }

            reader.close();
        }
        catch (IOException e) {
            System.out.print("Error");
        }
    }
    public static void PeopleEx(File f){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(f+"//people.csv"));
            String lin = reader.readLine();
            while (reader.ready()) {
                String line = reader.readLine();
                String[]s = line.split(",");
                for(int i=0 ; i<s.length ; i++)
                    s[i] = s[i].replaceAll("^\"+|\"+$", "");
                People people=new People(s[0],s[1],s[2],s[3],s[4],s[5]);
                ListOfPeople.add(people);
            }

            reader.close();
        }
        catch (IOException e) {
            System.out.print("Error");
        }
    }
}
