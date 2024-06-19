package com.anime.animeLibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.anime.animeLibrary.beans.anime;

import java.util.Arrays;

@Controller
public class AnimeController {

    @GetMapping("/anime-list")
    public String index(Model model) {
        model.addAttribute(
                "animeList",
                anime.getAnimeList ());
        return "index";
    }
}
