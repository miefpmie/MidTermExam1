package test;

import org.junit.Assert;
import org.junit.Test;
import question.Q1;
import question.utils.Utils;

public class TestQ1 {
    Utils utils = new Utils();

    Q1 q1 = new Q1();

    int [] array1 = {};

    int [] array2 = {1,2,5,8};

    int [] array3 = {1};

    int [] array4 = {1,1,1,1};

    int [] array5 = {5,6,7,8};

    @org.junit.Test
    public void test1(){
        Assert.assertEquals(q1.reverseScore(array1).length, new int[0].length);
    }

    @Test
    public void test2(){
        Assert.assertEquals(utils.toString(q1.reverseScore(array2)), utils.toString(new  int[] {8,5,2,1}));
    }

    @Test
    public void test3(){
        Assert.assertEquals(utils.toString(q1.reverseScore(array3)), utils.toString(new  int[] {1}));
    }

    @Test
    public void test4(){
        Assert.assertEquals(utils.toString(q1.reverseScore(array4)), utils.toString(new  int[] {1,1,1,1}));
    }

    @Test
    public void test5(){
        Assert.assertEquals(utils.toString(q1.reverseScore(array5)), utils.toString(new  int[] {8,7,6,5}));
    }
}
