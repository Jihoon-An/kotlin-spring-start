package com.example.home.controller

import com.example.home.dto.MemberRequestDto
import com.example.home.entity.Member
import com.example.home.repository.MemberRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/health")
class HealthCheckController {
    @GetMapping("")
    fun getHealthCheck(): ResponseEntity<String> {
        return ResponseEntity.ok("health")
    }
}

@RestController
@RequestMapping("/member")
class MemberController(
        var memberRepository: MemberRepository
) {
    @PostMapping("/insert")
    fun postInsert(@RequestBody requestDto: MemberRequestDto): ResponseEntity<String> {
        val member = Member(
                name = requestDto.name,
                age = requestDto.age
        )
        memberRepository.save(member)
        return ResponseEntity.ok(member.toString())
    }
}