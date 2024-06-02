package question.q7;

public class ChinesePeople extends  People implements Behaviour {
    @Override
    public String speakLanguage(String language) {
        return "你好";
    }

    public String eat(String food){
        System.out.println("鱼香肉丝");
        return "";
    }

    public int sleep(int hours){
        int a;
        System.out.println(a=7);
        return a ;
    }





}
