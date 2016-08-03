package unicon.lv.uniapp.data_providers;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;

/**
 * Created by antos on 8/1/16.
 */
public class EventMapDataProvider {

    public static LinkedHashMap<String, List<String>> getInfo() {
        LinkedHashMap<String, List<String>> mapDetails = new LinkedHashMap<>();
        List<String> map0 = new ArrayList<>();
        List<String> map1 = new ArrayList<>();
        List<String> map2 = new ArrayList<>();
        List<String> map3 = new ArrayList<>();
        List<String> map4 = new ArrayList<>();
        List<String> map5 = new ArrayList<>();

        map0.add("Turn your device to change the size.");

        map1.add("29. Entrance/info");

        map2.add("1. Dancing Area           2. UniCon VR" +
                "\n3. Crafts Area             4. Console Gaming" +
                "\n5. Coffee Inn               6. Trade Area" +
                "\n7. VR Area                     8. Lattelecom Area" +
                "\n9. Red Bull Zone           10. Workshops" +
                "\n11. EXanimo LoL          12. UniCon eSports" +
                "\n13. Tabletops                14. TCG" +
                "\n15. Arts Area                16. Jaff" +
                "\n17. Exhibition Area      18. IT & GameDev" +
                "\n19. Microsoft Latvia    20. Latlug" +
                "\n28. Instabox                   30. Vasily Art" +
                "\n31. Photowall");

        map3.add("21. Stairs\n22. Entrance to the main stage");

        map4.add("25. Stairs\n26. Comics library\n27. Presentation Hall");

        map5.add("23. Seats\n24. Stage");

        mapDetails.put("General map", map0);
        mapDetails.put("A. Gallery", map1);
        mapDetails.put("B. Main Hall", map2);
        mapDetails.put("C. Hall", map3);
        mapDetails.put("D. 2nd floor", map4);
        mapDetails.put("E. Main Stage", map5);

        return mapDetails;

    }

}
