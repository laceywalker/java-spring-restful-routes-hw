package com.example.OneToManyHW.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @OneToMany(mappedBy = "user")
    private List<Folder> usersFolders;


    public User(String userName){
        this.userName = userName;
        this.usersFolders = new ArrayList<>();
    }

    public User(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return userName;
    }

    public void setName(String userName) {
        this.userName = userName;
    }

    public List<Folder> getUsersFolders() {
        return usersFolders;
    }

    public void setUsersFolders(List<Folder> usersFolders) {
        this.usersFolders = usersFolders;
    }
}
