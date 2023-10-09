package com.example.heima_projectdeploymenttest.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject : heima_projectDeploymentTest
 * @BelongPackage : com.example.heima_projectdeploymenttest.controller
 * @CreateTime : 2023/10/7 13:07
 * @Author : Liusijie
 * @Description : TODO
 */
@RestController
@RequestMapping("/hello")
public class Hello {

    @GetMapping("")
    public String hello() {
        System.out.println("hello word...");
        return "ok";
    }
}
