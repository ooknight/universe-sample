package io.github.ooknight.universe.sample.page.component;

import org.springframework.stereotype.Component;

@Component("ui")
public class UI {

    public String[] breadcrumb(String... value) {
        return value;
    }

}
