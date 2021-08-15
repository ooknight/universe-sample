package io.github.ooknight.universe.sample.api.engine;

import io.github.ooknight.universe.sample.kernel.service.ab.AxService;
import io.github.ooknight.universe.sample.kernel.service.ab.BxService;
import io.github.ooknight.universe.sample.kernel.service.c.CxService;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Getter
@Accessors(fluent = true)
@Import({
    AxService.class,
    BxService.class,
    CxService.class
})
@Service
public class Engine {

    @Resource
    public AxService ax;
    @Resource
    public BxService bx;
    @Resource
    public CxService cx;
}
