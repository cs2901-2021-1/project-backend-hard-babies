package data.dto;

public class UserDTO {
    private Long id;
    private String email;
    private String area;
    private String firstName;
    private String lastName;

    public UserDTO(){}

    public UserDTO(String email, String area){
        this.email =email;
        this.area =area;
    }

    public UserDTO(String email, String area, String firstName, String lastName){
        this.email =email;
        this.area =area;
        this.firstName= firstName;
        this.lastName= lastName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

