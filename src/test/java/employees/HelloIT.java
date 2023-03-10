package employees;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class HelloIT {

    @Autowired
    HelloController helloController;

    @Test
    void testSayHello() {
        String message = helloController.sayHello();

        assertThat(message).startsWith("Hello");
    }
}
