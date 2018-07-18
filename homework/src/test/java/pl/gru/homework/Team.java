package pl.gru.homework;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

public class Team {
    @NotNull
    @Column
    String name;

    @NotNull
    @Column
    String city;

}
