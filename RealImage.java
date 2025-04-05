public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Loading full-resolution image: " + fileName);
    }

    public void display() {
        System.out.println("Displaying full-resolution image: " + fileName);
    }
}
