package io.github.ooknight.universe.sample.kernel.ab.service;

import io.github.ooknight.universe.core.domain.x.DOMAIN;
import io.github.ooknight.universe.sample.domain.a.entity.Ax;
import io.github.ooknight.universe.sample.domain.a.entity.query.QAx;

import io.ebean.Database;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AxService {

    @Resource
    private Database db;

    public Ax create(String name) {
        Ax ax = new Ax();
        ax.setName(name);
        db.insert(ax);
        return ax;
    }

    public Ax find(Long id) {
        return new QAx().id.eq(id).findOneOrEmpty().orElseThrow(DOMAIN::ENTITY_NOT_FOUND);
    }

}
