public class RestaurantMarkerStyle implements MarkerStyle {
    private String icon = "restaurant_icon";
    private String color = "green";
    private String labelStyle = "italic";

    public void render(String location) {
        System.out.println("Rendering restaurant marker at " + location + " with icon " + icon + ", color " + color + ", and label style " + labelStyle);
    }
}