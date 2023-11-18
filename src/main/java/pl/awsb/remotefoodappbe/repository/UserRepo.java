package pl.awsb.remotefoodappbe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.awsb.remotefoodappbe.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    void updateById(User user, Long id);
}
