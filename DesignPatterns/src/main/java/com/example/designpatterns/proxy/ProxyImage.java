package main.java.com.example.designpatterns.proxy;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }


    /**
     * Displays the image by creating a new RealImage if it hasn't been created
     * yet. If the RealImage has already been created, it calls the display
     * method on the RealImage.
     *
     * @return void
     */
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
