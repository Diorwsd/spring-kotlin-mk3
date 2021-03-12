package com.example.kotlindemomk3.service

import com.example.kotlindemomk3.model.USERS
import com.example.kotlindemomk3.repository.UserRepository
import org.springframework.stereotype.Service

/**
 * 撰寫business logic
 */
@Service
class UserService(val userRepository: UserRepository) {

    fun findUserByLoginname(loginname: String): Iterable<USERS> {
        return userRepository.findUSERSByLOGINNAMEContaining(loginname)
    }

    fun loginUser(loginname: String, password: String): Boolean {
        val user = userRepository.getUSERSByLOGINNAME(loginname) ?: return false

        user.let {
            if (it.PASSWORD != password) {
                return false
            }

            return true
        }
    }
}