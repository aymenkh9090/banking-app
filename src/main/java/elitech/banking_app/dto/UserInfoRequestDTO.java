package elitech.banking_app.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Set;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class UserInfoRequestDTO {

    @NotBlank(message = "user name is required")
    @NotEmpty(message = "user name is required")
    @Size(min = 3,max = 20 , message = "user name should be between 3 and 20 caracters")
    private String userName;
    @NotBlank(message = "password is required")
    @NotEmpty(message = "password is required")
    @Size(min = 3,max = 20 , message = "password should be between 3 and 20 caracters")
    private String password;
    @NotBlank(message = "Email is required")
    @NotEmpty(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;

    private Set<Long> rolesIds;






}
