package elitech.banking_app.entities;

import elitech.banking_app.enums.TransactionType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "transactions")
public class Transaction extends BaseEntity {

    @Column(nullable = false)
    private Double amount;
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    private LocalDate transactionDate;


    @ManyToOne()
    @JoinColumn(name = "from-account-id")
    private Account fromAccount;

    @ManyToOne()
    @JoinColumn(name = "to-account-id")
    private Account toAccount;







}
