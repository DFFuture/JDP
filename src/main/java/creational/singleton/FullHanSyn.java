package creational.singleton;

/**
 * 饱汉粗暴同步版
 * 线性安全，并行性能极差
 * 适合性能不敏感的场景
 */
public class FullHanSyn {
    private static FullHanSyn singleton = null;
    private FullHanSyn() {
    }

    public synchronized static FullHanSyn getInstance() {
        if(singleton == null) {
            singleton = new FullHanSyn();
        }
        return singleton;
    }
}
