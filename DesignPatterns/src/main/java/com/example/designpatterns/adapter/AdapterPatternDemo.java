package main.java.com.example.designpatterns.adapter;

public class AdapterPatternDemo {

    /**
     * This is the main method of the program.
     *
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
