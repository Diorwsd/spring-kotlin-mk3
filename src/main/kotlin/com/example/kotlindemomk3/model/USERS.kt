package com.example.kotlindemomk3.model


import org.jetbrains.annotations.NotNull
import java.math.BigDecimal
import java.sql.Date
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * oracle schema+table name 使用者表格
 */
@Entity
@Table(name="USERS", schema = "USRADMIN")
class USERS {
    @Id
    lateinit var USER_OID: BigDecimal
    @NotNull
    var LOGINNAME: String? = null
    var FULLNAME: String? = null
    @NotNull
    var PASSWORD: String? = null
    var USER_DESC: String? = null
    var PASSWORD_DATE: Date? = null
    var USER_STATUS: String="1"
    var ERROR_NUM: Int? = null
}