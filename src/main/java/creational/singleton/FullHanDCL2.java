package creational.singleton;

/**
 * 饱汉DCL 2.0
 * 线性安全
 */
public class FullHanDCL2 {

    private static volatile FullHanDCL2 singleton = null;   //使用volatile防止指令重排序

    private FullHanDCL2(){}

    public static FullHanDCL2 getInstance() {
        if(singleton == null) {
            synchronized (FullHanDCL2.class) {
                if(singleton == null) {
                    singleton = new FullHanDCL2();
                }
            }
        }
        return singleton;
    }

}
