package io.github.ooknight.universe.sample.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Line {

    private Point start;
    private Point end;
    private String name;
}
