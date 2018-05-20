package models;

import javax.persistence.*;
import java.util.Calendar;


@Entity
@Table(name = "managers")
public class Manager {
    Team team;

    public Manager(String name, int age) {
        super(name, age);

    }

    public Manager() {
    }

    @OneToOne()
    @PrimaryKeyJoinColumn
    public Team getTeam() {
        return this.team;
    }


    public void setTeam(Team team) {
        this.team = team;
    }
}