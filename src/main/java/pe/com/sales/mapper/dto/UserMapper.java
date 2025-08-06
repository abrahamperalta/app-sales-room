package pe.com.sales.mapper.dto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pe.com.sales.mapper.UserRequest;
import pe.com.sales.mapper.UserResponse;
import pe.com.sales.persistence.entity.UserEntity;
import pe.com.sales.proyections.UsersProyections;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {





    @Mapping(target = "firstName",source = "firstName")
    @Mapping(target = "lastName",source = "lastNameUser")
    @Mapping( target = "email",source = "emailUser")
    @Mapping(target = "phone",source = "phoneUser")
    @Mapping(target = "idNumber",source = "idNumberUser")
    @Mapping(target = "address",source = "addressUser")
    @Mapping(target = "passwordHash", source = "passwordHashUser")
    @Mapping(target = "createDate",expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "userEnum" , source = "userEnum")
    UserEntity toUserEntity(UserRequest src);



    @Mapping(source = "firstName", target = "firstNameUser")
    @Mapping(source = "userId", target = "userIdUser")
    @Mapping(source = "lastName", target = "lastNameUser")
    UserResponse toUserResponse(UserEntity userEntity);



    @Mapping(source = "usersId", target = "userId")
    @Mapping(source = "firstName", target = "firstName")
//    @Mapping(source = "idNumber", target = "idNumberUser")
    @Mapping(source = "idNewNumber", target = "idNumberUser")
    User2Response toUserResponse2(UsersProyections src);



    List<User2Response> asUser2Response(List<UsersProyections> src);





}
