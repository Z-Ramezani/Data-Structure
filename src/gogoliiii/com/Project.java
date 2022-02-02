package gogoliiii.com;

import java.io.File;
import java.util.Scanner;
import javax.swing.JFileChooser;


public class Project {
    static Prints p = new Prints();
    public static void main(String[] args)  {
        File a = getDataFolderFromSystem();
        Extractor EX=new Extractor();
        EX.PeopleEx(a);
        EX.CarsEx(a);
        EX.HomeEx(a);
        EX.TransactionsEx(a);
        EX.AccountEx(a);
        EX.RelationshipsEx(a);
        EX.OwnershipsEx(a);
        EX.CallsEx(a);
        EX.PhonesEx(a);
        Finder f = new Finder();
        f.Gomroki_Finder();
        f.Maznoon_Finder();
        f.Mafia_Finder();
        f.Proofcall_Finder();
        f.Proofmoney_Finder();
        showmenue();
    }

    private static File getDataFolderFromSystem(){
        JFileChooser chooser = new JFileChooser();
        chooser.setDragEnabled(true);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int choice = chooser.showOpenDialog(null);
        if (choice != JFileChooser.APPROVE_OPTION) {
            System.out.println("File not selected");
        }
        return chooser.getSelectedFile();
    }
    public static void showmenue() {
        System.out.println("Please choose the phase of the project:");
        System.out.println("1. Phase one");
        System.out.println("2. Phase two");
        System.out.println("3. Phase three");
        System.out.println("4. Phase four");
        System.out.println("5. Exit");
        System.out.println("*******************************************");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if (a.matches("1")) ShowPhaseOne();
        else if (a.matches("2")) ShowPhaseTwo();
        else if (a.matches("3")) ShowPhaseThree();
        else if (a.matches("4")) ShowPhaseFour();
        else if (a.matches("5"))System.exit(0);
        else {
            System.err.println("Invalid Input");
            showmenue();
        }
    }
    public static void ShowPhaseOne() {
        System.out.println("Which table would you like to see?");
        System.out.println("1.Accounts");
        System.out.println("2.People");
        System.out.println("3.Homes");
        System.out.println("4.Cars");
        System.out.println("5.Phones");
        System.out.println("6.Calls");
        System.out.println("7.Ownerships");
        System.out.println("8.Relationships");
        System.out.println("9.Transactions");
        System.out.println("10.Ghachaghchi Ha");
        System.out.println("11. Maznonin Koli");
        System.out.println("12.Return");
        System.out.println("*******************************************");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if(a.matches("1")){p.printAccounts();ShowPhaseOne();}
        else if(a.matches("2")){p.printPeople();ShowPhaseOne();}
        else if(a.matches("3")){p.printHomes();ShowPhaseOne();}
        else if(a.matches("4")){p.printCars();ShowPhaseOne();}
        else if(a.matches("5")){p.printPhones();ShowPhaseOne();}
        else if(a.matches("6")){p.printCalls();ShowPhaseOne();}
        else if(a.matches("7")){p.printOwns();ShowPhaseOne();}
        else if(a.matches("8")){p.printRels();ShowPhaseOne();}
        else if(a.matches("9")){p.printTrans();ShowPhaseOne();}
        else if(a.matches("10")){p.printMafia();ShowPhaseOne();}
        else if(a.matches("11")){p.printGomroki();ShowPhaseOne();}
        else if(a.matches("12")){showmenue();}
        else {
            System.err.println("Invalid Input");
            ShowPhaseOne();
        }
    }

    public static void ShowPhaseTwo() {
        System.out.println("1.List Of Suspects");
        System.out.println("2.Return");
        System.out.println("*******************************************");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if(a.matches("1")){p.printSuspects();ShowPhaseTwo();}
        else if(a.matches("2")){showmenue();}
        else {
            System.err.println("Invalid Input");
            ShowPhaseTwo();
        }
    }
    public static void ShowPhaseThree(){
        System.out.println("1.List Of Money Suspects");
        System.out.println("2.Return");
        System.out.println("*******************************************");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if(a.matches("1")){ p.print_Money_Suspects();ShowPhaseThree(); }
        else if(a.matches("2")){showmenue();}
        else {
            System.err.println("Invalid Input");
            ShowPhaseThree();
        }
    }
    public static void ShowPhaseFour() {
        System.out.println("1.List Of Final Suspects");
        System.out.println("2.Return");
        System.out.println("*******************************************");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if(a.matches("1")){p.printSpies();ShowPhaseTwo();}
        else if(a.matches("2")){showmenue();}
        else {
            System.err.println("Invalid Input");
            ShowPhaseFour();
        }
    }
}
