package io.github.ooknight.universe.sample.kernel.c;

import io.github.ooknight.universe.core.kernel.KernelConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("io.github.ooknight.universe.sample.kernel.c")
@Import(KernelConfiguration.class)
public class AutoConfiguration {
}
