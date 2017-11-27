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

}
