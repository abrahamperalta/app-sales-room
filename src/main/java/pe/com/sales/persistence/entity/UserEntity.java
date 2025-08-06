package pe.com.sales.persistence.entity;


import jakarta.persistence.*;
import lombok.*;
import pe.com.sales.persistence.model.EnumUser;

import java.time.LocalDateTime;

@Entity(name = "users")
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "first_name", length = 100, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 100, nullable = false)
    private String lastName;

    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @Column(name = "phone" ,nullable = false)

    private String phone;

    @Column(name = "id_number", nullable = false)
    private String idNumber;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "user_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumUser userEnum;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "created_at")
    private LocalDateTime createDate;
}
