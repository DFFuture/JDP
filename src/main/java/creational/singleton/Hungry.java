package creational.singleton;

/**
 * 饿汉模式
 * 线性安全
 */
public class Hungry {

    private static final Hungry singleton = new Hungry();

    private Hungry(){}

    public static Hungry getInstance() {
        return singleton;
    }
}
