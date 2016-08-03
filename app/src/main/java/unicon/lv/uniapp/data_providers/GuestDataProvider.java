package unicon.lv.uniapp.data_providers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by antos on 8/1/16.
 */
public class GuestDataProvider {

    private final static String CATEGORY_COSPLAYER = "Category: Cosplayer";
    private final static String COUNTRY = "\nCountry: ";

    public static LinkedHashMap<String, List<String>> getInfo() {
        LinkedHashMap<String, List<String>> guestDetails = new LinkedHashMap<>();
        List<String> guest1 = new ArrayList<>();
        List<String> guest2 = new ArrayList<>();
        List<String> guest3 = new ArrayList<>();
        List<String> guest4 = new ArrayList<>();
        List<String> guest5 = new ArrayList<>();

        //guest1
        guest1.add("" +
                CATEGORY_COSPLAYER + COUNTRY + "Germany" +
                "\n\nCalssara is a cosplayer from Germany who loves to cosplay since 2004. She was Germany's representative for World Cosplay Summit (WCS) in 2009 and 2011. Also she represented her country in the European Cosplay Gathering (ECG), one of the biggest European cosplay competitions that takes place in Paris on Japan Expo, and won the champion title in 2012 for her country with her Saber costume from Fate/Stay Night.\n" +
                " \n" +
                "\n" +
                "Calssara visited already 30 countries (Austria, Belgium, Brazil, Bulgaria, Canada, Chile, Costa Rica, Czech Republic, Denmark, Finland, France, Germany, Hungary, Italy, Ireland, Japan, Luxemburg, Mexico, Netherlands, Norway, Poland, Portugal, Romania, Serbia, Spain, Sweden, Switzerland, Turkey, United Arab Emirates and United Kingdom) on 3 continents with her costumes as cosplay judge, panelist and messenger.\n" +
                "\n" +
                "In real life she is a librarian, event manager and passionate tea drinker. She is a very social and happy person who loves to meet new friends and supports cosplayers all over the world.");

        //guest2
        guest2.add("" +
                CATEGORY_COSPLAYER + COUNTRY + "Russia" +
                "\n\n\"Cosplayer for more than 6 years, Gesha is the leader of \"The Evil League of Evil\", numerous Russian cosplay-contests' prizewinner, talented hair stylist, events host, crafter, professional cosplay-model, frequent guest and jury member at foreign festivals in Europe, Japan and China. Actively promoting Russian cosplay movement.\n" +
                "\n" +
                "It is a great pleasure to be a guest at UniCon 2016，This is my second tour to Europe. Looking forward to meet!)\n" +
                "\n" +
                "Strict, but fair in judging. Wishing LUCK to all the contestants and calm preparations, inspiration and strength for veterans, confidence and diligence for novices.\"");

        //guest3
        guest3.add("" +
                CATEGORY_COSPLAYER + COUNTRY + "Finland" +
                "\n\nElffi is a Finnish cosplayer who lives in the middle of the Finnish forest with his tortoise, Kippe.\n" +
                "\n" +
                "He has been active in the cosplay community since 2006, and has made over 35 costumes through the years. He loves to build armor and cosplay accessories, and to discover new building and manufacturing techniques. He also loves to hit the gym to shape his body to fit the characters he cosplays as.\n" +
                "\n" +
                "His talent and efforts have earned him the right to represent Finland at the 2011 World Cosplay Summit in Japan. Since then, he has been receiving regular invitations to speak and to judge cosplay contests at conventions.\n" +
                "\n" +
                "He has been a guest lecturer, panelist and judge in more than 30 countries and 50 conventions all over the world.\n" +
                "\n" +
                "He loves to travel and meet fans and fellow cosplayers from different countries, and experience new cultures!");

        //guest4
        guest4.add("" +
                CATEGORY_COSPLAYER + COUNTRY + "Germany" +
                "\n\n\"I live in Munich and in my real life I work as a Silversmith.\n" +
                "\n" +
                "I'm a cosplayer since 2009 and build since 2013 hughe armors and my own creation.\n" +
                "\n" +
                "I be known for my own creations and my love for details to complete my Costumes.\n" +
                "\n" +
                "I was a judge at competitions on different conventions and won some smaller competitions in the last years in Germany and Austria.\n" +
                "\n" +
                "Actually I was a guest in 5 different countries and kept some Lectures and Panels about crafting with thermoplastic Materials.\n" +
                "\n" +
                "I'm always happy to meet new people, have fun on conventions and see/learn new stuff and Cosplays.\"");

        //guest5
        guest5.add("" +
                "Category: Photographer" + COUNTRY + "Belgium" +
                "\n\nI’m from Belgium and started taking photos about 10 years ago when i bought my first DSLR camera. At first I only took the pictures everyone takes with their phone these days, but after a while I noticed that I prefered taking pictures of people. One day a colleague at work told me about ‘conventions’ and there it all started. \n" +
                "\n" +
                "Not happy about the ‘beautiful’ walls at conventions I started asking people to do shoots at other locations, which led me to go to other countries, starting with France, eventually ending up in countries all around Europe. This eventually changed cosplay for me so that it’s no longer about the pictures, but the social part has become very important too. And the food.. Don’t forget the food..\n" +
                "\n" +
                "Next to that i’ve been a gamer for as long as i can remember, starting out on the NES, MegaDrive, moving over to pc later, to end up on console again now as an avid Destiny player since release almost two years ago.");

        guestDetails.put("Calssara", guest1);
        guestDetails.put("Gesha Petrovich", guest2);
        guestDetails.put("Elffi", guest3);
        guestDetails.put("Erza", guest4);
        guestDetails.put("n8e", guest5);

        return guestDetails;

    }

}
