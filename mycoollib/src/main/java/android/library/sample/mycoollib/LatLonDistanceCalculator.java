package android.library.sample.mycoollib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LatLonDistanceCalculator {
    private static final int EARTH_RADIUS_IN_KILOMETERS = 6371;

    public static List<Point> parse(String rssFeed) {
        List<Point> list = new ArrayList<>();
        Random r = new Random();
        // random number of item but at least 5
        Integer number = r.nextInt(10) + 5;
        for (int i = 0; i < number; i++) {
            // create sample data
            String s = String.valueOf(r.nextInt(1000));
            Point item = new Point("Summary " + s, "Description " + s);
            list.add(item);
        }
        return list;
    }
}
