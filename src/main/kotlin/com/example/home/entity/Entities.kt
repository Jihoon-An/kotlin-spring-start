package com.example.home.entity

import jakarta.persistence.*

@Entity
@Table(name = "member")
class Member(
        name: String? = null,
        age: Int? = null
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Int? = null
    var name: String? = name
        protected set
    var age: Int? = age
        protected set

    override fun toString(): String {
        return "Member(idx=$idx, name=$name, age=$age)"
    }
}