package hellojpa;

import com.sun.org.apache.bcel.internal.generic.LOR;

import javax.persistence.*;


@Entity
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @ManyToOne//Member입장
    @JoinColumn(name = "TEAM_ID")
    private Team team;
//    @Column(name = "TEAM_ID")
//    private Long teamId;


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

    public void setTeam(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

//    public void changeTeam(Team team) {
//        this.team = team;
//        team.getMembers().add(this);
//    }
}


