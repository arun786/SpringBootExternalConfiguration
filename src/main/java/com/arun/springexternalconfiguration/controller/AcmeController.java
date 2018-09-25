package com.arun.springexternalconfiguration.controller;

import com.arun.springexternalconfiguration.config.MyPojo;
import com.arun.springexternalconfiguration.service.AcmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcmeController {

    private AcmeService acmeService;

    @Autowired
    public AcmeController(AcmeService acmeService) {
        this.acmeService = acmeService;
    }

    @GetMapping("/v1/acme/{key}")
    public MyPojo getService(@PathVariable String key) {
        return acmeService.getService(key);
    }
}
