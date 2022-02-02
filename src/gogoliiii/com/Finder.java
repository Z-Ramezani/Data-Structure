package gogoliiii.com;

import gogoliiii.com.Edge.*;
import gogoliiii.com.Vertex.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

import static java.time.LocalDate.*;


public class Finder {
    static ArrayList<People> ListGomroki = new ArrayList();
    static HashSet<Phones> ListOfSpy = new HashSet();
    static HashSet<People> ListOfMaznoon = new HashSet();
    static ArrayList<People> ListOfMafia = new ArrayList();
    static ArrayList<Phones> PhonesOfMafia = new ArrayList();
    static ArrayList<Phones> PhonesOfMaznoon = new ArrayList();
    static ArrayList<People> ListSpy = new ArrayList();
    static ArrayList<Account> Mafia_accounts= new ArrayList();
    static ArrayList<Transactions> Mafia_account = new ArrayList();
    static ArrayList<Account> Maznoon_account = new ArrayList();
    static HashSet<People> ListOfMoney = new HashSet();


    static Extractor e = new Extractor();

    void Gomroki_Finder(){
        for( People p : e.ListOfPeople){
            if(p.work.matches("گمرک") || p.work.matches("سازمان بنادر")){
                ListGomroki.add(p);
            }
        }
    }
    public static void Maznoon_Finder(){
        for( People p : ListGomroki){
            for(Relationships r: e.ListOfRels){
                if(r.from.matches(p.SSN)){
                    for(Ownerships o: e.ListOfOwns){
                        if(r.to.matches(o.from) || p.SSN.matches(o.from) ){
                            if(check_time(o.date)){
                                ListOfMaznoon.add(p);
                            }
                        }
                    }
                }
            }
        }
    }

    void Mafia_Finder(){
        for( People p : e.ListOfPeople){
            if(p.work.matches("قاچاقچی")){
                ListOfMafia.add(p);
            }
        }
    }
    public static void Proofcall_Finder(){
        for(People m: ListOfMafia)
            for(Phones ph1: e.ListOfPhones)
                if(m.SSN.matches(ph1.SSN))
                    PhonesOfMafia.add(ph1);
        for(People n: ListOfMaznoon)
            for(Phones ph2: e.ListOfPhones)
                if(n.SSN.matches(ph2.SSN))
                    PhonesOfMaznoon.add(ph2);
        for(Phones maf: PhonesOfMafia)
            for(Phones maz: PhonesOfMaznoon)
                for(Calls c: e.ListOfCalls)
                    if((c.from.matches(maz.number) && c.to.matches(maf.number))
                            ||  (c.from.matches(maf.number) && c.to.matches(maz.number)))
                        ListOfSpy.add(maz);

        for(Phones maz: ListOfSpy)
            for(People m: ListOfMaznoon)
                if(maz.SSN.matches(m.SSN))
                    ListSpy.add(m);

    }
    public static void Proofmoney_Finder(){
        for (People m: ListOfMafia)
            for (Account t: e.ListOfAccounts)
                if (m.SSN.matches(t.SSN))
                    Mafia_accounts.add(t);
        for (Account n: Mafia_accounts)
            for (Transactions t: e.ListOfTrans)
                if (n.account_id.matches(t.from))
                    Mafia_account.add(t);
        for (People m: ListOfMaznoon)
            for (Account t: e.ListOfAccounts)
                if (m.SSN.matches(t.SSN))
                    Maznoon_account.add(t);

        for ( Transactions t: Mafia_account)
            for (Account m: Maznoon_account) {
                    int count=0;
                    String to=t.to,  from=null;
                    while (count<7){
                        if (! to.matches(m.account_id)) {
                            from = t.to;
                            for (Transactions k : e.ListOfTrans){
                                LocalDate d=parse(t.date);
                                LocalDate d2=parse(k.date);
                                if (k.from.matches(from) && d2.isAfter(d))
                                    to = k.to;
                        }
                                count++;

                        }
                        else {
                                    for (People p: ListOfMaznoon)
                                        if (p.SSN.matches(m.SSN))
                                            ListOfMoney.add(p);
                            break;
                        }
                    }
                }
            }

    static Boolean check_time(String d){
        LocalDate now = now();
        LocalDate date = parse(d);
        return date.isAfter(now.plusYears(-2));
    }

}
