package com.arun.springexternalconfiguration.service;

import com.arun.springexternalconfiguration.config.MyPojo;

import java.util.Map;

public interface AcmeService {
    MyPojo getService(String key);
}
