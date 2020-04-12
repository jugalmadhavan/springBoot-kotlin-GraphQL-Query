package com.jugal.graphql.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.data.jpa.domain.Specification
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.stereotype.Component
import java.time.LocalDate
import com.jugal.repository.DepartmentRepository
import com.jugal.data.Department

@Component
class QueryResolver( private val departmentRepository: DepartmentRepository
) : GraphQLQueryResolver {

    fun department(code: String) = departmentRepository.findByCode(code)

    fun departments() = departmentRepository.findAll()

}
