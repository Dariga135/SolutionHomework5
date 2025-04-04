import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private Map<String, MarkerStyle> styles = new HashMap<>();

    public MarkerStyle getMarkerStyle(String markerType) {
        if (!styles.containsKey(markerType)) {
            if (markerType.equals("hospital")) {
                styles.put(markerType, new HospitalMarkerStyle());
            } else if (markerType.equals("restaurant")) {
                styles.put(markerType, new RestaurantMarkerStyle());
            }
        }
        return styles.get(markerType);
    }
}

