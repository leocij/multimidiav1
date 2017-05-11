package trabalho.v3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import trabalho.v3.model.Users;

public interface UserRepository extends JpaRepository<Users, String> {

}
