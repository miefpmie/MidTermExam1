package test;

import org.junit.Assert;
import org.junit.Test;
import question.Q4;

public class TestQ4 {
    Q4 q4 = new Q4();

    @Test
    public void test1(){
        Assert.assertEquals(q4.taxiFee(7, 5), 10.5D, 0.01);
    }

    @Test
    public void test2(){
        Assert.assertEquals(q4.taxiFee(7, 0), 0D, 0.01);
    }

    @Test
    public void test3(){
        Assert.assertEquals(q4.taxiFee(5, 9), 18.5D, 0.01);
    }

    @Test
    public void test4(){
        Assert.assertEquals(q4.taxiFee(6, 2), 7D, 0.01);
    }

    @Test
    public void test5(){
        Assert.assertEquals(q4.taxiFee(0, 2), 7D, 0.01);
    }

    @Test
    public void test6(){
        Assert.assertEquals(q4.taxiFee(15, 2), 6D, 0.01);
    }

    @Test
    public void test7(){
        Assert.assertEquals(q4.taxiFee(15, 15), 25.5D, 0.01);
    }

    @Test
    public void test8(){
        Assert.assertEquals(q4.taxiFee(2, 21), 36.5D, 0.01);
    }
}
