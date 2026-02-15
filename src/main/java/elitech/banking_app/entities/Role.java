package elitech.banking_app.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "roles")
public class Role extends BaseEntity{


    @Column(nullable = false)
    private String roleName;

    // users
    @ManyToMany(mappedBy = "roles")
    private Set<UserInfo> user;

}
