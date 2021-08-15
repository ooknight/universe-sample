package io.github.ooknight.universe.sample.api.controller;

import io.github.ooknight.universe.sample.api.engine.Engine;
import io.github.ooknight.universe.sample.domain.a.entity.Ax;
import io.github.ooknight.universe.sample.domain.b.entity.Bx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SampleController {

    @Resource
    private Engine engine;

    @GetMapping("/api/ax/{id}")
    public Ax getax(@PathVariable Long id) {
        return engine.ax.find(id);
    }

    @PostMapping("/api/bx/{id}")
    public Bx getbx(@PathVariable Long id) {
        return engine.bx.find(id);
    }

}
