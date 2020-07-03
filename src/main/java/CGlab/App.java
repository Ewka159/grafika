package CGlab;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    String version = "0.02";

    public static void main(String[] args) {
        int x, y;
        String sciezka;
        System.out.println(args.length);
        if (args.length < 3) {
            System.out.println("Za mało argumentów");
            return;

        }
        x = Integer.valueOf(args[1]);
        y = Integer.valueOf(args[2]);
        sciezka = args[0];


        Renderer mainRenderer = new Renderer(sciezka, x, y);
        mainRenderer.clear();
        mainRenderer.drawPoint(100, 100);
        try {
            mainRenderer.save();
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getVersion() {
        return this.version;
    }
}
