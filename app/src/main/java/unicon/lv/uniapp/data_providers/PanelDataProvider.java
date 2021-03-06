package unicon.lv.uniapp.data_providers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by antos on 8/1/16.
 */
public class PanelDataProvider {

    private final static String DAY_SIX = "\nDay: 6th of August\n\n";
    private final static String DAY_SEVEN = "\nDay: 7th of August\n\n";
    private final static String PLC_MAIN_STAGE = "\n\nPlace: Main Stage\n\n";
    private final static String PLC_PRESENTATION = "\n\nPlace: Presentation Hall\n\n";
    private final static String TIME = "Time: ";

    public static LinkedHashMap<String, List<String>> getInfo() {
        LinkedHashMap<String, List<String>> panelDetails = new LinkedHashMap<>();
        List<String> panel1 = new ArrayList<>();
        List<String> panel2 = new ArrayList<>();
        List<String> panel3 = new ArrayList<>();
        List<String> panel4 = new ArrayList<>();
        List<String> panel5 = new ArrayList<>();
        List<String> panel6 = new ArrayList<>();
        List<String> panel7 = new ArrayList<>();
        List<String> panel8 = new ArrayList<>();
        List<String> panel9 = new ArrayList<>();
        List<String> panel10 = new ArrayList<>();
        List<String> panel11 = new ArrayList<>();

        //panel1
        panel1.add("Topic: Q&A session with Gesha Petrovich\n" + DAY_SIX + TIME + "16:00" + PLC_MAIN_STAGE + "Language: RUS\n\n"
                + "Q & A session with Gesha Petrovich - Cosplayer for more than 6 years, who is the leader of \"The Evil League of Evil\", numerous Russian cosplay-contests' prizewinner, talented hair stylist, events host, crafter, professional cosplay-model, frequent guest and jury member at foreign festivals in Europe, Japan and China. Actively promoting Russian cosplay movement.");
        //panel2
        panel2.add("Topic: Cosplay around the world with Elffi\n" + DAY_SIX + TIME + "18:00" + PLC_MAIN_STAGE + "Language: ENG\n\n"
                + "Take a short trip together with Elffi around the world of cosplay. Come and hear how are the conventions in Latin America and Europe, what do people cosplay in Colombia, and what kind of photoshoots Japanese cosplayers do! Cosplay is very different in every country, and we can learn and exchange experiences of our wonderful hobby with all the people around the globe!");
        //panel3
        panel3.add("Topic: Sexual Harassment of Cosplayers: Why does it happen? What can we do to create a safer cosplay environment by Calssara\n" + DAY_SIX + TIME + "16:00"
                + PLC_PRESENTATION + "\"Sexual harassment of cosplayers happens... It can happen to women, to men, to transgenders and basically it can happen to everyone.\n" +
                "\n" +
                "But what shall we do against it? How do we protect ourselves? What can we do for the community? Who is to blame?\n" +
                "To understand what is going on, we will need to look at the reasons why it happens... the real reasons behind everything.\n" +
                "\n" +
                "This panel will help people of all genders (despite if you already have been a victim or not) to handle the situation emotionally and tactically. It also gives advices at every human what they can do to help others to make our community a safer environment for people.\"");
        //panel4
        panel4.add("Topic: Erza - thermoplastic for beginners. Thermoplastic Details\n" + DAY_SIX + TIME + "15:00" + PLC_MAIN_STAGE
                + "I have the big honor to talk in my own panel at Unicon Latvia 2016 and I know you know my passion is the work with thermoplastic Material like Worbla's Black and Finest Art.So, you have the change to ask me everything what you want about crafting, how you can build simply your own armors and how you make the finish, the coloration and more to bring you visions to life! I want to answer all of your questions based on armor/crafting and coloration or you ask me some personal questions and we will have some fun together. If you are interested on my crafting life and my experience in the World of cosplay visit my Panel with my crazzy german-english and a lot of bavarian fun!");
        //panel5
        panel5.add(DAY_SEVEN + TIME + "17:00" + PLC_MAIN_STAGE
                + "Latvia-based creators of Russian-speaking internet-show, which is second by the number of subscribers in Russian YouTube - This is Хорошо, as well as hosts of the program Интернет-бомбит and other projects. They will tell something secret and give away something pleasant! ");
        //panel6
        panel6.add("Topic: N8e on Cosplay and Photography\n" + DAY_SIX + TIME + "15:00" + PLC_PRESENTATION
                + "Cosplay changed a lot the last few years, and the people in it changed too. Cosplay changed me, even if i'm not a cosplayer. I'll be talking about how I saw it change over the years, how cosplay superstars were born, how big international events popped up, how photography has changed from 10 years ago. At the end, if we still have time, ask me anything.");
        //panel7
        panel7.add(DAY_SEVEN + TIME + "14:00" + PLC_MAIN_STAGE
                + "MalvinaMoney (Мальвина Мáни) - beginner YouTube vblogger. Dai5Top5 channel, program \"1на1\" host. Judging by the comments section, has already won the non-existent nomination \"YouTube sexiest voice\"! Improvisation, sarcasm and something tasty!");
        //panel8
        panel8.add(DAY_SEVEN + TIME + "15:00" + PLC_PRESENTATION
                + "\"Science fiction and fantasy offer you the prospect of a possible, and a possible contains a choice, and a choice - is freedom, and here you touch the fundamental nature of every human being.\" L. Ron Hubbard\n" +
                "- How writers influence culture - from the golden age of adventure and to this day;\n" +
                "- How space program is associated with writers;\n" +
                "- Why science fiction and fantasy are inconceivable without illustrations These and other questions will be answered in this presentation!");
        //panel9
        panel9.add(DAY_SIX + TIME + "13:00" + PLC_PRESENTATION
                + "Who we are, what we do and why we do what we do?\n" +
                "\n" +
                "We will tell you some facts about Lego, our hobby, why and how to become one of us. Come and see our presentation about Latlug, a part of bigger group Balticlug.");
        //panel10
        panel10.add(DAY_SEVEN + TIME + "14:00" + PLC_PRESENTATION
                + "A book presentation for those who love conspirology and generally independent comics. Novella is designed to not only popularize comics in Latvia and thus open for authors and readers new market segment, but also to present Latvia and Latvian authors in the world of comics, where to this point rare person has heard about them. Or perhaps never heard at all. Every beginning is difficult, but we hope that our modest contribution to the common cause will benefit to everyone.\n" +
                " \n" +
                "You will learn a lot of new and interesting things about the history of Riga and its ancient legends, especially about the missing gold of Templars, about the holy Kristaps and eerie prediction of the monster living somewhere under the dark waters of the river Daugava. Novella is unique because it is based on urban legends, which, according to tradition conspirology, linked in the most frightening manner with key themes and events of our time.");
        //panel11
        panel11.add(DAY_SEVEN + TIME + "12:00" + PLC_PRESENTATION
                + "Kinoblogeri.lv presentation on the most wanted movies of the nearest future!");


        panelDetails.put("Gesha's panel", panel1);
        panelDetails.put("Elffi's panel", panel2);
        panelDetails.put("Calssara's panel", panel3);
        panelDetails.put("Erza's panel", panel4);
        panelDetails.put("This is Хорошо", panel5);
        panelDetails.put("N8e's panel", panel6);
        panelDetails.put("MalvinaMoney", panel7);
        panelDetails.put("Role of the writer in the creation of the future", panel8);
        panelDetails.put("Latlug", panel9);
        panelDetails.put("R2 Novels", panel10);
        panelDetails.put("Kinoblogeri", panel11);

        return panelDetails;

    }

}
