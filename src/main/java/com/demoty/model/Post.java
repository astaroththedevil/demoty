package com.demoty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "post_id")
    private Integer id;

    @Column(name = "top_text")
    private String topText;

    @Column(name = "bottom_text")
    private String bottomText;

    @Lob
    @Column(name = "image")
    private byte[] image;

    @Column(name = "date_of_adding_post")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
