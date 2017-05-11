package trabalho.v3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import trabalho.v3.model.Authorities;

public interface AuthorityRepository extends JpaRepository<Authorities, String> {

}
