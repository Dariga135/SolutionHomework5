public class HospitalMarkerStyle implements MarkerStyle {
    private String icon = "hospital_icon";
    private String color = "red";
    private String labelStyle = "bold";

    public void render(String location) {
        System.out.println("Rendering hospital marker at " + location + " with icon " + icon + ", color " + color + ", and label style " + labelStyle);
    }
}


