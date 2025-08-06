package pe.com.sales.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.sales.persistence.entity.UserEntity;
import pe.com.sales.proyections.UsersProyections;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {


    @Query(value = "SELECT  s.user_id as usersId, " +
            " first_name as firstName, id_number as idNumber " +
            " FROM  users s ", nativeQuery = true)
    public List<UsersProyections> getListUsers();
}
