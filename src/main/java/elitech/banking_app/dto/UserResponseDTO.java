package elitech.banking_app.dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponseDTO {

    private Long id;
    private String userName;
    private Set<RoleResponseDTO> roles;




}
