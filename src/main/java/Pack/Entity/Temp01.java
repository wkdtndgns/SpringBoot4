package Pack.Entity;

import javax.persistence.*;

@Entity
@Table(name = "t_temp02")
public class Temp01 {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "name1", nullable = false)
  private String name1;

  @Column(name = "name2", nullable = false)
  private String name2;

  @Column(name = "name3", nullable = false)
  private String name3;

  @Column(name = "name4", nullable = false)
  private String name4;

  @Column(name = "name5", nullable = false)
  private String name5;

  @Column(name = "name6", nullable = false)
  private String name6;

  @Column(name = "name7", nullable = false)
  private String name7;

  public Temp01(String name1, String name2, String name3, String name4, String name5, String name6, String name7) {
    this.name1 = name1;
    this.name2 = name2;
    this.name3 = name3;
    this.name4 = name4;
    this.name5 = name5;
    this.name6 = name6;
    this.name7 = name7;
  }

  public Temp01() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName1() {
    return name1;
  }

  public void setName1(String name1) {
    this.name1 = name1;
  }

  public String getName2() {
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }

  public String getName3() {
    return name3;
  }

  public void setName3(String name3) {
    this.name3 = name3;
  }

  public String getName4() {
    return name4;
  }

  public void setName4(String name4) {
    this.name4 = name4;
  }

  public String getName5() {
    return name5;
  }

  public void setName5(String name5) {
    this.name5 = name5;
  }

  public String getName6() {
    return name6;
  }

  public void setName6(String name6) {
    this.name6 = name6;
  }

  public String getName7() {
    return name7;
  }

  public void setName7(String name7) {
    this.name7 = name7;
  }
}
