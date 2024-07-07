package main.java.com.example.designpatterns.adapter;

public class Mp4Player implements AdvancedMediaPlayer {


    /**
     * A method to play a VLC file.
     *
     * @param fileName the name of the VLC file to play
     */
    @Override
    public void playVlc(String fileName) {
        // Do nothing
    }


    /**
     * A description of the entire Java function.
     *
     * @param fileName	description of parameter
     * @return description of return value
     */
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
