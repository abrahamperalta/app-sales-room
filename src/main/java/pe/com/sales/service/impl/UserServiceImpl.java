package pe.com.sales.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import pe.com.sales.mapper.UserRequest;
import pe.com.sales.mapper.UserResponse;
import pe.com.sales.mapper.dto.User2Response;
import pe.com.sales.mapper.dto.UserMapper;
import pe.com.sales.persistence.entity.UserEntity;
import pe.com.sales.persistence.repository.UserRepository;
import pe.com.sales.service.UserService;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class UserServiceImpl  implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userDTO;


    @Override
    public UserResponse saveUser(UserRequest userRequest) throws Exception {
        final UserEntity entity = userDTO.toUserEntity(userRequest);

        return userDTO.toUserResponse(userRepository.save(entity));

    }

    @Override
    public UserResponse updateUser(UserRequest userRequest) throws Exception {
        return null;
    }

    @Override
    public List<UserResponse> listUser() throws Exception {
        return  null;
    }

    @Override
    public User getUser(Integer idUser) throws Exception {
        return null;
    }

    @Override
    public void deleteUser(Integer idUser) throws Exception {

    }

    /**
     * @return
     * @throws Exception
     */
    @Override
    public List<User2Response> list2() throws Exception {
        return  userDTO.asUser2Response(userRepository.getListUsers());
    }
}
