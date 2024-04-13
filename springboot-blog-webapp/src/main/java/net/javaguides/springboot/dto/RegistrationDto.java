package net.javaguides.springboot.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
