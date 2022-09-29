package Prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Song {
    String movieName;
    String songName;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        else if(o == null || getClass() != o.getClass()){ return false;}
        Song s1 = this;
        Song s2 = (Song) o;
        return (s1.movieName.equals(s2.movieName) && s1.songName.equals(s2.songName));
    }
    @Override
    public int hashCode() {
        return Objects.hash(songName,movieName);
    }
    public Song(String songName, String movieName) {
        this.songName=songName;
        this.movieName=movieName;
    }
    public void play(){
        System.out.println(songName+" of "+movieName+" is playing...!");
    }
}

class PlayList{
    public List<Song> songs = new ArrayList<>();
    public void addSong(Song song){
          if(songs.add(song)) {
              System.out.println("Song added to the playlist successfully.");
          }else{
              System.out.println("Song is already added in the playlist");
          }
    }
}

class Main {
    public static void main(String[] args) {
        Song songs = new Song("Aashiqui", "Tum mile");
        Song songs = new Song("Aashiqui", "Tum mile");
        Song songs = new Song("Aashiqi2", "Tum mle2");
        Song songs = new Song("Aashiqui3", "Tum mile3");
        Song songs = new Song("Aashiqui4", "Tum mile4");

        PlayList play = new PlayList();

        play.addSong(songs);
    }
}