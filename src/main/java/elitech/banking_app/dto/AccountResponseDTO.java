package elitech.banking_app.dto;

import elitech.banking_app.enums.AccountType;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponseDTO {

    private Long id;
    private String accountNumber;
    private Double balance;
    private LocalDate createdDate;
    private AccountType accountType;
    private Long userId;




}
