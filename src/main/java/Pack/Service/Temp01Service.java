package Pack.Service;

import Pack.Entity.Temp01;
import Pack.Repository.Temp01Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class Temp01Service {

  private final Temp01Repository repository;

  @Autowired
  public Temp01Service(Temp01Repository repository) {
    this.repository = repository;
  }

  public List<Temp01> getAllTemp01() {
    return repository.findAll();
  }

  public Temp01 getTemp01ById(int id) {
    return repository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Invalid Temp01 ID: " + id));
  }

  public Temp01 saveTemp01(Temp01 tTemp01) {
    return repository.save(tTemp01);
  }

  public void deleteTemp01(int id) {
    repository.deleteById(id);
  }

  // Additional service methods, if needed

}
