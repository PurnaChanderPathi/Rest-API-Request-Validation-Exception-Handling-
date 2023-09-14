package com.purna.validations.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.aspectj.bridge.IMessage;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

    @NotNull(message = "Username shouldn't be null")
    private String name;
    @Email(message = "Invalid email address")
    private String email;
    @Pattern(regexp = "^\\d{10}$",message = "Invalid mobile number entered")
    private String mobile;
    private String gender;
    @Min(value = 18,message = "Minimum age required 18" )
    @Max(value = 60, message = "maximum age up to 60")
    private int age;
    @NotBlank(message = "Nationality name shouldn't be blank")
    private String nationality;

}
