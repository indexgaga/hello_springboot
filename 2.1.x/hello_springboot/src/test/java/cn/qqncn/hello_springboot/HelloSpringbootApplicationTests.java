package cn.qqncn.hello_springboot;

import cn.qqncn.HelloSpringbootApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloSpringbootApplication.class)
class HelloSpringbootApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("asd");
    }

}
