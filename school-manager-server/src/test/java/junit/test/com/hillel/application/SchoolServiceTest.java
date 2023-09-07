package junit.test.com.hillel.application;

import com.hillel.application.persistent.entity.School;
import com.hillel.application.persistent.repository.SchoolRepository;
import com.hillel.application.service.SchoolServiceImpl;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.validation.BindException;

import java.util.List;
import java.util.Optional;

import static junit.suit.Constants.INTEGRATION_TEST;
import static junit.suit.Constants.UNIT_TEST;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SchoolServiceTest {


    private SchoolServiceImpl schoolService;

    @InjectMocks
    private SchoolServiceImpl mockedSchoolService;

    @Spy
    private SchoolRepository schoolRepository;


    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println("Setup before class");
    }

    @AfterAll
    public static void cleanupAfterClass() {
        System.out.println("Cleanup after class");
    }

    @BeforeEach
    public void setUp() {
        schoolService = new SchoolServiceImpl(); //for example
        System.out.println("Setup before each method");
    }

    @AfterEach
    public void cleanup() {
        schoolService = null; //for example
        System.out.println("Cleanup after each method");
    }

    @Test
    @Tag(UNIT_TEST)
    public void testCreateSchool() {
        School school = schoolService.create();

        Assertions.assertNull(school.getId());

    }


    @Test
    @Tag(UNIT_TEST)
    public void testCreateSchoolWithId() {
        School school = schoolService.create(100L);

        assertThat(school.getId())
                .isGreaterThan(50L)
                .isLessThan(150L)
                .isEqualTo(100L);
    }

    @Test
    @Tag(INTEGRATION_TEST)
    public void dummyTest() {
        System.out.println("Run in integration suite");
    }


    @Test
    public void mockedRepositoryExample() {
        when(schoolRepository.findById(100L)).thenReturn(Optional.of(new School(50L, null, "fake_address")));
        School actual = mockedSchoolService.findInRepository(100L);

        assertThat(actual.getId()).isEqualTo(50L);
        assertThat(actual.getAddress()).isEqualTo("fake_address");
    }

    @Test
    @Disabled("Disabled until I understand what to test")
    public void shouldIgnoreDuringRun(){
        System.out.println("Ignored test that should not run");
    }

    @Test
    public void shouldTrowBindException() {
        Assertions.assertThrows(BindException.class, () -> {
            System.out.println("some code here");
            throw new BindException("", null);
        });
    }

    @ParameterizedTest
    @MethodSource("giveMyMyString")
    public void parametrizedTest(String parameter) {
        System.out.println(parameter);
    }

    private static List<String> giveMyMyString() {
        return List.of("ANY", "MANY", "MINE", "BOOMS");
    }


    @ParameterizedTest
    @MethodSource("junit.suit.StringParams#blankStrings")
    public void parametrizedTestWithClass(String parameter) {
        System.out.println(parameter);
    }

}
