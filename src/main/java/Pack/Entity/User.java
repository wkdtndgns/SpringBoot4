package Pack.Entity;
import javax.persistence.*;

@Entity
@Table(name = "t_user") // 테이블 이름을 'user'로 설정. 만약 테이블 이름이 다르다면, 이 부분을 적절하게 변경해 주세요.
public class User {

    @Id
    @Column(name = "userid", nullable = false)
    private String userId;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "is_approved", nullable = false)
    private boolean isApproved;

    @Column(name = "Name")
    private String name;

    // getters, setters, constructors, etc.

    public User() {

    }

    public User(String userId, String password, boolean isApproved, String name) {
        this.userId = userId;
        this.password = password;
        this.isApproved = isApproved;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
