package com.anime.animeLibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.anime.animeLibrary.beans.anime;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class AnimeController {

    @GetMapping("/anime-list")
    public String index(Model model) {
        model.addAttribute(
                "animeList",
                anime.getAnimeList());
        return "index";
    }

    @GetMapping("/anime-list/title/{queryTitle}")
    public String findAnimeByName(@PathVariable(required = false) String queryTitle, Model model) {
        System.out.println(queryTitle);

        List<anime> foundedAnimes = anime.getAnimeList()
                .stream()
                .filter(e -> e.getTitle().toUpperCase().startsWith(queryTitle.toUpperCase()))
                .collect(Collectors.toList());

        model.addAttribute("animeList", foundedAnimes);
        return "showAnime";
    }

    @GetMapping("/anime-list/id/{queryId}")
    public String findAnimeByid(@PathVariable(required = false) String queryId, Model model) {
        System.out.println(queryId);

//          Optional<anime> foundedAnime  =  anime.getAnimeList()
//                .stream()
//                .filter(e -> e.getId() == Integer.valueOf(queryId))
//                .findFirst() ;

        System.out.println(anime.getAnimeList().get(Integer.valueOf(queryId)));
        model.addAttribute("animeList", anime.getAnimeList().get(Integer.valueOf(queryId)));
        return "showAnime";
    }
}
