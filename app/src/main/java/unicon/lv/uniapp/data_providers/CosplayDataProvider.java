package unicon.lv.uniapp.data_providers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by antos on 8/1/16.
 */
public class CosplayDataProvider {

    private static final String GROUP_TYPE = "\nTYPE: Group\n\n";
    private static final String SOLO_TYPE = "\nTYPE: Solo\n\n";
    private static final String TYPE_DUO = "\nTYPE: Duo\n\n";
    private static final String DANCE_TYPE = "\nTYPE: Dance\n\n";
    private static final String PARTICIPANTS = "\nCOSPLAYERS: ";
    private static final String CHARACTERS = "\nCHARACTERS: ";
    private static final String FANDOM = "\nFANDOM: ";

    public static LinkedHashMap<String, List<String>> getInfo() {
        LinkedHashMap<String, List<String>> cosplayDetails = new LinkedHashMap<>();
        List<String> DayOneBlockOne = new ArrayList<>();

        DayOneBlockOne.add(dayOneBlockOneInfo);

        List<String> DayOneBlockTwo = new ArrayList<>();

        DayOneBlockTwo.add(dayOneBlockTwoInfo);

        List<String> DayTwoBlockThree = new ArrayList<>();

        DayTwoBlockThree.add(dayTwoBlockOneInfo);

        List<String> DayTwoBlockFour = new ArrayList<>();

        DayTwoBlockFour.add(dayTwoBlockTwoInfo);

        cosplayDetails.put("Day 1 Block 1", DayOneBlockOne);
        cosplayDetails.put("Day 1 Block 2", DayOneBlockTwo);
        cosplayDetails.put("Day 2 Block 3", DayTwoBlockThree);
        cosplayDetails.put("Day 2 Block 4", DayTwoBlockFour);

        return cosplayDetails;

    }

    private final static String dayOneBlockOneInfo = "" +
            "1. V Dosku as Kuroshitsuji group" + PARTICIPANTS + "V Dosku" + CHARACTERS + "Alois, Ciel, Undertaker, Grell" + FANDOM + "Kuroshitsuji" + GROUP_TYPE +
            "2. Star vs. the Forces of Evil" + PARTICIPANTS + "Medovaya Hanna" + CHARACTERS + "Star Butterfly" + FANDOM + "Star vs. the Forces of Evil" + SOLO_TYPE +
            "3. Law Enforcement" + PARTICIPANTS + "Parva and Hina" + CHARACTERS + "Nick and Judy" + FANDOM + "Zootopia" + TYPE_DUO +
            "4. Greeting" + PARTICIPANTS + "Rangi" + CHARACTERS + "Death" + FANDOM + "OC" + SOLO_TYPE +
            "5. Yozhik and Namie as Alexstrasza and Sylvanas from World of Warcraft" + PARTICIPANTS + "Yozhik and Namie" + CHARACTERS + "Sylvanas and Alexstrasza" + FANDOM
            + "World of Warcraft" + TYPE_DUO +
            "6. Ash Demon" + PARTICIPANTS + "Beresklet" + CHARACTERS + "Ash Demon" + FANDOM + "OC" + SOLO_TYPE +
            "7. At the Gluskin’s Workshop" + PARTICIPANTS + "Nikrofil and MiAuta" + CHARACTERS + "Eddie and Waylon" + FANDOM + "Outlast" + TYPE_DUO +
            "8. Scout" + PARTICIPANTS + "Jokertina" + CHARACTERS + "Scout" + FANDOM + "Team Fortress 2" + DANCE_TYPE +
            "9. Alsy as Ciri from Witcher 3: Wild Hunt" + PARTICIPANTS + "Alsy" + CHARACTERS + "Ciri" + FANDOM + "Witcher 3: The Wild Hunt" + SOLO_TYPE +
            "10. Empathy. Mortal Combat X. Paranoya as Sonya Blade and Fury as Cassie Cage" + PARTICIPANTS + "Fury and Paranoya" + CHARACTERS + "Sonya Blade and Cassie Cage"
            + FANDOM + "Mortal Combat X" + TYPE_DUO +
            "11. Lady Wolf as Iron Solari Leona" + PARTICIPANTS + "Lady Wolf" + CHARACTERS + "Leona" + FANDOM + "League of Legends" + SOLO_TYPE +
            "12. Non professional  fairies  - The world is upside-down" + PARTICIPANTS + "Kai Urusai and Nia" + CHARACTERS + "Alice and Cheshire cat"
            + FANDOM + "Alice in Wonderland" + TYPE_DUO +
            "13. Star Wars: The Force Eclipse" + PARTICIPANTS + "MasterAGB, SkyRocker, Coraline" + CHARACTERS + "Darth Revan, Anakin Skywalker, Aayla Secura"
            + FANDOM + "Star Wars: Episode 3" + GROUP_TYPE +
            "14. Katen Kyokotsu" + PARTICIPANTS + "Foxes in the fog" + CHARACTERS + "Katen Kyokotsu" + FANDOM + "Bleach" + TYPE_DUO +
            "15. Grill Power 2k16" + PARTICIPANTS + "Sakura" + CHARACTERS + "Tracer" + FANDOM + "Overwatch" + DANCE_TYPE +
            "16. Suicide Squad / Captain Boomerang" + PARTICIPANTS + "Mr. Wolf" + CHARACTERS + "Captain Boomerang" + FANDOM + "Suicide Squad" + SOLO_TYPE +
            "17. Another evening in Phantomhive mansion" + PARTICIPANTS + "Alex and The great Martin-san" + CHARACTERS + "Sebastian and Claude"
            + FANDOM + "Kuroshitsuji" + TYPE_DUO +
            "18. Yami as Johannes Krauser II from Detroit Metal City" + PARTICIPANTS + "Yami" + CHARACTERS + "Krauser II" + FANDOM + "Detroit Metal City" + SOLO_TYPE +
            "19. Prayer of Peace" + PARTICIPANTS + "Eminora" + CHARACTERS + "Tera priest" + FANDOM + "Tera" + SOLO_TYPE +
            "20. Sisters' love" + PARTICIPANTS + "Horomi and Ulavita" + CHARACTERS + "Lina and Crystal Maiden" + FANDOM + "DotA 2" + TYPE_DUO +
            "21. Cheer up" + PARTICIPANTS + "Yoon Sora" + CHARACTERS + "Sana" + FANDOM + "K-pop" + DANCE_TYPE +
            "22. AzyoMecha as Monsoon from Metal Gear Rising: Revengeance" + PARTICIPANTS + "AzyoMecha" + CHARACTERS + "Monsoon"
            + FANDOM + "Metal Gear Rising: Revengeance" + SOLO_TYPE +
            "23 Nobles" + PARTICIPANTS + "Shirayuri" + CHARACTERS + "Krul and Hyakuya" + FANDOM + "Seraph of the End" + TYPE_DUO +
            "24. Definitely not loli" + PARTICIPANTS + "Rae" + CHARACTERS + "Chibiusa" + FANDOM + "Sailor Moon" + SOLO_TYPE +
            "25. Vental as Hanji Zoe from Shingeki no Kyojin" + PARTICIPANTS + "Vental" + CHARACTERS + "Hanji Zoe" + FANDOM + "Attack on Titan" + SOLO_TYPE +
            "26. Beast Boy and Raven" + PARTICIPANTS + "John and Tanuki" + CHARACTERS + "Beast Boy and Raven" + FANDOM + "Teen Titans" + TYPE_DUO +
            "27. Whimsicality of goat mom" + PARTICIPANTS + "Silverwood" + CHARACTERS + "Toriel" + FANDOM + "Undertale" + SOLO_TYPE +
            "28. Where is Luke?" + PARTICIPANTS + "Elyanna and Alekas" + CHARACTERS + "Luke and Rey" + FANDOM + "Star Wars" + TYPE_DUO;

    private final static String dayOneBlockTwoInfo = "" +
            "1. Simatian as character from Aion" + PARTICIPANTS + "Simatian" + CHARACTERS + "Aion Hyperion" + FANDOM + "Aion" + SOLO_TYPE +
            "2. Big Boss from Metal Gear Solid 5" + PARTICIPANTS + "Andosmir" + CHARACTERS + "Snake" + FANDOM + "Metal Gear Solid 5" + SOLO_TYPE +
            "3. Dark lord Lucifer" + PARTICIPANTS + "Boltushka" + CHARACTERS + "Lucifer" + FANDOM + "Angel Sanctuary" + SOLO_TYPE +
            "4. Your fight starts now" + PARTICIPANTS + "Insomnia" + CHARACTERS + "Baby Doll, Sweet Pea, Rocket, Amber, Blondie"
            + FANDOM + "Sucker Punch" + GROUP_TYPE +
            "5. Firewall" + PARTICIPANTS + "Zaulinio" + CHARACTERS + "Rocket Raccoon" + FANDOM + "Guardians of the Galaxy" + SOLO_TYPE +
            "6. Heavy training" + PARTICIPANTS + "Kuroko, May Kim, Kodokuhime" + CHARACTERS + "Kuroko, Kuroko2, Satsuki"
            + FANDOM + "Kuroko no Basuke" + DANCE_TYPE +
            "7. Arizona as Harley Quinn from Suicide Squad (the movie)" + PARTICIPANTS + "Arizona" + CHARACTERS + "Harley Quinn"
            + FANDOM + "Suicide Squad" + SOLO_TYPE +
            "8. Typical day in Kokkuri’s life" + PARTICIPANTS + "BLAST" + CHARACTERS + "Kokkuri-san and Shigaraki" + FANDOM + "Gugure! Kokkuri-san!" + TYPE_DUO +
            "9. Guardian of time" + PARTICIPANTS + "Sanahi" + CHARACTERS + "Sailor Pluto" + FANDOM + "Sailor Moon" + SOLO_TYPE +
            "10. Dragons of destiny as Furious Five from Kung Fu Panda 3" + PARTICIPANTS + "Dragons of Destiny" + CHARACTERS
            + "Masters Monkey, Tigress, Viper, Crane, Shifu, Mantis" + FANDOM + "Kung Fu Panda 3" + GROUP_TYPE +
            "11. Lightning Empress Armor" + PARTICIPANTS + "Hope" + CHARACTERS + "Erza Scarlet" + FANDOM + "Fairy Tail" + SOLO_TYPE +
            "12. Lady Marmalade" + PARTICIPANTS + "Insomnia" + CHARACTERS + "Baby Doll, Sweet Pea, Rocket, Amber, Blondie" + FANDOM + "Sucker Punch" + DANCE_TYPE +
            "13. Vanilla Cat as Homura Akemi from Madoka" + PARTICIPANTS + "Vanilla Cat" + CHARACTERS + "Homura Akemi" + FANDOM + "Puella Magi Madoka Magica" + SOLO_TYPE +
            "14. Infection is at rise. An old friend appears?" + PARTICIPANTS + "T-oku and Visual Aya" + CHARACTERS + "Leon and Ada" + FANDOM + "Resident Evil" + TYPE_DUO +
            "15. Drawing lesson" + PARTICIPANTS + "Vega, Gen, Eztly Tigerlehik" + CHARACTERS + "Hakutaku and Hozuki" + FANDOM + "Hozuki no Reitetsu" + GROUP_TYPE +
            "16. Princess of Alderaan" + PARTICIPANTS + "Amirah Odette" + CHARACTERS + "Princess Leia" + FANDOM + "Star Wars : Original Trilogy" + SOLO_TYPE +
            "17. The song of destiny" + PARTICIPANTS + "Mei" + CHARACTERS + "Ciri" + FANDOM + "Witcher 3: The Wild Hunt" + SOLO_TYPE +
            "18. Orendi Away!" + PARTICIPANTS + "Foxtail" + CHARACTERS + "Orendi" + FANDOM + "Battleborn" + SOLO_TYPE +
            "19. Elastic Heart" + PARTICIPANTS + "Commander Kokoro" + CHARACTERS + "Rey" + FANDOM + "Star Wars" + DANCE_TYPE +
            "20. Knights of Astora" + PARTICIPANTS + "Guts and Sighter" + CHARACTERS + "Oscar and Solaire of Astora" + FANDOM + "Dark Sould" + TYPE_DUO +
            "21. Woke up like this" + PARTICIPANTS + "Sanahi, Dulcinea, Rae" + CHARACTERS + "Sailor Mars, Sailor Pluto, Chibi Moon" + FANDOM + "Sailor Moon" + GROUP_TYPE +
            "22. Beast Boy" + PARTICIPANTS + "Tanuki" + CHARACTERS + "Beast Boy" + FANDOM + "Teen Titans" + SOLO_TYPE +
            "23. White Raven" + PARTICIPANTS + "White raven" + CHARACTERS + "Shirayuki and Zen" + FANDOM + "Akagami no Shirayuki Hime" + DANCE_TYPE +
            "24. Never Forget" + PARTICIPANTS + "Mintaka" + CHARACTERS + "Hyakuya Mikaela" + FANDOM + "Seraph of the End" + SOLO_TYPE +
            "25. Welcome To The Underground" + PARTICIPANTS + "MO and Ralina" + CHARACTERS + "Sans and Papyrus" + FANDOM + "Undertale" + TYPE_DUO +
            "26. Raven" + PARTICIPANTS + "John" + CHARACTERS + "Raven" + FANDOM + "Teen Titans" + SOLO_TYPE +
            "27. Bang Bang" + PARTICIPANTS + "Aiko" + CHARACTERS + "Stocking" + FANDOM + "Panty&Stocking with Garterbelt" + SOLO_TYPE +
            "28. Let the Game Begin" + PARTICIPANTS + "Flafstar" + CHARACTERS + "Sora" + FANDOM + "No Game No Life" + DANCE_TYPE +
            "";

    private final static String dayTwoBlockOneInfo = "" +
            "1. Dragonslayer Ornstein" + PARTICIPANTS + "Tanagashi" + CHARACTERS + "Dragonslayer Ornstein" + FANDOM + "Dark Souls" + SOLO_TYPE +
            "2. Alpacas Error Duo" + PARTICIPANTS + "Natsumi and Dinarin" + CHARACTERS + "Otohime and Shirahoshi" + FANDOM + "One Piece" + TYPE_DUO +
            "3. Cousins' performance" + PARTICIPANTS + "Gauzera and Luka" + CHARACTERS + "Mettaton and Napstabot" + FANDOM + "Undertale" + DANCE_TYPE +
            "4. Dance of the sword" + PARTICIPANTS + "Visual Aya" + CHARACTERS + "Mikazuki Munechika" + FANDOM + "Touken Ranbu" + SOLO_TYPE +
            "5. The Drill" + PARTICIPANTS + "Zaulinio" + CHARACTERS + "Storm Trooper" + FANDOM + "Star Wars" + DANCE_TYPE +
            "6. Sweet Draculaura" + PARTICIPANTS + "Lilith" + CHARACTERS + "Draculaura" + FANDOM + "Monster High" + SOLO_TYPE +
            "7. Granado Espada" + PARTICIPANTS + "Pandemonnium" + CHARACTERS + "Musketeer, Fighter, Elementalist, Wizard" + FANDOM + "Granado Espada" + GROUP_TYPE +
            "8. The Rise Of Evil Queen" + PARTICIPANTS + "Svajone" + CHARACTERS + "Queen Nehellenia" + FANDOM + "Sailor Moon" + SOLO_TYPE +
            "9. His soul" + PARTICIPANTS + "Insomnia" + CHARACTERS + "Sebastian, Ciel, Alois, Claude" + FANDOM + "Kuroshitsuji" + GROUP_TYPE +
            "10. Arizona as Symmetra from Blizzard’s Overwatch" + PARTICIPANTS + "Arizona" + CHARACTERS + "Symmetra" + FANDOM + "Overwatch" +SOLO_TYPE +
            "11. Duty of the Goddess" + PARTICIPANTS + "Dulcinea" + CHARACTERS + "Freya" + FANDOM + "Smite" +SOLO_TYPE +
            "12. Diva-de-Kara as mew Ichigo and mew Pudding" + PARTICIPANTS + "Diva-de-Kara" + CHARACTERS + "Mew Ichigo and Mew Pudding" + FANDOM + "Tokyo Mew Mew" +TYPE_DUO +
            "13. Secret hobby" + PARTICIPANTS + "Vega" + CHARACTERS + "Genos" + FANDOM + "One-Punch Man" +DANCE_TYPE +
            "14. When you pause a game" + PARTICIPANTS + "City Boyz" + CHARACTERS + "Akashi Kuniyuki, Mitsutada Shokudaikiri, Ookurikara, Uguisumaru" + FANDOM + "Touken Ranbu" +GROUP_TYPE +
            "15. Kira and Ice Sakura as Fushimi and Misaki from K Project" + PARTICIPANTS + "Kira and Ice Sakura" + CHARACTERS + "Fushimi and Misaki" + FANDOM + "K Project" +TYPE_DUO +
            "16. I Am Victorious" + PARTICIPANTS + "Rhaine" + CHARACTERS + "Gaige" + FANDOM + "Borderlands 2" +SOLO_TYPE +
            "17. Thanks for smoking as Food spirits Vanilla and Caramel from  Yumeiro Patissiere" + PARTICIPANTS + "Thanks for Smoking"
            + CHARACTERS + "Vanilla and Caramel" + FANDOM + "Food spirit from Yumeiro Patissiere" +TYPE_DUO +
            "18. Valide Safiye sultan hazretreli" + PARTICIPANTS + "Boltushka" + CHARACTERS + "Safiye Sultan" + FANDOM + "Muhtesem Yuzyil: Kosem" +SOLO_TYPE +
            "19. Empathy. Blazblue. Paranoya as Taokaka and Fury as NU-13" + PARTICIPANTS + "Fury and Paranoya" + CHARACTERS + "Taokaka and NU-13" + FANDOM + "Blazblue" +TYPE_DUO +
            "20. My group let me choose the title so HI MOM" + PARTICIPANTS + "Lin, Little Lady, Little Lord, Dictamnus, Chibi"
            + CHARACTERS + "Yugi Muto, Dark Magician Girl, Bakura Ryou, Change of Heart" + FANDOM + "Yu-Gi-Oh!" +GROUP_TYPE +
            "21. Cinderella's stepsisters -  Anastasia  and Drizella Tremaine!" + PARTICIPANTS + "Thanks for Smoking"
            + CHARACTERS + "Anastasia and Drizella" + FANDOM + "Cinderella" +TYPE_DUO +
            "22. Eternity" + PARTICIPANTS + "Koneko-chan" + CHARACTERS + "CC" + FANDOM + "Code Geass" +DANCE_TYPE +
            "23. Better love story than Twilight" + PARTICIPANTS + "Guren no harem" + CHARACTERS + "Hiiragi Shinya, Hiiragi Mahiru, Ichinose Guren"
            + FANDOM + "Seraph of the End" +GROUP_TYPE +
            "24. CaptainMort as Ciel Phantomhive from Kuroshitsuji" + PARTICIPANTS + "CaptainMort" + CHARACTERS + "Ciel Phantomhive" + FANDOM + "Kuroshitsuji" +SOLO_TYPE +
            "25. Non professional fairies – one reflection" + PARTICIPANTS + "Kai Urusai and Nia" + CHARACTERS + "Peter Pan and Tinker Bell" + FANDOM + "Peter Pan" +TYPE_DUO +
            "26. Angry bun bun with a big shuriken" + PARTICIPANTS + "SHIRO I" + CHARACTERS + "Elin Ninja" + FANDOM + "Tera" +SOLO_TYPE +
            "27. Lady Wolf as Pumpkin Pie from Sakizou Artworks" + PARTICIPANTS + "Lady Wolf" + CHARACTERS + "Pumpkin Pie" + FANDOM + "Sakizou Artworks" +SOLO_TYPE +
            "28. Love, Chunibyo & Other Delusions" + PARTICIPANTS + "Fairy World" + CHARACTERS + "Rikka and Shichimiya" + FANDOM + "Love, Chunibyo & Other Delusions" +TYPE_DUO +
            "29. Sword dance" + PARTICIPANTS + "Shapeshifter" + CHARACTERS + "Shaak-ti" + FANDOM + "Star Wars" +DANCE_TYPE +
            "30. Blackout: Let This World Explode!" + PARTICIPANTS + "Blackout" + CHARACTERS + "Gaige, Tiny Tina, Maya" + FANDOM + "Borderlands" +GROUP_TYPE +
            "";

    private final static String dayTwoBlockTwoInfo = "" +
            "1. Nice-kun as Genji from Overwatch" + PARTICIPANTS + "Nice-kun" + CHARACTERS + "Genji" + FANDOM + "Overwatch" +SOLO_TYPE +
            "2. The Third Force rises" + PARTICIPANTS + "Zaulinio" + CHARACTERS + "Storm Trooper" + FANDOM + "Star Wars " +SOLO_TYPE +
            "3. Sword Bois" + PARTICIPANTS + "Visual Aya and Crossmant" + CHARACTERS + "Mikazuki Munechika and Kogitsunemaru" + FANDOM + "Touken Ranbu" +TYPE_DUO +
            "4. Dragons of Destiny as Sally from Nightmare before Christmas" + PARTICIPANTS + "Scarlett Lily" + CHARACTERS + "Sally" + FANDOM + "Nightmare Before Christmas" +SOLO_TYPE +
            "5. For your entertainment!" + PARTICIPANTS + "Insomnia" + CHARACTERS + "Ciel and Alois" + FANDOM + "Kuroshitsuji" +DANCE_TYPE +
            "6. Touken Dream come true" + PARTICIPANTS + "Black&White" + CHARACTERS + "Akashi Kuniyuki, Tsurumaru Kuninaga, Mikazuki Munechika" + FANDOM + "Touken Ranbu" +GROUP_TYPE +
            "7. Spinoza" + PARTICIPANTS + "John and Kato" + CHARACTERS + "Astrid and Stormfly" + FANDOM + "How to Train your Dragon" +TYPE_DUO +
            "8. Keep calm and Junkrat on!" + PARTICIPANTS + "Hooots_Senpai" + CHARACTERS + "Junkrat" + FANDOM + "Overwatch" +SOLO_TYPE +
            "9. Once Upon a Time on Pandora" + PARTICIPANTS + "Narya" + CHARACTERS + "Maya" + FANDOM + "Borderlands 2" +SOLO_TYPE +
            "10. Owari no Seraph" + PARTICIPANTS + "Sanahi" + CHARACTERS + "Shinya Hiiragi" + FANDOM + "Seraph of the End" +SOLO_TYPE +
            "11. Once in Moving Castle" + PARTICIPANTS + "Kiom and Drebedenik" + CHARACTERS + "Howl and Sophie" + FANDOM + "Howl's Moving Castle" +TYPE_DUO +
            "12. Join us, Join the Rooks!" + PARTICIPANTS + "SkyRocker, Coraline, Templars" + CHARACTERS + "Jacob Frye, Evie Frye, Templars" + FANDOM + "Assassins Creed" +GROUP_TYPE +
            "13. Aion" + PARTICIPANTS + "HELL" + CHARACTERS + "Aion Sorcerer" + FANDOM + "Aion" +SOLO_TYPE +
            "14. From shadows to the bright sun" + PARTICIPANTS + "T-oku and Wolfsgirl" + CHARACTERS + "Minato and Kushina" + FANDOM + "Naruto" +TYPE_DUO +
            "15. TROUBLE MAKER- NOW" + PARTICIPANTS + "Miyabi and Ivo" + CHARACTERS + "Hyuna and HyunSeung" + FANDOM + "K-pop" +DANCE_TYPE +
            "16. Heroes of Honor as Mercy, Hanzo and Symmetra from Blizzard’s Overwatch" + PARTICIPANTS + "Heroes of Honor"
            + CHARACTERS + "Mercy, Hanzo, Symmetra" + FANDOM + "Overwatch" +GROUP_TYPE +
            "17. Cillit Butler!" + PARTICIPANTS + "Insomnia" + CHARACTERS + "Sebastian and Claude" + FANDOM + "Kuroshitsuji" +DANCE_TYPE +
            "18. Blood is all for a vampire!" + PARTICIPANTS + "Anika" + CHARACTERS + "Krul Tepes" + FANDOM + "Seraph of the End" +SOLO_TYPE +
            "19. I am the blade in the shadow" + PARTICIPANTS + "White Flame" + CHARACTERS + "Shao Jun" + FANDOM + "Assasins Creed China Chronicles" +SOLO_TYPE +
            "20. Dragons of Destiny as Alice the Bloody Rabbit and Will of the Abyss from Pandora Hearts" + PARTICIPANTS + "Dragons of Destiny" + CHARACTERS
            + "Alice the Bloody Rabbit and Will of the Abyss" + FANDOM + "Pandora Hearts" +TYPE_DUO +
            "21. Excuse me!" + PARTICIPANTS + "Vikonija" + CHARACTERS + "Roberta" + FANDOM + "Black Lagoon" +SOLO_TYPE +
            "22. Stormfly the dragon" + PARTICIPANTS + "John" + CHARACTERS + "Stormfly" + FANDOM + "How to Train your Dragon" +SOLO_TYPE +
            "23. 404 not found" + PARTICIPANTS + "Kaori and Margosha" + CHARACTERS + "Gaige and Handsome Jack" + FANDOM + "Borderlands 2" +TYPE_DUO +
            "24. Le Petit Prince" + PARTICIPANTS + "Cat Bounce" + CHARACTERS + "Little Prince" + FANDOM + "Little Prince" +SOLO_TYPE +
            "25. Hathor from  Gods of Egypt" + PARTICIPANTS + "Nashiro" + CHARACTERS + "Hathor" + FANDOM + "Gods of Egypt" +SOLO_TYPE +
            "26. JoJo's Bizarre Adventure Part 4: Diamond Is Unbreakable" + PARTICIPANTS + "BLAST" + CHARACTERS
            + "Josuke and Okuyasu" + FANDOM + "JoJo's Bizarre Adventure Part 4: Diamond Is Unbreakable" +TYPE_DUO +
            "27. Shokugeki no Soma" + PARTICIPANTS + "Flafstar and MadMaid" + CHARACTERS + "Soma and fem!Soma" + FANDOM + "Shokugeki no Soma" +DANCE_TYPE +
            "28. Insomnia" + PARTICIPANTS + "True Baba" + CHARACTERS + "Rocket" + FANDOM + "Sucker Punch" +SOLO_TYPE +
            "29. The Saber Dance" + PARTICIPANTS + "Lasura" + CHARACTERS + "Sith Marauder OC" + FANDOM + "Star Wars" +SOLO_TYPE +
            "";


}
