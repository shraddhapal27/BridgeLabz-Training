package com.Day2.songvault;

import java.io.*;
import java.util.*;
import java.util.regex.*;

class SongVault {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("song.txt"));

        List<Song> songs = new ArrayList<>();
        Map<String, List<Song>> genreMap = new HashMap<>();
        Set<String> artists = new HashSet<>();

        String line, title="", artist="", genre="";

        while ((line = br.readLine()) != null) {
            if (line.startsWith("Title")) title = line.split(":")[1].trim();
            if (line.startsWith("Artist")) artist = line.split(":")[1].trim();
            if (line.startsWith("Genre")) {
                genre = line.split(":")[1].trim();

                Song s = new Song(title, artist, genre);
                songs.add(s);

                genreMap.putIfAbsent(genre, new ArrayList<>());
                genreMap.get(genre).add(s);

                artists.add(artist);
            }
        }

        br.close();
        System.out.println("Songs loaded");
    }
}
