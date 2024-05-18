package question;

/** Q5 现需要判定一个String类型的字符串是否满足邮箱的格式。
 * 正确的邮箱格式要求: 邮箱有2部分构成: @前面的部分 和 @后面的部分
 * 其中要求@前面的部分由9到12位内容构成, 其中必须包括至少1个数字，1个字母
 * 要求@后面的部分由：@XX.com构成, 其中XX可以为任何值，只需要长度为2-6位即可，例如可以是qq, 126, gmail等
 * 方法传入参数: 1个字符串, 表示邮箱
 * 方法返回值: boolean值, true表示邮箱格式正确, false表示邮箱格式错误
 * 例子1: 传入参数email为"1165783612@qq.com"。 返回值false(因为@前面的部分缺少字母, 只有数字)
 * 例子2: 传入参数email为"11657836xx@qq.com"。 返回值true
 * 例子3: 传入参数email为"11657836xx@qq.comm"。 返回值false(因为@后的部分不满足@XX.com格式)
 */

public class Q5 {
    public boolean validEmail(String email) {
       // 邮箱有2部分构成: @前面的部分 和 @后面的部分
        //String 类的 public boolean matches(String regex)
        String regex = "//d{1}[a-zA-Z]{1}//w{7,10}+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
        //其中必须包括至少1个数字，1个字
        //如果是前面几个为数字或者字母 则返回flase；

        boolean flag = email.matches(regex);
        return flag;
    }
}
