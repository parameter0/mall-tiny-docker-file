package com.example.malltinydockerfile;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: mall-tiny-docker-file
 * @description:
 * @author: rt
 * @create: 2021-07-27 14:29
 **/
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hi() {

        int a = 8;
        int b;
        b = a == 9 || a == 10 ? 1 : 2;
        System.out.println(111);

        return "congratulations!It worksa!12345";
    }
}
