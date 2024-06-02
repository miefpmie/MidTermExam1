package question;

// ***** 此类可用于测试写的题目是否正确及debug ******
// 例如想要测试第一题： 首先创建对象, Q1 q1 = new Q1(); 然后利用对象q1调用对应的方法。注意参数(测试案例)需要自己编写

public class MainDemo {
    public static void main(String[] args) {
        //Q1 q1 = new Q1();
        //int [] scores = {1,2,5,8};
        //q1.reverseScore(scores);

        Q3 q3 = new Q3();
        int [] array1 = {2,6,7,7,9};
        int [] array2 = {3,8};
        q3.mergeArray(array1,array2);
        System.out.println(q3);
    }
}
