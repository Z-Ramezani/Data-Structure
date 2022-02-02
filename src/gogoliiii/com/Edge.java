package gogoliiii.com;

class Edge{
    static class Calls {
        String from;
        String to;
        String call_id;
        String date;
        String duration;
        Calls(String from ,  String to, String call_id , String date,String duration){
            this.call_id = call_id;
            this.date = date;
            this.duration = duration;
            this.from = from;
            this.to = to;
        }
    }
    static class Ownerships{
        String from;
        String to;
        String ownership_id;
        String date;
        String amount;
        Ownerships( String from , String to,String ownership_id , String date, String amount){
            this.from = from;
            this.to = to;
            this.date = date;
            this.amount = amount;
            this.ownership_id = ownership_id;
        }
    }
    static class Relationships{
        String from;
        String to;
        String relation;
        String date;
        Relationships( String from,String to, String relation,String date){
            this.from = from;
            this.to = to;
            this.date = date;
            this.relation = relation;
        }
    }
    static class Transactions{
        String from;
        String to;
        String transaction_id;
        String date;
        String amount;
        Transactions(String from,String to,String transaction_id,String date, String amount){
            this.amount = amount;
            this.to = to;
            this.date = date;
            this.from = from;
            this.transaction_id = transaction_id;
        }
    }
}
