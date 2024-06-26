package question;

/** Q3 现在有2个数组, 这两个数组都已经是经过排序后从小到大的数组(你不需要对这两个数组再次排序，默认已经是有序的了)。
 * 现在需要你将这两个有序的数组合并成一个有序的, 从小到大的数组
 * 方法传入参数: 2个已经排序(从小到大)的数组
 * 方法返回值: 1个从小到大的数组
 * 例子1: 传入参数array1为{1,5,7,8,9} array2为{0,2,3,6}。 返回值{0,1,2,3,5,6,7,8,9}
 * 例子2: 传入参数array1为{3,4,7,10} array2为{3,4,6}。 返回值{3,3,4,4,6,7,10}
 * 例子3: 传入参数array1为{3,4,7,10} array2为{}。 返回值{3,4,7,10}
 */

public class Q3 {
    public int[] mergeArray(int[] array1, int[] array2) {
        //方法返回值: 1个从小到大的数组
        int[] min = new int[array1.length + array2.length];
        /* //先遍历一下
        for (int i=0;i<array1.length;i++){
            min[i]=array1[i];
        }
        for (int i=0;i<array2.length ;i++){
            min[i+ array1.length]=array2[i];
        }
        //排序
        for(int x=0;x<min.length-1;x++) {
            for (int y = 0; y < min.length - 1; y++) {
                if (min[y] > min[y + 1]) {
                    int temp = min[y];
                    min[y] = min[y + 1];
                    min[y + 1] = temp;
                }
            }
        }
        return min;*/

        int a = 0;
        int b = 0;
        int i = 0;
        //情况特殊的
        if (array1.length == 0 && array2.length != 0) {
            return array2;
        } else if (array1.length != 0 && array2.length == 0) {
            return array1;
        } else if (array1.length == 0 && array2.length == 0) {
            return min;//返回空的数组 不会改
        }
        while (true) {
            if (array1[a] <= array2[b]) {
                min[i] = array1[a];
                a++;
                if (a >= array1.length) {
                    for (int x = i + 1; x < min.length; x++) {
                        min[x] = array2[b];
                        i++;
                    }
                }
            } else if (array1[a] > array2[b]) {
                min[i] = array2[b];
                b++;
                if (b >= array2.length) {
                    for (int x = i + 1; x < min.length; x++) {
                        min[x] = array1[a];
                        i++;
                    }
                }
            }
            i++;//此时做个判断
            if (i>=min.length){
                break;
            }
        }
            return min;
    }
}