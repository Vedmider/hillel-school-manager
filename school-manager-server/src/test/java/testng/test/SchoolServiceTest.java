package testng.test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;


@ExtendWith(MockitoExtension.class)
public class SchoolServiceTest {

    private int number;

    @BeforeClass
    public void setup() {
        number = 12;
    }

    @AfterClass
    public void tearDown() {
        number = 0;
    }


    @BeforeMethod
    public void setupMethod() {
        System.out.println("Before each method");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("After each method");
    }

    @Test
    public void givenNumber_whenEven_thenTrue() {
        assertTrue(number % 2 == 0);
    }
}
