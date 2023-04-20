package edu.guilford.horsedesign;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class HorseDesign {

    static BufferedImage background;
    static JFrame maneWindow;
    static JFrame tailWindow;
    static JFrame hoofWindow;
    static JFrame bodyWindow;

    public static void main(String[] args) throws IOException, URISyntaxException {
        // TODO code application logic here
        background = ImageIO.read(new File(HorseDesign.class.getResource("/horse_coloring2.png").toURI()));

        //This creates main panel for program 
        JFrame horseWindow = new JFrame("What Color Looks Best? Horse Studio");
        HorsePanel designPanel = new HorsePanel();
        horseWindow.getContentPane().add(designPanel);

        horseWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        horseWindow.pack();
        horseWindow.setVisible(true);

        //This creates the mane panel 
        //Set as non-visible
        maneWindow = new JFrame("Mane Color!");
        ManePanel manePanel = new ManePanel();

        manePanel.sethPanel(designPanel);

        maneWindow.getContentPane().add(manePanel);
        maneWindow.pack();
        maneWindow.setVisible(false);
        designPanel.setManeWindow(maneWindow);
        //reclocate Panel
        maneWindow.setLocation(horseWindow.getWidth() - 800, 350);

        //This creates the tail panel 
        //Set as non-visible
        //This panel is the mane panel refactored (since the mane and tail will have the same color options)
        tailWindow = new JFrame("Tail Color!");
        TailPanel tailPanel = new TailPanel();

        tailPanel.sethPanel(designPanel);

        tailWindow.getContentPane().add(tailPanel);
        tailWindow.pack();
        tailWindow.setVisible(false);
        designPanel.setTailWindow(tailWindow);
        //Relocate Panel
        tailWindow.setLocation(horseWindow.getWidth() - 800, 350);

        //This creates the hoof panel 
        //Set as non-visible
        hoofWindow = new JFrame("Hoof Color!");
        HoofPanel hoofPanel = new HoofPanel();

        hoofPanel.sethPanel(designPanel);

        hoofWindow.getContentPane().add(hoofPanel);
        hoofWindow.pack();
        hoofWindow.setVisible(false);
        designPanel.setHoofWindow(hoofWindow);
        //Relocate Panel
        hoofWindow.setLocation(horseWindow.getWidth() - 800, 350);

        //This creates the body panel 
        //Set as non-visible
        bodyWindow = new JFrame("Body Color!");
        BodyPanel bodyPanel = new BodyPanel();

        bodyPanel.sethPanel(designPanel);

        bodyWindow.getContentPane().add(bodyPanel);
        bodyWindow.pack();
        bodyWindow.setVisible(false);
        designPanel.setBodyWindow(bodyWindow);
        //Relocate Panel
        bodyWindow.setLocation(horseWindow.getWidth() - 800, 350);
    }

    

}
