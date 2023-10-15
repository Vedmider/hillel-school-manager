package com.hillel.application.springBootTest;

import com.hillel.application.persistent.entity.Director;
import com.hillel.application.persistent.repository.DirectorRepository;
import com.hillel.application.service.SchoolServiceImpl;
import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.ClassicConfiguration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@TestPropertySource(properties = {"spring.flyway.enabled=false", "spring.flyway.cleanDisabled=false"})
public class DirectorSpringBootTest {

//    @Container
//    private static final PostgreSQLContainer POSTGRESQL_CONTAINER = new PostgreSQLContainer("postgres:15.2-alpine")
//            .withDatabaseName("postgres")
//            .withUsername("postgres")
//            .withPassword("postgres");
    @Autowired
    SchoolServiceImpl schoolService;

    @Autowired
    private DirectorRepository repository;

    private static Flyway flyway;
    static String url;
    static String username;
    static String password;


    @BeforeAll
    static void beforeAll() {
//        POSTGRESQL_CONTAINER.start();
//        url = POSTGRESQL_CONTAINER.getJdbcUrl();
//        username = POSTGRESQL_CONTAINER.getUsername();
//        password = POSTGRESQL_CONTAINER.getPassword();
//        System.setProperty("spring.datasource.url", url);
//        System.setProperty("spring.datasource.username", username);
//        System.setProperty("spring.datasource.password", password);

        ClassicConfiguration classicConfiguration = new ClassicConfiguration();
        classicConfiguration.setUrl("jdbc:postgresql://localhost:5432/postgres");
        classicConfiguration.setPassword("postgres");
        classicConfiguration.setUser("postgres");
        classicConfiguration.setCleanDisabled(false);
        flyway = new Flyway(classicConfiguration);
    }

    @Test
  //  @Sql(scripts = {"../../../../db/scripts/insert_director_test_data.sql"})
 //   @Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, statements = {"TRUNCATE TABLE director_super_director CASCADE"})
    public void testCar() {
//        Director director = new Director();
//        repository.saveAndFlush(director);
//
//        repository.findById(10L);
//
//        System.out.println("FINISHED");
//        System.out.println(flyway.info());
//        flyway.validate();
//
//        System.out.println(repository.findAll());
//
//        System.out.println("++++++++++++++++");
//        System.out.println(flyway.info());

        flyway.clean();
    }
}
