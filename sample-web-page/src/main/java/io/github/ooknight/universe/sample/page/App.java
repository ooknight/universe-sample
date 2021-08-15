package io.github.ooknight.universe.sample.page;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
            .sources(App.class)
            .run(args);
    }

}
