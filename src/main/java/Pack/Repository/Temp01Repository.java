package Pack.Repository;

import Pack.Entity.Temp01;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Temp01Repository extends JpaRepository<Temp01, Integer> {

  // Additional custom query methods, if needed

}
