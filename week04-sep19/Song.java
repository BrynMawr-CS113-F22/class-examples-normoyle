import java.util.Arrays;

public class Song {
    public static void main(String[] args) {

        In songFile = new In("elisa.txt");
        int numNotes = songFile.readInt();

        for (int i = 0; i < numNotes; i++) {
            int pitch = songFile.readInt();
            double duration  = songFile.readDouble();

            // build sine wave with desired frequency
            double hz = 440 * Math.pow(2, pitch / 12.0);
            int n = (int) (StdAudio.SAMPLE_RATE * duration);
            double[] sound = new double[n+1];
            for (int j = 0; j <= n; j++) {
                sound[j] = Math.sin(2 * Math.PI * j * hz / StdAudio.SAMPLE_RATE);
            }
            StdAudio.play(sound);
        }
    }
}
