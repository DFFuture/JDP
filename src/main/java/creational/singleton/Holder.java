package creational.singleton;

/**
 * Holder模式
 */
public class Holder {
    private Holder(){}

    private static class HolderClass {
        private final static Holder instance = new Holder();
    }

    public static Holder getInstance() {
        return HolderClass.instance;
    }
}
