package data.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import config.GlobalConstants;
import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name ="users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")}
)

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Email
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

    @JsonIgnore
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
