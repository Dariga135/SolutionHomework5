public class Main {
    public static void main(String[] args) {

        MarkerStyleFactory styleFactory = new MarkerStyleFactory();

        String[] locations = {"Hospital A", "Restaurant B", "Hospital C", "Restaurant D", "Restaurant E"};
        String[] markerTypes = {"hospital", "restaurant", "hospital", "restaurant", "restaurant"};

        for (int i = 0; i < locations.length; i++) {
            MarkerStyle style = styleFactory.getMarkerStyle(markerTypes[i]);
            LocationMarker marker = new LocationMarker(locations[i], style);
            marker.render();
        }
    }
}
