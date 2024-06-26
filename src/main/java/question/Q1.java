package question;

/** Q1 小杨班级进行了一次期中考试, 现在老师已经得到了一个经过排序后, 分数由小到大的数组。
 * 现在老师想要得到由大到小的数组, 即将数组倒序排列。
 * 方法传入参数: 已经排过序的从小到大的数组
 * 方法返回值: 由大到小的数组
 * 例子: 传入参数{76,79,81,88,95}。 返回内容{95, 88, 81, 79, 76}
 * 注意：传入的数组默认为已经排过序的数组，不需要你再次对他排序
 */


public class Q1 {
    public int [] reverseScore(int [] scores) {
        // TODO: 请补全下方的方法
        //这边的长度等于创建的数组长度
        int [] max = new int[scores.length];
        for(int x=0;x<scores.length;x++){   //5/2 等于2.5 是2
            max[x]=scores[scores.length-1-x];//本来length=4  -1 则是0123
        }
        return max;
    }
}
