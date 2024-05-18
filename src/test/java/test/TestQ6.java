package test;

import org.junit.Assert;
import org.junit.Test;
import question.Q6;

public class TestQ6 {
    Q6 q6 = new Q6();

    @Test
    public void test1(){
        Assert.assertEquals(q6.ballDistance(200), 574);
    }

    @Test
    public void test2(){
        Assert.assertEquals(q6.ballDistance(15), 15);
    }

    @Test
    public void test3(){
        Assert.assertEquals(q6.ballDistance(100), 274);
    }

    @Test
    public void test4(){
        Assert.assertEquals(q6.ballDistance(20), 40);
    }

    @Test
    public void test5(){
        Assert.assertEquals(q6.ballDistance(5), 0);
    }

    @Test
    public void test6(){
        Assert.assertEquals(q6.ballDistance(10), 10);
    }

    @Test
    public void test7(){
        Assert.assertEquals(q6.ballDistance(50), 124);
    }

    @Test
    public void test8(){
        Assert.assertEquals(q6.ballDistance(80), 220);
    }
}
