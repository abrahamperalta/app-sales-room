package pe.com.sales.mapper;


import lombok.*;
import pe.com.sales.persistence.model.EnumUser;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequest {


    private Integer idUser;

    private String firstName;


    private String lastNameUser;


    private String emailUser;


    private String phoneUser;


    private String idNumberUser;


    private String addressUser;


    private String userEnum;


    private String passwordHashUser;


    private LocalDateTime createDate;
}
