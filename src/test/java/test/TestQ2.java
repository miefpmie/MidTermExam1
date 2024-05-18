package test;

import org.junit.Assert;
import org.junit.Test;
import question.Q2;
import question.utils.Utils;

public class TestQ2 {
    Q2 q2 = new Q2();

    @Test
    public void test1(){
        Assert.assertEquals(q2.sumNumber(2), 0);
    }

    @Test
    public void test2(){
        Assert.assertEquals(q2.sumNumber(3), 3);
    }

    @Test
    public void test3(){
        Assert.assertEquals(q2.sumNumber(10), 18);
    }

    @Test
    public void test4(){
        Assert.assertEquals(q2.sumNumber(23), 84);
    }

    @Test
    public void test5(){
        Assert.assertEquals(q2.sumNumber(24), 108);
    }

    @Test
    public void test6(){
        Assert.assertEquals(q2.sumNumber(26), 108);
    }
}
