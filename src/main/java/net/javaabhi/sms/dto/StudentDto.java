package net.javaabhi.sms.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Long id;
    @NotEmpty(message = "Student first name should not be empty")
    private String firstName;
    @NotEmpty(message = "Student Last name should not be empty")
    private String lastName;
    @NotEmpty(message = "student email should not be empty")
    @Email
    private String email;

    // getter/setter methods
}

// student detail class as a model class to transport the data between controller layer and view layer
