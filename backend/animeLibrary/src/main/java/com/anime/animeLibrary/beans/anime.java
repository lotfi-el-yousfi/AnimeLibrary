package com.anime.animeLibrary.beans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "your_entity_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class anime {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "url")
    private String url;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Getter
    private static List<anime> animeList = new ArrayList<>();

    public anime(String title, String url, String imageUrl) {
        this.title = title;
        this.url = url;
        this.imageUrl = imageUrl;
    }

    public static void addAnime(anime anime) {
        animeList.add(anime);
    }
}
