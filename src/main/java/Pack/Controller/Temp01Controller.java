package Pack.Controller;

import Pack.Entity.Temp01;
import Pack.Service.Temp01Service;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/temp01")
public class Temp01Controller {

  private final Temp01Service temp01Service;

  @Autowired
  public Temp01Controller(Temp01Service temp01Service) {
    this.temp01Service = temp01Service;
  }

  @GetMapping
  public List<Temp01> getAllTemp01() {
    return temp01Service.getAllTemp01();
  }

  @GetMapping("/{id}")
  public Temp01 getTemp01ById(@PathVariable int id) {
    return temp01Service.getTemp01ById(id);
  }

  @PostMapping("/bulk")
  public List<Temp01> createTemp01Bulk(@RequestBody List<Temp01> temp01List) {
    return temp01List.stream()
        .map(temp01Service::saveTemp01)
        .collect(Collectors.toList());
  }
  @PostMapping
  public Temp01 createTemp0(@RequestBody Temp01 temp0) {
    return temp01Service.saveTemp01(temp0);
  }

  @PutMapping("/{id}")
  public Temp01 updateTemp01(@PathVariable int id, @RequestBody Temp01 temp01) {
    Temp01 existingTemp01 = temp01Service.getTemp01ById(id);
    existingTemp01.setName1(temp01.getName1());
    existingTemp01.setName2(temp01.getName2());
    existingTemp01.setName3(temp01.getName3());
    existingTemp01.setName4(temp01.getName4());
    existingTemp01.setName5(temp01.getName5());
    existingTemp01.setName6(temp01.getName6());
    existingTemp01.setName7(temp01.getName7());
    return temp01Service.saveTemp01(existingTemp01);
  }

  @DeleteMapping("/{id}")
  public void deleteTemp01(@PathVariable int id) {
    temp01Service.deleteTemp01(id);
  }
}
