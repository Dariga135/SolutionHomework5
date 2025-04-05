public class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {

            System.out.println("Displaying thumbnail for: " + fileName);
        } else {

            realImage.display();
        }
    }
    public void displayFullImage() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
