package elitech.banking_app.dto;

import elitech.banking_app.enums.AccountType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter @Setter @Builder @NoArgsConstructor
@AllArgsConstructor
public class AccountRequestDTO {

   private Long userId;
   private Double balance;
   private AccountType accountType;

}
