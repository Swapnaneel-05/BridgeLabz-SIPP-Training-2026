import java.util.*;

public class MusicPlaylist {

    LinkedList<String> playlist = new LinkedList<>();

    // Add song
    public void playSong(String song) {
        playlist.addFirst(song);

        if (playlist.size() > 10) {
            playlist.removeLast();
        }

        System.out.println(song + " added to Recently Played");
    }

    // Search song
    public void searchSong(String song) {
        if (playlist.contains(song)) {
            System.out.println(song + " found in playlist.");
        } else {
            System.out.println(song + " not found.");
        }
    }

    // Display playlist
    public void displayPlaylist() {
        System.out.println("\nRecently Played Songs:");
        for (String song : playlist) {
            System.out.println(song);
        }
    }

    public static void main(String[] args) {

        MusicPlaylist mp = new MusicPlaylist();

        mp.playSong("Believer");
        mp.playSong("Shape of You");
        mp.playSong("Perfect");
        mp.playSong("Closer");
        mp.playSong("Senorita");
        mp.playSong("Blinding Lights");
        mp.playSong("Levitating");
        mp.playSong("Memories");
        mp.playSong("Faded");
        mp.playSong("Counting Stars");
        mp.playSong("Heat Waves"); // Removes oldest song

        mp.searchSong("Perfect");

        mp.displayPlaylist();
    }
}