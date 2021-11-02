package com.homeproject.blog.backend.business.models.DTO;

public class UserDTO {
    private Long id;
    private String name;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private RoleTypeDTO role;

    public UserDTO (Long id, String name, String firstName, String lastName, String email, String password, RoleTypeDTO role) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public UserDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleTypeDTO getRole() {
        return role;
    }

    public void setRole(RoleTypeDTO role) {
        this.role = role;
    }
}
