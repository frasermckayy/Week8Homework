package models;

import javax.persistence.*;



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

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}


