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
        if (args.length < 4) {
            System.out.println("Za mało argumentów");
            return;

        }
        x = Integer.parseInt(args[1]);
        y = Integer.parseInt(args[2]);
        sciezka = args[0];
Renderer.LineAlgo line=null;
if(args[3].equalsIgnoreCase("LINE_NAIVE"))
    line=Renderer.LineAlgo.NAIVE;

        Renderer mainRenderer = new Renderer(sciezka, x, y);
        mainRenderer.clear();
       mainRenderer.drawLine(100,100,200,200,line);
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
