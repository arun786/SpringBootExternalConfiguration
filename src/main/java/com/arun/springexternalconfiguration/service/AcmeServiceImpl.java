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
