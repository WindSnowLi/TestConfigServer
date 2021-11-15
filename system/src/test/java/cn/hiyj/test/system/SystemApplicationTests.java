package cn.hiyj.test.system;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SystemApplicationTests {


    private Love love;

    @Autowired
    public void setLove(Love love) {
        this.love = love;
    }

    @Test
    void contextLoads() {
        System.out.println(love.toString());
    }

}
