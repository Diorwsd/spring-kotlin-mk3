package com.example.kotlindemomk3.controller

import com.example.kotlindemomk3.model.LoginUser
import com.example.kotlindemomk3.model.USERS
import com.example.kotlindemomk3.repository.UserRepository
import com.example.kotlindemomk3.service.UserService
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(
    val userRepo: UserRepository,
    val objectMapper: ObjectMapper,
    val userService: UserService
) {
    @GetMapping("/all")
    @ResponseBody
    fun getAll(): Iterable<USERS> {
        return this.userRepo.findAll()
    }

    @GetMapping("/ByLoginname")
    @ResponseBody
    fun findByLoginname(@RequestParam loginname: String): Iterable<USERS> {
        return userService.findUserByLoginname(loginname)
    }

    @PostMapping("/login")
    @ResponseBody
    fun loginByLoginnameAndPassword(@RequestBody user: LoginUser): String {
        // 先略過檢查傳入參數

        if (userService.loginUser(user.loginname, user.password)) {
            // 產生JWT

            return "JWT"
        } else {
            return "false"
        }
    }
}