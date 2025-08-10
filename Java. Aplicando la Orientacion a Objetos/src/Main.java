import com.angel.entities.Audio;

public class Main {
    public static void main(String[] args) {
        Audio mp3 = new Audio();
        mp3.setTotalReproductions(1000);
        System.out.println(mp3.getTotalReproductions());
    }
}