package data.dto;

public class UserDTO {
    private Long id;
    private String email;
    private String area;
    private String password;

    public UserDTO() {
    }

    public UserDTO(String email, String area) {
        this.email = email;
        this.area = area;
    }

    public UserDTO(String email, String area,  String password) {
        this.email = email;
        this.area = area;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


}

