package me.afua.artisteforms;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String title;

    //There are many songs, but each of them is led by ONE artiste.
    //The Artiste's ID is repsresented in the song table as leadArtiste
    @ManyToMany()
    private Set<Artiste> leadArtiste;

    public Song() {
        leadArtiste = new HashSet<>();
    }

    public Song(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Artiste> getLeadArtiste() {
        return leadArtiste;
    }

    public void setLeadArtiste(Set<Artiste> leadArtiste) {
        this.leadArtiste = leadArtiste;
    }
}
