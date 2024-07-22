package dev.subhajit.bookmyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Theater extends BaseModel{
    private String name;
    private String address;

    public Theater(){

    }
    public Theater(String name, String address){
        this.name = name;
        this.address = address;
    }
    @OneToMany
    private List<Auditorium> auditoriums;
}
