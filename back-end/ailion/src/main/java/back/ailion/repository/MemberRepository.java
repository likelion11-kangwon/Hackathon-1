package back.ailion.repository;

import back.ailion.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<User, Long> {

}