
import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;

public class Labyrinth extends BouncerApp {

    @Override
    public void bounce() {
        loadMap("Labyrinth");
    }

    public static void main(String[] args) {
        BouncerLauncher.launch("Labyrinth");
    }
}