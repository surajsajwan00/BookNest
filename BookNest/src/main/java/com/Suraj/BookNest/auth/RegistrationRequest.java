package com.Suraj.BookNest.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class RegistrationRequest {
    @NotEmpty(message = "Firstname Required")
    @NotBlank(message = "Firstname Required")
    private String firstname;

    @NotEmpty(message = "Lastname Required")
    @NotBlank(message = "Lastname Required")
    private String lastname;

    @Email(message = "Incorrect Email")
    @NotEmpty(message = "Email Required")
    @NotBlank(message = "Email Required")
    private String email;

    @Size(min = 8, message = "Minimum Password Length should be at least 8 characters or more")
    @NotEmpty(message = "Password Required")
    @NotBlank(message = "Password Required")
    private String password;
}
