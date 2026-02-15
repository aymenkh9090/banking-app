package elitech.banking_app.dto;

import elitech.banking_app.enums.TransactionType;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequestDTO {

    private Double amount;
    private TransactionType transactionType;
    private Long fromAccountId;
    private Long toAccountId;



}
