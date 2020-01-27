package com.test.Test;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @RequestMapping("/hello")
    public String sayHello(@RequestParam(value = "name") String name) {
        String[] arr = name.split(",");
        int size = arr.length;
        int[] num = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            num[i] = Integer.parseInt(arr[i]);
            sum = sum + num[i];
        }
        return "Sum of the numbers is " + sum;
    }
    }
