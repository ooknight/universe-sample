package io.github.ooknight.universe.sample.api.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Point implements Serializable {

    private Integer x;
    private Integer y;

}
