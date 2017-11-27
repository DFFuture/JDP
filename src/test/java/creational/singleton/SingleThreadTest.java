package creational.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SingleThreadTest {

    @Test
    void HolderTest() {
        Holder s1, s2;
        s1 = Holder.getInstance();
        s2 = Holder.getInstance();
        assertEquals(s1, s2);
    }

    @Test
    void FullHan1Test() {
        FullHanBasic s1, s2;
        s1 = FullHanBasic.getInstance();
        s2 = FullHanBasic.getInstance();
        assertEquals(s1, s2);
    }

    @Test
    void SingletonBasicTest() {
        SingletonBasic s1, s2;
        s1 = SingletonBasic.SINGLETON;
        s2 = SingletonBasic.SINGLETON;
        assertEquals(s1, s2);
    }

}
