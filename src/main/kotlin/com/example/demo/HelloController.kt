package com.example.demo

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    fun hello(): String {
        return "hello"
    }
}