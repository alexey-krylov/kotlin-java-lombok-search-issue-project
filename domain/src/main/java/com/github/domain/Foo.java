package com.github.domain;

import lombok.*;

@Data
@ToString(of = "uuid")
@EqualsAndHashCode(of = "uuid")
public class Foo {

    private String uuid;
}