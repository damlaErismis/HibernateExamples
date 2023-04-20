package com.bilgeadam.entity;

import javax.persistence.*;
import java.util.Date;


/**
 * content,
 * date,
 * user
 */

@Entity
@Table(name = "tblposts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private Date date = new Date();
    private Long userId; //user'ın id'si

    public Post(String content, Date date, Long userId) {
        this.content = content;
        this.date = date;
        this.userId = userId;
    }

    public Post(String content, Long userId) {
        this.content = content;
        this.userId = userId;
    }

    public Post() {
    }
}
