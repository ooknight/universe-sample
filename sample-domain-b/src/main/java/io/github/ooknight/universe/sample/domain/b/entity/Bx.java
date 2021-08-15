package io.github.ooknight.universe.sample.domain.b.entity;

import io.github.ooknight.universe.core.domain.UEntity;
import io.github.ooknight.universe.sample.domain.a.entity.Ax;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "e_bx")
public class Bx extends UEntity {

    @Column(name = "name_")
    private String name;

    @ManyToOne
    @JoinColumn(name = "ax_id")
    private Ax ax;

}
