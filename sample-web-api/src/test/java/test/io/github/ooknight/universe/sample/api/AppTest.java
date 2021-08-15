package test.io.github.ooknight.universe.sample.api;

import io.github.ooknight.universe.sample.api.App;
import io.github.ooknight.universe.sample.domain.a.entity.Ax;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = App.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebMvc
@SqlGroup({
    @Sql("classpath:db-schema-a.ddl"),
    @Sql("classpath:db-schema-b.ddl"),
    @Sql("classpath:db-schema-c.ddl"),
    @Sql("classpath:db-data-a.ddl"),
    @Sql("classpath:db-data-b.ddl"),
    @Sql("classpath:db-data-c.ddl")
})
public class AppTest {

    @Resource
    private TestRestTemplate template;

    @Test
    void test1() {
        Ax ax = template.getForObject("/api/ax/1", Ax.class);
        assertNotNull(ax);
    }

    //HttpHeaders headers = new HttpHeaders();
    //    headers.add(Constant.HEADER_NAME_TIMESTAMP, x.timestamp.now() + "");
    //
    //Point point = new Point();
    //    point.setX(1);
    //    point.setY(2);
    //
    //HttpEntity<Point> request = new HttpEntity<>(point, headers);
    //
    //
    //Point result = template.postForObject("/api/ax/1", request, Point.class);
    //    System.out.println(result);

}
