package pl.awsb.remotefoodappbe.service;

import org.springframework.stereotype.Service;
import pl.awsb.remotefoodappbe.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void deleteUser(Long userId);

    void updateUser(User user);

    List<User> getUser(List<Long> userId);

}
