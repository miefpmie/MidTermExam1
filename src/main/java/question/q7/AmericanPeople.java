package question.q7;

public class AmericanPeople  extends  People implements Behaviour {

    public AmericanPeople() {
        super();
    }

    @Override
    public String speakLanguage(String language) {
        return "hello";
    }

    public String eat(String food){
       System.out.println("牛排");
       return "";
    }

     public int sleep(int hours){
        int i ;
         System.out.println(i=8);
        return i ;
    }


}
