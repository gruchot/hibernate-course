package pl.gru.homework;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Team")
public class Team {
    @NotNull
    @Column
    String name;

    @NotNull
    @Column
    String city;

}
