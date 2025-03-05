import java.util.ArrayList;
import java.util.LinkedList;

class Album{
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    //parameterised constructor
    public Album(String name, String artist){
        this.name = name;
        this.artist = name;
        songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) != null){
            System.out.println("This song is already in the list");
            return false;
        }
        else{
            //adding the song.
            songs.add(new Song(title, duration));
            return true;
        }
    }

    public Song findSong(String title){
        for(var i: songs){
            if(i.getTitle().equalsIgnoreCase(title)){
                return i;
            }
        }
        return null;
    }


    public boolean addToPlayList(int numberOfSongs, LinkedList<Song> playlist){
        int index = numberOfSongs - 1; //number of songs will be 1 index based. whereas arraylist will be based on 0 index
        if((index >= 0 ) && (index <= songs.size())){
            playlist.add(songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song requiredSong = findSong(title);
        if(requiredSong != null){
            playlist.add(requiredSong);
            return true;
        }
        return false;

    }
}