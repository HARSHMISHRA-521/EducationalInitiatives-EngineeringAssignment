package main.java.com.example.designpatterns.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {


    /**
     * Plays a VLC file with the given file name.
     *
     * @param fileName the name of the VLC file to play
     */
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }


    /**
     * A method that plays an MP4 file with the given file name. This method
     * does nothing.
     *
     * @param fileName the name of the MP4 file to play
     */
    @Override
    public void playMp4(String fileName) {
        // Do nothing
    }
}
