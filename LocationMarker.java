public class LocationMarker {
    private String location;
    private MarkerStyle markerStyle;

    public LocationMarker(String location, MarkerStyle markerStyle) {
        this.location = location;
        this.markerStyle = markerStyle;
    }

    public void render() {
        markerStyle.render(location);
    }
}
