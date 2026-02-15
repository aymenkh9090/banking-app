package elitech.banking_app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@Table(name = "users")
public class UserInfo extends BaseEntity {


    @Column( nullable = false)
    private String userName;
    @Column( nullable = false)
    private String password;
    @Column( nullable = false,unique = true )
    private String email;

    // complete with role and account
    @ManyToMany()
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    Set<Role> roles;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    List<Account> accounts;

}
