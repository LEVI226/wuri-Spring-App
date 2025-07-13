package bf.securitywithjwt.repository;
import bf.securitywithjwt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
