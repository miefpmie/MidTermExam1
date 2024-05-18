package question;

/** Q4 现模拟打车, 每日0点(含0点)-6点(含6点)，起步价7元，当日6(不含6点)-次日0点，起步价6元。
 * 起步价包含2公里，超出部分按照每公里1.5元收费。
 * 另外, 凌晨乘客(0-6点的乘客)需要加收1元的夜间行驶费。输入打车的时间和距离，计算本次打车的费用。
 * 方法传入参数: 2个整数，第一个整数time表示打车时间, 第二个整数distance表示打车距离。
 * 方法返回值: double类型的值, 表示打车费用。
 * 例子1: 传入参数time=7, distance=5。 返回值10.5(计算过程6+3*1.5)
 * 例子2: 传入参数time=3, distance=9。 返回值18.5(计算过程7+7*1.5+1)
 */

public class Q4 {
    public double taxiFee(int time, int distance) {
       double money =0;
       double  qibu=0;
       double juli=0;

       //传入的time 和distance是int 转成double
       //求两个数
        if (0<=time&&time<=6){
            qibu=7+1;
        } else {
            qibu=6;
        }

        money = qibu ;

        if (distance > 2) {
            juli= (distance-2)*1.5;
        }

        money +=juli;

        if (distance == 0){
            money = 0;
        }

        return money;
    }
}
