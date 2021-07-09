package data.entities;
import config.GlobalConstants;
import javax.persistence.*;

@Entity
@Table(name ="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email", updatable = false, length= GlobalConstants.DB_EMAIL_LENGTH )
    private String email;

    @Column(name = "area", updatable = true, length= GlobalConstants.DB_AREA_LENGTH )
    private String area;

    public User(){}

    public User(String email){
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getArea() {
        return area;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setArea(String area) { this.area = area; }
}
