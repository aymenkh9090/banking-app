package elitech.banking_app.entities;

import elitech.banking_app.enums.AccountType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "accounts")
public class Account {

    @Id
    private Long id;
    @Column(nullable = false, unique = true)
    private String accountNumber;
    @Column(nullable = false)
    private Double balance;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    private LocalDate createDate;

    @ManyToOne()
    @JoinColumn(name = "user-id")
    @MapsId
    private UserInfo user;

    @OneToMany(mappedBy = "fromAccount")
    private List<Transaction> outTransactions;

    @OneToMany(mappedBy = "toAccount")
    private List<Transaction> inTransactions;









}
