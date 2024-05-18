package question.utils;

public class Utils {
    public String toString(int [] array){
        if (array.length == 0) {
            return "";
        }
        String s = "";
        for (int i=0;i<array.length;i++){
            s += array[i];
            if (i != array.length-1) {
                s += ",";
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Utils utils = new Utils();
        System.out.println(utils.toString(new int[] {1,2,3}));
    }
}
