package data.dto;

public class UserDTO {
    private String email;
    private String area;

    public UserDTO(){}
    public UserDTO(String email, String area){
        this.email =email;
        this.area =area;
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

