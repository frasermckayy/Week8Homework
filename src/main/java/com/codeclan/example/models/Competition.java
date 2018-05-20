package models;

import javax.persistence.*;
import java.util.List;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Competition {
    private int id;
    private String name;
    private List<Team> teams;

    public Competition() {
    }

    public Competition(String name) {
        this.name = name;
        this.teams = new ArrayList<Team>();

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="names")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name="teams")
    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}


