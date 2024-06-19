package com.anime.animeLibrary.beans;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class anime {

    String title;
    String url;
    String imageUrl;

    static List<anime> animeList = new ArrayList<>();

    public static List<anime> getAnimeList() {
        return animeList;
    }

    public static void setAnimeList(anime a) {
        animeList.add(a);
    }
}
