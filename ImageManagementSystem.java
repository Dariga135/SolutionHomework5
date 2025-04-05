public class ImageManagementSystem {
    public static void main(String[] args) {

        ProxyImage proxyImage1 = new ProxyImage("property1_high_res.jpg");
        ProxyImage proxyImage2 = new ProxyImage("property2_high_res.jpg");

        proxyImage1.display();
        proxyImage2.display();

        System.out.println("\nUser clicks to zoom in on property 1:");
        proxyImage1.displayFullImage();

        System.out.println("\nUser clicks to zoom in on property 2:");
        proxyImage2.displayFullImage();
    }
}
