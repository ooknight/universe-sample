package io.github.ooknight.universe.sample.api.engine;

import io.github.ooknight.universe.sample.kernel.ab.service.AxService;
import io.github.ooknight.universe.sample.kernel.ab.service.BxService;
import io.github.ooknight.universe.sample.kernel.c.service.CxService;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Getter
@Accessors(fluent = true)
@Service
public class Engine {

    @Resource
    public AxService ax;
    @Resource
    public BxService bx;
    @Resource
    public CxService cx;

}
