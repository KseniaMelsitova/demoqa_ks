import org.junit.jupiter.api.*;


public class SimpleJUnitTest {
    int result;

    @BeforeAll
    static void beforeALL() {
        System.out.println("\n###  beforeALL()\n");
    }


    @BeforeEach
    void beforeEach() {
        System.out.println("###     beforeEach()");
        result = getResult();
    }

    @AfterEach
    void afterEach() {
        System.out.println("###     afterEach()\n");
        result = 0;
    }

    @AfterAll
    static void afterALL() {
        System.out.println("\n###  beforeALL()\n");
    }

    @Test
      void firstTest() {
        int result = getResult();
        System.out.println("###     firstTest()");
       Assertions.assertTrue(result>2);
    }



    @Test
    void secondTest() {
        int result = getResult();
        System.out.println("###     secondTest()");
        Assertions.assertTrue(result>2);
    }

    @Test
    void thirdTest() {
        int result = getResult();
        System.out.println("###     thirdTest()");
        Assertions.assertTrue(result>2);
    }

    private int getResult() {
        return 3;
    }
}
