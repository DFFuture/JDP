package creational.singleton;

/**
 * 枚举优雅版
 */
public enum SingletonBetter implements MySingleton{
    SINGLETON {
        //实现接口方法
        public void doSomething() {
            System.out.println("枚举单例模式中的方法");
        }
    };

    // 增加可读性
    public static SingletonBetter getInstance() {
        return SingletonBetter.SINGLETON;
    }

}
