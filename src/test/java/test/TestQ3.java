package test;

import org.junit.Assert;
import org.junit.Test;
import question.Q3;
import question.utils.Utils;

public class TestQ3 {
    Utils utils = new Utils();

    Q3 q3 = new Q3();

    @Test
    public void test1(){
        Assert.assertEquals(
                utils.toString(q3.mergeArray(new int[] {}, new int[] {1})),
                utils.toString(new int[] {1})
        );
    }

    @Test
    public void test2(){
        Assert.assertEquals(
                utils.toString(q3.mergeArray(new int[] {1,4,6}, new int[] {2,5,7})),
                utils.toString(new int[] {1,2,4,5,6,7})
        );
    }

    @Test
    public void test3(){
        Assert.assertEquals(
                utils.toString(q3.mergeArray(new int[] {1,3,5}, new int[] {2,4,6})),
                utils.toString(new int[] {1,2,3,4,5,6})
        );
    }

    @Test
    public void test4(){
        Assert.assertEquals(
                utils.toString(q3.mergeArray(new int[] {1,3,5}, new int[] {3,3,4,5})),
                utils.toString(new int[] {1,3,3,3,4,5,5})
        );
    }

    @Test
    public void test5(){
        Assert.assertEquals(
                utils.toString(q3.mergeArray(new int[] {}, new int[] {})),
                utils.toString(new int[] {})
        );
    }

    @Test
    public void test6(){
        Assert.assertEquals(
                utils.toString(q3.mergeArray(new int[] {2,6,7,7,9}, new int[] {3,8})),
                utils.toString(new int[] {2,3,6,7,7,8,9})
        );
    }
}
