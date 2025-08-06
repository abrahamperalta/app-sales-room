package pe.com.sales.proyections;

import org.springframework.beans.factory.annotation.Value;

public interface UsersProyections {

    @Value("#{target.usersId}")
    Integer getUsersId();

    @Value("#{target.firstName}")
    String getFirstName();

    @Value("#{target.idNumber}")
    String getIdNumber();

    String getIdNewNumber();
}
