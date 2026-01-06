package org.socialmeli.socialmeli.domain;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false)
    private boolean seller;

    public User() {}

    public User(Long id, String name, boolean seller) {
        this.id = id;
        this.name = name;
        this.seller = seller;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public boolean isSeller() {

        return seller;

    }

    public void setId(Long id) {this.id = id; }
    public void setName(String name) {this.name = name; }
    public void setSeller(boolean seller) {this.seller = seller; }
}
