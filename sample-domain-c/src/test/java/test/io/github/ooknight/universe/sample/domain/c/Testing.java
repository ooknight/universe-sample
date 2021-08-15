package test.io.github.ooknight.universe.sample.domain.c;

import io.github.ooknight.universe.sample.domain.a.entity.Ax;
import io.github.ooknight.universe.sample.domain.a.entity.query.QAx;
import io.github.ooknight.universe.sample.domain.b.entity.Bx;
import io.github.ooknight.universe.sample.domain.b.entity.query.QBx;
import io.github.ooknight.universe.sample.domain.c.entity.Cx;
import io.github.ooknight.universe.sample.domain.c.entity.query.QCx;

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

    @Test
    void testsB() {
        QBx query = new QBx().id.le(100L);
        List<Bx> result = query.findList();
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("select t0.id, t0.name_, t0.created_, t0.updated_, t0.deleted_ from e_bx t0 where t0.id <= ? and t0.deleted_ = false", query.getGeneratedSql());
    }

    @Test
    void testsC() {
        QCx query = new QCx().id.le(100L);
        List<Cx> result = query.findList();
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("select t0.id, t0.name_, t0.created_, t0.updated_, t0.deleted_ from e_cx t0 where t0.id <= ? and t0.deleted_ = false", query.getGeneratedSql());
    }

}



