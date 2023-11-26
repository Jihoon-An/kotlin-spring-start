package com.example.home

import com.example.home.repository.MemberRepository
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class HomeApplicationTests (
        @Autowired val memberRepository: MemberRepository
){

    @Test
    @DisplayName("멤버레포테스트")
    fun memberRepositoryTest() {
        val exists = memberRepository.existsById(2)
        println(exists)
    }

}
