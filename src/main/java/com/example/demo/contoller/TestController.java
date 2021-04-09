package com.example.demo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author jzwx
 * @version $ Id: TestController, v 0.1 2021/4/9 19:08 jzwx Exp $
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    /**
     * 测试
     *
     * @return
     */
    @GetMapping(value = "/hello")
    public String getHello(@RequestParam(value = "a") String a) {
        return "hello,world!" + a;
    }
}