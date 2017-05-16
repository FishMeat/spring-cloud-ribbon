package com.fishmeat.ribbon;

import com.fishmeat.config.client.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sggb
 * @since 04.05.2017
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/")
    public String get() {
        return ribbonService.get();
    }
}
