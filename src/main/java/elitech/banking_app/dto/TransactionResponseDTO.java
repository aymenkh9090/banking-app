package elitech.banking_app.dto;

import elitech.banking_app.enums.TransactionType;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponseDTO {

    private Long id;
    private TransactionType transactionType;
    private Double amount;
    private LocalDate transactionDate;
    private String fromAccountNumber;
    private String toAccountNumber;


}
