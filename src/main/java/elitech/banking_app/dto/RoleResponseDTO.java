package elitech.banking_app.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleResponseDTO {
    private Long id;
    private String roleName;
}
