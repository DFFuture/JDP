package creational.singleton;


/**
 * 饱汉模式基础版
 * 线性不安全，if语句会出现竞争条件
 * 只适合单线程环境
 */

public class FullHanBasic {

    private static FullHanBasic singleton = null;
    private FullHanBasic() {
    }

    public static FullHanBasic getInstance() {
        if(singleton == null) {
            singleton = new FullHanBasic();
        }
        return singleton;
    }

}
