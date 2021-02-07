import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnit5Annotation {

    @BeforeAll
    static void setup(){
        System.out.println("Before everything. Can add listener here for example.");
    }

    @BeforeEach
    void attach(){
        System.out.println("Before every single test. Can attach file or smth.");
    }

    @Test
    @DisplayName("Test 1")
    void someTest1(){
        System.out.println("Executing test 1");
        assertTrue(true);
    }

    @Test
    @DisplayName("Test 2")
    void someTest2(){
        System.out.println("Executing test 2");
        assertTrue(true);
    }

    @AfterEach
    void attachFile(){
        System.out.println("After every single test. Can attach file or smth.");
    }

    @AfterAll
    static void shutDown(){
        System.out.println("After all tests. Shutdown for example.");
    }
}
