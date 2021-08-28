package test.io.github.ooknight.universe.sample.domain;

import io.github.ooknight.universe.core.kernel.KernelConfiguration;
import io.github.ooknight.universe.sample.domain.a.entity.Ax;
import io.github.ooknight.universe.sample.domain.a.entity.query.QAx;
import io.github.ooknight.universe.sample.domain.b.entity.Bx;
import io.github.ooknight.universe.sample.domain.b.entity.query.QBx;
import io.github.ooknight.universe.sample.kernel.ab.service.AxService;
import io.github.ooknight.universe.sample.kernel.ab.service.BxService;
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
    @Sql("classpath:db-data-a.ddl"),
    @Sql("classpath:db-data-b.ddl"),
})
public class Testing {

    @Resource
    private AxService axs;
    @Resource
    private BxService bxs;

    @Test
    void test0() {
        x.console.echo(axs);
        x.console.echo(bxs);
    }

    @Test
    void test1() {
        Ax ax = axs.create("test");
        assertNotNull(ax);
        assertNotNull(ax.id());
    }

    @Test
    void test2() {
        Bx bx = new Bx();
        bx.setName("test");
        bxs.create(bx);
        assertNotNull(bx);
        assertNotNull(bx.id());
    }

    @Test
    void test3() {
        Ax ax = new QAx().id.eq(1).findOne();
        assertNotNull(ax);
    }

    @Test
    void test4() {
        Bx bx = new QBx().id.eq(1).findOne();
        assertNotNull(bx);
    }
}
