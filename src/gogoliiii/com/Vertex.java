package gogoliiii.com;

import java.util.HashMap;

class Vertex {
    static class People{
        String first_name;
        String last_name;
        String SSN;
        String birthday;
        String city;
        String work;
        People(String first_name , String last_name , String SSN , String birthday , String city , String work){
            this.first_name = first_name;
            this.last_name=last_name;
            this.city=city;
            this.SSN = SSN;
            this.birthday=birthday;
            this.work=work;
        }

    }
    static class Account{
        String bank_name;
        String account_id;
        String SSN;
        String IBAN;
        Account( String SSN , String bank_name , String IBAN, String account_id ){
            this.IBAN = IBAN;
            this.SSN = SSN;
            this.account_id = account_id;
            this.bank_name = bank_name;
        }
    }
    static class Cars{
        String plate;
        String SSN;
        String model;
        String color;
        Cars(String plate , String SSN ,String model, String color ){
            this.SSN = SSN;
            this.color = color;
            this.model = model;
            this.plate = plate;
        }
    }
    static class Homes{
        String SSN;
        String price;
        String postal_code;
        String size;
        String address;
        Homes(String SSN , String price ,  String postal_code ,  String size ,  String address){
            this.SSN = SSN;
            this.address = address;
            this.postal_code = postal_code;
            this.price = price;
            this.size = size;
        }
    }
    static class Phones{
        String SSN;
        String number;
        String operator;
        Phones(String SSN , String number , String operator){
            this.SSN = SSN;
            this.number = number;
            this.operator = operator;
        }
    }
}

