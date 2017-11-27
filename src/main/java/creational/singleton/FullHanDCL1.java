package creational.singleton;


/**
 * 饱汉DCL（Double Check Lock） 1.0
 * 线性不安全
 */
public class FullHanDCL1 {
    private static FullHanDCL1 singleton = null;

    private FullHanDCL1() {}

    public static FullHanDCL1 getInstance() {
        if(singleton == null) {
            synchronized (FullHanDCL1.class) {
                if(singleton == null) {
                    singleton = new FullHanDCL1();
                }
            }
        }
        return singleton;
    }
}
