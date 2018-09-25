package com.arun.springexternalconfiguration.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties("acme")
@Getter
@Setter
public class ConfigProperties {
    private final Map<String, MyPojo> map = new HashMap<>();
    private final List<MyPojo> list = new ArrayList<>();
}
