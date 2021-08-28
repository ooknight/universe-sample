package io.github.ooknight.universe.sample.kernel.ab.service;

import io.github.ooknight.universe.core.domain.x.DOMAIN;
import io.github.ooknight.universe.sample.domain.b.entity.Bx;
import io.github.ooknight.universe.sample.domain.b.entity.query.QBx;

import io.ebean.Database;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BxService {

    @Resource
    private Database db;

    @SuppressWarnings("UnusedReturnValue")
    public Bx create(Bx bx) {
        db.insert(bx);
        return bx;
    }

    public Bx find(Long id) {
        return new QBx().id.eq(id).findOneOrEmpty().orElseThrow(DOMAIN::ENTITY_NOT_FOUND);
    }

}
