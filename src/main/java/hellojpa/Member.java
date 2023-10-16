package hellojpa;

import com.sun.org.apache.bcel.internal.generic.LOR;

import javax.persistence.*;
import java.time.*;
import java.util.Date;

@Entity
public class Member {
    @Id //pk맵핑
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",nullable = false)
    private String username;

    public Member() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}

