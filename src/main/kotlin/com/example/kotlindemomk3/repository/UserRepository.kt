package com.example.kotlindemomk3.repository

import com.example.kotlindemomk3.model.USERS
import org.springframework.data.jpa.repository.JpaRepository
import java.math.BigDecimal

/**
 * 資料庫操作邏輯
 */
interface UserRepository : JpaRepository<USERS, BigDecimal> {

    fun findUSERSByLOGINNAMEContaining(loginname: String): Iterable<USERS>

    fun getUSERSByLOGINNAME(loginname: String): USERS?
}