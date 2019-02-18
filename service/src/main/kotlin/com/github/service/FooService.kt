package com.github.service

import com.github.domain.Foo
import java.util.UUID

class FooService {
    fun foo(foo: Foo) {
        foo.uuid = UUID.randomUUID().toString()
    }
}

fun main() {
    val fooService = FooService()
    val foo = Foo()
    fooService.foo(foo)
    println(foo)
}
