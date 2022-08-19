package day35_custom_classes.song;

public class SongInformationRunner {
    public static void main(String[] args) {
        Song song1 = new Song("Kechki Bishkek", 4.21, "Mirbek Atabekov", "classic");

        Song song2 = new Song("Ashygym", 3.09, "Erlan Andashev", "pop");


        System.out.println(song1);
        System.out.println(song2);
    }
}
