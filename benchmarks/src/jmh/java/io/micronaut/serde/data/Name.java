package io.micronaut.serde.data;

import io.micronaut.core.annotation.Introspected;

@Introspected
public record Name(String firstName, String lastName) {
}
