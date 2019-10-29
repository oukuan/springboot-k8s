package com.usher.k8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Usher
 * @Date: 2019/10/29,0029
 * @Description:
 */
@RestController
public class MainController {
    @GetMapping("/hello")
    public String test() {
        return "hello";
    }
}
