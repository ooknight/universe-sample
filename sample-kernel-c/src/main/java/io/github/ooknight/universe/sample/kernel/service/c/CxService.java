package io.github.ooknight.universe.sample.kernel.service.c;

import io.github.ooknight.universe.sample.domain.a.entity.Ax;
import io.github.ooknight.universe.sample.domain.b.entity.Bx;
import io.github.ooknight.universe.sample.domain.c.entity.Cx;

import io.ebean.Database;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CxService {

    @Resource
    private Database db;

    public Cx create(String nameAx, String nameBx, String nameCx) {

        Ax ax = new Ax();
        ax.setName(nameAx);

        Bx bx = new Bx();
        bx.setName(nameBx);
        bx.setAx(ax);

        Cx cx = new Cx();
        cx.setName(nameCx);
        cx.setBx(bx);

        db.insert(ax);
        db.insert(bx);
        db.insert(cx);

        return cx;
    }

}
