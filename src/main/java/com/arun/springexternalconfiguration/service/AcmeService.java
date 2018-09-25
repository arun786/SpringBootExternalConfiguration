package com.arun.springexternalconfiguration.service;

import com.arun.springexternalconfiguration.config.MyPojo;

import java.util.List;

public interface AcmeService {
    MyPojo getService(String key);
    List<MyPojo> getServiceUsingList();
}
