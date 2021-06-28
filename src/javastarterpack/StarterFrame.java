/*
This is a simplified example frame used in Java.
The frame includes:
    - Background color
    - Font
 */

// Package name 
package javastarterpack;

// Imports that are used throughout this program
// You import them as you go, you don't have to type them in advance
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

// Extending the JFrame class.
public class StarterFrame extends JFrame
{
    // Making the background color
    // Color needs to be imported, the error will show, click the error and import.
    // Colors are identified in RGB.. (R, G, B)
    // I use the color "Salmon" for this
    // STARTER_COLOR is just a name for the color, can be used throughout the package 
    public static final Color STARTER_COLOR = new Color(250,128,114);
    
    // Making a font
    // Font needs to be imported, the error will show, click the error and import.
    // This depends on what font you have saved on your computer (I'll use a common one)
    // You can also change the font to be bold, italic or underline. Size can also be changed
    // STARTER_FONT is just a name for the font, can be used throughout the package 
    public static final Font STARTER_FONT = new Font("Times New Roman", Font.BOLD, 25);
    
    // Declaring a label for the text
    // Label needs to be imported, the error will show, click the error and import.
    // This is where you ut your text in the frame
    // JLabel needs to be imported
    private JLabel starterText;
    
    public StarterFrame()
    {
        // this wil appear at the very top of the frame
        // it works as an identifier
        super("Starter Frame");
        
        // constructing the frame
        // this is where you identify the size (x, y, width, height)
        this.setBounds(200, 200, 500, 500);
        
        // This is merely extra but this identify what the X button does
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // As we already set what our background color is, we are now putting it in the frame
        this.getContentPane().setBackground(STARTER_COLOR);
        
        // This construct the border layout, it acts as a default manager for content pane
        // BorderLayout needs to be imported, the error will show, click the error and import.
        this.setLayout(new BorderLayout());
        
        // Constructing a text message to be shown in frame
        // Swing Constants indicates that you want the indentation to be in the center instead if right or left
        // SwingConstants needs to be imported, the error will show, click the error and import.
        this.starterText = new JLabel ("Congrats! You made a frame!", SwingConstants.CENTER);
        // setting the font to the font we created
        starterText.setFont(STARTER_FONT);
        
        // We now add the text to the frame
        this.add(starterText, BorderLayout.CENTER);
        
        // Making everything visible
        this.setVisible(true);
    }
    
    // A main method to allow the program to run
    public static void main(String[] args)
    {
        StarterFrame frame = new StarterFrame();              
    }
    
}
