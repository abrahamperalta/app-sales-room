package pe.com.sales.service;

import org.apache.catalina.User;
import pe.com.sales.mapper.UserRequest;
import pe.com.sales.mapper.UserResponse;
import pe.com.sales.mapper.dto.User2Response;

import java.util.List;


public interface UserService {


    UserResponse saveUser(UserRequest userRequest) throws  Exception;
    UserResponse updateUser(UserRequest userRequest) throws  Exception;
    List<UserResponse> listUser() throws  Exception;
    User getUser(Integer idUser) throws  Exception;
    void deleteUser(Integer idUser) throws Exception;
    List<User2Response> list2() throws  Exception;
}
