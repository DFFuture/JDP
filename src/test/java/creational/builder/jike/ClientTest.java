package creational.builder.jike;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {
    @Test
    public void main() throws Exception {
        ActorBuilder ab; //针对抽象建造者编程
        ab =  (ActorBuilder)XMLUtil.getBean(); //反射生成具体建造者对象
        ActorController ac = new  ActorController();
        Actor actor;
        actor = ac.construct(ab); //通过指挥者创建完整的建造者对象
        String  type = actor.getType();
        assertEquals("英雄", type);
        assertEquals("男", actor.getSex());
    }

}