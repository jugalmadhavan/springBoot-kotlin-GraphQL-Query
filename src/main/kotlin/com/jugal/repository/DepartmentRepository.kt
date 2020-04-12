package com.jugal.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.time.LocalDateTime
import java.util.*
import javax.transaction.Transactional
import com.jugal.data.Department

@Repository
@Transactional
interface DepartmentRepository : JpaRepository<Department, Int> {
    fun findByCode(code: String): Department
}