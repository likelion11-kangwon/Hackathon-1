package back.ailion.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity @Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String password;

    private String username;

    private String nickName;

    private String name;

    private String phone;

    private String provider;

    private String providerId;

    private String role;

//    @Enumerated(EnumType.STRING)
//    private RoleType role;


    @Builder
    public User(String nickName, String password, String username, String name, String phone, String role, String provider, String providerId) {
        this.password = password;
        this.username = username;
        this.name = name;
        this.phone = phone;
        this.nickName = nickName;
        this.role = role;
        this.provider = provider;
        this.providerId = providerId;
    }
}