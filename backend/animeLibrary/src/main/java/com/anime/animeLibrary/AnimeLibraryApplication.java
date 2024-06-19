package com.anime.animeLibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.anime.animeLibrary.beans.anime;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class AnimeLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnimeLibraryApplication.class, args);

        anime.addAnime(new anime(
                "Loop 7-kaime no Akuyaku Reijou wa, Moto Tekikoku de Jiyuu Kimama na Hanayome Seikatsu wo Mankitsu suru ",
                "https://shahiid-anime.net/series/loop-7-kaime-no-akuyaku-reijou-wa-moto-tekikoku-de-jiyuu-kimama-na-hanayome-seikatsu-wo-mankitsu-suru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/140617.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Saikyou Tank no Meikyuu Kouryaku: Tairyoku 9999 no Rare Skill-mochi Tank, Yuusha Party wo Tsuihou sareru ",
                "https://shahiid-anime.net/series/saikyou-tank-no-meikyuu-kouryaku-tairyoku-9999-no-rare-skill-mochi-tank-yuusha-party-wo-tsuihou-sareru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/140093.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kekkon Yubiwa Monogatari ",
                "https://shahiid-anime.net/series/kekkon-yubiwa-monogatari-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139991.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Pon no Michi ",
                "https://shahiid-anime.net/series/pon-no-michi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138961.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Momochi-san Chi no Ayakashi Ouji ",
                "https://shahiid-anime.net/series/momochi-san-chi-no-ayakashi-ouji-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139441.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Chiyu Mahou no Machigatta Tsukaikata ",
                "https://shahiid-anime.net/series/chiyu-mahou-no-machigatta-tsukaikata-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/140235.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Sokushi Cheat ga Saikyou sugite, Isekai no Yatsura ga Marude Aite ni Naranai n desu ga. ",
                "https://shahiid-anime.net/series/sokushi-cheat-ga-saikyou-sugite-isekai-no-yatsura-ga-marude-aite-ni-naranai-n-desu-ga-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139673.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Sasaki to Pii-chan ",
                "https://shahiid-anime.net/series/sasaki-to-pii-chan-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139672.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Dungeon Meshi ",
                "https://shahiid-anime.net/series/dungeon-meshi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/140374.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Mato Seihei no Slave ",
                "https://shahiid-anime.net/series/mato-seihei-no-slave-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138908.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Mahou Shoujo ni Akogarete ",
                "https://shahiid-anime.net/series/mahou-shoujo-ni-akogarete-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139345.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Ishura ",
                "https://shahiid-anime.net/series/ishura-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/140122.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Isekai de Mofumofu Nadenade suru Tame ni Ganbattemasu. ",
                "https://shahiid-anime.net/series/isekai-de-mofumofu-nadenade-suru-tame-ni-ganbattemasu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139564.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Burn the Witch ",
                "https://shahiid-anime.net/series/burn-the-witch-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139282.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Onmyouji ",
                "https://shahiid-anime.net/series/onmyouji-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139317.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Daa! Daa! Daa! ",
                "https://shahiid-anime.net/series/daa-daa-daa-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/21166.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Akuma-kun (ONA) ",
                "https://shahiid-anime.net/series/akuma-kun-ona-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/137452.jpg?resize=200%2C281&ssl=1"
        ));
        anime.addAnime(new anime(
                "Hikikomari Kyuuketsuki no Monmon ",
                "https://shahiid-anime.net/series/hikikomari-kyuuketsuki-no-monmon-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/137893.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Biao Ren: Blades of the Guardians ",
                "https://shahiid-anime.net/series/biao-ren-blades-of-the-guardians-%d9%85%d8%aa%d8%b1%d8%ac%d9%85%d8%a9/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/110585.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kusuriya no Hitorigoto ",
                "https://shahiid-anime.net/series/kusuriya-no-hitorigoto-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138033.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Nanatsu no Taizai: Mokushiroku no Yonkishi ",
                "https://shahiid-anime.net/series/nanatsu-no-taizai-mokushiroku-no-yonkishi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138530.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Houkago Shounen Hanako-kun ",
                "https://shahiid-anime.net/series/houkago-shounen-hanako-kun-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138031.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kimi no Koto ga Daidaidaidaidaisuki na 100-nin no Kanojo ",
                "https://shahiid-anime.net/series/kimi-no-koto-ga-daidaidaidaidaisuki-na-100-nin-no-kanojo-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/136764.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Seiken Gakuin no Makentsukai ",
                "https://shahiid-anime.net/series/seiken-gakuin-no-makentsukai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138529.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Undead Unluck ",
                "https://shahiid-anime.net/series/undead-unluck-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138410.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Bokura no Ameiro Protocol ",
                "https://shahiid-anime.net/series/bokura-no-ameiro-protocol-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138465.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Buta no Liver wa Kanetsu Shiro ",
                "https://shahiid-anime.net/series/buta-no-liver-wa-kanetsu-shiro-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138383.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kikansha no Mahou wa Tokubetsu desu ",
                "https://shahiid-anime.net/series/kikansha-no-mahou-wa-tokubetsu-desu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138532.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tearmoon Teikoku Monogatari: Dantoudai kara Hajimaru, Hime no Tensei Gyakuten Story ",
                "https://shahiid-anime.net/series/tearmoon-teikoku-monogatari-dantoudai-kara-hajimaru-hime-no-tensei-gyakuten-story-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/tearmoon-teikoku-monogatari-dantoudai-kara-hajimaru-hime-no-tensei-gyakuten-story-tearmoon-empire.269205.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Megumi no Daigo: Kyuukoku no Orange ",
                "https://shahiid-anime.net/series/megumi-no-daigo-kyuukoku-no-orange-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138934.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Hametsu no Oukoku ",
                "https://shahiid-anime.net/series/hametsu-no-oukoku-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138189.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Zanting! Rang Wo Cha Gonglue ",
                "https://shahiid-anime.net/series/zanting-rang-wo-cha-gonglue-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/125585.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Keikenzumi na Kimi to, Keiken Zero na Ore ga, Otsukiai suru Hanashi. ",
                "https://shahiid-anime.net/series/keikenzumi-na-kimi-to-keiken-zero-na-ore-ga-otsukiai-suru-hanashi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138503.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Under Ninja ",
                "https://shahiid-anime.net/series/under-ninja-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/137896.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Konyaku Haki sareta Reijou wo Hirotta Ore ga, Ikenai Koto wo Oshiekomu ",
                "https://shahiid-anime.net/series/konyaku-haki-sareta-reijou-wo-hirotta-ore-ga-ikenai-koto-wo-oshiekomu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/137572.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kamierabi ",
                "https://shahiid-anime.net/series/kamierabi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138318.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "16bit Sensation: Another Layer ",
                "https://shahiid-anime.net/series/16bit-sensation-another-layer-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138395.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Bullbuster ",
                "https://shahiid-anime.net/series/bullbuster-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138192.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Toaru Ossan no VRMMO Katsudouki ",
                "https://shahiid-anime.net/series/toaru-ossan-no-vrmmo-katsudouki-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138531.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shy ",
                "https://shahiid-anime.net/series/shy-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/shy.268829.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kamonohashi Ron no Kindan Suiri ",
                "https://shahiid-anime.net/series/kamonohashi-ron-no-kindan-suiri-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/137123.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Migi to Dali ",
                "https://shahiid-anime.net/series/migi-to-dali-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/134817.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Boushoku no Berserk ",
                "https://shahiid-anime.net/series/boushoku-no-berserk-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138462.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Overtake! ",
                "https://shahiid-anime.net/series/overtake-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/137607.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Dekoboko Majo no Oyako Jijou ",
                "https://shahiid-anime.net/series/dekoboko-majo-no-oyako-jijou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138185.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shangri-La Frontier: Kusoge Hunter, Kamige ni Idoman to su ",
                "https://shahiid-anime.net/series/shangri-la-frontier-kusoge-hunter-kamige-ni-idoman-to-su-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/137973.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Ragna Crimson ",
                "https://shahiid-anime.net/series/ragna-crimson-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/137709.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Sousou no Frieren ",
                "https://shahiid-anime.net/series/sousou-no-frieren-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138006.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Ojou to Banken-kun ",
                "https://shahiid-anime.net/series/ojou-to-banken-kun-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138479.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Boukensha ni Naritai to Miyako ni Deteitta Musume ga S-Rank ni Natteta ",
                "https://shahiid-anime.net/series/boukensha-ni-naritai-to-miyako-ni-deteitta-musume-ga-s-rank-ni-natteta-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/boukensha-ni-naritai-to-miyako-ni-deteitta-musume-ga-s-rank-ni-natteta-my-daughter-left-the-nest-and-returned-an-s-rank-adventurer-s-rank-musume.268597.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Zom 100: Zombie ni Naru made ni Shitai 100 no Koto ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-zom-100-zombie-ni-naru-made-ni-shitai-100-no-koto-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/136408.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Helck ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-helck-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/133302.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shiro Seijo to Kuro Bokushi ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-shiro-seijo-to-kuro-bokushi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/135096.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dark Gathering ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-dark-gathering-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/136736.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " No Guns Life ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-no-guns-life-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104972l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tenka Hyakken: Meiji-kan e Youkoso! ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-tenka-hyakken-meiji-kan-e-youkoso-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102821l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Rifle Is Beautiful ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-rifle-is-beautiful-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/100747l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kabukichou Sherlock",
                "https://shahiid-anime.net/series/kabukichou-sherlock/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102099l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "07-Ghost",
                "https://shahiid-anime.net/series/07-ghost/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/22605.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Houkago Saikoro Club ",
                "https://shahiid-anime.net/series/houkago-saikoro-club-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102526l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Urashimasakatasen no Nichijou ",
                "https://shahiid-anime.net/series/urashimasakatasen-no-nichijou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102367l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Ore wo Suki nano wa Omae dake ka yo ",
                "https://shahiid-anime.net/series/ore-wo-suki-nano-wa-omae-dake-ka-yo-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102797l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " BlackFox",
                "https://shahiid-anime.net/series/blackfox/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/661555d55d71750ccb387d03b9ddb2431569527335_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tsubasa Chronicle",
                "https://shahiid-anime.net/series/tsubasa-chronicle/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/6555.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Nurarihyon no Mago",
                "https://shahiid-anime.net/series/nurarihyon-no-mago/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/75631.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shaman King",
                "https://shahiid-anime.net/series/shaman-king/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/18990.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Suisei no Gargantia",
                "https://shahiid-anime.net/series/suisei-no-gargantia/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/48817.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "oshiete-galko-chan",
                "https://shahiid-anime.net/series/oshiete-galko-chan/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/77845l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Zetsuen no Tempest",
                "https://shahiid-anime.net/series/zetsuen-no-tempest/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/42453.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Black Bullet",
                "https://shahiid-anime.net/series/black-bullet/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/57947.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Soul Eater",
                "https://shahiid-anime.net/series/soul-eater/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/7804.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Log Horizon",
                "https://shahiid-anime.net/series/log-horizon/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/84004.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Nagato Yuki-chan no Shoushitsu ",
                "https://shahiid-anime.net/series/nagato-yuki-chan-no-shoushitsu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/medium_nagato-yuki-chan-no-shoushitsu-185.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Re-Kan! ",
                "https://shahiid-anime.net/series/re-kan/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/medium_re-kan-173.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Samurai Champloo ",
                "https://shahiid-anime.net/series/samurai-champloo/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/29134.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hoshiai no Sora",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-hoshiai-no-sora/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/97991l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Beastars ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-beastars-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102008l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Honzuki no Gekokujou: Shisho ni Naru Tame ni wa Shudan wo Erandeiraremasen ",
                "https://shahiid-anime.net/series/honzuki-no-gekokujou-shisho-ni-naru-tame-ni-wa-shudan-wo-erandeiraremasen-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/105931l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hataage! Kemono Michi ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-hataage-kemono-michi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102343l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Fate/Grand Order: Zettai Majuu Sensen Babylonia ",
                "https://shahiid-anime.net/series/fate-grand-order-zettai-majuu-sensen-babylonia-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/100038l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Chuubyou Gekihatsu Boy ",
                "https://shahiid-anime.net/series/chuubyou-gekihatsu-boy-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99872l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Choujin Koukousei-tachi wa Isekai demo Yoyuu de Ikinuku you desu! ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-choujin-koukousei-tachi-wa-isekai-demo-yoyuu-de-ikinuku-you-desu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99776l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Babylon ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-babylon-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102707l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Azur Lane  اون لاين",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d8%a7%d9%84%d8%ad%d9%84%d9%82%d8%a7%d8%aa-%d8%a7%d9%84%d8%a7%d9%86%d9%85%d9%8a-azur-lane-%d9%85%d8%aa%d8%b1%d8%ac%d9%85%d8%a9-%d8%a7%d9%88%d9%86-%d9%84%d8%a7%d9%8a%d9%86/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102383l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Assassins Pride ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-assassins-pride-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/101026l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "  Ani ni Tsukeru Kusuri wa Nai  اون لاين+تحميل",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d8%a7%d9%84%d8%ad%d9%84%d9%82%d8%a7%d8%aa-ani-ni-tsukeru-kusuri-wa-nai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85%d8%a9-%d8%a7%d9%88%d9%86-%d9%84%d8%a7%d9%8a%d9%86%d8%aa%d8%ad%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/large-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Actors: Songs Connection ",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d8%a7%d9%84%d8%ad%d9%84%d9%82%d8%a7%d8%aa-%d8%a7%d9%84%d8%a7%d9%86%d9%85%d9%8a-actors-songs-connection-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102309l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Mugen no Juunin: Immortal ",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d8%a7%d9%84%d8%ad%d9%84%d9%82%d8%a7%d8%aa-%d8%a7%d9%84%d8%a7%d9%86%d9%85%d9%8a-mugen-no-juunin-immortal-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102516l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shinchou Yuusha: Kono Yuusha ga Ore Tuee Kuse ni Shinchou Sugiru ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-shinchou-yuusha-kono-yuusha-ga-ore-tuee-kuse-ni-shinchou-sugiru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/100941l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "  Sword Art Online: Alicization ",
                "https://shahiid-anime.net/series/sword-art-online-alicization-%d9%85%d8%aa%d8%b1%d8%ac%d9%85%d8%a9/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106255l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Sword Art Online Alternative: Gun Gale Online ",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d8%a7%d9%84%d8%ad%d9%84%d9%82%d8%a7%d8%aa-%d8%a7%d9%84%d8%a7%d9%86%d9%85%d9%8a-sword-art-online-alternative-gun-gale-online-%d9%85%d8%aa%d8%b1%d8%ac%d9%85%d8%a9/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93288l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Ahiru no Sora ",
                "https://shahiid-anime.net/series/ahiru-no-sora-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102719l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Bem ",
                "https://shahiid-anime.net/series/bem-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/98939l-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   dr. slump: arale – chan ",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d8%a7%d9%84%d8%ad%d9%84%d9%82%d8%a7%d8%aa-%d8%a7%d9%86%d9%85%d9%8a-dr-slump-arale-chan-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/dr_slump_arale-chan_1027.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shinreigari ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-shinreigari-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/22691.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Enen no Shouboutai ",
                "https://shahiid-anime.net/series/enen-no-shouboutai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/100716l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Naruto Shippuden ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-naruto-shippuden-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-naruto-shippuden-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/"
        ));
        anime.addAnime(new anime(
                " Kimetsu no Yaiba ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-kimetsu-no-yaiba-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141893.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Nanatsu No Taizai ",
                "https://shahiid-anime.net/series/nanatsu-no-taizai/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/02-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shingeki no Kyojin  ",
                "https://shahiid-anime.net/series/shingeki-no-kyojin/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/110531.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Hunter x Hunter 2011HD",
                "https://shahiid-anime.net/series/hunter-x-hunter-2011-%d9%85%d8%aa%d8%b1%d8%ac%d9%85-2/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/hunter_x_hunter.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Bleach / ",
                "https://shahiid-anime.net/series/bleach-%d8%a8%d9%84%d9%8a%d8%aa%d8%b4/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/126627.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Death Note ",
                "https://shahiid-anime.net/series/death-note/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/s-l1000.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " One Punch Man ",
                "https://shahiid-anime.net/series/one-punch-man/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/71G5MlHrUL._SY550_.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hundred ",
                "https://shahiid-anime.net/series/hundred/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Hundred-animation-visual-art.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Noragami ",
                "https://shahiid-anime.net/series/noragami/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/77809l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mirai Nikki (TV) ",
                "https://shahiid-anime.net/series/mirai-nikki-tv/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/20150619130041Mirai_Nikki_Volume_1_Cover_Italiana.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Deadman Wonderland ",
                "https://shahiid-anime.net/series/deadman-wonderland/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/poster-thumb-2385.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Boku no Hero Academia   ",
                "https://shahiid-anime.net/series/boku-no-hero-academia/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/140306.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Owari no seraph ",
                "https://shahiid-anime.net/series/owari-no-seraph/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Anime_Key_Visual.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tales of Zestiria the X: Saiyaku no Jidai ",
                "https://shahiid-anime.net/series/tales-of-zestiria-the-x-saiyaku-no-jidai/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Tales-of-Zestiria-the-X-Saiyaku-no-Jidai-0.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " D.Gray-man Hallow ",
                "https://shahiid-anime.net/series/d-gray-man-hallow/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/another-exciting-adventures-awaits-allen-walker-a-hero-with-a-powerful-left-arm.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Justice League vs. Teen Titans 2016 ",
                "https://shahiid-anime.net/series/justice-league-vs-teen-titans-2016/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/3T0b4dZI9CI.movieposter_maxres.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Berserk 2016 ",
                "https://shahiid-anime.net/series/berserk-2016/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/berserk-new-kv.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hitori no Shita: The Outcast ",
                "https://shahiid-anime.net/series/hitori-no-shita-the-outcast/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/80346l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Nejimaki Seirei Senki: Tenkyou no Alderamin ",
                "https://shahiid-anime.net/series/nejimaki-seirei-senki-tenkyou-no-alderamin/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/78934l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Taboo Tattoo ",
                "https://shahiid-anime.net/series/taboo-tattoo/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/80197l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Detective Conan ",
                "https://shahiid-anime.net/series/detective-conan/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/9a5e20af1430.original.jpeg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Danganronpa 3: Despair Arc ",
                "https://shahiid-anime.net/series/danganronpa-3-despair-arc/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/fffdf0b7cf531b6b89fab62d402cec311466187504_full-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Days TV ",
                "https://shahiid-anime.net/series/days-tv/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/1461288633_1_1_8457a05c85d7730cbf4b3580093bea7a-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gakusen Toshi Asterisk ",
                "https://shahiid-anime.net/series/gakusen-toshi-asterisk/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/74447l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ajin ",
                "https://shahiid-anime.net/series/ajin/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/77968.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " God Eater ",
                "https://shahiid-anime.net/series/god-eater/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/73852l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Soredemo Sekai wa Utsukushii ",
                "https://shahiid-anime.net/series/soredemo-sekai-wa-utsukushii/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/2713d29d84d627554e7e5bd19b20c5d0.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Charlotte ",
                "https://shahiid-anime.net/series/charlotte/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/74683l255B1255D1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Danganronpa ",
                "https://shahiid-anime.net/series/danganronpa/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/57689l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sakurasou no Pet na Kanojo ",
                "https://shahiid-anime.net/series/sakurasou-no-pet-na-kanojo/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/825.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hai To Gensou No Grimgar ",
                "https://shahiid-anime.net/series/hai-to-gensou-no-grimgar/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/77976.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Phantasy Star Online 2 The Animation ",
                "https://shahiid-anime.net/series/phantasy-star-online-2-the-animation/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Pso2_anime_poster1clean.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Musaigen no Phantom World ",
                "https://shahiid-anime.net/series/musaigen-no-phantom-world/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/961d72f6b3825bca53b772996d47eae91452021340_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " DanMachi ",
                "https://shahiid-anime.net/series/danmachi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/108380l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Phantom Requiem For The Phantom ",
                "https://shahiid-anime.net/series/phantom-requiem-for-the-phantom/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Phantom_Requiem_for_the_Phantom_DVD_Cover.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gate: Jieitai Kanochi nite, Kaku Tatakaeri ",
                "https://shahiid-anime.net/series/gate-jieitai-kanochi-nite-kaku-tatakaeri/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/85a5d8cc2972ae422158be7069076be41435936212_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gate 2nd Season ",
                "https://shahiid-anime.net/series/gate-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/gate-saison-2-visuel.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hellsing ",
                "https://shahiid-anime.net/series/hellsing/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Dvd01l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gangsta ",
                "https://shahiid-anime.net/series/gangsta/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/GANGSTA_ANIME_POSTER.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Blood-c ",
                "https://shahiid-anime.net/series/blood-c/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/1Blood-C-The-Last-Dark.jpeg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Koutetsujou No Kabaneri ",
                "https://shahiid-anime.net/series/koutetsujou-no-kabaneri/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/koutetsujou-no-kabaneri.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ushio to Tora (TV) ",
                "https://shahiid-anime.net/series/ushio-to-tora-tv/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/74945l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " kiseijuu-sei-no-kakuritsu ",
                "https://shahiid-anime.net/series/kiseijuu-sei-no-kakuritsu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Er6ebY.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Akagami No Shirayuki-Hime ",
                "https://shahiid-anime.net/series/akagami-no-shirayuki-hime/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Akagami-no-Shirayuki-hime-anime-imagen-promocional.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Angel Beats ",
                "https://shahiid-anime.net/series/angel-beats/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Angel_Beats_game_cover.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sword Art Online ",
                "https://shahiid-anime.net/series/sword-art-online/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/poster-thumb-39.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   هايكيوا Haikyuu!! ",
                "https://shahiid-anime.net/series/haikyuu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/596e47532d686104209150725120162b43c831c9_hq.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Big Order ",
                "https://shahiid-anime.net/series/big-order/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/u7D3WN1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tokyo Ghoul ",
                "https://shahiid-anime.net/series/tokyo-ghoul/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/tokyo_ghoul_5787.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Bungou Stray Dogs ",
                "https://shahiid-anime.net/series/bungou-stray-dogs/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/tumblr_o5v1esBmX61qmlmyuo1_1280.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Prince of Stride: Alternative ",
                "https://shahiid-anime.net/series/prince-of-stride-alternative/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/77842l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Terra Formars ",
                "https://shahiid-anime.net/series/terra-formars/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/67117l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ore Monogatari ",
                "https://shahiid-anime.net/series/ore-monogatari/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/69455l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Skip Beat ",
                "https://shahiid-anime.net/series/skip-beat/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/4bbe3a679c7365d16dd49c9d78ae992e1279142023_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Fate Zero ",
                "https://shahiid-anime.net/series/fate-zero/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Fate.zero_.full_.1222758.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shigatsu wa Kimi no Uso ",
                "https://shahiid-anime.net/series/shigatsu-wa-kimi-no-uso/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Your_Lie_in_April_Poster.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " One Piece/ون بيس ",
                "https://shahiid-anime.net/series/one-piece-%d9%88%d9%86-%d8%a8%d9%8a%d8%b3/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/bandicam-2019-07-26-23-15-26-775.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Danganronpa 3: Future Arc ",
                "https://shahiid-anime.net/series/danganronpa-3-future-arc/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Danganronpa-3.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " 91 Days ",
                "https://shahiid-anime.net/series/91-days/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Avilio.91.Days_.full_.2020495.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Orange ",
                "https://shahiid-anime.net/series/orange/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/09f8a5ce297476499e084b564ab8dc361455683923_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "    Shokugeki no Souma ",
                "https://shahiid-anime.net/series/shokugeki-no-souma/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/f89fe53aa5941bd52e58bf7b009ae7451584697036_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sousei no Onmyouji ",
                "https://shahiid-anime.net/series/sousei-no-onmyouji/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/85d5474f751658fbced809e2fdd7fa93.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Fullmetal Alchemist: Brotherhood ",
                "https://shahiid-anime.net/series/fullmetal-alchemist-brotherhood/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/full-metal-alchemist.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Rakudai Kishi no Cavalry ",
                "https://shahiid-anime.net/series/rakudai-kishi-no-cavalry/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/poster-thumb-53936.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Code Geass: Hangyaku no Lelouch ",
                "https://shahiid-anime.net/series/code-geass-hangyaku-no-lelouch/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/pN1IAywSOr89CCbzDFEgYSuGb30.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Code Geass: Hangyaku no Lelouch R2 ",
                "https://shahiid-anime.net/series/code-geass-hangyaku-no-lelouch-r2/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/code-geass-r21.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dansai Bunri no Crime Edge ",
                "https://shahiid-anime.net/series/dansai-bunri-no-crime-edge/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/dansai-bunri-no-crime-edge-1.png?resize=200%2C272&ssl=1"
        ));
        anime.addAnime(new anime(
                " Magi: The Labyrinth of Magic ",
                "https://shahiid-anime.net/series/magi-the-labyrinth-of-magic/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/53539l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Magi- The Kingdom of Magic S2 ",
                "https://shahiid-anime.net/series/magi-the-kingdom-of-magic-s2/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/MagiThe-Kingdom-of-Magic@lovestoorey210.blogspot.com@-@www.lovestoorey210.com@se7ro.net@M7agic.com@BY@love_stoorey210-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Btooom ",
                "https://shahiid-anime.net/series/btooom/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/718.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Boku dake ga Inai Machi ",
                "https://shahiid-anime.net/series/boku-dake-ga-inai-machi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/76932l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kuroko no Basket ",
                "https://shahiid-anime.net/series/kuroko-no-basket/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/kuroko_no_basket_2184.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Zankyou no Terror ",
                "https://shahiid-anime.net/series/zankyou-no-terror/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/zankyou-no-terror.28531.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Bloodivores ",
                "https://shahiid-anime.net/series/bloodivores/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Bloodivores_anime_TV_linsonnia_che_fa_impazzire_e_diventare_vampiri-57c9eab9b0881.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Bubuki Buranki ",
                "https://shahiid-anime.net/series/bubuki-buranki/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/79758l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Bubuki Buranki: Hoshi no Kyojin ",
                "https://shahiid-anime.net/series/bubuki-buranki-hoshi-no-kyojin/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/81429l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shuumatsu no Izetta ",
                "https://shahiid-anime.net/series/shuumatsu-no-izetta/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/a5755a5be986a99f2b5bbd4b89d9b2d01468584104_full.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mahou Shoujo Ikusei Keikaku ",
                "https://shahiid-anime.net/series/mahou-shoujo-ikusei-keikaku/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/mahoushoujoikuseikeikaku2.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kekkai Sensen ",
                "https://shahiid-anime.net/series/kekkai-sensen/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Kekkai_Sensen_Anime_Key_Visual_2.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dragon ball GT/دراغون بول جيتي ",
                "https://shahiid-anime.net/series/dragon-ball-gt-%d8%af%d8%b1%d8%a7%d8%ba%d9%88%d9%86-%d8%a8%d9%88%d9%84-%d8%ac%d9%8a%d8%aa%d9%8a/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/155413.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Chaos : Sekiryuu Senyaku ",
                "https://shahiid-anime.net/series/chaos-sekiryuu-senyaku/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/a52jVkn.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tiger Mask W ",
                "https://shahiid-anime.net/series/tiger-mask-w/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/tigermask-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " (Magi: Sinbad no Bouken (TV ",
                "https://shahiid-anime.net/series/magi-sinbad-no-bouken-tv/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Magi_Adventure_of_Sinbad.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " WWW.Working!! ",
                "https://shahiid-anime.net/series/www-working/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/81704.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hataraku Maou-sama! ",
                "https://shahiid-anime.net/series/hataraku-maou-sama/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/1366097145_1_1_fc03dc353aa17ae7e2d9ee1f4c6db828516cfdf8.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " No Game No Life ",
                "https://shahiid-anime.net/series/no-game-no-life/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/no-game-no-life-online.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Schwarzesmarken ",
                "https://shahiid-anime.net/series/schwarzesmarken/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/849d51d5304ca8f1350bf6c4ea1108891452032224_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Amagi Brilliant Park ",
                "https://shahiid-anime.net/series/amagi-brilliant-park/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/79593.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Seisen Cerberus ",
                "https://shahiid-anime.net/series/seisen-cerberus/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Seisen_Cerberus.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "  و  Mobile Suit Gundam: Iron-Blooded Orphans  ",
                "https://shahiid-anime.net/series/mobile-suit-gundam-iron-blooded-orphans-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/57895709_p0.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Yahari Ore no Seishun Love Come wa Machigatteiru ",
                "https://shahiid-anime.net/series/yahari-ore-no-seishun-love-come-wa-machigatteiru/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104239l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Re:Zero kara Hajimeru Isekai Seikatsu ",
                "https://shahiid-anime.net/series/rezero-kara-hajimeru-isekai-seikatsu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Re-Zero-Kara-Hajimeru-Isekai-Seikatsu.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Touken Ranbu: Hanamaru ",
                "https://shahiid-anime.net/series/touken-ranbu-hanamaru/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/79925l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kuroshitsuji ",
                "https://shahiid-anime.net/series/kuroshitsuji/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Kuroshitsuji.full_.105483.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shakunetsu no Takkyuu Musume ",
                "https://shahiid-anime.net/series/shakunetsu-no-takkyuu-musume/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/80746l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Blood Lad ",
                "https://shahiid-anime.net/series/blood-lad/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/47677.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Digimon Universe: Appli Monsters ",
                "https://shahiid-anime.net/series/digimon-universe-appli-monsters/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/265px-Appmon_poster.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Trickster: Edogawa Ranpo ",
                "https://shahiid-anime.net/series/trickster-edogawa-ranpo/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/80187-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " VIVID STRIKE ",
                "https://shahiid-anime.net/series/vivid-strike/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/wp-1471795012432.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Bungou Stray Dogs 2nd Season ",
                "https://shahiid-anime.net/series/bungou-stray-dogs-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/80542.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Magic-Kyun! Renaissance ",
                "https://shahiid-anime.net/series/magic-kyun-renaissance/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/mcrs_20160315_ma.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Brave Witches ",
                "https://shahiid-anime.net/series/brave-witches/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/81854l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " !! All Out ",
                "https://shahiid-anime.net/series/all-out/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/78649l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Drifters ",
                "https://shahiid-anime.net/series/drifters/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/e502ad9551354d40c3833296ab9f44961470726942_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Lostorage incited WIXOSS ",
                "https://shahiid-anime.net/series/lostorage-incited-wixoss/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/81445.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ajin: Demi-Human 2nd Season ",
                "https://shahiid-anime.net/series/ajin-demi-human-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/2-4.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Occultic:Nine ",
                "https://shahiid-anime.net/series/occulticnine/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/81186l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Soul Buster ",
                "https://shahiid-anime.net/series/soul-buster/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/ccf2aba7d65d3ac54dfac5adc44b3afd1470211673_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Soushin Shoujo Matoi ",
                "https://shahiid-anime.net/series/soushin-shoujo-matoi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/80987l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dragon Ball Z/دراغون بول زد ",
                "https://shahiid-anime.net/series/dragon-ball-z-%d8%af%d8%b1%d8%a7%d8%ba%d9%88%d9%86-%d8%a8%d9%88%d9%84-%d8%b2%d8%af/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/a9673b4713e042f28838d0aed3f7a453-goku-vs-dragonball-z-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Joker Game ",
                "https://shahiid-anime.net/series/joker-game/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Joker-Game.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Natsume Yuujinchou Go ",
                "https://shahiid-anime.net/series/natsume-yuujinchou-go/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/28859l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Flip Flappers ",
                "https://shahiid-anime.net/series/flip-flappers/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/8fb1c912101e9445ff74ee082b82eb121463138870_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "  ون بيس One Piece خاص+أوفات ",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d8%ad%d9%84%d9%82%d8%a7%d8%aa-%d9%88%d9%86-%d8%a8%d9%8a%d8%b3-one-piece-%d8%a7%d9%84%d8%ae%d8%a7%d8%b5%d8%a9%d8%a7%d9%84%d8%a3%d9%88%d9%81%d8%a7%d8%aa-%d9%85%d8%aa%d8%b1/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/SM95Yih.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Naruto Shippuden OVA ",
                "https://shahiid-anime.net/series/naruto-shippuden-ova/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/cartoon-naruto-shippuden-triangle-poster-AQU241075.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dragon Ball Ova ",
                "https://shahiid-anime.net/series/dragon-ball-ova/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/000.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " The Lion King Movies ",
                "https://shahiid-anime.net/series/the-lion-king-movies/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/MOV_18abe4a2_b.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mahou Sensou ",
                "https://shahiid-anime.net/series/mahou-sensou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/58103l-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Ao no Exorcist ",
                "https://shahiid-anime.net/series/ao-no-exorcist/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138381.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Nisekoi ",
                "https://shahiid-anime.net/series/nisekoi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/6-5.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ao no Kanata no Four Rhythm ",
                "https://shahiid-anime.net/series/ao-no-kanata-no-four-rhythm/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/77839.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " ReLIFE ",
                "https://shahiid-anime.net/series/relife/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/06f2c7030f794acf0bfdd34e5735bd191465708255_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tanaka-kun wa Itsumo Kedaruge ",
                "https://shahiid-anime.net/series/tanaka-kun-wa-itsumo-kedaruge/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/78565l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Servamp ",
                "https://shahiid-anime.net/series/servamp/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/80953l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Guilty Crown ",
                "https://shahiid-anime.net/series/guilty-crown/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Guilty-Crown.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Steins;Gate ",
                "https://shahiid-anime.net/series/steinsgate/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/73199l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Baccano ",
                "https://shahiid-anime.net/series/baccano-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/14547.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Akame Ga Kill ",
                "https://shahiid-anime.net/series/akame-ga-kill/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/4fe71ff4ce4cf1b0d13b814d42ba51bc1404629753_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Nanbaka ",
                "https://shahiid-anime.net/series/nanbaka-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/81399l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Aquarion Evol ",
                "https://shahiid-anime.net/series/aquarion-evol/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/541.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Black★Rock Shooter ",
                "https://shahiid-anime.net/series/black%e2%98%85rock-shooter/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/31473l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mob Psycho 100 ",
                "https://shahiid-anime.net/series/mob-psycho-100/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/125011.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Fairy Tail ",
                "https://shahiid-anime.net/series/fairy-tail/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/81.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kara No Kyoukai ",
                "https://shahiid-anime.net/series/kara-no-kyoukai/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Kara-no-Kyoukai-Japanese-anime_640x1136_iPhone_5_wallpaper.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Durarara!! ",
                "https://shahiid-anime.net/series/durarara/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/25082l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Brave 10 ",
                "https://shahiid-anime.net/series/brave-10/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/1869dedb97a9b25ab567e77d4d1d5cd1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Trigun ",
                "https://shahiid-anime.net/series/trigun/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/22886l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shinrei Tantei Yakumo ",
                "https://shahiid-anime.net/series/shinrei-tantei-yakumo/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/shinrei-tantei-yakumo-3279.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Arata Kangatari ",
                "https://shahiid-anime.net/series/arata-kangatari/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/919.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Young Black Jack ",
                "https://shahiid-anime.net/series/young-black-jack/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Young-Black-Jack-Volume-5-Japanese-Cover.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Plastic Memories ",
                "https://shahiid-anime.net/series/plastic-memories/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/44725fc716f5d59a87bad487c4ea46b61414514490_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hero Tales ",
                "https://shahiid-anime.net/series/hero-tales/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/75193l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ansatsu Kyoushitsu ",
                "https://shahiid-anime.net/series/ansatsu-kyoushitsu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/75639l-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Selector infected WIXOSS ",
                "https://shahiid-anime.net/series/selector-infected-wixoss/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/67027l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Another ",
                "https://shahiid-anime.net/series/another/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/75509l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Yuri!!! on Ice ",
                "https://shahiid-anime.net/series/yuri-on-ice/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/A18191-2291224427.1469808485.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mushishi ",
                "https://shahiid-anime.net/series/mushishi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Mushishi.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Toriko ",
                "https://shahiid-anime.net/series/toriko/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Toriko_3D_Movie_Kaimaku_Gourmet_Adventure.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " GLASSLIP ",
                "https://shahiid-anime.net/series/glasslip/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/60121l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Naruto/Naurto Shippuden ",
                "https://shahiid-anime.net/series/naruto/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/bandicam-2019-10-20-14-51-44-948.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Wolverine ",
                "https://shahiid-anime.net/series/wolverine/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/dd.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Berserk ",
                "https://shahiid-anime.net/series/berserk/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/berserk-7733545.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Black Lagoon ",
                "https://shahiid-anime.net/series/black-lagoon/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/78742l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Black Lagoon 2nd Season ",
                "https://shahiid-anime.net/series/black-lagoon-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/20980.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ao Haru Ride ",
                "https://shahiid-anime.net/series/ao-haru-ride/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/64813l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Utawarerumono: Itsuwari No Kamen ",
                "https://shahiid-anime.net/series/utawarerumono-itsuwari-no-kamen/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Utawarerumono-.Itsuwari.no_.Kamen_.full_.1931630.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Akatsuki no Yona ",
                "https://shahiid-anime.net/series/akatsuki-no-yona/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/64225.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Endride ",
                "https://shahiid-anime.net/series/endride/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Endride.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Air Master ",
                "https://shahiid-anime.net/series/air-master/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/AirMaster.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shigurui ",
                "https://shahiid-anime.net/series/shigurui/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/1-1-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Blade of the Immortal ",
                "https://shahiid-anime.net/series/blade-of-the-immortal/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/74074.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Street Fighter ll V ",
                "https://shahiid-anime.net/series/street-fighter-ll-v/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Street_Fighter_II_V_main_visual.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Grappler Baki ",
                "https://shahiid-anime.net/series/grappler-baki/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/515AQWVP6GL._SY445_.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Golden Time ",
                "https://shahiid-anime.net/series/golden-time/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Golden.Time_.full_.1805869.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Diabolik Lovers ",
                "https://shahiid-anime.net/series/diabolik-lovers/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/6792970dea24081392ab45d083fc10791443978202_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Date A Live ",
                "https://shahiid-anime.net/series/date-a-live/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/qi98miuMe1oB5WWo2lonuKFTq4P.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dragon Ball Super/دراغون بول سوبر ",
                "https://shahiid-anime.net/series/dragon-ball-super-%d8%af%d8%b1%d8%a7%d8%ba%d9%88%d9%86-%d8%a8%d9%88%d9%84-%d8%b3%d9%88%d8%a8%d8%b1/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/bandicam-2019-07-26-23-21-34-152.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " OreShura ",
                "https://shahiid-anime.net/series/oreshura/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/84d66337f5a9da0e55eb27a4b55632cd1357155566_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mahouka koukou no rettousei ",
                "https://shahiid-anime.net/series/mahouka-koukou-no-rettousei/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/61039l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kaze no Stigma ",
                "https://shahiid-anime.net/series/kaze-no-stigma/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/8b62123bba9c65e40d31afdc61c70c6e.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Fune wo Amu ",
                "https://shahiid-anime.net/series/fune-wo-amu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/poster-thumb-106884.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " sakurako san no ashimoto ",
                "https://shahiid-anime.net/series/sakurako-san-no-ashimoto/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/76116l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Little Witch Academia TV ",
                "https://shahiid-anime.net/series/little-witch-academia-tv/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/82299-210x300-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Masamune-kun no Revenge ",
                "https://shahiid-anime.net/series/masamune-kun-no-revenge/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/cdc03c88eaee9915b4fe2db62db108231474672025_full-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Granblue Fantasy The Animation ",
                "https://shahiid-anime.net/series/granblue-fantasy-the-animation/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102410l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " ēlDLIVE ",
                "https://shahiid-anime.net/series/eldlive/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/82348l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tales of Zestiria the X 2nd Season ",
                "https://shahiid-anime.net/series/tales-of-zestiria-the-x-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/63aba810ffccf0440e1e3411975dc128.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Buzzer Beater ",
                "https://shahiid-anime.net/series/buzzer-beater/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/buzzer-beater-1384.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kyoukai no Kanata ",
                "https://shahiid-anime.net/series/kyoukai-no-kanata/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/85468l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Reikenzan: Hoshikuzu-tachi no Utage ",
                "https://shahiid-anime.net/series/reikenzan-hoshikuzu-tachi-no-utage/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/78196l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Fuuka ",
                "https://shahiid-anime.net/series/fuuka/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/6bec34a311c6f055c32ad33ede9a3596_1397453943_large.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Seiren ",
                "https://shahiid-anime.net/series/seiren/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/83471.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Aoharu X Kikanjuu ",
                "https://shahiid-anime.net/series/aoharu-x-kikanjuu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/607855922.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kyousou Giga ",
                "https://shahiid-anime.net/series/kyousou-giga/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/kyousougiga-2013-5718.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " BanG Dream! ",
                "https://shahiid-anime.net/series/bang-dream/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/689b0a10feadc3905e29b3a6ca6351471467828467_full-2.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Schoolgirl Strikers: Animation Channel ",
                "https://shahiid-anime.net/series/schoolgirl-strikers-animation-channel/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/MED-DVD2-35771.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Claymore ",
                "https://shahiid-anime.net/series/claymore/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Claymore.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Yowamushi Pedal ",
                "https://shahiid-anime.net/series/yowamushi-pedal/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/7a36b97db217210884787b989c48b9eb1412362077_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gi(A)Rlish Number ",
                "https://shahiid-anime.net/series/giarlish-number/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/82291l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shakugan no Shana ",
                "https://shahiid-anime.net/series/shakugan-no-shana/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/shakugan-no-shana.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " kaichou wa maid-sama ",
                "https://shahiid-anime.net/series/kaichou-wa-maid-sama/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/02383d4b1cc79f019b1043f2b05eda2a.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " 3-gatsu no Lion ",
                "https://shahiid-anime.net/series/3-gatsu-no-lion/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/3-gatsu-no-lion.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kaitou Joker 4th Season ",
                "https://shahiid-anime.net/series/kaitou-joker-4th-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/kaito-joker-anime.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Towa no Quon ",
                "https://shahiid-anime.net/series/towa-no-quon/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/TowanoQuon2.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Cheating Craft ",
                "https://shahiid-anime.net/series/cheating-craft/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/81891.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Trinity Seven ",
                "https://shahiid-anime.net/series/trinity-seven/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/981211045a13bf64782730e577d399cd1412621473_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hibike! Euphonium ",
                "https://shahiid-anime.net/series/hibike-euphonium/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/ba2c6a7f9e96fe5164c110e1e73ba7ab1428165704_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "  واجزاء  Psycho-Pass ",
                "https://shahiid-anime.net/series/psycho-pass/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Psycho_Pass.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Overlord ",
                "https://shahiid-anime.net/series/overlord/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/74462.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tokyo ESP ",
                "https://shahiid-anime.net/series/tokyo-esp/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/bf9165f48cdfb9fda789e776ab8f2082.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Elsword El Lady ",
                "https://shahiid-anime.net/series/elsword-el-lady/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/400px-Elsword_Anime_Poster.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ore no Imouto ga Konnani Kawaii Wake ga Nai ",
                "https://shahiid-anime.net/series/ore-no-imouto-ga-konnani-kawaii-wake-ga-nai/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Ore-no-Imoto-ga-Konna-ni-Kawaii-Wake-ga-Na.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " DREAM FESTIVAL! ",
                "https://shahiid-anime.net/series/dream-festival/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/81713.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Rokka no Yuusha ",
                "https://shahiid-anime.net/series/rokka-no-yuusha/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/150706095757504249.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " History’s Strongest Disciple Kenichi ",
                "https://shahiid-anime.net/series/historys-strongest-disciple-kenichi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/20140423170246.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Chain Chronicle: Hekuseitasu no Hikari ",
                "https://shahiid-anime.net/series/chain-chronicle-hekuseitasu-no-hikari/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/659fdc090d5d00fccc3e7662647192f81481323284_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Amnesia ",
                "https://shahiid-anime.net/series/amnesia/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/ee0d385e20e9d9ca78ba3ca372fecfe61357577656_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Fairy Tail Ova ",
                "https://shahiid-anime.net/series/fairy-tail-ova-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/114801-15-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " CANAAN ",
                "https://shahiid-anime.net/series/canaan/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Canaan.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " KORO-SENSEI QUEST ",
                "https://shahiid-anime.net/series/koro-sensei-quest/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/4e06585c12dd352d0e4317a1f4d17e541482349665_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hajime no Ippo ",
                "https://shahiid-anime.net/series/hajime-no-ippo/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/hajime_no_ippo_by_uchiha_itasuke-d7ruibk.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Arcana Famiglia ",
                "https://shahiid-anime.net/series/arcana-famiglia/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/07052012_LaFamiglia_showcard.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Baby Steps ",
                "https://shahiid-anime.net/series/baby-steps/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/baby-steps-5888.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Baby Steps 2nd Season ",
                "https://shahiid-anime.net/series/baby-steps-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/73683.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kizumonogatari II: Nekketsu-hen ",
                "https://shahiid-anime.net/series/kizumonogatari-ii-nekketsu-hen/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/80930l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Bounen no Xamdou ",
                "https://shahiid-anime.net/series/bounen-no-xamdou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Xam_d_Lost_Memories.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Cheer Danshi !! ",
                "https://shahiid-anime.net/series/cheer-danshi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/80360.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gintama (2017) ",
                "https://shahiid-anime.net/series/gintama-2017/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/15622209_594782867394420_1755700419413986837_n.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Spiritpact ",
                "https://shahiid-anime.net/series/spiritpact/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Spiritpact-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Youjo Senki ",
                "https://shahiid-anime.net/series/youjo-senki/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/get.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Zombie-loan ",
                "https://shahiid-anime.net/series/zombie-loan/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Zombie-Loan-Vol-1-zombie-loan-4123816-1200-1642.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Flying Witch ",
                "https://shahiid-anime.net/series/flying-witch/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/79113l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Divine Gate ",
                "https://shahiid-anime.net/series/divine-gate/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/MV5BYWQ2MjA0MDAtMTk1Yi00MTM1LWE2ZGItYTJmNmVlZTM5NjA5XkEyXkFqcGdeQXVyNDgyODgxNjE@._V1_FMjpg_UX1000_.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gintama ",
                "https://shahiid-anime.net/series/gintama/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/gintama-1325.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dance with Devils ",
                "https://shahiid-anime.net/series/dance-with-devils/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Dance_with_Devils.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shingeki! Kyojin Chuugakkou ",
                "https://shahiid-anime.net/series/shingeki-kyojin-chuugakkou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/75467.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Fate Grand Order: First Order ",
                "https://shahiid-anime.net/series/fate-grand-order-first-order/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/6a9b9b6ea239be382481eda83c354c761483176773_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Nanbaka 2017 ",
                "https://shahiid-anime.net/series/nanbaka-2017/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/tumblr_oh1e1w5xPu1uq3bnuo1_r1_1280.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Minami Kamakura Koukou Joshi Jitensha-bu ",
                "https://shahiid-anime.net/series/minami-kamakura-koukou-joshi-jitensha-bu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/162198l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shouwa Genroku Rakugo Shinjuu 2nd Season ",
                "https://shahiid-anime.net/series/shouwa-genroku-rakugo-shinjuu-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/77907l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Demi-chan wa Kataritai ",
                "https://shahiid-anime.net/series/demi-chan-wa-kataritai/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/bf00bb9314272a29b058894cf331d6ed1483790667_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Arslan Senki TV ",
                "https://shahiid-anime.net/series/arslan-senki-tv/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/arslan-senki-55a4e9b6f0469-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Arslan Senki (TV): Fuujin Ranbu ",
                "https://shahiid-anime.net/series/arslan-senki-tv-fuujin-ranbu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/80681l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " idol jihen ",
                "https://shahiid-anime.net/series/idol-jihen/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/jp.co_.bbb_.idoljihen_1.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Nyanko Days ",
                "https://shahiid-anime.net/series/nyanko-days/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/44955312e16442374e44088df08e740d.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gabriel DropOut ",
                "https://shahiid-anime.net/series/gabriel-dropout/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/82590l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Urara Meirochou ",
                "https://shahiid-anime.net/series/urara-meirochou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/82429l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Chiruran: Nibun no Ichi ",
                "https://shahiid-anime.net/series/chiruran-nibun-no-ichi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/82948-207x272.jpg?resize=200%2C272&ssl=1"
        ));
        anime.addAnime(new anime(
                " Onihei ",
                "https://shahiid-anime.net/series/onihei/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/main.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hand Shakers ",
                "https://shahiid-anime.net/series/hand-shakers/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/4372f8a574f6d942b6d2e332222d80d61468673177_full.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " ACCA: 13-ku Kansatsu-ka ",
                "https://shahiid-anime.net/series/acca-13-ku-kansatsu-ka/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/82497-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kobayashi-san Chi no Maid Drajon ",
                "https://shahiid-anime.net/series/kobayashi-san-chi-no-maid-drajon/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/kobayashi-san-chi-no-maid-dragon-s-miss-kobayashis-dragon-maid-s.215035.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " One Room ",
                "https://shahiid-anime.net/series/one-room/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/One_Room.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " ChäoS;Child ",
                "https://shahiid-anime.net/series/chaoschild/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/1-10.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Marginal#4: Kiss kara Tsukuru Big Bang ",
                "https://shahiid-anime.net/series/marginal4-kiss-kara-tsukuru-big-bang/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/70e45804c61a114cd1feb16ac8f537ea1484157865_full.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Piace: Watashi no Italian ",
                "https://shahiid-anime.net/series/piace-watashi-no-italian/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/15966079_1181733028528823_5873583169627970816_n.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Forest Fairy Five ",
                "https://shahiid-anime.net/series/forest-fairy-five/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/i6NMKkP.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Chihayafuru ",
                "https://shahiid-anime.net/series/chihayafuru/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/96340l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kono Subarashii Sekai ni Shukufuku wo! ",
                "https://shahiid-anime.net/series/kono-subarashii-sekai-ni-shukufuku-wo/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141268.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " WWE Monday Night Raw ",
                "https://shahiid-anime.net/series/wwe-monday-night-raw/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/WWE-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " WWE SmackDown Live ",
                "https://shahiid-anime.net/series/wwe-smackdown-live/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/svtrtx1466492878.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "عروض شهري WWE",
                "https://shahiid-anime.net/series/%d8%a7%d9%84%d8%b9%d8%b1%d9%88%d8%b6-%d8%a7%d9%84%d8%b4%d9%87%d8%b1%d9%8a%d8%a9-wwe/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/bandicam-2017-01-15-14-27-49-471.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Rewrite ",
                "https://shahiid-anime.net/series/rewrite/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/UXvWiNB.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kemono Friends ",
                "https://shahiid-anime.net/series/kemono-friends/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/ec6804b40827473f478ac1438cd9959a1483995291_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Seiken No Katanakaji ",
                "https://shahiid-anime.net/series/seiken-no-katanakaji/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/175839.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Bakemono no Ko ",
                "https://shahiid-anime.net/series/bakemono-no-ko/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/73540.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Heavy Object ",
                "https://shahiid-anime.net/series/heavy-object/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/555.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Densetsu no Yuusha no Densetsu ",
                "https://shahiid-anime.net/series/densetsu-no-yuusha-no-densetsu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/oyf6onhq.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " ! Long Riders ",
                "https://shahiid-anime.net/series/long-riders/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/82255.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Chou Yuu Sekai: Being the Reality ",
                "https://shahiid-anime.net/series/chou-yuu-sekai-being-the-reality/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/83712.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Moana 2016 ",
                "https://shahiid-anime.net/series/moana-2016/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/moana_ver6.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kyoukai no Rinne ",
                "https://shahiid-anime.net/series/kyoukai-no-rinne/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/73436.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kimi no Na wa ",
                "https://shahiid-anime.net/series/kimi-no-na-wa/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/0ribEcoh7Jr0AMq9GuUg7ZNFvDARr_ltk2O25GFd_Go.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Bakumatsu Kikansetsu Irohanihoheto ",
                "https://shahiid-anime.net/series/bakumatsu-kikansetsu-irohanihoheto/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/79540-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Neppu Kairiku Bushi Road  Movie ",
                "https://shahiid-anime.net/series/neppu-kairiku-bushi-road-movie/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Neppu.Kairiku.Bushi_.Road_.full_.2054797.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Initial D First Stage ",
                "https://shahiid-anime.net/series/initial-d-first-stage/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Initial.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ixion Saga DT ",
                "https://shahiid-anime.net/series/ixion-saga-dt/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Ixion-Saga-DT_lovestoorey210.blogspot.com_-_www.lovestoorey210.com_www.mov.lovestoorey210.com_by_love_stoorey210.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " C Cntrol ",
                "https://shahiid-anime.net/series/c-cntrol/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/0.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Oda Nobuna no Yabou ",
                "https://shahiid-anime.net/series/oda-nobuna-no-yabou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/39249l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Garo: Honoo no Kokuin ",
                "https://shahiid-anime.net/series/garo-honoo-no-kokuin/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/20161201020404Honoo_no_Kokuin.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Garo Guren no Tsuki 2nd Season ",
                "https://shahiid-anime.net/series/garo-guren-no-tsuki-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/76029l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Code:Breaker ",
                "https://shahiid-anime.net/series/codebreaker/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/57251.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Seirei no Moribito ",
                "https://shahiid-anime.net/series/seirei-no-moribito/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/0e98efe352cb5e71d9e892365668d33d.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Blassreiter ",
                "https://shahiid-anime.net/series/blassreiter/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/23760l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Genshiken Nidaime ",
                "https://shahiid-anime.net/series/genshiken-nidaime/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/genshiken-nidaime-5565.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Uta no Prince sama ",
                "https://shahiid-anime.net/series/uta-no-prince-sama-season-1/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Uta-no-Prince-sama-S1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Inazuma Eleven ",
                "https://shahiid-anime.net/series/inazuma-eleven/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Inazuma_Eleven_series_1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Berserk 2nd Season ",
                "https://shahiid-anime.net/series/2017-berserk/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Berserk-2017.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Fukumenkei Noise ",
                "https://shahiid-anime.net/series/fukumenkei-noise/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/DcRE3nZojhvejpnDz6E51c3tNcI.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shingeki no Bahamut: Virgin Soul ",
                "https://shahiid-anime.net/series/shingeki-no-bahamut-virgin-soul/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Shingeki_no_Bahamut_Virgin_Soul_Key_Visual_1-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Zero kara Hajimeru Mahou no Sho ",
                "https://shahiid-anime.net/series/zero-kara-hajimeru-mahou-no-sho/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/3339.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Busou Shoujo Machiavellism ",
                "https://shahiid-anime.net/series/busou-shoujo-machiavellism/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/83995l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shingeki No Bahamut: Genesis ",
                "https://shahiid-anime.net/series/shingeki-no-bahamut-genesis/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Main-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " D.Gray-man ",
                "https://shahiid-anime.net/series/d-gray-man/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/81KQn7MVlTL._SL1500_.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sing 2016 ",
                "https://shahiid-anime.net/series/sing-2016/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/RKFWQy9-copy.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Quan Zhi Gao Shou ",
                "https://shahiid-anime.net/series/quan-zhi-gao-shou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/7d5426972e9ad8ab0615155c68bd73cb-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gin no Guardian ",
                "https://shahiid-anime.net/series/gin-no-guardian/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/462f6995a332c158b2ec8fe1b93ddc151458136346_full-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Rokudenashi Majutsu Koushi to Akashic Records ",
                "https://shahiid-anime.net/series/rokudenashi-majutsu-koushi-to-akashic-records/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/T0pWXNW-copy.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sakurada Reset ",
                "https://shahiid-anime.net/series/sakurada-reset/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/84470-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Uchouten Kazoku ",
                "https://shahiid-anime.net/series/uchouten-kazoku/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Uchoten-Kazoku.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Oushitsu Kyoushi Haine ",
                "https://shahiid-anime.net/series/oushitsu-kyoushi-haine/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/C50jEzBWMAIQzQI.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Re:Creators ",
                "https://shahiid-anime.net/series/recreators/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/85469l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tsuki ga Kirei ",
                "https://shahiid-anime.net/series/tsuki-ga-kirei/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/85173l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sakura Quest ",
                "https://shahiid-anime.net/series/sakura-quest/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/sakuraquest_visual.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Danmachi :Sword Oratoria ",
                "https://shahiid-anime.net/series/danmachi-sword-oratoria/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Sword_Oratoria_Volume_5_Cover.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Eromanga-Sensei ",
                "https://shahiid-anime.net/series/eromanga-sensei/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Eromanga_Sensei_volume_1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kamisama Dolls ",
                "https://shahiid-anime.net/series/kamisama-dolls/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/poster-thumb-20227.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Joukamachi no Dandelion ",
                "https://shahiid-anime.net/series/joukamachi-no-dandelion/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/213cc923d76ce1a15d89b6cd3534731a.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kimi ni Todoke ",
                "https://shahiid-anime.net/series/kimi-ni-todoke/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/kimi-ni-todoke-kimi-ni-todoke-26326331-1739-2560-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Closers: Side Blacklambs ",
                "https://shahiid-anime.net/series/closers-side-blacklambs/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/78304.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Fate/kaleid liner Prisma☆Illya 3rei!! ",
                "https://shahiid-anime.net/series/fate-kaleid-liner-prisma%e2%98%86illya-3rei/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/A17690-2208087353.1462552307.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Fate/kaleid liner Prisma☆Illya ",
                "https://shahiid-anime.net/series/fate-kaleid-liner-prisma%e2%98%86illya/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/b394479eb45b7b137191ed197ff4d3a81467665252_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Darker than Black ",
                "https://shahiid-anime.net/series/darker-than-black/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/DTB_DVD.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Fate/kaleid liner Prisma☆Illya 2wei! ",
                "https://shahiid-anime.net/series/fate-kaleid-liner-prisma%e2%98%86illya-2wei/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/2wei.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Great Teacher Onizuka ",
                "https://shahiid-anime.net/series/great-teacher-onizuka/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Great-Teacher-Onizuka-gto-DVD.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Rurouni Kenshin ",
                "https://shahiid-anime.net/series/rurouni-kenshin-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/bf79f16fb87dbf6003485240832a3ad9.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " InuYasha ",
                "https://shahiid-anime.net/series/inuyasha/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/inuyasha-tv-poster.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Fate/kaleid liner Prisma☆Illya 2wei Herz! ",
                "https://shahiid-anime.net/series/fate-kaleid-liner-prisma%e2%98%86illya-2wei-herz/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Fate_kaleid_liner_Prisma_Illya_2wei_Herz-450x675.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Clockwork Planet ",
                "https://shahiid-anime.net/series/clockwork-planet/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/83460.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Monster Strike ",
                "https://shahiid-anime.net/series/monster-strike/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Monster-Strike-2.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Renai Boukun ",
                "https://shahiid-anime.net/series/renai-boukun/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/84266.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Seikaisuru-Kado ",
                "https://shahiid-anime.net/series/seikaisuru-kado/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/84011l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hinako Note ",
                "https://shahiid-anime.net/series/hinako-note/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/8a31d15a46bc6bd9d61e19981c848b9e1480098887_full.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Toradora ",
                "https://shahiid-anime.net/series/toradora/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/22128.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " ?Shuumatsu Nani Shitemasu ka? Isogashii desu ka? Sukutte Moratte Ii desu ka",
                "https://shahiid-anime.net/series/shuumatsu-nani-shitemasu-ka-isogashii-desu-ka-sukutte-moratte-ii-desu-ka/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/edaff0ce7bb09ea13d1e5636a016a68a1467036494_full-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Donten ni Warau ",
                "https://shahiid-anime.net/series/donten-ni-warau/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/35c5abe109ece675e06a58984ee0ace2.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dagashi Kashi ",
                "https://shahiid-anime.net/series/dagashi-kashi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/gif7d3O.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Atom: The Beginning ",
                "https://shahiid-anime.net/series/atom-the-beginning/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/21830-2rbbT6RX1tE7-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " The Boss Baby 2017 ",
                "https://shahiid-anime.net/series/the-boss-baby-2017/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/boss_baby_ver6.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kamisama no Inai Nichiyoubi ",
                "https://shahiid-anime.net/series/kamisama-no-inai-nichiyoubi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/52127.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Cowboy Bebop 3 ",
                "https://shahiid-anime.net/series/cowboy-bebop-3/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/3dffa91167b0da964d69dbb5832c7f3c.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Blood+ ",
                "https://shahiid-anime.net/series/blood/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/10183l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gekkan Shoujo Nozaki-kun ",
                "https://shahiid-anime.net/series/gekkan-shoujo-nozaki-kun/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/f9fa0b4100432bc8439c9a1725f668e8.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Saishuu Heiki Kanojo ",
                "https://shahiid-anime.net/series/saishuu-heiki-kanojo/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Saishuu-Heiki-Kanojo-900.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "BLACK CLOVER ",
                "https://shahiid-anime.net/series/black-clover/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/a4640e7f185ea1e9237a1c1feec77a92.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Carried by the Wind Tsukikage Ran ",
                "https://shahiid-anime.net/series/carried-by-the-wind-tsukikage-ran/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/DJ-135.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Noblesse: Awakening ",
                "https://shahiid-anime.net/series/noblesse-awakening/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/NW_Chapter_126.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Jormungand: Perfect Order ",
                "https://shahiid-anime.net/series/jormungand-perfect-order/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/73278l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kekkaishi ",
                "https://shahiid-anime.net/series/kekkaishi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/735f052cbb57a1c538ea8b80298bc593.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Rail Wars ",
                "https://shahiid-anime.net/series/rail-wars/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/045f658134f40dd90bef9580e215b8241404452402_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Toaru Kagaku no Railgun ",
                "https://shahiid-anime.net/series/toaru-kagaku-no-railgun/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/3491e4066fd71d0ee94fc000cf2f187a.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " The Law of Ueki ",
                "https://shahiid-anime.net/series/the-law-of-ueki/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/The.Law_.of_.Ueki_.full_.30571.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Beelzebub ",
                "https://shahiid-anime.net/series/beelzebub/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/28013l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shiki ",
                "https://shahiid-anime.net/series/shiki/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/207648-shiki1_super.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " FULL METAL PANIC! ",
                "https://shahiid-anime.net/series/full-metal-panic/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/75259l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Saiyuuki Reload Blast ",
                "https://shahiid-anime.net/series/saiyuuki-reload-blast/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/saiyuki-visual.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Knight’s and Magic ",
                "https://shahiid-anime.net/series/knights-and-magic/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Knights-Magic.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Koe no Katachi ",
                "https://shahiid-anime.net/series/koe-no-katachi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/63d4b5c1-69f8-4a65-be4a-c8ba3f06f33c.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Katsugeki/Touken Ranbu ",
                "https://shahiid-anime.net/series/katsugeki-touken-ranbu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/79229l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Fate/Apocrypha ",
                "https://shahiid-anime.net/series/fate-apocrypha/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Apocrypha_Poster.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Jigoku Shoujo: Yoi no Togi ",
                "https://shahiid-anime.net/series/jigoku-shoujo-yoi-no-togi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/bandicam-2017-05-18-14-11-55-535.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hidan no Aria ",
                "https://shahiid-anime.net/series/hidan-no-aria/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/140117120105828570.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Accel World ",
                "https://shahiid-anime.net/series/accel-world/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87601-accel-world-accel-world-poster.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gantz ",
                "https://shahiid-anime.net/series/gantz/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/3b338f245dd80c8c318d8e88e64f4d3d.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Air Gear ",
                "https://shahiid-anime.net/series/air-gear/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/91839-air-gear-air-gear-poster.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sora no Manimani ",
                "https://shahiid-anime.net/series/sora-no-manimani/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/75491.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Trinity Blood ",
                "https://shahiid-anime.net/series/trinity-blood/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/2pKNI_XgKKQ.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Re: Hamatora: Season 2 ",
                "https://shahiid-anime.net/series/re-hamatora-season-2/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/af7959685c69bcd13d9a8f86ae072935.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hamatora The Animation ",
                "https://shahiid-anime.net/series/hamatora-the-animation/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/ハマトラ-画像.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Rental Magica ",
                "https://shahiid-anime.net/series/rental-magica/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Rental.Magica.full_.1190411.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tokyo Majin Gakuen Kenpucho: Tou ",
                "https://shahiid-anime.net/series/tokyo-majin-gakuen-kenpucho-tou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/A8209-12.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tegamibachi Reverse ",
                "https://shahiid-anime.net/series/tegamibachi-reverse/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/3778004_640px.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Phi Brain: Kami no Puzzle ",
                "https://shahiid-anime.net/series/phi-brain-kami-no-puzzle/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/1343632095_1321044300_phi_brain_kami_no_puzzle_poster.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Reideen ",
                "https://shahiid-anime.net/series/reideen/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/reideen.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ballroom e Youkoso ",
                "https://shahiid-anime.net/series/ballroom-e-youkoso/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/86016.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Nana Maru San Batsu ",
                "https://shahiid-anime.net/series/nana-maru-san-batsu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/tumblr_om5f7tMACd1t01kq6o1_1280-1.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Princess Principal ",
                "https://shahiid-anime.net/series/princess-principal/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/84891l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Isekai Shokudou ",
                "https://shahiid-anime.net/series/isekai-shokudou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/86165l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e TV ",
                "https://shahiid-anime.net/series/youkoso-jitsuryoku-shijou-shugi-no-kyoushitsu-e-tv/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139318.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kakegurui ",
                "https://shahiid-anime.net/series/kakegurui/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/142175.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Koi to Uso ",
                "https://shahiid-anime.net/series/koi-to-uso/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Koi.to_.Uso_.full_.1930668.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Vatican Kiseki Chousakan ",
                "https://shahiid-anime.net/series/vatican-kiseki-chousakan/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/85824l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Youkai Apartment no Yuuga na Nichijou ",
                "https://shahiid-anime.net/series/youkai-apartment-no-yuuga-na-nichijou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/85885l-214x300.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tsure-dure Children ",
                "https://shahiid-anime.net/series/tsure-dure-children/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/155605l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Robomasters The Animated Series ",
                "https://shahiid-anime.net/series/robomasters-the-animated-series/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/84215l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Keppeki Danshi! Aoyama-kun ",
                "https://shahiid-anime.net/series/keppeki-danshi-aoyama-kun/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/C5uOz96UwAE10T7.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Jikan no Shihaisha ",
                "https://shahiid-anime.net/series/jikan-no-shihaisha/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/6TNjfFW09u.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shoukoku no Altair ",
                "https://shahiid-anime.net/series/shoukoku-no-altair/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/84939l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dive!! ",
                "https://shahiid-anime.net/series/dive/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/85900l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Senki Zesshou Symphogear AXZ ",
                "https://shahiid-anime.net/series/senki-zesshou-symphogear-axz/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/85322l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gamers !! ",
                "https://shahiid-anime.net/series/gamers/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/85822l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Owarimonogatari ",
                "https://shahiid-anime.net/series/owarimonogatari/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/76479.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " The LEGO Batman Movie 2017 ",
                "https://shahiid-anime.net/series/the-lego-batman-movie-2017-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/lego-batman-movie-4.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Smurfs The Lost Village 2017 ",
                "https://shahiid-anime.net/series/smurfs-the-lost-village-2017/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/smurfs_the_lost_village_2017.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Isekai wa Smartphone to Tomo ni ",
                "https://shahiid-anime.net/series/isekai-wa-smartphone-to-tomo-ni/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/33b32b1278fd72d9dd390c5509aa88e2-smartphone-light-novel.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Suki ni Naru Sono Shunkan wo.: Kokuhaku Jikkou Iinkai ",
                "https://shahiid-anime.net/series/suki-ni-naru-sono-shunkan-wo-kokuhaku-jikkou-iinkai/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/149687055205761.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Arakawa Under the Bridge ",
                "https://shahiid-anime.net/series/arakawa-under-the-bridge-2/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/20101006195502Arakawa_Under_the_Bridge.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Arakawa Under the Bridge ",
                "https://shahiid-anime.net/series/arakawa-under-the-bridge/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/arak10.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ai Yori Aoshi  Season 2 ",
                "https://shahiid-anime.net/series/ai-yori-aoshi-season-2/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Ai.Yori_.Aoshi_.full_.51130.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Saredo Tsumibito wa Ryuu to Odoru ",
                "https://shahiid-anime.net/series/saredo-tsumibito-wa-ryuu-to-odoru/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/bandicam-2017-09-01-16-44-42-389.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ousama Game The Animation ",
                "https://shahiid-anime.net/series/ousama-game-the-animation/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87101l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gintama.: Porori-hen ",
                "https://shahiid-anime.net/series/gintama-porori-hen/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/83412l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " UQ holder ! mahou sensi negima !2 ",
                "https://shahiid-anime.net/series/uq-holder-mahou-sensi-negima-2/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87161l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Code realize sousei no himegimi ",
                "https://shahiid-anime.net/series/code-realize-sousei-no-himegimi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/85483l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Imouto sae Ireba Ii ",
                "https://shahiid-anime.net/series/imouto-sae-ireba-ii/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/5610550-02.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dia Horizon ",
                "https://shahiid-anime.net/series/dia-horizon/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/bandicam-2017-09-01-18-05-14-126.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Inuyashiki ",
                "https://shahiid-anime.net/series/inuyashiki/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87467l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kujira no kora wa sajou ni utau ",
                "https://shahiid-anime.net/series/kujira-no-kora-wa-sajou-ni-utau/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/86661.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Konohana Kitan ",
                "https://shahiid-anime.net/series/konohana-kitan/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87241l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Two Car ",
                "https://shahiid-anime.net/series/two-car/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87059l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dies Irae ",
                "https://shahiid-anime.net/series/dies-irae/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/22046601_1553878444634561_2156531591420512088_n.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Just Because! ",
                "https://shahiid-anime.net/series/just-because/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/85941l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Despicable Me 3 2017 ",
                "https://shahiid-anime.net/series/despicable-me-3-2017/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/856137005131_anime-Magi-The-Kingdom-of-Magic-DVD-Set-2-Hyb-primary-copy.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sword Art Online Movie: Ordinal Scale 2017 ",
                "https://shahiid-anime.net/series/sword-art-online-movie-ordinal-scale-2017/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/79297l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Nanbaka Special ",
                "https://shahiid-anime.net/series/nanbaka-special/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/nanbaka-special-8336.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Digimon Adventure tri. 5: Kyousei Movie ",
                "https://shahiid-anime.net/series/digimon-adventure-tri-5-kyousei-movie/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/85166l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Recovery of an MMO Junkie ",
                "https://shahiid-anime.net/series/recovery-of-an-mmo-junkie/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87463l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sengoku Night Blood ",
                "https://shahiid-anime.net/series/sengoku-night-blood/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87505l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " The iDOLM@STER Side M ",
                "https://shahiid-anime.net/series/the-idolmster-side-m/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/84237l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Urahara ",
                "https://shahiid-anime.net/series/urahara/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/86819l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dragon Ball GT Special 1 ",
                "https://shahiid-anime.net/series/dragon-ball-gt-special-1/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/174044.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dragon Ball: Episode of Bardock ",
                "https://shahiid-anime.net/series/dragon-ball-episode-of-bardock/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/dragon_ball___episode_of_bardock__color__by_nikocopado-d79ptxe.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dragon Ball: Ossu! Kaettekita Son Gokuu ",
                "https://shahiid-anime.net/series/dragon-ball-ossu-kaettekita-son-gokuu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Yosh.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tsukipro The Animation ",
                "https://shahiid-anime.net/series/tsukipro-the-animation/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87326l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Osake wa Fuufu ni Natte kara ",
                "https://shahiid-anime.net/series/osake-wa-fuufu-ni-natte-kara/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/88155l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dream Festival! R ",
                "https://shahiid-anime.net/series/dream-festival-r/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/86852l-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tokyo Ghoul:re ",
                "https://shahiid-anime.net/series/tokyo-ghoulre/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90955l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kino no Tabi 2017 ",
                "https://shahiid-anime.net/series/kino-no-tabi-2017/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/86471l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gundam Build Fighters Battlogue ",
                "https://shahiid-anime.net/series/gundam-build-fighters-battlogue/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/581f54f5cadbe6edc3a72f4f8f564fef1505004195_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shoujo Shuumatsu Ryokou ",
                "https://shahiid-anime.net/series/shoujo-shuumatsu-ryokou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/125649l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kimi no Koe wo Todoketai ",
                "https://shahiid-anime.net/series/kimi-no-koe-wo-todoketai/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/86703l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Yuuki Yuuna wa Yuusha de Aru: Washio Sumi no Shou ",
                "https://shahiid-anime.net/series/yuuki-yuuna-wa-yuusha-de-aru-washio-sumi-no-shou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Yuuki-Yuuna-wa-Yuusha-de-Aru-Washio-Sumi-no-Shou-Chapter-2-Tamashii-Visual.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Garo: Vanishing Line ",
                "https://shahiid-anime.net/series/garo-vanishing-line/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/88236l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mahoutsukai no Yome ",
                "https://shahiid-anime.net/series/mahoutsukai-no-yome/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87018l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Houseki no Kuni TV ",
                "https://shahiid-anime.net/series/houseki-no-kuni-tv/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Euclase.Houseki.no_.Kuni_.600.1840394.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Blend S ",
                "https://shahiid-anime.net/series/blend-s/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/88286l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Evil or Live ",
                "https://shahiid-anime.net/series/evil-or-live/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87710l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " The Emoji Movie 2017 ",
                "https://shahiid-anime.net/series/the-emoji-movie-2017/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/film-plakat-2013.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Vampire Knight ",
                "https://shahiid-anime.net/series/vampire-knight/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/ee667f3df74d0a02ebc77e66956bd80cb6728b84.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Himouto! Umaru-chan ",
                "https://shahiid-anime.net/series/himouto-umaru-chan/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/75086l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " ClassicaLoid 2nd Season ",
                "https://shahiid-anime.net/series/classicaloid-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87621l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " 3-gatsu no Lion 2nd Season ",
                "https://shahiid-anime.net/series/3-gatsu-no-lion-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/88180l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shikabane Hime: Aka ",
                "https://shahiid-anime.net/series/shikabane-hime-aka/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/20544l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shikabane Hime: Kuro ",
                "https://shahiid-anime.net/series/shikabane-hime-kuro/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/29945l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Juuni Taisen ",
                "https://shahiid-anime.net/series/juuni-taisen-%d9%85%d8%af%d8%a8%d9%84%d8%ac/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87328l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shirobako ",
                "https://shahiid-anime.net/series/shirobako/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/68021l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ima Soko ni Iru Boku ",
                "https://shahiid-anime.net/series/ima-soko-ni-iru-boku/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/36841l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Yaoguai Mingdan ",
                "https://shahiid-anime.net/series/yaoguai-mingdan/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/69999.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Animegataris ",
                "https://shahiid-anime.net/series/animegataris/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/88213l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Aldnoah Zero ",
                "https://shahiid-anime.net/series/aldnoah-zero/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/64483l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Aldnoah Zero 2nd Season ",
                "https://shahiid-anime.net/series/aldnoah-zero-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/71297l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Wake Up, Girls ",
                "https://shahiid-anime.net/series/wake-up-girls/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/52777l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Witch Craft Works ",
                "https://shahiid-anime.net/series/witch-craft-works/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/55693l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Iria: Zeiram The Animation ",
                "https://shahiid-anime.net/series/iria-zeiram-the-animation/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/27277_1_large.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Cardfight!! Vanguard G: Z ",
                "https://shahiid-anime.net/series/cardfight-vanguard-g-z/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/cardfight-vanguard-g-z-9047.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Love Live! Sunshine!! ",
                "https://shahiid-anime.net/series/love-live-sunshine/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/80791l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Yuuki Yuuna wa Yuusha de Aru: Hidamari ",
                "https://shahiid-anime.net/series/yuuki-yuuna-wa-yuusha-de-aru-hidamari/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/2f99ef0070f984690b49f802569f7a040173f538_hq.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Itsudatte Bokura no Koi wa 10 cm Datta ",
                "https://shahiid-anime.net/series/itsudatte-bokura-no-koi-wa-10-cm-datta/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/88425l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Yuuki Yuuna wa Yuusha de Aru: Yuusha no Shou ",
                "https://shahiid-anime.net/series/yuuki-yuuna-wa-yuusha-de-aru-yuusha-no-shou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89077l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Koi wa Ameagari no You ni ",
                "https://shahiid-anime.net/series/koi-wa-ameagari-no-you-ni/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/173051l-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Fate/Extra Last Encore ",
                "https://shahiid-anime.net/series/fate-extra-last-encore/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/86000l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hakata Tonkotsu Ramens ",
                "https://shahiid-anime.net/series/hakata-tonkotsu-ramens/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/d1a0b71e64180da32b13296816a9976e1499687630_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " (Captain Tsubasa (2018 ",
                "https://shahiid-anime.net/series/captain-tsubasa-2018/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/af06417c751805fac790861d8f41d5461513221686_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Lovely Complex ",
                "https://shahiid-anime.net/series/lovely-complex/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/51909l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dragon Crisis ",
                "https://shahiid-anime.net/series/dragon-crisis/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/MV5BMTZlYTI3YmUtODVkNS00ZWIzLWIwYTMtY2YyZjk5ZDE2ZTBmXkEyXkFqcGdeQXVyMjQ0OTA1Nzc@._V1_.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Seikoku no Dragonar ",
                "https://shahiid-anime.net/series/seikoku-no-dragonar/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/58237l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Slam Dunk ",
                "https://shahiid-anime.net/series/slam-dunk/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/dc9737718f216be489a3d00f6cbb053d-slam-dunk-manga-anime.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Yu☆Gi☆Oh!: Duel Monsters GX ",
                "https://shahiid-anime.net/series/yu%e2%98%86gi%e2%98%86oh-duel-monsters-gx/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/20873l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Net-juu no Susume Special ",
                "https://shahiid-anime.net/series/net-juu-no-susume-special/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87463l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sugar soldier ",
                "https://shahiid-anime.net/series/sugar-soldier/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/sugar_soldier_by_nacchan90-d6e9899.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tokyo Ravens ",
                "https://shahiid-anime.net/series/tokyo-ravens/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/75094l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Slam Dunk Movie 1 ",
                "https://shahiid-anime.net/series/slam-dunk-movie-1/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/MV5BODhkODE0YjEtMDU5MS00NGM1LWJhYjQtODhiYmVlNDQwMmM1XkEyXkFqcGdeQXVyMzM4MjM0Nzg@._V1_SX750_CR00750999_AL_.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Slam Dunk Movie 2 ",
                "https://shahiid-anime.net/series/slam-dunk-movie-2/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/13916l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Slam Dunk Movie 3 ",
                "https://shahiid-anime.net/series/slam-dunk-movie-3/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/13612l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mushibugyou ",
                "https://shahiid-anime.net/series/mushibugyou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/d3248f93882ab7879a116b837da056f41364699336_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Senyuu ",
                "https://shahiid-anime.net/series/senyuu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/137dacec22706566786f389c169e7c631357592135_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Iisshuukan Friends ",
                "https://shahiid-anime.net/series/iisshuukan-friends/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/large.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dantalian no Shoka ",
                "https://shahiid-anime.net/series/dantalian-no-shoka/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/29730l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " DRAMAtical Murder ",
                "https://shahiid-anime.net/series/dramatical-murder/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/75642l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Inu to Hasami wa Tsukaiyou ",
                "https://shahiid-anime.net/series/inu-to-hasami-wa-tsukaiyou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/inu_to_hasami_wa_tsukaiyou_2518.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Inou Battle wa Nichijou-kei no Naka de ",
                "https://shahiid-anime.net/series/inou-battle-wa-nichijou-kei-no-naka-de/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/64413l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Koi to Senkyo to Chocolate ",
                "https://shahiid-anime.net/series/koi-to-senkyo-to-chocolate/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/42015l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mondaiji Tachi ",
                "https://shahiid-anime.net/series/mondaiji-tachi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Mondaiji-tachi_ga_isekai_kara_kuru_soudesu_yo_V10_Color_Pic_2.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ore Twintails ni Narimasu ",
                "https://shahiid-anime.net/series/ore-twintails-ni-narimasu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/64429l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sakamoto desu ga ",
                "https://shahiid-anime.net/series/sakamoto-desu-ga/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/78134l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dagashi Kashi 2 ",
                "https://shahiid-anime.net/series/dagashi-kashi-2/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89242l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Cardcaptor Sakura: Clear Card-hen ",
                "https://shahiid-anime.net/series/cardcaptor-sakura-clear-card-hen/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87790l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Saiki Kusuo no Ψ Nan Season 2 ",
                "https://shahiid-anime.net/series/saiki-kusuo-no-%cf%88-nan-season-2/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/82427.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Death March kara Hajimaru Isekai Kyousoukyoku ",
                "https://shahiid-anime.net/series/death-march-kara-hajimaru-isekai-kyousoukyoku/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/143837l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Darling in the FranXX ",
                "https://shahiid-anime.net/series/darling-in-the-franxx/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89016l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "  Karakai Jouzu no Takagi-san ",
                "https://shahiid-anime.net/series/karakai-jouzu-no-takagi-san/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/17100610082982.jpeg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Beatless ",
                "https://shahiid-anime.net/series/beatless/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89397l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kokkoku ",
                "https://shahiid-anime.net/series/kokkoku/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89076l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Basilisk: Ouka Ninpouchou ",
                "https://shahiid-anime.net/series/basilisk-ouka-ninpouchou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/88384l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ito Junji: Collection ",
                "https://shahiid-anime.net/series/ito-junji-collection/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/88366l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gakuen Babysitters ",
                "https://shahiid-anime.net/series/gakuen-babysitters/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/84903l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Yuru Camp ",
                "https://shahiid-anime.net/series/yuru-camp/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89143l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Toji no Miko ",
                "https://shahiid-anime.net/series/toji-no-miko/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/86700l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ryuuou no Oshigoto ",
                "https://shahiid-anime.net/series/ryuuou-no-oshigoto/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/88426l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hakyuu Houshin Engi ",
                "https://shahiid-anime.net/series/hakyuu-houshin-engi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/88796l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Violet Evergarden ",
                "https://shahiid-anime.net/series/violet-evergarden/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/violet_evergarden_950600.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Code Geass: Hangyaku no Lelouch II – Handou ",
                "https://shahiid-anime.net/series/code-geass-hangyaku-no-lelouch-ii-handou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89275l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Grancrest Senki ",
                "https://shahiid-anime.net/series/grancrest-senki/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/86500l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Yu☆Gi☆Oh! VRAINS ",
                "https://shahiid-anime.net/series/yu%e2%98%86gi%e2%98%86oh-vrains/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Vrains_Promo_Poster.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ai Yori Aoshi ",
                "https://shahiid-anime.net/series/ai-yori-aoshi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/ai-yori-aoshi-enishi-790.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "حلق خاص Ai Yori Aoshi: Enishi – Miyuki ",
                "https://shahiid-anime.net/series/ai-yori-aoshi-enishi-miyuki/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Minitokyo.Ai_.Yori_.Aoshi_.Scans_257564.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dragon Ball/دراغون بول ",
                "https://shahiid-anime.net/series/dragon-ball-%d8%af%d8%b1%d8%a7%d8%ba%d9%88%d9%86-%d8%a8%d9%88%d9%84/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/21055l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Digimon Adventure ",
                "https://shahiid-anime.net/series/digimon-adventure/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/01-366314.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Digimon Adventure S2 ",
                "https://shahiid-anime.net/series/digimon-adventure-s2/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/4b5f91cd973d989cd713a9a1739de3e91434403318_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " World Trigger ",
                "https://shahiid-anime.net/series/world-trigger/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/76533l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Magic Kaito 1412 ",
                "https://shahiid-anime.net/series/magic-kaito-1412/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Kaito-Kid-detective-conan-33901223-347-500.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Emiya-san Chi no Kyou no Gohan ",
                "https://shahiid-anime.net/series/emiya-san-chi-no-kyou-no-gohan/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/img_main.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " KanColle Movie ",
                "https://shahiid-anime.net/series/kancolle-movie/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/b22913259ef9b23bda04967e92d549651479833788_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Neko Para Ova ",
                "https://shahiid-anime.net/series/neko-para-ova/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89618l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sora yori mo Tooi Basho ",
                "https://shahiid-anime.net/series/sora-yori-mo-tooi-basho/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/88906l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "    بوكيمون Pokemon ",
                "https://shahiid-anime.net/series/pokemon/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/pokemon_card___ash__ritchie_y_pokemon_by_adfpf1-d6jexy5.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ramen Daisuki Koizumi-san ",
                "https://shahiid-anime.net/series/ramen-daisuki-koizumi-san/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87949l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Eiyuu Kyoushitsu ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-eiyuu-kyoushitsu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/136000.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " AI no Idenshi ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-ai-no-idenshi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/136176.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Nanatsu no Maken ga Shihai suru ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-nanatsu-no-maken-ga-shihai-suru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/136273.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Undead Girl Murder Farce ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-undead-girl-murder-farce-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/136661.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Seija Musou: Salaryman, Isekai de Ikinokoru Tame ni Ayumu Michi ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-seija-musou-salaryman-isekai-de-ikinokoru-tame-ni-ayumu-michi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/135926.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Rurouni Kenshin: Meiji Kenkaku Romantan (2023) ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-rurouni-kenshin-meiji-kenkaku-romantan-2023-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/136532.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Okashi na Tensei ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-okashi-na-tensei-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/136232.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Jitsu wa Ore, Saikyou deshita? ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-jitsu-wa-ore-saikyou-deshita-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/136558.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Uchi no Kaisha no Chiisai Senpai no Hanashi ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-uchi-no-kaisha-no-chiisai-senpai-no-hanashi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/136274.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ryza no Atelier: Tokoyami no Joou to Himitsu no Kakurega ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-ryza-no-atelier-tokoyami-no-joou-to-himitsu-no-kakurega-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/135852.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Horimiya: Piece ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-horimiya-piece-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/136277.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ayaka ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-ayaka-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/136367.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Genjitsu no Yohane: Sunshine in the Mirror ",
                "https://shahiid-anime.net/series/genjitsu-no-yohane-sunshine-in-the-mirror-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/133335.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Dragon Ball Kai دراغون بول كاي ",
                "https://shahiid-anime.net/series/dragon-ball-kai-%d8%af%d8%b1%d8%a7%d8%ba%d9%88%d9%86-%d8%a8%d9%88%d9%84-%d9%83%d8%a7%d9%8a-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/133990.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Niehime to Kemono no Ou ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-niehime-to-kemono-no-ou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/133339.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ousama Ranking: Yuuki no Takarabako ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-ousama-ranking-yuuki-no-takarabako-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/131615.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " The Marginal Service ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-the-marginal-service-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/133934.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kimi wa Houkago Insomnia ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-kimi-wa-houkago-insomnia-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/134007.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kanojo ga Koushaku-tei ni Itta Riyuu ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-kanojo-ga-koushaku-tei-ni-itta-riyuu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/130452.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dead Mount Death Play ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-dead-mount-death-play-%d9%85%d8%aa%d8%b1%d8%ac%d9%85%d8%a9/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/133758.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Boku no Kokoro no Yabai Yatsu ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-boku-no-kokoro-no-yabai-yatsu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/131654.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Yuusha ga Shinda! ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-yuusha-ga-shinda-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/133866.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Otonari ni Ginga ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-otonari-ni-ginga-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/135041.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Isekai Shoukan wa Nidome desu ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-isekai-shoukan-wa-nidome-desu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/134151.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mahou Shoujo Magical Destroyers ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-mahou-shoujo-magical-destroyers-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/134079.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Megami no Café Terrace ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-megami-no-cafe-terrace-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/130919.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Rokudou no Onna-tachi ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-rokudou-no-onna-tachi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/134709.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mashle ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-mashle-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139607.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Isekai One Turn Kill Neesan: Ane Douhan no Isekai Seikatsu Hajimemashita ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-isekai-one-turn-kill-neesan-ane-douhan-no-isekai-seikatsu-hajimemashita-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/129736.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kaminaki Sekai no Kamisama Katsudou ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-kaminaki-sekai-no-kamisama-katsudou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/134647.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kono Subarashii Sekai ni Bakuen wo! ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-kono-subarashii-sekai-ni-bakuen-wo-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/135042.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Isekai de Cheat Skill wo Te ni Shita Ore wa, Genjitsu Sekai wo mo Musou Suru: Level Up wa Jinsei wo Kaeta ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-isekai-de-cheat-skill-wo-te-ni-shita-ore-wa-genjitsu-sekai-wo-mo-musou-suru-level-up-wa-jinsei-wo-kaeta-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/50OsbGp6AWw4za2aAM82vKburcg.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tensei Kizoku no Isekai Boukenroku: Jichou wo Shiranai Kamigami no Shito ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-tensei-kizoku-no-isekai-boukenroku-jichou-wo-shiranai-kamigami-no-shito-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/tensei-kizoku-no-isekai-boukenroku-jichou-wo-shiranai-kamigami-no-shito-the-aristocrats-otherworldly-adventure-serving-gods-who-go-too-far.257423.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "My Home Hero ",
                "https://shahiid-anime.net/series/my-home-hero-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/ec4f1599c2a76b049fde9b6442c55f7c1674459450_main.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Jijou wo Shiranai Tenkousei ga Guigui Kuru. ",
                "https://shahiid-anime.net/series/jijou-wo-shiranai-tenkousei-ga-guigui-kuru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/0b0f2c6df436d5857c63dcec1b616fe31678439794_main.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Yamada-kun to Lv999 no Koi wo Suru ",
                "https://shahiid-anime.net/series/yamada-kun-to-lv999-no-koi-wo-suru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/134923.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Jigokuraku ",
                "https://shahiid-anime.net/series/jigokuraku-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/134936.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tengoku Daimakyou ",
                "https://shahiid-anime.net/series/tengoku-daimakyou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/134925.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shuumatsu no Walküre ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-shuumatsu-no-walkure-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/124646.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ningen Fushin no Boukensha-tachi ga Sekai wo Sukuu you desu ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-ningen-fushin-no-boukensha-tachi-ga-sekai-wo-sukuu-you-desu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/131578.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ooyukiumi no Kaina ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-ooyukiumi-no-kaina-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/131833.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ayakashi Triangle ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-ayakashi-triangle-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/131921.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tondemo Skill de Isekai Hourou Meshi ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-tondemo-skill-de-isekai-hourou-meshi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/131889.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " High Card ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-high-card-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/131345.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mononogatari ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-mononogatari-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/131830.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Eiyuuou, Bu wo Kiwameru Tame Tenseisu: Soshite, Sekai Saikyou no Minarai Kishi♀ ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-eiyuuou-bu-wo-kiwameru-tame-tenseisu-soshite-sekai-saikyou-no-minarai-kishi%e2%99%80-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/129594.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Inu ni Nattara Suki na Hito ni Hirowareta. ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-inu-ni-nattara-suki-na-hito-ni-hirowareta-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/132333.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Saikyou Onmyouji no Isekai Tenseiki ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-saikyou-onmyouji-no-isekai-tenseiki-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/saikyou-onmyouji-no-isekai-tenseiki-the-reincarnation-of-the-strongest-exorcist-in-another-world.252237.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Otonari no Tenshi-sama ni Itsunomanika Dame Ningen ni Sareteita Ken ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-otonari-no-tenshi-sama-ni-itsunomanika-dame-ningen-ni-sareteita-ken-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/131525.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sugar Apple Fairy Tale ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-sugar-apple-fairy-tale-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/131300.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Benriya Saitou-san, Isekai ni Iku ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-benriya-saitou-san-isekai-ni-iku-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/132335.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Nokemono-tachi no Yoru ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-nokemono-tachi-no-yoru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/129002.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " NieR:Automata Ver1.1a ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-nierautomata-ver1-1a-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/128318.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Trigun Stampede ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-trigun-stampede-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/129194.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sanrio Danshi ",
                "https://shahiid-anime.net/series/sanrio-danshi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89890l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Katekyo Hitman Reborn ",
                "https://shahiid-anime.net/series/katekyo-hitman-reborn/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/80004l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " IDOLiSH7 ",
                "https://shahiid-anime.net/series/idolish7/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87656l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gintama.: Shirogane no Tamashii-hen ",
                "https://shahiid-anime.net/series/gintama-shirogane-no-tamashii-hen/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89603l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " JoJo no Kimyou na Bouken TV ",
                "https://shahiid-anime.net/series/jojo-no-kimyou-na-bouken-tv/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/40409.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Bakuman Season 3 ",
                "https://shahiid-anime.net/series/bakuman-season-3/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/medium_bakuman-3-592.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Bakuman ",
                "https://shahiid-anime.net/series/bakuman/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/26138l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Bakuman Season 2 ",
                "https://shahiid-anime.net/series/bakuman-season-2/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/34923.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " JoJo no Kimyou na Bouken: Stardust Crusaders 2nd Season ",
                "https://shahiid-anime.net/series/jojo-no-kimyou-na-bouken-stardust-crusaders-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/MV5BNDc0NDYxZGMtNjg0Ny00ZjNhLWEzZTAtZmU1YjFiNGM5MzNiL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjc2NjA5MTU@._V1_.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hakuouki Hekketsuroku ",
                "https://shahiid-anime.net/series/hakuouki-hekketsuroku/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/71797l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Persona: Trinity Soul ",
                "https://shahiid-anime.net/series/persona-trinity-soul/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/medium_persona-trinity-soul-617.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "  Kingdom ",
                "https://shahiid-anime.net/series/kingdom/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139641.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dragon Quest: Dai no Daibouken ",
                "https://shahiid-anime.net/series/dragon-quest-dai-no-daibouken/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Fly_dragonquest_pic25682_1240071333.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ace of Diamond ",
                "https://shahiid-anime.net/series/ace-of-diamond/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/b1cdec1bf4b06441b6de33c756e1b6e81410328328_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Zoku Touken Ranbu: Hanamaru ",
                "https://shahiid-anime.net/series/zoku-touken-ranbu-hanamaru/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89579l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Diamond no Ace: Season 2 ",
                "https://shahiid-anime.net/series/diamond-no-ace-season-2/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/588be5a62065e1a1df0388ec56ba5a641427842600_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Genshiken ",
                "https://shahiid-anime.net/series/genshiken/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/20323l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Miira no Kaikata ",
                "https://shahiid-anime.net/series/miira-no-kaikata/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89328l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mitsuboshi Colors ",
                "https://shahiid-anime.net/series/mitsuboshi-colors/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89984l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mär ",
                "https://shahiid-anime.net/series/mar/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/mar_183.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " B: The Beginning ",
                "https://shahiid-anime.net/series/b-the-beginning/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90284l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Overlord Movie 1: Fushisha no Ou ",
                "https://shahiid-anime.net/series/overlord-movie-1-fushisha-no-ou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87759l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Overlord Movie 2 Shikkoku no Eiyuu ",
                "https://shahiid-anime.net/series/overlord-movie-2-shikkoku-no-eiyuu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87758l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Steins,Gate Zero ",
                "https://shahiid-anime.net/series/steinsgate-zero/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87040l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Persona 5 the Animation ",
                "https://shahiid-anime.net/series/persona-5-the-animation/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Pursooona.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Full Metal Panic! Invisible Victory ",
                "https://shahiid-anime.net/series/full-metal-panic-invisible-victory/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89544l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Wotaku ni Koi wa Muzukashii ",
                "https://shahiid-anime.net/series/wotaku-ni-koi-wa-muzukashii/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/86933l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ginga Eiyuu Densetsu: Die Neue These – Kaikou ",
                "https://shahiid-anime.net/series/ginga-eiyuu-densetsu-die-neue-these-kaikou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87834l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Devils Line ",
                "https://shahiid-anime.net/series/devils-line/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90817l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ze Tian Ji ",
                "https://shahiid-anime.net/series/ze-tian-ji/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/448ec30fdcd2d5d5_original.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "أونا  AICO: Incarnation ",
                "https://shahiid-anime.net/series/aico-incarnation/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89969l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Golden Kamuy ",
                "https://shahiid-anime.net/series/golden-kamuy-%d8%ac%d9%88%d9%84%d8%af%d9%86-%d9%83%d8%a7%d9%85%d9%88%d9%8a/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/88518l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tada-kun wa Koi wo Shinai ",
                "https://shahiid-anime.net/series/tada-kun-wa-koi-wo-shinai/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/88837l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Piano no Mori TV ",
                "https://shahiid-anime.net/series/piano-no-mori-tv/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90334l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Amanchu! Advance ",
                "https://shahiid-anime.net/series/amanchu-advance/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90778l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hinamatsuri ",
                "https://shahiid-anime.net/series/hinamatsuri/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/61u74t59L._SY445_QL70_.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mahou Shoujo Site ",
                "https://shahiid-anime.net/series/mahou-shoujo-site/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/51cM6nJnXYL.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Juushinki Pandora ",
                "https://shahiid-anime.net/series/juushinki-pandora/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90288l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " 3D Kanojo: Real Girl ",
                "https://shahiid-anime.net/series/3d-kanojo-real-girl/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/26f2ad02533b1331240ef25509bbd61e1516592818_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kakuriyo no Yadomeshi ",
                "https://shahiid-anime.net/series/kakuriyo-no-yadomeshi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90270l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Caligula ",
                "https://shahiid-anime.net/series/caligula/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90748l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shiyan Pin Jiating ",
                "https://shahiid-anime.net/series/shiyan-pin-jiating/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/88806l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Megalo Box ",
                "https://shahiid-anime.net/series/megalo-box/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/megalo_box_7549.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dorei-ku The Animation ",
                "https://shahiid-anime.net/series/dorei-ku-the-animation/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Doreiku_VIsual_Art.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Souten no Ken Re:Genesis ",
                "https://shahiid-anime.net/series/souten-no-ken-regenesis/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90752l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "  Major 2nd TV ",
                "https://shahiid-anime.net/series/major-2nd-tv/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/major2.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Quanzhi Fashi ",
                "https://shahiid-anime.net/series/quanzhi-fashi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/83819l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Black And White Warriors ",
                "https://shahiid-anime.net/series/black-and-white-warriors/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/y3t96ajx8vscttp.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sword Gai: The Animation ",
                "https://shahiid-anime.net/series/sword-gai-the-animation/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89759l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gegege no Kitarou 2018 ",
                "https://shahiid-anime.net/series/gegege-no-kitarou-2018/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90621l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mahou Shoujo Ore ",
                "https://shahiid-anime.net/series/mahou-shoujo-ore/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/magicalgirl-ore_Teaser_Visual.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Uchuu Senkan Tiramisù ",
                "https://shahiid-anime.net/series/uchuu-senkan-tiramisu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90738l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gundam Build Divers ",
                "https://shahiid-anime.net/series/gundam-build-divers/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/9dac6779035c256f57ba09326b262cb41522734261_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "سلام دانك مدبلج كامل",
                "https://shahiid-anime.net/series/%d8%b3%d9%84%d8%a7%d9%85-%d8%af%d8%a7%d9%86%d9%83-%d9%85%d8%af%d8%a8%d9%84%d8%ac/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/74582028.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Comic Girls ",
                "https://shahiid-anime.net/series/comic-girls/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90325l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Lupin III: Part V ",
                "https://shahiid-anime.net/series/lupin-iii-part-v/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/medium_5247-mM8qS-1482.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Akkun to Kanojo ",
                "https://shahiid-anime.net/series/akkun-to-kanojo/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/9a95cc791707e1bf0a4f56462a0a88501522978363_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Lostorage Conflated Wixoss ",
                "https://shahiid-anime.net/series/lostorage-conflated-wixoss/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90898l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gurazeni ",
                "https://shahiid-anime.net/series/gurazeni/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/88498l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "مسلسل دراغون بول كاي Dragon Ball Z kai مدبلج",
                "https://shahiid-anime.net/series/dragon-ball-z-kai-%d9%85%d8%af%d8%a8%d9%84%d8%ac/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/dbkai_saiyan_promo1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Omae wa Mada Gunma wo Shiranai ",
                "https://shahiid-anime.net/series/omae-wa-mada-gunma-wo-shiranai/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90426l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "يوغي يو  مدبلج  عربي كامل",
                "https://shahiid-anime.net/series/%d9%8a%d9%88%d8%ba%d9%8a-%d9%8a%d9%88-%d8%a7%d9%84%d8%ac%d8%b2%d8%a1-1-%d9%85%d8%af%d8%a8%d9%84%d8%ac/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/80541910.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Nil Admirari no Tenbin: Teito Genwaku Kitan ",
                "https://shahiid-anime.net/series/nil-admirari-no-tenbin-teito-genwaku-kitan/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87560l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Isekai Izakaya – Koto Aitheria no Izakaya Nobu ",
                "https://shahiid-anime.net/series/isekai-izakaya-koto-aitheria-no-izakaya-nobu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/88797l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Rokuhoudou Yotsuiro Biyori ",
                "https://shahiid-anime.net/series/rokuhoudou-yotsuiro-biyori/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89315l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Butlers: Chitose Momotose Monogatari ",
                "https://shahiid-anime.net/series/butlers-chitose-momotose-monogatari/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87711l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "مسلسل ناروتو Naruto مدبلج كامل ",
                "https://shahiid-anime.net/series/%d9%86%d8%a7%d8%b1%d9%88%d8%aa%d9%88-naruto-%d8%a7%d9%84%d8%ac%d8%b2%d8%a1-1-%d9%85%d8%af%d8%a8%d9%84%d8%ac/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/cat_1405905015.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "ابط كر جزء 1 مدبلج",
                "https://shahiid-anime.net/series/%d8%a7%d8%a8%d8%b7%d8%a7%d9%84-%d8%a7%d9%84%d9%83%d8%b1%d8%a9-%d8%a7%d9%84%d8%ac%d8%b2%d8%a1-1-%d9%85%d8%af%d8%a8%d9%84%d8%ac/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/cat_cat_1406157783.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "ابط كر جزء 2 مدبلج",
                "https://shahiid-anime.net/series/%d8%a7%d8%a8%d8%b7%d8%a7%d9%84-%d8%a7%d9%84%d9%83%d8%b1%d8%a9-%d8%a7%d9%84%d8%ac%d8%b2%d8%a1-2-%d9%85%d8%af%d8%a8%d9%84%d8%ac/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/51QgNbYe3L.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "ابط ديجيت جزء 1 مدبلج",
                "https://shahiid-anime.net/series/%d8%a7%d8%a8%d8%b7%d8%a7%d9%84-%d8%a7%d9%84%d8%af%d9%8a%d8%ac%d9%8a%d8%aa%d8%a7%d9%84-%d8%a7%d9%84%d8%ac%d8%b2%d8%a1-1-%d9%85%d8%af%d8%a8%d9%84%d8%ac/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/cat_1414874446.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "ابط ديجيت جزء 2 مدبلج",
                "https://shahiid-anime.net/series/%d8%a7%d8%a8%d8%b7%d8%a7%d9%84-%d8%a7%d9%84%d8%af%d9%8a%d8%ac%d9%8a%d8%aa%d8%a7%d9%84-%d8%a7%d9%84%d8%ac%d8%b2%d8%a1-2-%d9%85%d8%af%d8%a8%d9%84%d8%ac/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/digimon2.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "ابط ديجيت جزء 4 مدبلج",
                "https://shahiid-anime.net/series/%d8%a7%d8%a8%d8%b7%d8%a7%d9%84-%d8%a7%d9%84%d8%af%d9%8a%d8%ac%d9%8a%d8%aa%d8%a7%d9%84-%d8%a7%d9%84%d8%ac%d8%b2%d8%a1-4-%d9%85%d8%af%d8%a8%d9%84%d8%ac/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/767685294901_anime-Digimon-Season-4.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "ابط ديجيت جزء 3 مدبلج",
                "https://shahiid-anime.net/series/%d8%a7%d8%a8%d8%b7%d8%a7%d9%84-%d8%a7%d9%84%d8%af%d9%8a%d8%ac%d9%8a%d8%aa%d8%a7%d9%84-%d8%a7%d9%84%d8%ac%d8%b2%d8%a1-3-%d9%85%d8%af%d8%a8%d9%84%d8%ac/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/020.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "ألعاب ناري /Uchiage Hanab ",
                "https://shahiid-anime.net/series/%d8%a7%d9%84%d8%a3%d9%84%d8%b9%d8%a7%d8%a8-%d8%a7%d9%84%d9%86%d8%a7%d8%b1%d9%8a%d8%a9-uchiage-hanab-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/DNUI4N4XkAYXduf.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "بوروتو / Boruto: Naruto Next Generations  ",
                "https://shahiid-anime.net/series/%d8%a8%d9%88%d8%b1%d9%88%d8%aa%d9%88-boruto-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Boruto_Anime_Poster_HD.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "دراغون بول هيرو /Dragon ball Heros",
                "https://shahiid-anime.net/series/%d8%af%d8%b1%d8%a7%d8%ba%d9%88%d9%86-%d8%a8%d9%88%d9%84-%d9%87%d9%8a%d8%b1%d9%88-dragon-ball-heros/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/MV5BMTY0MTA5Y2YtYmIwNS00N2M4LThlZGUtNTQ2ODQ3ZTM3YjIyXkEyXkFqcGdeQXVyMzE2NDMyMTU@._V1_SY1000_CR007371000_AL_.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Island ",
                "https://shahiid-anime.net/series/island-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/92145l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hanebado! ",
                "https://shahiid-anime.net/series/hanebado-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93154l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Satsuriku no Tenshi ",
                "https://shahiid-anime.net/series/satsuriku-no-tenshi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/91257l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Baki 2018 ",
                "https://shahiid-anime.net/series/baki-2018/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/91042l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Chio-chan no Tsuugakuro ",
                "https://shahiid-anime.net/series/chio-chan-no-tsuugakuro/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/92602l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Senjuushi ",
                "https://shahiid-anime.net/series/senjuushi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/91376l-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Banana Fish ",
                "https://shahiid-anime.net/series/banana-fish/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90735l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Yume Oukoku to Nemureru 100 Nin no Ouji-sama ",
                "https://shahiid-anime.net/series/yume-oukoku-to-nemureru-100-nin-no-ouji-sama/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93139l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Chuukan Kanriroku Tonegawa ",
                "https://shahiid-anime.net/series/chuukan-kanriroku-tonegawa/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93145l-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shichisei no Subaru ",
                "https://shahiid-anime.net/series/shichisei-no-subaru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/91971l-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Planet With ",
                "https://shahiid-anime.net/series/planet-with/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/91337l-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Yama no Susume: Third Season ",
                "https://shahiid-anime.net/series/yama-no-susume-third-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/91648l-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dies Irae: To the Ring Reincarnation ",
                "https://shahiid-anime.net/series/dies-irae-to-the-ring-reincarnation/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/91038l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Angolmois: Genkou Kassenki ",
                "https://shahiid-anime.net/series/angolmois-genkou-kassenki-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/d1f8c8e2e69a243941477189070f4a9c1531281549_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Free!: Dive to the Future ",
                "https://shahiid-anime.net/series/free-dive-to-the-future/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/92608l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tenrou: Sirius the Jaeger ",
                "https://shahiid-anime.net/series/tenrou-sirius-the-jaeger-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/91326l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Lord of Vermilion: Guren no Ou ",
                "https://shahiid-anime.net/series/lord-of-vermilion-guren-no-ou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/34ac3d28db872f8af260b8406fdd93e01531500445_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Grand Blue ",
                "https://shahiid-anime.net/series/grand-blue-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90007l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " ISekai Maou to Shoukan Shoujo no Dorei Majutsu ",
                "https://shahiid-anime.net/series/isekai-maou-to-shoukan-shoujo-no-dorei-majutsu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93156l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hyakuren no Haou to Seiyaku no Valkyria ",
                "https://shahiid-anime.net/series/hyakuren-no-haou-to-seiyaku-no-valkyria-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/92951l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Phantom in the Twilight ",
                "https://shahiid-anime.net/series/phantom-in-the-twilight-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/2f7c66b2ae8919bb8475e5e6429600b01531117155_full.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kyoto Teramachi Sanjou no Holmes ",
                "https://shahiid-anime.net/series/kyoto-teramachi-sanjou-no-holmes-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90995l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Asobi Asobase ",
                "https://shahiid-anime.net/series/asobi-asobase/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90281l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Aguu: Tensai Ningyou ",
                "https://shahiid-anime.net/series/aguu-tensai-ningyou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/92825l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Batman Ninja (2018) BluRay ",
                "https://shahiid-anime.net/series/batman-ninja-2018-bluray-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Batman_Ninja.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shoujo☆Kageki Revue Starlight ",
                "https://shahiid-anime.net/series/shoujo%e2%98%86kageki-revue-starlight/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89944l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Toaru Majutsu no Index III ",
                "https://shahiid-anime.net/series/toaru-majutsu-no-index-iii-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93857l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " RErideD: Tokigoe no Derrida ",
                "https://shahiid-anime.net/series/rerided-tokigoe-no-derrida-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93833l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kimi to Boku ",
                "https://shahiid-anime.net/series/kimi-to-boku/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/582353.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Beatless Final Stage ",
                "https://shahiid-anime.net/series/beatless-final-stage-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Lacia1.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " SSSS.Gridman ",
                "https://shahiid-anime.net/series/ssss-gridman/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93478l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ingress The Animation ",
                "https://shahiid-anime.net/series/ingress-the-animation/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93421l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tonari no Kyuuketsuki-san ",
                "https://shahiid-anime.net/series/tonari-no-kyuuketsuki-san/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93379l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Beelzebub-jou no Okinimesu mama ",
                "https://shahiid-anime.net/series/beelzebub-jou-no-okinimesu-mama/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93382l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " JoJo no Kimyou na Bouken: Ougon no Kaze ",
                "https://shahiid-anime.net/series/jojo-no-kimyou-na-bouken-ougon-no-kaze/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/94948l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Yagate Kimi ni Naru ",
                "https://shahiid-anime.net/series/yagate-kimi-ni-naru/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93419l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hangyakusei Million Arthur ",
                "https://shahiid-anime.net/series/hangyakusei-million-arthur/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93383l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "  Radiant ",
                "https://shahiid-anime.net/series/radiant-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93613l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ulysses: Jehanne Darc to Renkin no Kishi ",
                "https://shahiid-anime.net/series/ulysses-jehanne-darc-to-renkin-no-kishi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93328l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Golden Kamuy 2nd Season ",
                "https://shahiid-anime.net/series/golden-kamuy-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/95018l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "إنمي Irozuku Sekai no Ashita kara ",
                "https://shahiid-anime.net/series/irozuku-sekai-no-ashita-kara/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93855l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ora ga Suki nano wa Imouto dakedo Imouto ja Nai ",
                "https://shahiid-anime.net/series/ora-ga-suki-nano-wa-imouto-dakedo-imouto-ja-nai/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93920l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Seishun Buta Yarou wa Bunny Girl Senpai no Yume wo Minai ",
                "https://shahiid-anime.net/series/seishun-buta-yarou-wa-bunny-girl-senpai-no-yume-wo-minai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/184333l_250x0.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sono Toki, Kanojo wa. ",
                "https://shahiid-anime.net/series/sono-toki-kanojo-wa-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Captura-de-pantalla-2017-07-24-a-las-18.31.42.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Akanesasu Shoujo ",
                "https://shahiid-anime.net/series/akanesasu-shoujo-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93805l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tensei shitara Slime Datta Ken ",
                "https://shahiid-anime.net/series/tensei-shitara-slime-datta-ken-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141789.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ken En Ken: Aoki Kagayaki ",
                "https://shahiid-anime.net/series/ken-en-ken-aoki-kagayaki-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/-Ken-En-Ken-Aoki-Kagayaki-حلق-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Souten no Ken: Regenesis 2nd Season ",
                "https://shahiid-anime.net/series/souten-no-ken-regenesis-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93814l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kaze ga Tsuyoku Fuiteiru ",
                "https://shahiid-anime.net/series/kaze-ga-tsuyoku-fuiteiru/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93918l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Jingai-san no Yome ",
                "https://shahiid-anime.net/series/jingai-san-no-yome/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93406l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sora to Umi no Aida ",
                "https://shahiid-anime.net/series/sora-to-umi-no-aida/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93845l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Conception ",
                "https://shahiid-anime.net/series/conception-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/95019l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Zombieland Saga ",
                "https://shahiid-anime.net/series/zombieland-saga-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93651l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Bakumatsu ",
                "https://shahiid-anime.net/series/bakumatsu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93827l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kitsune no Koe ",
                "https://shahiid-anime.net/series/kitsune-no-koe/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93424l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kishuku Gakkou no Juliet ",
                "https://shahiid-anime.net/series/kishuku-gakkou-no-juliet-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/DYZPFJPVQAAzE7K.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hinomaru Zumou ",
                "https://shahiid-anime.net/series/hinomaru-zumou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93846l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gurazeni: Season 2 ",
                "https://shahiid-anime.net/series/gurazeni-season-2/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/95059l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ace Attorney Season 2 ",
                "https://shahiid-anime.net/series/ace-attorney-season-2/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/91089l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Goblin Slayer ",
                "https://shahiid-anime.net/series/goblin-slayer-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138338.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Uchi no Maid ga Uzasugiru! ",
                "https://shahiid-anime.net/series/uchi-no-maid-ga-uzasugiru/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93847l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Anima Yell! ",
                "https://shahiid-anime.net/series/anima-yell/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93862l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Release the Spyce ",
                "https://shahiid-anime.net/series/release-the-spyce/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/91403l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gakuen Basara ",
                "https://shahiid-anime.net/series/gakuen-basara/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93380l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Merc Storia: Mukiryoku no Shounen to Bin no Naka no Shoujo ",
                "https://shahiid-anime.net/series/merc-storia-mukiryoku-no-shounen-to-bin-no-naka-no-shoujo/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93916l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Karakuri Circus ",
                "https://shahiid-anime.net/series/karakuri-circus/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93384l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gaikotsu Shotenin Honda-san ",
                "https://shahiid-anime.net/series/gaikotsu-shotenin-honda-san/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93865l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hashiri Tsuzukete Yokattatte ",
                "https://shahiid-anime.net/series/hashiri-tsuzukete-yokattatte/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/321704000723.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tsurune: Kazemai Koukou Kyuudoubu ",
                "https://shahiid-anime.net/series/tsurune-kazemai-koukou-kyuudoubu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93571l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Jyu Oh Sei ",
                "https://shahiid-anime.net/series/jyu-oh-sei-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/434c3adf5b2933c1b2c019a252d328b59cb2b372r1-640-960v2_hq.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Maoyuu Maou Yuusha ",
                "https://shahiid-anime.net/series/maoyuu-maou-yuusha/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/45432l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sukitte Ii na yo ",
                "https://shahiid-anime.net/series/sukitte-ii-na-yo/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/42509l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sayonara no Asa ni Yakusoku no Hana wo Kazarou ",
                "https://shahiid-anime.net/series/sayonara-no-asa-ni-yakusoku-no-hana-wo-kazarou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/89556l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " 3D Kanojo: Real Girl 2nd Season ",
                "https://shahiid-anime.net/series/3d-kanojo-real-girl-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/97219l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " BanG Dream! 2nd Season ",
                "https://shahiid-anime.net/series/bang-dream-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Season_23_Key_Visual.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dororo ",
                "https://shahiid-anime.net/series/dororo-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/96247l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Grimms Notes The Animation ",
                "https://shahiid-anime.net/series/grimms-notes-the-animation-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/96962l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mahou Shoujo Tokushusen Asuka ",
                "https://shahiid-anime.net/series/mahou-shoujo-tokushusen-asuka-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93179l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ame-iro Cocoa: Side G ",
                "https://shahiid-anime.net/series/ame-iro-cocoa-side-g/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/97361l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Bermuda Triangle: Colorful Pastrale ",
                "https://shahiid-anime.net/series/bermuda-triangle-colorful-pastrale/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93947l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Boogiepop wa Warawanai 2019 ",
                "https://shahiid-anime.net/series/boogiepop-wa-warawanai-2019/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/90971l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Domestic na Kanojo ",
                "https://shahiid-anime.net/series/domestic-na-kanojo-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93182l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Doukyonin wa Hiza, Tokidoki, Atama no Ue ",
                "https://shahiid-anime.net/series/doukyonin-wa-hiza-tokidoki-atama-no-ue-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/97368l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Egao no Daika ",
                "https://shahiid-anime.net/series/egao-no-daika-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/96963l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Endro~! ",
                "https://shahiid-anime.net/series/endro-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/96180l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Fukigen na Mononokean 2nd Season ",
                "https://shahiid-anime.net/series/fukigen-na-mononokean-2nd-season-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/95662l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Girly Air Force ",
                "https://shahiid-anime.net/series/girly-air-force-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/97025l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kouya no Kotobuki Hikoutai ",
                "https://shahiid-anime.net/series/kouya-no-kotobuki-hikoutai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/96179l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Manaria Friends ",
                "https://shahiid-anime.net/series/manaria-friends-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/mPM7BBDf.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Meiji Tokyo Renka ",
                "https://shahiid-anime.net/series/meiji-tokyo-renka-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/96175l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Revisions ",
                "https://shahiid-anime.net/series/revisions-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/97007l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ueno-san wa Bukiyou ",
                "https://shahiid-anime.net/series/ueno-san-wa-bukiyou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/96178l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Watashi ni Tenshi ga Maiorita! ",
                "https://shahiid-anime.net/series/watashi-ni-tenshi-ga-maiorita-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/96183l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " W’z ",
                "https://shahiid-anime.net/series/wz-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/91170l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Yakusoku no Neverland ",
                "https://shahiid-anime.net/series/yakusoku-no-neverland-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/g4eZcpty4s28ngMc8g3AxnxQbsh.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ayakashi ",
                "https://shahiid-anime.net/series/ayakashi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/6978l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Steins Gate 0 Special ",
                "https://shahiid-anime.net/series/steins-gate-0-special/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87040l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Saint Seiya: Saintia Shou ",
                "https://shahiid-anime.net/series/saint-seiya-saintia-shou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/87457l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Pastel Memories ",
                "https://shahiid-anime.net/series/pastel-memories-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/95294l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "  Gotoubun no Hanayome ",
                "https://shahiid-anime.net/series/gotoubun-no-hanayome-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/97947l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kaguya-sama wa Kokurasetai ",
                "https://shahiid-anime.net/series/kaguya-sama-wa-kokurasetai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106290l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Bungou Stray Dogs 3nd Season ",
                "https://shahiid-anime.net/series/bungou-stray-dogs-3nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/98115l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Diamond no Ace: Act II ",
                "https://shahiid-anime.net/series/diamond-no-ace-act-ii-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99220l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Bakumatsu: Crisis ",
                "https://shahiid-anime.net/series/bakumatsu-crisis-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99180l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gunjou no Magmel  ",
                "https://shahiid-anime.net/series/gunjou-no-magmel-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/98597l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hangyakusei Million Arthur 2nd Season ",
                "https://shahiid-anime.net/series/hangyakusei-million-arthur-2nd-season/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99666l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kenja no Mago ",
                "https://shahiid-anime.net/series/kenja-no-mago-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/94615l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Fairy Gone ",
                "https://shahiid-anime.net/series/fairy-gone-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99784l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kono Yo no Hate de Koi wo Utau Shoujo YU-NO ",
                "https://shahiid-anime.net/series/kono-yo-no-hate-de-koi-wo-utau-shoujo-yu-no-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99003l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Fruits Basket 2019 ",
                "https://shahiid-anime.net/series/fruits-basket-2019-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106299l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Midara na Ao-chan wa Benkyou ga Dekinai ",
                "https://shahiid-anime.net/series/midara-na-ao-chan-wa-benkyou-ga-dekinai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/96993l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Senryuu Shoujo ",
                "https://shahiid-anime.net/series/senryuu-shoujo-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/98216l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Joshikausei ",
                "https://shahiid-anime.net/series/joshikausei-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/98376l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hitoribocchi no Marumaru Seikatsu ",
                "https://shahiid-anime.net/series/hitoribocchi-no-marumaru-seikatsu/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/94906l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Bokutachi wa Benkyou ga Dekinai ",
                "https://shahiid-anime.net/series/bokutachi-wa-benkyou-ga-dekinai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99940l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " !Kono Oto Tomare ",
                "https://shahiid-anime.net/series/kono-oto-tomare-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99881l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shoumetsu Toshi ",
                "https://shahiid-anime.net/series/shoumetsu-toshi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/93448l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Namu Amida Butsu!: Rendai Utena ",
                "https://shahiid-anime.net/series/namu-amida-butsu-rendai-utena-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99004l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mayonaka no Occult Koumuin ",
                "https://shahiid-anime.net/series/mayonaka-no-occult-koumuin-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/95008l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sewayaki Kitsune no Senko-san ",
                "https://shahiid-anime.net/series/sewayaki-kitsune-no-senko-san-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99677l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Carole & Tuesday ",
                "https://shahiid-anime.net/series/carole-tuesday/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/96132l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Sarazanmai ",
                "https://shahiid-anime.net/series/sarazanmai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/96184l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gunjou no Magmel ",
                "https://shahiid-anime.net/series/gunjou-no-magmel/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99433l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dr. Stone ",
                "https://shahiid-anime.net/series/dr-stone-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138696.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Isekai Cheat Magician  ",
                "https://shahiid-anime.net/series/isekai-cheat-magician-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99611l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Katsute Kami Datta Kemono-tachi e ",
                "https://shahiid-anime.net/series/katsute-kami-datta-kemono-tachi-e-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/98801l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kanata no Astra ",
                "https://shahiid-anime.net/series/kanata-no-astra-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/100976l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dumbbell Nan Kilo Moteru   ",
                "https://shahiid-anime.net/series/dumbbell-nan-kilo-moteru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/101060l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Maou-sama, Retry!  ",
                "https://shahiid-anime.net/series/maou-sama-retry-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/101288l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Uchi no Ko no Tame naraba, Ore wa Moshikashitara Maou mo Taoseru kamo Shirenai. ",
                "https://shahiid-anime.net/series/uchi-no-ko-no-tame-naraba-ore-wa-moshikashitara-maou-mo-taoseru-kamo-shirenai/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/100670l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Joshikousei no Mudazukai ",
                "https://shahiid-anime.net/series/joshikousei-no-mudazukai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99966l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Granbelm ",
                "https://shahiid-anime.net/series/granbelm-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/101330l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Vinland Saga ",
                "https://shahiid-anime.net/series/vinland-saga-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/100737l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Lord El-Melloi II Sei no Jikenbo: Rail Zeppelin Grace Note ",
                "https://shahiid-anime.net/series/lord-el-melloi-ii-sei-no-jikenbo-rail-zeppelin-grace-note-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/101037l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Cop Craft ",
                "https://shahiid-anime.net/series/cop-craft-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99615l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kochouki: Wakaki Nobunaga  ",
                "https://shahiid-anime.net/series/kochouki-wakaki-nobunaga-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99665l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Nakanohito Genome  ,Jikkyouchuu]  ",
                "https://shahiid-anime.net/series/nakanohito-genome-jikkyouchuu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/94908l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Arifureta Shokugyou de Sekai Saikyou ",
                "https://shahiid-anime.net/series/arifureta-shokugyou-de-sekai-saikyou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/97682l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Toaru Kagaku no Accelerator  ",
                "https://shahiid-anime.net/series/toaru-kagaku-no-accelerator-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/95381l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tsuujki ga Zentai Kougeki de ou KougeNi-kai Kougeki no Okaasan wa Suki Desu ka? ",
                "https://shahiid-anime.net/series/tsuujou-kougeki-ga-zentai-kougeki-de-ni-kai-kougeki-no-okaasan-wa-suki-desu-ka-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99950l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tate no yuusha No Noriagari ",
                "https://shahiid-anime.net/series/tate-no-yuusha-no-noriagari/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/136926.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Pet ",
                "https://shahiid-anime.net/series/pet-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/94794l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " دراغون بول هيرو Dragon Ball Heroes ",
                "https://shahiid-anime.net/series/dragon-ball-heroes-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/100674l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Technoroid: Overmind ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-technoroid-overmind-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/132388.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Buddy Daddies ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-buddy-daddies-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/132462.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ars no Kyojuu ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-ars-no-kyojuu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/132161.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Hyouken no Majutsushi ga Sekai wo Suberu ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-hyouken-no-majutsushi-ga-sekai-wo-suberu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/131580.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " The Legend of Heroes: Sen no Kiseki – Northern War ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-the-legend-of-heroes-sen-no-kiseki-northern-war-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/132319.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tensei Oujo to Tensai Reijou no Mahou Kakumei ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-tensei-oujo-to-tensai-reijou-no-mahou-kakumei-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/132087.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Spy Kyoushitsu ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-spy-kyoushitsu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/131844.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Revenger ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-revenger-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/131748.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Koori Zokusei Danshi to Cool na Douryou Joshi ",
                "https://shahiid-anime.net/series/koori-zokusei-danshi-to-cool-na-douryou-joshi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/126451.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tomo-chan wa Onnanoko! ",
                "https://shahiid-anime.net/series/tomo-chan-wa-onnanoko-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/tomo-chan-wa-onnanoko-tomo-chan-is-a-girl.251905.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kaze no Shoujo Emily ",
                "https://shahiid-anime.net/series/kaze-no-shoujo-emily-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/131232.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Arknights: Reimei Zensou ",
                "https://shahiid-anime.net/series/arknights-reimei-zensou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/arknights-reimei-zensou-arknights-prelude-to-dawn.247581.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Urusei Yatsura (2022) ",
                "https://shahiid-anime.net/series/urusei-yatsura-2022-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/129144.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Renai Flops ",
                "https://shahiid-anime.net/series/renai-flops-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/128505.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Fuufu Ijou, Koibito Miman. ",
                "https://shahiid-anime.net/series/fuufu-ijou-koibito-miman-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/126442.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Akiba Maid Sensou ",
                "https://shahiid-anime.net/series/akiba-maid-sensou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/127385.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tensei shitara Ken Deshita ",
                "https://shahiid-anime.net/series/tensei-shitara-ken-deshita-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/127909.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Mushikaburi-hime ",
                "https://shahiid-anime.net/series/mushikaburi-hime-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/128714.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kage no Jitsuryokusha ni Naritakute! ",
                "https://shahiid-anime.net/series/kage-no-jitsuryokusha-ni-naritakute-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/kage-no-jitsuryokusha-ni-naritakute-the-eminence-in-shadow.246799.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Meitantei Conan: Hannin no Hanzawa-san ",
                "https://shahiid-anime.net/series/meitantei-conan-hannin-no-hanzawa-san-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/125527.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shinmai Renkinjutsushi no Tenpo Keiei ",
                "https://shahiid-anime.net/series/shinmai-renkinjutsushi-no-tenpo-keiei-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/125560.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Human Bug Daigaku ",
                "https://shahiid-anime.net/series/human-bug-daigaku-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/127867.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shinobi no Ittoki ",
                "https://shahiid-anime.net/series/shinobi-no-ittoki-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/125643.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Koukyuu no Karasu ",
                "https://shahiid-anime.net/series/koukyuu-no-karasu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/127228.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Mobile Suit Gundam: The Witch from Mercury ",
                "https://shahiid-anime.net/series/mobile-suit-gundam-the-witch-from-mercury-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/127624.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Seiken Densetsu: Legend of Mana – The Teardrop Crystal ",
                "https://shahiid-anime.net/series/seiken-densetsu-legend-of-mana-the-teardrop-crystal-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/123397.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Do It Yourself!! ",
                "https://shahiid-anime.net/series/do-it-yourself-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/127129.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Bocchi the Rock! ",
                "https://shahiid-anime.net/series/bocchi-the-rock-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/125289.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Yuusha Party wo Tsuihou sareta Beast Tamer, Saikyoushu no Nekomimi Shoujo to Deau ",
                "https://shahiid-anime.net/series/yuusha-party-wo-tsuihou-sareta-beast-tamer-saikyoushu-no-nekomimi-shoujo-to-deau-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/124357.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Blue Lock ",
                "https://shahiid-anime.net/series/blue-lock-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/123773.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Chainsaw Man ",
                "https://shahiid-anime.net/series/chainsaw-man-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/126216.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Akuyaku Reijou nanode Last Boss wo Kattemimashita ",
                "https://shahiid-anime.net/series/akuyaku-reijou-nanode-last-boss-wo-kattemimashita-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/126110.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Fuuto Tantei ",
                "https://shahiid-anime.net/series/fuuto-tantei-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/123588.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Saikin Yatotta Maid ga Ayashii ",
                "https://shahiid-anime.net/series/saikin-yatotta-maid-ga-ayashii-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/123845.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shine Post ",
                "https://shahiid-anime.net/series/shine-post-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/123710.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Warau Arsnotoria Sun! ",
                "https://shahiid-anime.net/series/warau-arsnotoria-sun-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/124696.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kuro no Shoukanshi ",
                "https://shahiid-anime.net/series/kuro-no-shoukanshi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/122905.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Isekai Yakkyoku ",
                "https://shahiid-anime.net/series/isekai-yakkyoku-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/123624.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Hoshi no Samidare ",
                "https://shahiid-anime.net/series/hoshi-no-samidare-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/124919.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kumichou Musume to Sewagakari ",
                "https://shahiid-anime.net/series/kumichou-musume-to-sewagakari-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/122063.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Bucchigire! ",
                "https://shahiid-anime.net/series/bucchigire-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/n52m4tqLLn6CsI5vXIMDCNQvhMz.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Extreme Hearts ",
                "https://shahiid-anime.net/series/extreme-hearts-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/121836.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Yofukashi no Uta ",
                "https://shahiid-anime.net/series/yofukashi-no-uta-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/123711.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shoot! Goal to the Future ",
                "https://shahiid-anime.net/series/shoot-goal-to-the-future-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/124120.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Made in Abyss ",
                "https://shahiid-anime.net/series/made-in-abyss-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/122519.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Isekai Ojisan ",
                "https://shahiid-anime.net/series/isekai-ojisan-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/124347.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shin Tennis no Ouji-sama: U-17 World Cup ",
                "https://shahiid-anime.net/series/shin-tennis-no-ouji-sama-u-17-world-cup-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/121955.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Mamahaha no Tsurego ga Motokano datta ",
                "https://shahiid-anime.net/series/mamahaha-no-tsurego-ga-motokano-datta-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/123281.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Isekai Meikyuu de Harem wo ",
                "https://shahiid-anime.net/series/isekai-meikyuu-de-harem-wo-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/121831.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kinsou no Vermeil: Gakeppuchi Majutsushi wa Saikyou no Yakusai to Mahou Sekai wo Tsukisusumu ",
                "https://shahiid-anime.net/series/kinsou-no-vermeil-gakeppuchi-majutsushi-wa-saikyou-no-yakusai-to-mahou-sekai-wo-tsukisusumu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/123724.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Engage Kiss ",
                "https://shahiid-anime.net/series/engage-kiss-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/0156650.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tensei Kenja no Isekai Life: Dai-2 no Shokugyou wo Ete, Sekai Saikyou ni Narimashita ",
                "https://shahiid-anime.net/series/tensei-kenja-no-isekai-life-dai-2-no-shokugyou-wo-ete-sekai-saikyou-ni-narimashita-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/120368.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Lycoris Recoil ",
                "https://shahiid-anime.net/series/lycoris-recoil-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/121838.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Yurei Deco ",
                "https://shahiid-anime.net/series/yurei-deco-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/124349.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Utawarerumono: Futari no Hakuoro ",
                "https://shahiid-anime.net/series/utawarerumono-futari-no-hakuoro-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/123280.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kami Kuzu☆Idol ",
                "https://shahiid-anime.net/series/kami-kuzu%e2%98%86idol-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/124088.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Bastard!! Ankoku no Hakaishin (ONA) ",
                "https://shahiid-anime.net/series/bastard-ankoku-no-hakaishin-ona-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/124228.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "RWBY: Hyousetsu Teikoku ",
                "https://shahiid-anime.net/series/rwby-hyousetsu-teikoku-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/121832.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Vampire in the Garden ",
                "https://shahiid-anime.net/series/vampire-in-the-garden-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/121956.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tales of Luminaria: The Fateful Crossroad ",
                "https://shahiid-anime.net/series/tales-of-luminaria-the-fateful-crossroad-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/120624.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Zuihou de Zhaohuan Shi ",
                "https://shahiid-anime.net/series/zuihou-de-zhaohuan-shi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/107435.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Summertime Render ",
                "https://shahiid-anime.net/series/summertime-render-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/120796.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kono Healer, Mendokusai ",
                "https://shahiid-anime.net/series/kono-healer-mendokusai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/121221.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kawaii dake ja Nai Shikimori-san ",
                "https://shahiid-anime.net/series/kawaii-dake-ja-nai-shikimori-san-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/121695.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kunoichi Tsubaki no Mune no Uchi ",
                "https://shahiid-anime.net/series/kunoichi-tsubaki-no-mune-no-uchi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/121343.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shijou Saikyou no Daimaou, Murabito A ni Tensei suru ",
                "https://shahiid-anime.net/series/shijou-saikyou-no-daimaou-murabito-a-ni-tensei-suru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/120095.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Ao Ashi ",
                "https://shahiid-anime.net/series/ao-ashi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/120871.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Spy x Family ",
                "https://shahiid-anime.net/series/spy-x-family-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138482.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Paripi Koumei ",
                "https://shahiid-anime.net/series/paripi-koumei-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/122297.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Dance Dance Danseur ",
                "https://shahiid-anime.net/series/dance-dance-danseur-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/121381.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Yuusha, Yamemasu ",
                "https://shahiid-anime.net/series/yuusha-yamemasu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/122301.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Koi wa Sekai Seifuku no Ato de ",
                "https://shahiid-anime.net/series/koi-wa-sekai-seifuku-no-ato-de-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/120593.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Gaikotsu Kishi-sama, Tadaima Isekai e Odekakechuu ",
                "https://shahiid-anime.net/series/gaikotsu-kishi-sama-tadaima-isekai-e-odekakechuu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/120706.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Mahoutsukai Reimeiki ",
                "https://shahiid-anime.net/series/mahoutsukai-reimeiki-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/121114.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Heroine Tarumono! Kiraware Heroine to Naisho no Oshigoto ",
                "https://shahiid-anime.net/series/heroine-tarumono-kiraware-heroine-to-naisho-no-oshigoto-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/heroine-tarumono-kiraware-her.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Black★★Rock Shooter: Dawn Fall ",
                "https://shahiid-anime.net/series/black%e2%98%85%e2%98%85rock-shooter-dawn-fall-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/121866.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tomodachi Game ",
                "https://shahiid-anime.net/series/tomodachi-game-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/121345.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "RPG Fudousan ",
                "https://shahiid-anime.net/series/rpg-fudousan-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/rpg-fudousan-rpg-real-estate.23527100.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Estab-Life: Great Escape ",
                "https://shahiid-anime.net/series/estab-life-great-escape-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/121606.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Birdie Wing: Golf Girls’ Story ",
                "https://shahiid-anime.net/series/birdie-wing-golf-girls-story-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/120541.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Meitantei Conan: Zero no Tea Time ",
                "https://shahiid-anime.net/series/meitantei-conan-zero-no-tea-time-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/121082.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shokei Shoujo no Virgin Road ",
                "https://shahiid-anime.net/series/shokei-shoujo-no-virgin-road-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/shokei-shoujo-no-virgin-road.235211.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Otome Game Sekai wa Mob ni Kibishii Sekai desu ",
                "https://shahiid-anime.net/series/otome-game-sekai-wa-mob-ni-kibishii-sekai-desu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/3d2020ee3e562f436efe85004c25725d1647341618_main.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Gunjou no Fanfare ",
                "https://shahiid-anime.net/series/gunjou-no-fanfare-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/121946.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Love All Play ",
                "https://shahiid-anime.net/series/love-all-play-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/120869.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shadowverse Flame ",
                "https://shahiid-anime.net/series/shadowverse-flame-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/120545.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Aharen-san wa Hakarenai ",
                "https://shahiid-anime.net/series/aharen-san-wa-hakarenai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/120636.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Hakuouki OVA ",
                "https://shahiid-anime.net/series/hakuouki-ova-%d9%85%d8%aa%d8%b1%d8%ac%d9%85%d8%a9/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/hakuouki-ova.230271.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Gensou Sangokushi: Tengen Reishinki ",
                "https://shahiid-anime.net/series/gensou-sangokushi-tengen-reishinki-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/gensou-sangokushi-tengen-reishinki.229983.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kenja no Deshi wo Nanoru Kenja ",
                "https://shahiid-anime.net/series/kenja-no-deshi-wo-nanoru-kenja-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/119223.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tensai Ouji no Akaji Kokka Saisei Jutsu ",
                "https://shahiid-anime.net/series/tensai-ouji-no-akaji-kokka-saisei-jutsu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/119511.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Fantasy Bishoujo Juniku Ojisan to ",
                "https://shahiid-anime.net/series/fantasy-bishoujo-juniku-ojisan-to-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/fantasy-bishoujo-juniku-ojisan-to.230003.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Futsal Boys!!!!! ",
                "https://shahiid-anime.net/series/futsal-boys-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/120394.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Baraou no Souretsu ",
                "https://shahiid-anime.net/series/baraou-no-souretsu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/118527.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Sabiiro no Armor: Reimei ",
                "https://shahiid-anime.net/series/sabiiro-no-armor-reimei-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/120362.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Dolls’ Frontline ",
                "https://shahiid-anime.net/series/dolls-frontline-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/c5GOXlm4kfRdK4w6XXwDGabW6A0.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Slow Loop ",
                "https://shahiid-anime.net/series/slow-loop-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/slow-loop.229709.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Saiyuuki Reload: Zeroin ",
                "https://shahiid-anime.net/series/saiyuuki-reload-zeroin-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/119862.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Ryman’s Club ",
                "https://shahiid-anime.net/series/rymans-club-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/120215.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Cue! ",
                "https://shahiid-anime.net/series/cue-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/5b8b6a4d3fb3b417736f318945753dbf1640353771_main.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Hakozume: Kouban Joshi no Gyakushuu ",
                "https://shahiid-anime.net/series/hakozume-kouban-joshi-no-gyakushuu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/119512.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shuumatsu no Harem ",
                "https://shahiid-anime.net/series/shuumatsu-no-harem-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/kcxcTt4yA3MflFQ4cTNLM62yitw.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shikkakumon no Saikyou Kenja ",
                "https://shahiid-anime.net/series/shikkakumon-no-saikyou-kenja-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/111441.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kaijin Kaihatsu-bu no Kuroitsu-san ",
                "https://shahiid-anime.net/series/kaijin-kaihatsu-bu-no-kuroitsu-san-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/119204.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Akebi-chan no Sailor-fuku ",
                "https://shahiid-anime.net/series/akebi-chan-no-sailor-fuku-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/120268.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Leadale no Daichi nite ",
                "https://shahiid-anime.net/series/leadale-no-daichi-nite-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/2ewgcfQexptUyR1m6uhcw5ttoeU.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tokyo 24-ku ",
                "https://shahiid-anime.net/series/tokyo-24-ku-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/120112.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Sabikui Bisco ",
                "https://shahiid-anime.net/series/sabikui-bisco-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/118840.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Sono Bisque Doll wa Koi wo Suru ",
                "https://shahiid-anime.net/series/sono-bisque-doll-wa-koi-wo-suru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/119897.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Koroshi Ai ",
                "https://shahiid-anime.net/series/koroshi-ai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/119329.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Orient ",
                "https://shahiid-anime.net/series/orient-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/119361.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "أوفا Sorairo Utility ",
                "https://shahiid-anime.net/series/%d8%a3%d9%88%d9%81%d8%a7-sorairo-utility-%d9%85%d8%aa%d8%b1%d8%ac%d9%85%d8%a9/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/118973.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "JoJo no Kimyou na Bouken Part 4: Diamond wa Kudakenai ",
                "https://shahiid-anime.net/series/jojo-no-kimyou-na-bouken-part-4-diamond-wa-kudakenai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/79156.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Fullmetal Alchemist ",
                "https://shahiid-anime.net/series/fullmetal-alchemist-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/75815.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Transformers: War for Cybertron Trilogy ",
                "https://shahiid-anime.net/series/transformers-war-for-cybertron-trilogy-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/transformers-war-for-cybertron-trilogy-kingdom-third-season.216732.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Super Crooks ",
                "https://shahiid-anime.net/series/super-crooks-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/super-crooks-first-season.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Arcane ",
                "https://shahiid-anime.net/series/arcane-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Arcane-fqldf2t8ztc9aiwn3k6mlX3tvRT.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "JoJo no Kimyou na Bouken Part 6: Stone Ocean ",
                "https://shahiid-anime.net/series/jojo-no-kimyou-na-bouken-part-6-stone-ocean-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/jojo-no-kimyou-na-bouken-part-6-stone-ocean-jojos-bizarre-adventure-stone-ocean.227165.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Blade Runner: Black Lotus ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-blade-runner-black-lotus-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/E8D8yjQVIAERKLb00.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shikizakura ",
                "https://shahiid-anime.net/series/shikizakura-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/116578.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Deep Insanity: The Lost Child ",
                "https://shahiid-anime.net/series/deep-insanity-the-lost-child-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/118466.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Gyakuten Sekai no Denchi Shoujo ",
                "https://shahiid-anime.net/series/gyakuten-sekai-no-denchi-shoujo-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/117774.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Senpai ga Uzai Kouhai no Hanashi ",
                "https://shahiid-anime.net/series/senpai-ga-uzai-kouhai-no-hanashi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/117931.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Build Divide: Code Black ",
                "https://shahiid-anime.net/series/build-divide-code-black-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/117452.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Saihate no Paladin ",
                "https://shahiid-anime.net/series/saihate-no-paladin-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138515.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Taishou Otome Otogibanashi ",
                "https://shahiid-anime.net/series/taishou-otome-otogibanashi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/113767.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Visual Prison ",
                "https://shahiid-anime.net/series/visual-prison-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/117924.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Platinum End ",
                "https://shahiid-anime.net/series/platinum-end-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/platinum-end.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Puraore! Pride of Orange ",
                "https://shahiid-anime.net/series/puraore-pride-of-orange-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/puraore-pride-of-orange.223181.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Sakugan ",
                "https://shahiid-anime.net/series/sakugan-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/118413.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Komi-san wa, Comyushou desu. ",
                "https://shahiid-anime.net/series/komi-san-wa-comyushou-desu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/117237.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Sekai Saikou no Ansatsusha, Isekai Kizoku ni Tensei suru ",
                "https://shahiid-anime.net/series/sekai-saikou-no-ansatsusha-isekai-kizoku-ni-tensei-suru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/117620.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Muv-Luv Alternative ",
                "https://shahiid-anime.net/series/muv-luv-alternative-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/118439.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Sankaku Mado no Sotogawa wa Yoru ",
                "https://shahiid-anime.net/series/sankaku-mado-no-sotogawa-wa-yoru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/117547.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Takt Op. Destiny ",
                "https://shahiid-anime.net/series/takt-op-destiny-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Takt-Op.-Destiny-724x1024-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Digimon Ghost Game ",
                "https://shahiid-anime.net/series/digimon-ghost-game-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/117606.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kyoukai Senki ",
                "https://shahiid-anime.net/series/kyoukai-senki-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/116668.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kyuuketsuki Sugu Shinu ",
                "https://shahiid-anime.net/series/kyuuketsuki-sugu-shinu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/117151.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shinka no Mi: Shiranai Uchi ni Kachigumi Jinsei ",
                "https://shahiid-anime.net/series/shinka-no-mi-shiranai-uchi-ni-kachigumi-jinsei-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/shinka-no-mi-shiranai-uchi-ni-kachigumi-jinsei-the-fruit-of-evolution-before-i-knew-it-my-life-had-it-made.222919.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Getsuyoubi no Tawawa ",
                "https://shahiid-anime.net/series/getsuyoubi-no-tawawa-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/117813.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Ganbare Douki-chan ",
                "https://shahiid-anime.net/series/ganbare-douki-chan-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/117548.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shin no Nakama ja Nai to Yuusha no Party wo Oidasareta node, Henkyou de Slow Life suru Koto ni Shimashita ",
                "https://shahiid-anime.net/series/shin-no-nakama-ja-nai-to-yuusha-no-party-wo-oidasareta-node-henkyou-de-slow-life-suru-koto-ni-shimashita-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/111230l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tsuki to Laika to Nosferatu ",
                "https://shahiid-anime.net/series/tsuki-to-laika-to-nosferatu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/118374.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tesla Note ",
                "https://shahiid-anime.net/series/tesla-note-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/116890.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Mieruko-chan ",
                "https://shahiid-anime.net/series/mieruko-chan-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/117155.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Selection Project ",
                "https://shahiid-anime.net/series/selection-project-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/113554.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Blue Period ",
                "https://shahiid-anime.net/series/blue-period-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/116931.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Biohazard: Infinite Darkness ",
                "https://shahiid-anime.net/series/biohazard-infinite-darkness-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/biohazard_infinite_darkness-349452144-large.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Blood of Zeus ",
                "https://shahiid-anime.net/series/blood-of-zeus-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Blood-of-Zeus-16537-poster.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Xian Wang de Richang Shenghuo ",
                "https://shahiid-anime.net/series/xian-wang-de-richang-shenghuo-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/105508.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kaizoku Oujo ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-kaizoku-oujo-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/115855l.webp?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Jahy-sama wa Kujikenai! ",
                "https://shahiid-anime.net/series/jahy-sama-wa-kujikenai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/yAAkRRFMd6VaAWT2zg1URnumNQX.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Heion Sedai no Idaten-tachi ",
                "https://shahiid-anime.net/series/heion-sedai-no-idaten-tachi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/osCAbL4rdGUVLH3o2rlYZpDaiCb.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Megami-ryou no Ryoubo-kun. ",
                "https://shahiid-anime.net/series/megami-ryou-no-ryoubo-kun-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/tB4Fd8D8GT7dGFKckPSpa5KEhKa.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Night Head 2041 ",
                "https://shahiid-anime.net/series/night-head-2041-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/mJ7t9wyD43H32E9Sv22mMrVmkLo.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Deatte 5-byou de Battle ",
                "https://shahiid-anime.net/series/deatte-5-byou-de-battle-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/rt1gmKCONtlcJoBfNvNhcLQziLH.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "D_Cide Traumerei the Animation ",
                "https://shahiid-anime.net/series/d_cide-traumerei-the-animation-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/z5BEjsn820bDzwQz8lPThCHAHkq.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shiroi Suna no Aquatope ",
                "https://shahiid-anime.net/series/shiroi-suna-no-aquatope-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/zVyLvchDYj1gYkAH7y1SRS0Ko30.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Meikyuu Black Company ",
                "https://shahiid-anime.net/series/meikyuu-black-company-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/coAkyVOGFTTkNQeUilbzNP57nGP.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tsuki ga Michibiku Isekai Douchuu ",
                "https://shahiid-anime.net/series/tsuki-ga-michibiku-isekai-douchuu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/nCQgjGSRjMbKX27PWf26M7DZukO.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Cheat Kusushi no Slow Life: Isekai ni Tsukurou Drugstore ",
                "https://shahiid-anime.net/series/cheat-kusushi-no-slow-life-isekai-ni-tsukurou-drugstore-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/7vyK57Er6hG2YBlMzEXAfNIR9P0.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Seirei Gensouki ",
                "https://shahiid-anime.net/series/seirei-gensouki-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/d43CM2cRqMlZgnqFB8kWPIVM2z3.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Uramichi Oniisan ",
                "https://shahiid-anime.net/series/uramichi-oniisan-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/bh3yjvHZodeVMtI8NitZIcbrIUK.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Getter Robo Arc ",
                "https://shahiid-anime.net/series/getter-robo-arc-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/esCeud4cz74FEm8Gqwy7m0dmSrf.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shinigami Bocchan to Kuro Maid ",
                "https://shahiid-anime.net/series/shinigami-bocchan-to-kuro-maid-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/mDmHIOxg909lK7oITB5T0TxZt5r.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tantei wa Mou, Shindeiru. ",
                "https://shahiid-anime.net/series/tantei-wa-mou-shindeiru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/5NXO5acrIa2hkDxIqFyKcVW6vca.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Re-Main ",
                "https://shahiid-anime.net/series/re-main-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/t0eM3XgTTIokfNMpVYfNrZqZlvP.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Genjitsu Shugi Yuusha no Oukoku Saikenki ",
                "https://shahiid-anime.net/series/genjitsu-shugi-yuusha-no-oukoku-saikenki-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/aYkTi5RqsdBRUfy0pUUWUiY7Ga2.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Bokutachi no Remake ",
                "https://shahiid-anime.net/series/bokutachi-no-remake-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/dUq8ZrPotvqy8kUWTuk1EKW765o.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kageki Shoujo!! ",
                "https://shahiid-anime.net/series/kageki-shoujo-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/jee2p5CXSIS9V5Vxx0Uwe9Qr1Hb.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Mahouka Koukou no Yuutousei ",
                "https://shahiid-anime.net/series/mahouka-koukou-no-yuutousei-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/ukDNjfJJj4GyiKFCddKChwWUbYz.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kanojo mo Kanojo ",
                "https://shahiid-anime.net/series/kanojo-mo-kanojo-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/kanojo-mo-kanojo-girlfriend-girlfriend.214486.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Vanitas no Carte ",
                "https://shahiid-anime.net/series/vanitas-no-carte-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/kygDQJiBw2xDnpupQCFyDDe86DW.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Higurashi no Naku Koro ni Sotsu ",
                "https://shahiid-anime.net/series/higurashi-no-naku-koro-ni-sotsu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/yPAkeiSBCbaneIFGF8w3vQBmAmg.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Peach Boy Riverside ",
                "https://shahiid-anime.net/series/peach-boy-riverside-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/iItmnX7PMtfZuYsumdMkutmQOO1-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Sonny Boy ",
                "https://shahiid-anime.net/series/sonny-boy-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/115869.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Scarlet Nexus ",
                "https://shahiid-anime.net/series/scarlet-nexus-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/114899.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Castlevania ",
                "https://shahiid-anime.net/series/castlevania-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/wLcyadyOtGFhg45zHeLJNw7ORlk.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Eden ",
                "https://shahiid-anime.net/series/eden-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/yqaQPvPpdQBPX3zOiKKbxQDrqRw.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Yasuke ",
                "https://shahiid-anime.net/series/yasuke-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/yasuke-first-season.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "SD Gundam World Heroes ",
                "https://shahiid-anime.net/series/sd-gundam-world-heroes-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/sd-gundam-world-heroes.207903.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Cestvs: The Roman Fighter ",
                "https://shahiid-anime.net/series/cestvs-the-roman-fighter-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/114014.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Osananajimi ga Zettai ni Makenai Love Comedy ",
                "https://shahiid-anime.net/series/osananajimi-ga-zettai-ni-makenai-love-comedy-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/113327.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Battle Athletess Daiundoukai ReSTART! ",
                "https://shahiid-anime.net/series/battle-athletess-daiundoukai-restart-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/113795.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Bishounen Tanteidan ",
                "https://shahiid-anime.net/series/bishounen-tanteidan-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/110172.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shadows House ",
                "https://shahiid-anime.net/series/shadows-house-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/113342.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "86 Eighty Six ",
                "https://shahiid-anime.net/series/86-eighty-six-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/113797.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Slime Taoshite 300-nen, Shiranai Uchi ni Level Max ni Nattemashita ",
                "https://shahiid-anime.net/series/slime-taoshite-300-nen-shiranai-uchi-ni-level-max-ni-nattemashita-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/113723.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Blue Reflection Ray ",
                "https://shahiid-anime.net/series/blue-reflection-ray-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/113840.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Subarashiki Kono Sekai The Animation ",
                "https://shahiid-anime.net/series/subarashiki-kono-sekai-the-animation-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/111566.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Godzilla: S.P ",
                "https://shahiid-anime.net/series/godzilla-s-p-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/112581.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Bakuten!! ",
                "https://shahiid-anime.net/series/bakuten-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/113510.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Fairy Ranmaru: Anata no Kokoro Otasuke Shimasu ",
                "https://shahiid-anime.net/series/fairy-ranmaru-anata-no-kokoro-otasuke-shimasu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/s4nO833HLTK5Uxz8NW8WoapE2Dq.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Gokushufudou ",
                "https://shahiid-anime.net/series/gokushufudou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/113180.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Super Cub ",
                "https://shahiid-anime.net/series/super-cub-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/111172.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Alice in Deadly School OVA ",
                "https://shahiid-anime.net/series/alice-in-deadly-school-ova-%d9%85%d8%aa%d8%b1%d8%ac%d9%85%d8%a9/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/110455.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Seijo no Maryoku wa Bannou Desu ",
                "https://shahiid-anime.net/series/seijo-no-maryoku-wa-bannou-desu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/q5R03Plc4N6SRMBbv0DEsiThv9w.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Yakunara Mug Cup mo ",
                "https://shahiid-anime.net/series/yakunara-mug-cup-mo-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/faSPCo94Q11aJ73Et6joXI39DJg.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Sayonara Watashi no Cramer ",
                "https://shahiid-anime.net/series/sayonara-watashi-no-cramer-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/jMpjStc5RgDu2AmFHyPOfL2pCq5.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Seven Knights Revolution: Eiyuu no Keishousha ",
                "https://shahiid-anime.net/series/seven-knights-revolution-eiyuu-no-keishousha-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/mbhfIiQbUABptjWbZ65NoIAZnTW.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Dragon, Ie wo Kau. ",
                "https://shahiid-anime.net/series/dragon-ie-wo-kau-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/4tmfddob3Lnn6PLxEReRj39yhiM.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Sentouin, Hakenshimasu! ",
                "https://shahiid-anime.net/series/sentouin-hakenshimasu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/tk0LqlgKzc79nWtTmgGz41yu6p3.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Mashiro no Oto ",
                "https://shahiid-anime.net/series/mashiro-no-oto-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/c5TXVs0BRGy7smjMHiqUnttiktw.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kyuukyoku Shinka shita Full Dive RPG ga Genjitsu yori mo Kusoge Dattara ",
                "https://shahiid-anime.net/series/kyuukyoku-shinka-shita-full-dive-rpg-ga-genjitsu-yori-mo-kusoge-dattara-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/4FrgskezC02csLdMphyOxuYoguj.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tokyo Revengers ",
                "https://shahiid-anime.net/series/tokyo-revengers-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138322.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Hige wo Soru. Soshite Joshikousei wo Hirou. ",
                "https://shahiid-anime.net/series/hige-wo-soru-soshite-joshikousei-wo-hirou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/pRfn6D3hP64bcQ4THr7Lnv8s3hb.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tensura Nikki: Tensei shitara Slime Datta Ken ",
                "https://shahiid-anime.net/series/tensura-nikki-tensei-shitara-slime-datta-ken-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/jf88OMvYSQbeJWYwChJhN7j6K0A.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Fumetsu no Anata e ",
                "https://shahiid-anime.net/series/fumetsu-no-anata-e-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/jxtLpQq0I7MF8kP99w0Q0K39UpG.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Ijiranaide, Nagatoro-san ",
                "https://shahiid-anime.net/series/ijiranaide-nagatoro-san-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/noSvSkVHkja4BASVDevKL4HDaoT.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shakunetsu Kabaddi ",
                "https://shahiid-anime.net/series/shakunetsu-kabaddi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/jNFZ9Qn56yj6QDK1CoaJmCE8qTn.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Vivy: Fluorite Eye’s Song ",
                "https://shahiid-anime.net/series/vivy-fluorite-eyes-song-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/7gBEMy646un8Qd8SVKi7AGkb9M4.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "SSSS.Dynazenon ",
                "https://shahiid-anime.net/series/ssss-dynazenon-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/5oJNRLySEOI3mdMGSGfrCrog48f.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shaman King (2021) ",
                "https://shahiid-anime.net/series/shaman-king-2021-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/rFFsdLlwyclyM83ALobrfMhr28A.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Cardfight!! Vanguard: overDress ",
                "https://shahiid-anime.net/series/cardfight-vanguard-overdress-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/l1KTsbSvONhHO5KLU00XvYM3dDp.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Jouran: The Princess of Snow and Blood ",
                "https://shahiid-anime.net/series/jouran-the-princess-of-snow-and-blood-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/gXrGwyldMJRslgk7mf3auqnnF0u.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Edens Zero ",
                "https://shahiid-anime.net/series/edens-zero-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/206XV6WWn9WN7TIsJB3tyRH0oLs.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Koi to Yobu ni wa Kimochi Warui ",
                "https://shahiid-anime.net/series/koi-to-yobu-ni-wa-kimochi-warui-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/gPS6ip5T0W823Z0rlDhopXI6i1h.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Mars Red ",
                "https://shahiid-anime.net/series/mars-red-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/zOROtGE5TF04X1M7vEUOy8EkULv.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Dota: Dragon’s Blood ",
                "https://shahiid-anime.net/series/dota-dragons-blood-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/cp9yXhqaJE2HqbJPHbZFZmyROdw.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Pacific Rim: The Black ",
                "https://shahiid-anime.net/series/pacific-rim-the-black-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/images-5.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tenkuu Shinpan",
                "https://shahiid-anime.net/series/tenkuu-shinpan/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/qcyMLtT7nFxP0SvzXxrLQQp52iQ.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Vlad Love ",
                "https://shahiid-anime.net/series/vlad-love-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/vlad-love-vladlove.203358.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Wonder Egg Priority ",
                "https://shahiid-anime.net/series/wonder-egg-priority-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/oktwnQKdZpoBycT77XcDKmnT9XW.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kaifuku Jutsushi no Yarinaoshi ",
                "https://shahiid-anime.net/series/kaifuku-jutsushi-no-yarinaoshi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/efedef79391608297649_main.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Azur Lane: Bisoku Zenshin! ",
                "https://shahiid-anime.net/series/azur-lane-bisoku-zenshin-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/azur-lane-bisoku-zenshin-azur-lane-slow-ahead.200670.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Wave!! Surfing Yappe!! (TV) ",
                "https://shahiid-anime.net/series/wave-surfing-yappe-tv-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/wave-surfing-yappe-tv-wave-lets-go-surfing.200675.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Ex-Arm ",
                "https://shahiid-anime.net/series/ex-arm-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/ex-arm.200588fffff.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kemono Jihen ",
                "https://shahiid-anime.net/series/kemono-jihen-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/ct6HkcvSGDC5yT6eQKdBn4HWcNC.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "SK∞ ",
                "https://shahiid-anime.net/series/sk%e2%88%9e-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/ksb6QlSCsRLr3MNmxc8ojOOLK6V.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Horimiya ",
                "https://shahiid-anime.net/series/horimiya-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/horimiya0.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kai Byoui Ramune ",
                "https://shahiid-anime.net/series/kai-byoui-ramune-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/kai-byoui-ramune-dr-ramune-mysterious-disease-.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Jaku-Chara Tomozaki-kun ",
                "https://shahiid-anime.net/series/jaku-chara-tomozaki-kun-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/jaku-chara-tomozaki-kun.200380.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Project Scard: Praeter no Kizu ",
                "https://shahiid-anime.net/series/project-scard-praeter-no-kizu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/109124.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Back Arrow ",
                "https://shahiid-anime.net/series/back-arrow-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/110674.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Ore dake Haireru Kakushi Dungeon ",
                "https://shahiid-anime.net/series/ore-dake-haireru-kakushi-dungeon-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/109120.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "WIXOSS Diva(A)Live ",
                "https://shahiid-anime.net/series/wixoss-divaalive-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/110434.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kumo Desu ga, Nani ka? ",
                "https://shahiid-anime.net/series/kumo-desu-ga-nani-ka-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/110322.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Hataraku Saibou Black (TV) ",
                "https://shahiid-anime.net/series/hataraku-saibou-black-tv-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/110799.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "I★Chu: Halfway Through the Idol ",
                "https://shahiid-anime.net/series/i%e2%98%85chu-halfway-through-the-idol-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/110096.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Uma Musume: Pretty Derby (TV)",
                "https://shahiid-anime.net/series/uma-musume-pretty-derby-tv/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/110803.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tenchi Souzou Design-bu ",
                "https://shahiid-anime.net/series/tenchi-souzou-design-bu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/109865.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Soukou Musume Senki ",
                "https://shahiid-anime.net/series/soukou-musume-senki-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/110186.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Hortensia Saga (TV) ",
                "https://shahiid-anime.net/series/hortensia-saga-tv-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Hortensia-Saga-TV.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Gekidol ",
                "https://shahiid-anime.net/series/gekidol-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/110365.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Urasekai Picnic ",
                "https://shahiid-anime.net/series/urasekai-picnic-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Ura-Sekai-Picnic-1-1462x2048-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tatoeba Last Dungeon Mae no Mura no Shounen ga Joban no Machi de Kurasu Youna Monogatari ",
                "https://shahiid-anime.net/series/tatoeba-last-dungeon-mae-no-mura-no-shounen-ga-joban-no-machi-de-kurasu-youna-monogatari-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106599.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Skate-Leading☆Stars ",
                "https://shahiid-anime.net/series/skate-leading%e2%98%86stars-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106481.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Mushoku Tensei: Isekai Ittara Honki Dasu ",
                "https://shahiid-anime.net/series/mushoku-tensei-isekai-ittara-honki-dasu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141251.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Onyx Equinox ",
                "https://shahiid-anime.net/series/onyx-equinox-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/onyx.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Highschool of the Dead ",
                "https://shahiid-anime.net/series/highschool-of-the-dead-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/wf3bBKp1RgCJjyCBLfEAbZjVr31.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Adachi to Shimamura",
                "https://shahiid-anime.net/series/adachi-to-shimamura/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/9EZgcyY2WEBd2AAxNKpUnUSneoj.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kuma Kuma Kuma Bear",
                "https://shahiid-anime.net/series/kuma-kuma-kuma-bear/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/gbvF4KfQdoCLbACSIaQlkq7PE5f.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Magatsu Wahrheit: Zuerst",
                "https://shahiid-anime.net/series/magatsu-wahrheit-zuerst/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/b1QTrOrbkmj6lp70GyDpwU0zqw8.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Maoujou de Oyasumi",
                "https://shahiid-anime.net/series/maoujou-de-oyasumi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/3bmu7Mg7Sc6IfHgvt98WNChaOkR.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Love Live! Nijigasaki Gakuen School Idol Doukoukai",
                "https://shahiid-anime.net/series/love-live-nijigasaki-gakuen-school-idol-doukoukai/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/zX30sdcxqrhxayRQUIozabTLFMH.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kamisama ni Natta Hi",
                "https://shahiid-anime.net/series/kamisama-ni-natta-hi/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/SF65DSF4HG54DGTH.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Senyoku no Sigrdrifa ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-senyoku-no-sigrdrifa-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/senyoku-no-sigrdrifa.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Iwa Kakeru!: Sport Climbing Girls",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-iwa-kakeru-sport-climbing-girls/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/9X4ubebN3m53E672kpufos4IBz4.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Akudama Drive ",
                "https://shahiid-anime.net/series/akudama-drive-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/54EFDG45F5H4J6SFSDFG.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kimi to Boku no Saigo no Senjou, Aruiwa Sekai ga Hajimaru Seisen ",
                "https://shahiid-anime.net/series/kimi-to-boku-no-saigo-no-senjou-aruiwa-sekai-ga-hajimaru-seisen-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/6FGH65HFG65J4JKM6SDFRSD.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Ikebukuro West Gate Park",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d8%a7%d9%84%d8%ad%d9%84%d9%82%d8%a7%d8%aa-%d8%a7%d9%86%d9%85%d9%8a-ikebukuro-west-gate-park-%d9%85%d8%aa%d8%b1%d8%ac%d9%85%d8%a9-%d8%a7%d9%88%d9%86-%d9%84%d8%a7%d9%8a%d9%86/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/DFSG4F5J4H5SDF945FSD5G.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Noblesse ",
                "https://shahiid-anime.net/series/noblesse-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/85F447ZEI985FRD.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Yuukoku no Moriarty ",
                "https://shahiid-anime.net/series/yuukoku-no-moriarty-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/108330l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kami-tachi ni Hirowareta Otoko ",
                "https://shahiid-anime.net/series/kami-tachi-ni-hirowareta-otoko-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/107084l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Munou na Nana ",
                "https://shahiid-anime.net/series/munou-na-nana-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/109146l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Jujutsu Kaisen (TV) ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-jujutsu-kaisen-tv-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138022.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Majo no Tabitabi ",
                "https://shahiid-anime.net/series/majo-no-tabitabi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/108501l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " King’s Raid: Ishi wo Tsugumono-tachi ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-kings-raid-ishi-wo-tsugumono-tachi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/109083l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tonikaku Kawaii ",
                "https://shahiid-anime.net/series/tonikaku-kawaii-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/108722l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dragon Quest: Dai no Daibouken (2020)  ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-dragon-quest-dai-no-daibouken-2020-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/108771l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Higurashi no Naku Koro ni (2020) ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-higurashi-no-naku-koro-ni-2020-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/105271l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Assault Lily: Bouquet ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-assault-lily-bouquet-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/108413l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " 100-man no Inochi no Ue ni Ore wa Tatteiru ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-100-man-no-inochi-no-ue-ni-ore-wa-tatteiru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/108800l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dragon’s Dogma  أون لاين ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-dragons-dogma-%d9%85%d8%aa%d8%b1%d8%ac%d9%85-%d8%a3%d9%88%d9%86-%d9%84%d8%a7%d9%8a%d9%86-%d9%88%d8%aa%d8%ad%d9%85%d9%8a%d9%84/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/dragons_dogma_anime.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Nihon Chinbotsu 2020 ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-nihon-chinbotsu-2020-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/107335.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Dokyuu Hentai HxEros ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-dokyuu-hentai-hxeros-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/DokyuuHentaiHxEroswp.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Ninja Collection ",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d8%ad%d9%84%d9%82%d8%a7%d8%aa-%d8%a3%d9%86%d9%85%d9%8a-ninja-collection-%d9%85%d8%aa%d8%b1%d8%ac%d9%85-%d8%a3%d9%88%d9%86-%d9%84%d8%a7%d9%8a%d9%86-%d9%88%d8%aa%d8%ad%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/320.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Koi to Producer: EVOL×LOVE ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-koi-to-producer-evolxlove-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/108276.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Gibiate  أون لاين ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-gibiate-%d9%85%d8%aa%d8%b1%d8%ac%d9%85-%d8%a3%d9%88%d9%86-%d9%84%d8%a7%d9%8a%d9%86-%d9%88%d8%aa%d8%ad%d9%85%d9%8a%d9%84/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/107880.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Monster Musume no Oishasan ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-monster-musume-no-oishasan-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/Monster-Musume-no-Oisha-san-key-300x422-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Peter Grill to Kenja no Jikan ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-peter-grill-to-kenja-no-jikan-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106693.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kanojo, Okarishimasu ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-kanojo-okarishimasu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/107693.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Uzaki-chan wa Asobitai! ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-uzaki-chan-wa-asobitai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/108292.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Deca-Dence ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-deca-dence-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/107552.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Muhyo to Rouji no Mahouritsu Soudan Jimusho ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-muhyo-to-rouji-no-mahouritsu-soudan-jimusho-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106376.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " The God of High School ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-the-god-of-high-school-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/107269.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Maou Gakuin no Futekigousha: Shijou Saikyou no Maou no Shiso, Tensei shite Shison-tachi no Gakkou e ",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d8%ad%d9%84%d9%82%d8%a7%d8%aa-%d8%a3%d9%86%d9%85%d9%8a-maou-gakuin-no-futekigousha-shijou-saikyou-no-maou-no-shiso-tensei-shite-shison-tachi-no-gakkou-e-%d9%85%d8%aa%d8%b1/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/128323.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Lapis Re:LiGHTs ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-lapis-relights-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/107611.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Great Pretender  أون لاين ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-great-pretender-%d9%85%d8%aa%d8%b1%d8%ac%d9%85-%d8%a3%d9%88%d9%86-%d9%84%d8%a7%d9%8a%d9%86-%d9%88%d8%aa%d8%ad%d9%85%d9%8a%d9%84/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/great_pretender_8804.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "  Yichang Shengwu Jianwenlu ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-yichang-shengwu-jianwenlu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/DFHGJDFG.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Tengen Toppa Gurren Lagann ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-tengen-toppa-gurren-lagann-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/7101499860722170.0084810256958.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Yu☆Gi☆Oh!: Sevens",
                "https://shahiid-anime.net/series/yu%e2%98%86gi%e2%98%86oh-sevens/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104940l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Koukaku Kidoutai: SAC_2045  أون لاين ",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d8%ad%d9%84%d9%82%d8%a7%d8%aa-%d8%a3%d9%86%d9%85%d9%8a-koukaku-kidoutai-sac_2045-%d8%a7%d9%84%d9%85%d9%88%d8%b3%d9%85-%d8%a7%d9%84%d8%a3%d9%88%d9%84-%d9%85%d8%aa%d8%b1%d8%ac/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/animenwes.blogspot.com_002.png?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "أوفا Strike the Blood IV ",
                "https://shahiid-anime.net/series/%d8%a3%d9%88%d9%81%d8%a7-strike-the-blood-iv-%d9%85%d8%aa%d8%b1%d8%ac%d9%85%d8%a9/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104833.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shadowverse (TV) ",
                "https://shahiid-anime.net/series/shadowverse-tv-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106498l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "jashin chan dropkick  ",
                "https://shahiid-anime.net/series/jashin-chan-dropkick-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106182l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "  Tsugumomo",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d9%85%d9%88%d8%a7%d8%b3%d9%85-%d8%a7%d9%84%d8%a7%d9%86%d9%85%d9%8a-tsugumomo-%d9%85%d8%aa%d8%b1%d8%ac%d9%85%d8%a9-%d8%a7%d9%88%d9%86-%d9%84%d8%a7%d9%8a%d9%86-%d9%88%d8%aa/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106184l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Zenonzard The Animation ",
                "https://shahiid-anime.net/series/zenonzard-the-animation-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/105048l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Gal to Kyouryuu ",
                "https://shahiid-anime.net/series/gal-to-kyouryuu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102874l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shin Sakura Taisen the Animation ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-shin-sakura-taisen-the-animation-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/105735l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Hachi-nan tte, Sore wa Nai deshou! ",
                "https://shahiid-anime.net/series/hachi-nan-tte-sore-wa-nai-deshou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104668l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tamayomi ",
                "https://shahiid-anime.net/series/tamayomi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102449l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "7 Seeds",
                "https://shahiid-anime.net/series/7-seeds/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106054l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Yesterday wo Utatte ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-yesterday-wo-utatte-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104517l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shironeko Project: Zero Chronicle ",
                "https://shahiid-anime.net/series/shironeko-project-zero-chronicle-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102045l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shachou, Battle no Jikan Desu!  اون لاين ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-shachou-battle-no-jikan-desu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85-%d8%a7%d9%88%d9%86-%d9%84%d8%a7%d9%8a%d9%86-%d9%88%d8%aa%d8%ad%d9%85%d9%8a%d9%84/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106309l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Princess Connect! Re:Dive ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-princess-connect-redive-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106070l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Otome Game no Hametsu Flag shika Nai Akuyaku Reijou ni Tensei shiteshimatta…",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-otome-game-no-hametsu-flag-shika-nai-akuyaku-reijou-ni-tensei-shiteshimatta-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106420l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Nami yo Kiitekure ",
                "https://shahiid-anime.net/series/nami-yo-kiitekure-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/103437l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Motto! Majime ni Fumajime Kaiketsu Zorori ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-motto-majime-ni-fumajime-kaiketsu-zorori-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106017l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Mewkledreamy ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-mewkledreamy-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/105775l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Listeners ",
                "https://shahiid-anime.net/series/listeners-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106391l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kitsutsuki Tanteidokoro ",
                "https://shahiid-anime.net/series/kitsutsuki-tanteidokoro-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/103380l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kami no Tou ",
                "https://shahiid-anime.net/series/kami-no-tou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106229l-1.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Houkago Teibou Nisshi ",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d8%a7%d9%84%d8%ad%d9%84%d9%82%d8%a7%d8%aa-%d8%a7%d8%a7%d9%86%d9%85%d9%8a-houkago-teibou-nisshi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85%d8%a9/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/105563l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kakushigoto (TV) ",
                "https://shahiid-anime.net/series/kakushigoto-tv-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104759l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Fugou Keiji: Balance:Unlimited ",
                "https://shahiid-anime.net/series/fugou-keiji-balanceunlimited-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106476l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Bungou to Alchemist: Shinpan no Haguruma ",
                "https://shahiid-anime.net/series/bungou-to-alchemist-shinpan-no-haguruma-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/105954l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Digimon Adventure: 2020 ",
                "https://shahiid-anime.net/series/digimon-adventure-2020-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/105558l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "BNA ",
                "https://shahiid-anime.net/series/bna-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106404l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Arte ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-arte-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104516l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Gleipnir  اون لاين",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d8%a7%d9%84%d8%ad%d9%84%d9%82%d8%a7%d8%aa-%d8%a7%d9%86%d9%85%d9%8a-gleipnir-%d9%85%d8%aa%d8%b1%d8%ac%d9%85%d8%a9-%d8%a7%d9%88%d9%86-%d9%84%d8%a7%d9%8a%d9%86/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106557l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Appare-Ranman! ",
                "https://shahiid-anime.net/series/appare-ranman-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/106012l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "A3! Season Spring & Summer ",
                "https://shahiid-anime.net/series/a3-season-spring-summer-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/103594l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "ARP Backstage Pass ",
                "https://shahiid-anime.net/series/arp-backstage-pass-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104231l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Nanabun no Nijyuuni 22/7 ",
                "https://shahiid-anime.net/series/nanabun-no-nijyuuni-22-7-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/103155l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Boku no Tonari ni Ankoku Hakaishin ga Imasu. ",
                "https://shahiid-anime.net/series/boku-no-tonari-ni-ankoku-hakaishin-ga-imasu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/103547l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Breakers ",
                "https://shahiid-anime.net/series/breakers-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/8852937bfcbdf90fc_ca.jpg?resize=190%2C279&ssl=1"
        ));
        anime.addAnime(new anime(
                "Rikei ga Koi ni Ochita no de Shoumei shitemita ",
                "https://shahiid-anime.net/series/rikei-ga-koi-ni-ochita-no-de-shoumei-shitemita-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/101991l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Uchi Tama?! Uchi no Tama Shirimasen ka? ",
                "https://shahiid-anime.net/series/uchi-tama-uchi-no-tama-shirimasen-ka-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/103162l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Jibaku Shounen Hanako-kun ",
                "https://shahiid-anime.net/series/jibaku-shounen-hanako-kun-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/t_700x780.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Nekopara ",
                "https://shahiid-anime.net/series/nekopara-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/téléchargement-4.jpg?resize=194%2C260&ssl=1"
        ));
        anime.addAnime(new anime(
                "Murenase! Seton Gakuen ",
                "https://shahiid-anime.net/series/murenase-seton-gakuen-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104666l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Natsunagu! ",
                "https://shahiid-anime.net/series/natsunagu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104408l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " number24 ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-number24-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102374.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Housekishou Richard-shi no Nazo Kantei ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-housekishou-richard-shi-no-nazo-kantei-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102512.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Itai no wa Iya nano de Bougyoryoku ni Kyokufuri Shitai to Omoimasu. ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-itai-no-wa-iya-nano-de-bougyoryoku-ni-kyokufuri-shitai-to-omoimasu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/97035.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Eizouken ni wa Te wo Dasu na! ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-eizouken-ni-wa-te-wo-dasu-na-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104498.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Koisuru Asteroid ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-koisuru-asteroid-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104212.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Kuutei Dragons ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-kuutei-dragons-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/103606.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Infinite Dendrogram ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-infinite-dendrogram-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104365.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Somali to Mori no Kamisama ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-somali-to-mori-no-kamisama-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102796.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Runway de Waratte ",
                "https://shahiid-anime.net/series/runway-de-waratte-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104540l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Dorohedoro ",
                "https://shahiid-anime.net/series/dorohedoro-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104786l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Magia Record: Mahou Shoujo Madoka☆Magica Gaiden (TV) ",
                "https://shahiid-anime.net/series/magia-record-mahou-shoujo-madoka%e2%98%86magica-gaiden-tv-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104783l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Darwin’s Game ",
                "https://shahiid-anime.net/series/darwins-game-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104499l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Toaru Kagaku no Railgun T ",
                "https://shahiid-anime.net/series/toaru-kagaku-no-railgun-t-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/103287l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Majutsushi Orphen Hagure Tabi ",
                "https://shahiid-anime.net/series/majutsushi-orphen-hagure-tabi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104481l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Plunderer ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-plunderer-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/104420.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "ID:Invaded ",
                "https://shahiid-anime.net/series/idinvaded-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/103347l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kyokou Suiri ",
                "https://shahiid-anime.net/series/kyokou-suiri-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/101302l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Levius ",
                "https://shahiid-anime.net/series/levius/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99916.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "   Kengan Ashura ",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d9%85%d9%88%d8%a7%d8%b3%d9%85-%d8%a3%d9%86%d9%85%d9%8a-kengan-ashura-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/100770l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "  Sengoku Basara ",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d9%85%d9%88%d8%a7%d8%b3%d9%85-%d8%a3%d9%86%d9%85%d9%8a-sengoku-basara-%d9%85%d8%aa%d8%b1%d8%ac%d9%85%d8%a9/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/21849.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Rainbow: Nisha Rokubou no Shichinin ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-rainbow-nisha-rokubou-no-shichinin-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/72697.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "  أوفا Tennis no Ouji-sama: Zenkoku Taikai-hen",
                "https://shahiid-anime.net/series/%d8%ac%d9%85%d9%8a%d8%b9-%d8%ad%d9%84%d9%82%d8%a7%d8%aa-%d8%a3%d9%88%d9%81%d8%a7-tennis-no-ouji-sama-zenkoku-taikai-hen/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/10572.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Heroman ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-heroman-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/23841.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Giant Killing ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-giant-killing-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/30191.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Cross Ange: Tenshi to Ryuu no Rondo ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-cross-ange-tenshi-to-ryuu-no-rondo-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/67515.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " 11eyes ",
                "https://shahiid-anime.net/series/%d8%a3%d9%86%d9%85%d9%8a-11eyes-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/73520.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Senkou no Night Raid",
                "https://shahiid-anime.net/series/senkou-no-night-raid/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/24229.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Gungrave",
                "https://shahiid-anime.net/series/gungrave/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/75724.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Nabari no Ou",
                "https://shahiid-anime.net/series/nabari-no-ou/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/79037.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Busou Renkin",
                "https://shahiid-anime.net/series/busou-renkin/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/75566.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Watashi, Nouryoku wa Heikinchi de tte Itta yo ne! ",
                "https://shahiid-anime.net/series/watashi-nouryoku-wa-heikinchi-de-tte-itta-yo-ne-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102811l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Ah! My Goddess TV ",
                "https://shahiid-anime.net/series/ah-my-goddess-tv-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/20827l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Texhnolyze",
                "https://shahiid-anime.net/series/texhnolyze/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/18165.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Africa no Salaryman",
                "https://shahiid-anime.net/series/africa-no-salaryman/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102309.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Chrome Shelled Regios",
                "https://shahiid-anime.net/series/chrome-shelled-regios/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/12238.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tiger & Bunny",
                "https://shahiid-anime.net/series/tiger-bunny/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/29466.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Val x Love ",
                "https://shahiid-anime.net/series/val-x-love-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102067l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Mairimashita! Iruma-kun ",
                "https://shahiid-anime.net/series/mairimashita-iruma-kun-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99740l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Mobile Suit Gundam 00",
                "https://shahiid-anime.net/series/mobile-suit-gundam-00/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/13200.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Null Peta",
                "https://shahiid-anime.net/series/null-peta/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/103202l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kandagawa Jet Girls ",
                "https://shahiid-anime.net/series/kandagawa-jet-girls/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/103129l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Keishichou Tokumubu Tokushu Kyouakuhan Taisakushitsu Dainanaka: Tokunana ",
                "https://shahiid-anime.net/series/keishichou-tokumubu-tokushu-kyouakuhan-taisakushitsu-dainanaka-tokunana-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/102486l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Phantasy Star Online 2: Episode Oracle ",
                "https://shahiid-anime.net/series/phantasy-star-online-2-episode-oracle-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/99744l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                " Shin Chuuka Ichiban! ",
                "https://shahiid-anime.net/series/%d8%a7%d9%86%d9%85%d9%8a-shin-chuuka-ichiban-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/100772l.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Dead Dead Demons Dededede Destruction (ONA) ",
                "https://shahiid-anime.net/series/dead-dead-demons-dededede-destruction-ona-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/143212.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "“Oshi no Ko” ",
                "https://shahiid-anime.net/series/oshi-no-ko-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/134736.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Garouden: The Way of the Lone Wolf ",
                "https://shahiid-anime.net/series/garouden-the-way-of-the-lone-wolf-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/142687.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Grimm Kumikyoku ",
                "https://shahiid-anime.net/series/grimm-kumikyoku-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/142224.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Karasu wa Aruji wo Erabanai ",
                "https://shahiid-anime.net/series/karasu-wa-aruji-wo-erabanai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/xBhH3xtTOiPlHOAFoAmo3kkjF9Y.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Metal Fight Beyblade ",
                "https://shahiid-anime.net/series/metal-fight-beyblade-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/9Z247cCZOggsLoD4vY4Bg6QsH4U.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Astro Note ",
                "https://shahiid-anime.net/series/astro-note-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/7S713gLbVcNrqpys8kInhmbm8jW.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Seiyuu Radio no Uraomote ",
                "https://shahiid-anime.net/series/seiyuu-radio-no-uraomote-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141796.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Vampire Dormitory ",
                "https://shahiid-anime.net/series/vampire-dormitory-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141863.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tonari no Youkai-san ",
                "https://shahiid-anime.net/series/tonari-no-youkai-san-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141559.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Long Zu ",
                "https://shahiid-anime.net/series/long-zu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/126703.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "The Fable ",
                "https://shahiid-anime.net/series/the-fable-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141155.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Henjin no Salad Bowl ",
                "https://shahiid-anime.net/series/henjin-no-salad-bowl-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141482.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shuumatsu Train Doko e Iku? ",
                "https://shahiid-anime.net/series/shuumatsu-train-doko-e-iku-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/137451.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Touken Ranbu Kai: Kyoden Moyuru Honnouji ",
                "https://shahiid-anime.net/series/touken-ranbu-kai-kyoden-moyuru-honnouji-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/142048.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Boukyaku Battery (TV) ",
                "https://shahiid-anime.net/series/boukyaku-battery-tv-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/142242.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kenka Dokugaku ",
                "https://shahiid-anime.net/series/kenka-dokugaku-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141932.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "The New Gate ",
                "https://shahiid-anime.net/series/the-new-gate-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141857.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Dekisokonai to Yobareta Motoeiyuu wa Jikka kara Tsuihou sareta node Sukikatte ni Ikiru Koto ni Shita ",
                "https://shahiid-anime.net/series/dekisokonai-to-yobareta-motoeiyuu-wa-jikka-kara-tsuihou-sareta-node-sukikatte-ni-ikiru-koto-ni-shita-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141710.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Re:Monster ",
                "https://shahiid-anime.net/series/remonster-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141680.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Yoru no Kurage wa Oyogenai ",
                "https://shahiid-anime.net/series/yoru-no-kurage-wa-oyogenai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141827.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kaii to Otome to Kamikakushi ",
                "https://shahiid-anime.net/series/kaii-to-otome-to-kamikakushi-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141688.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Blue Archive the Animation ",
                "https://shahiid-anime.net/series/blue-archive-the-animation-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/140995.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tensei Kizoku, Kantei Skill de Nariagaru ",
                "https://shahiid-anime.net/series/tensei-kizoku-kantei-skill-de-nariagaru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139538.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Lv2 kara Cheat datta Motoyuusha Kouho no Mattari Isekai Life ",
                "https://shahiid-anime.net/series/lv2-kara-cheat-datta-motoyuusha-kouho-no-mattari-isekai-life-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139120.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kami wa Game ni Ueteiru. ",
                "https://shahiid-anime.net/series/kami-wa-game-ni-ueteiru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141782.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Maou no Ore ga Dorei Elf wo Yome ni Shitanda ga, Dou Medereba Ii? ",
                "https://shahiid-anime.net/series/maou-no-ore-ga-dorei-elf-wo-yome-ni-shitanda-ga-dou-medereba-ii-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141203.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Jiisan Baasan Wakagaeru ",
                "https://shahiid-anime.net/series/jiisan-baasan-wakagaeru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141714.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Bartender: Kami no Glass ",
                "https://shahiid-anime.net/series/bartender-kami-no-glass-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/MV5BY2U5ZGIwYWEtMjA2NC00Y2FlLWI1N2ItNGZlMDZiYWM4ZmNiXkEyXkFqcGdeQXVyNjA5MDIyMzU@._V1_.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Yozakura-san Chi no Daisakusen ",
                "https://shahiid-anime.net/series/yozakura-san-chi-no-daisakusen-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141783.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Tensei shitara Dainana Ouji Datta node, Kimama ni Majutsu wo Kiwamemasu ",
                "https://shahiid-anime.net/series/tensei-shitara-dainana-ouji-datta-node-kimama-ni-majutsu-wo-kiwamemasu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141243.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Unnamed Memory ",
                "https://shahiid-anime.net/series/unnamed-memory-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/140340.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Wind Breaker ",
                "https://shahiid-anime.net/series/wind-breaker-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141816.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Hananoi-kun to Koi no Yamai ",
                "https://shahiid-anime.net/series/hananoi-kun-to-koi-no-yamai-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141411.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Sentai Daishikkaku ",
                "https://shahiid-anime.net/series/sentai-daishikkaku-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141489.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Sasayaku You ni Koi wo Utau ",
                "https://shahiid-anime.net/series/sasayaku-you-ni-koi-wo-utau-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/141858.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Ookami to Koushinryou: Merchant Meets the Wise Wolf ",
                "https://shahiid-anime.net/series/ookami-to-koushinryou-merchant-meets-the-wise-wolf-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/142218.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Kaijuu 8-gou ",
                "https://shahiid-anime.net/series/kaijuu-8-gou-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/140362.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Dragon Ball Kai (2014) ",
                "https://shahiid-anime.net/series/dragon-ball-kai-2014-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/59275.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Ninja Kamui ",
                "https://shahiid-anime.net/series/ninja-kamui-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/A7mYSloFonDcQtHTqyLqEg9rIkh.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Monsters: Ippyaku Sanjou Hiryuu Jigoku",
                "https://shahiid-anime.net/series/monsters-ippyaku-sanjou-hiryuu-jigoku/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/140372.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Shaman King: Flowers ",
                "https://shahiid-anime.net/series/shaman-king-flowers-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139294.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Akuyaku Reijou Level 99: Watashi wa Ura-Boss desu ga Maou dewa Arimasen ",
                "https://shahiid-anime.net/series/akuyaku-reijou-level-99-watashi-wa-ura-boss-desu-ga-maou-dewa-arimasen-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/140028.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Himesama “Goumon” no Jikan desu ",
                "https://shahiid-anime.net/series/himesama-goumon-no-jikan-desu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139398.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Saijaku Tamer wa Gomi Hiroi no Tabi wo Hajimemashita. ",
                "https://shahiid-anime.net/series/saijaku-tamer-wa-gomi-hiroi-no-tabi-wo-hajimemashita-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/138474.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Sengoku Youko ",
                "https://shahiid-anime.net/series/sengoku-youko-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/140627.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Meiji Gekken: 1874 ",
                "https://shahiid-anime.net/series/meiji-gekken-1874-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/140687.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Bucchigiri?! ",
                "https://shahiid-anime.net/series/bucchigiri-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139871.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Majo to Yajuu ",
                "https://shahiid-anime.net/series/majo-to-yajuu-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139745.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Yuuki Bakuhatsu Bang Bravern ",
                "https://shahiid-anime.net/series/yuuki-bakuhatsu-bang-bravern-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139283.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Metallic Rouge ",
                "https://shahiid-anime.net/series/metallic-rouge-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/140210.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Oroka na Tenshi wa Akuma to Odoru ",
                "https://shahiid-anime.net/series/oroka-na-tenshi-wa-akuma-to-odoru-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/139271.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(new anime(
                "Nozomanu Fushi no Boukensha ",
                "https://shahiid-anime.net/series/nozomanu-fushi-no-boukensha-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/140287.jpg?resize=200%2C283&ssl=1"
        ));
        anime.addAnime(
                new anime(
                        "Ore dake Level Up na Ken ",
                        "https://shahiid-anime.net/series/ore-dake-level-up-na-ken-%d9%85%d8%aa%d8%b1%d8%ac%d9%85/",
                        "https://i0.wp.com/shahiid-anime.net/wp-content/uploads/ore-dake-level-up-na-ken-solo-leveling.274627.jpg?resize=200%2C283&ssl=1"
                ));


//        for (anime element : anime.getAnimeList()) {
//            System.out.println(element);
//        }
    }

}
