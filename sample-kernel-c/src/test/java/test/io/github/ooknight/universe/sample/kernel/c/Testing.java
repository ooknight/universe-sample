package test.io.github.ooknight.universe.sample.kernel.c;

import io.github.ooknight.universe.core.kernel.KernelConfiguration;
import io.github.ooknight.universe.sample.domain.c.entity.Cx;
import io.github.ooknight.universe.sample.kernel.c.service.CxService;
import static io.github.ooknight.universe.support.utils.COMBINE.x;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = KernelConfiguration.class)
@EnableAutoConfiguration
@SqlGroup({
    @Sql("classpath:db-schema-a.ddl"),
    @Sql("classpath:db-schema-b.ddl"),
    @Sql("classpath:db-schema-c.ddl"),
    @Sql("classpath:db-data-a.ddl"),
    @Sql("classpath:db-data-b.ddl"),
    @Sql("classpath:db-data-c.ddl")
})
public class Testing {

    @Resource
    private CxService cxs;

    @Test
    void test0() {
        x.console.echo(cxs);
    }

    @Test
    void test1() {
        Cx cx = cxs.create("testa", "testb", "testc");
        assertNotNull(cx);
        assertNotNull(cx.id());
    }

}
