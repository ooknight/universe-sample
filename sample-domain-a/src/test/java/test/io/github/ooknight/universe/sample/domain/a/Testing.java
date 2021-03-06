package test.io.github.ooknight.universe.sample.domain.a;

import io.github.ooknight.universe.sample.domain.a.entity.Ax;
import io.github.ooknight.universe.sample.domain.a.entity.query.QAx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Testing {

    @Test
    void testsA() {
        QAx query = new QAx().id.le(100L);
        List<Ax> result = query.findList();
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("select t0.id, t0.name_, t0.created_, t0.updated_, t0.deleted_ from e_ax t0 where t0.id <= ? and t0.deleted_ = false", query.getGeneratedSql());
    }

}
