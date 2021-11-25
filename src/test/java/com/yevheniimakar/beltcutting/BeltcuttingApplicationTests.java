package com.yevheniimakar.beltcutting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"local-test", "debug"})
class BeltcuttingApplicationTests {

    @Test
    void contextLoads() {
    }

}
