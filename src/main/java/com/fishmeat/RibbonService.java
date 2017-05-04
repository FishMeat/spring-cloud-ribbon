package com.fishmeat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author sggb
 * @since 04.05.2017
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String get() {
        return restTemplate.getForObject("http://client/", String.class);
    }
}
