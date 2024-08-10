package com.Suraj.BookNest.book;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record BookRequest(
        Integer id,

        @NotNull(message = "Missing Book tile")
        @NotEmpty(message = "Missing Book tile")
        String title,

        @NotNull(message = "Missing authorName")
        @NotEmpty(message = "Missing authorName")
        String authorName,

        @NotNull(message = "Missing isbn")
        @NotEmpty(message = "Missing isbn")
        String isbn,

        @NotNull(message = "Missing synopsis")
        @NotEmpty(message = "Missing synopsis")
        String synopsis,

        boolean shareable) {
}
