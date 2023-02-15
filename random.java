import java.time.Duration;
import java.time.Instant;

import javax.swing.plaf.synth.SynthScrollBarUI;
public class random {
    public static void main(String[] args) {
        Instant start=Instant.now();
       for(int i=0;i<100000000;i++) {
       double d=Math.random();
       // System.out.println(d);
    }
    
       Instant end=Instant.now();
       Duration timeElapsed =Duration.between(start, end);
       System.out.println(timeElapsed.toSeconds());
}
}