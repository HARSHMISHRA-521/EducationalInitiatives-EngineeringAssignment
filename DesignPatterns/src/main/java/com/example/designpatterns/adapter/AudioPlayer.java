package main.java.com.example.designpatterns.adapter;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;


    /**
     * Plays the specified audio file.
     *
     * @param audioType the type of the audio file (e.g. "mp3", "vlc", "mp4")
     * @param fileName the name of the audio file
     */
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
