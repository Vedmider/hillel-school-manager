package e2e.test;


import com.hillel.application.service.SchoolService;
import com.hillel.application.service.SchoolServiceImpl;
import e2e.configuration.ConfigForTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;

//@SpringBootTest - run all application
@SpringBootTest(classes = SchoolServiceImpl.class) // run context only needed for SchoolServiceImpl
@Import(ConfigForTest.class)
// OR
@ContextConfiguration(classes = {ConfigForTest.class})
public class EndToEndTest {
    private static final String SCHOOL_SERVICE_QUALIFIER = "school_service_test";


    @SpyBean
    private SchoolService schoolService;

    @Configuration
    static class ContextConfiguration {

        @Bean
        @Qualifier(SCHOOL_SERVICE_QUALIFIER)
        public SchoolService schoolService() {
            return new SchoolServiceImpl();
        }
    }

    @Test
    public void e2eTest() {
        System.out.println("e2e test run");
    }
}
