package test;

import org.junit.Assert;
import org.junit.Test;
import question.Q5;

public class TestQ5 {
    Q5 q5 = new Q5();

    @Test
    public void test1(){
        Assert.assertEquals(q5.validEmail("11520@qq.com"), false);
    }

    @Test
    public void test2(){
        Assert.assertEquals(q5.validEmail("11520xxxxx@qq.com"), true);
    }

    @Test
    public void test3(){
        Assert.assertEquals(q5.validEmail("pppppxxxxx@qq.com"), false);
    }

    @Test
    public void test4(){
        Assert.assertEquals(q5.validEmail("pppppxxxxx@qqqqqqqq.com"), false);
    }

    @Test
    public void test5(){
        Assert.assertEquals(q5.validEmail("ppppp11xxx@gmial.com"), true);
    }

    @Test
    public void test6(){
        Assert.assertEquals(q5.validEmail("ppppp11xxx@gmialcom"), false);
    }

    @Test
    public void test7(){
        Assert.assertEquals(q5.validEmail("ppppp11xxx@gmail.com"), true);
    }

    @Test
    public void test8(){
        Assert.assertEquals(q5.validEmail("11111111111A@gmail.com"), true);
    }
}
