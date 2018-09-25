# SpringBootExternalConfiguration

# step 1

Create a properties file as below, name as translator.properties

    acme.map.key1.name=arun
    acme.map.key1.description=student
    acme.map.key2.name=arun
    acme.map.key2.description=student
    acme.map.key3.name=arun
    acme.map.key3.description=student
    
# step 2

Mark the application file as below with @PropertySource

    package com.arun.springexternalconfiguration;
    
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.context.annotation.PropertySource;
    
    @SpringBootApplication
    @PropertySource("classpath:translator.properties")
    public class SpringexternalconfigurationApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(SpringexternalconfigurationApplication.class, args);
        }
    }

# step 3

Create a pojo class
    
    package com.arun.springexternalconfiguration.config;
    
    import lombok.Getter;
    import lombok.Setter;
    
    @Getter
    @Setter
    public class MyPojo {
        private String name;
        private String description;
    }
   
# step 4

Create a configuration file

    package com.arun.springexternalconfiguration.config;
    
    import lombok.Getter;
    import lombok.Setter;
    import org.springframework.boot.context.properties.ConfigurationProperties;
    import org.springframework.context.annotation.Configuration;
    
    import java.util.HashMap;
    import java.util.Map;
    
    @Configuration
    @ConfigurationProperties("acme")
    @Getter
    @Setter
    public class ConfigProperties {
        private final Map<String, MyPojo> map = new HashMap<>();
    }

# step 5

Call the config file 

    package com.arun.springexternalconfiguration.service;
    
    import com.arun.springexternalconfiguration.config.ConfigProperties;
    import com.arun.springexternalconfiguration.config.MyPojo;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    
    import java.util.Map;
    
    @Service
    public class AcmeServiceImpl implements AcmeService {
    
        private ConfigProperties configProperties;
    
        @Autowired
        public AcmeServiceImpl(ConfigProperties configProperties) {
            this.configProperties = configProperties;
        }
    
        @Override
        public MyPojo getService(String key) {
    
            MyPojo mypojo = configProperties.getMap().get(key);
            return mypojo;
    
        }
    }



