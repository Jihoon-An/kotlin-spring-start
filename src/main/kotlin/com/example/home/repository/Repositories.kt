package com.example.home.repository

import com.example.home.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Int> {
}