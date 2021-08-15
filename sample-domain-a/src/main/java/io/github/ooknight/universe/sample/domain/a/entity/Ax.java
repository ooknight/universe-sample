package io.github.ooknight.universe.sample.domain.a.entity;

import io.github.ooknight.universe.core.domain.UEntity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "e_ax")
public class Ax extends UEntity {

    @Column(name = "name_")
    private String name;

}
