package com.demoty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "user_id")
    private Integer id;

    @Column(name = "login")
    @Size(min = 6, max = 30, message = "Login must be at least 6 and at most 30 characters long.")
    private String login;

    @Column(name = "password")
    @Size(min = 8, max = 30, message = "Password must be at least 6 and at most 30 characters long.")
    private String password;

    @Column(name = "email")
    @Email
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;
}
