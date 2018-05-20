package models;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player {
    Team team;

    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);

    }

    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name ="team_id")
    public Team getTeam() {
        return this.team;
    }


    public void setTeam(Team team) {
        this.team = team;
    }
}