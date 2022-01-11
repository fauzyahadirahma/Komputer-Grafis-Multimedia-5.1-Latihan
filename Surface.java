/*
 * Nama     : Fauzyah Hadirahma
 * NPM      : 20191310070
 * Materi   : Transformasi - Translasi
 * Tanggal  : 6 Agustus 2021
 */
package Coba;

/**
 *
 * @author Fauzyah
 */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Surface extends JPanel{
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        
        //------------------------------------------------
        
        g2d.setPaint(new Color(250, 128, 114));
        /*koordinat objek awal 0*/
        String s = "F";
        g2d.drawString(s, 20, 10);
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(250, 128, 114));
        g2d.translate(30, 0); //posisi translasi
        //koordinat object - target kanan
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(250, 128, 114));
        g2d.translate(30, 0); //posisi translasi
        //koordinat object - target kanan
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(250, 128, 114));
        g2d.translate(-60, 30); //posisi translasi
        //koordinat object - target bawah
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(250, 128, 114));
        g2d.translate(0, 30); //posisi translasi
        //koordinat object - target bawah
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(250, 128, 114));
        g2d.translate(30, 0); //posisi translasi
        //koordinat object - target kanan
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(250, 128, 114));
        g2d.translate(30, 0); //posisi translasi
        //koordinat object - target kanan
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(250, 128, 114));
        g2d.translate(-60, 30); //posisi translasi
        //koordinat object - target bawah
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(250, 128, 114));
        g2d.translate(0, 30); //posisi translasi
        //koordinat object - target bawah
        g2d.fillRect(20, 20, 20, 20);
        
        //---------------------------------------------------
        
        g2d.setPaint(new Color(40, 178, 170));
        /*koordinat objek awal 0*/
        s = "A";
        g2d.drawString(s, 176, -110);
        g2d.translate(150, -120);
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(40, 178, 170));
        g2d.translate(20, 30); //posisi translasi
        //koordinat object - target 
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(40, 178, 170));
        g2d.translate(-40, 0); //posisi translasi
        //koordinat object - target 
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(40, 178, 170));
        g2d.translate(20, 30); //posisi translasi
        //koordinat object - target 
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(40, 178, 170));
        g2d.translate(-40, 0); //posisi translasi
        //koordinat object - target 
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(40, 178, 170));
        g2d.translate(80, 0); //posisi translasi
        //koordinat object - target 
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(40, 178, 170));
        g2d.translate(0, 30); //posisi translasi
        //koordinat object - target 
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(40, 178, 170));
        g2d.translate(0, 30); //posisi translasi
        //koordinat object - target 
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(40, 178, 170));
        g2d.translate(-80, 0); //posisi translasi
        //koordinat object - target 
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(40, 178, 170));
        g2d.translate(0, -30); //posisi translasi
        //koordinat object - target 
        g2d.fillRect(20, 20, 20, 20);
        
        //---------------------------------------------------
        
        g2d.setPaint(new Color(218, 165, 32));
        /*koordinat objek awal 0*/
        s = "U";
        g2d.drawString(s, 155, -80);
        g2d.translate(130, -90);
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(218, 165, 32));
        g2d.translate(0, 30); //posisi translasi
        //koordinat object - target bawah
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(218, 165, 32));
        g2d.translate(0, 30); //posisi translasi
        //koordinat object - target bawah
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(218, 165, 32));
        g2d.translate(0, 30); //posisi translasi
        //koordinat object - target bawah
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(218, 165, 32));
        g2d.translate(0, 30); //posisi translasi
        //koordinat object - target bawah
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(218, 165, 32));
        g2d.translate(30, 0); //posisi translasi
        //koordinat object - target kanan
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(218, 165, 32));
        g2d.translate(30, 0); //posisi translasi
        //koordinat object - target kanan
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(218, 165, 32));
        g2d.translate(30, 0); //posisi translasi
        //koordinat object - target kanan
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(218, 165, 32));
        g2d.translate(0, -30); //posisi translasi
        //koordinat object - target atas
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(218, 165, 32));
        g2d.translate(0, -30); //posisi translasi
        //koordinat object - target atas
        g2d.fillRect(20, 20, 20, 20);

        g2d.setPaint(new Color(218, 165, 32));
        g2d.translate(0, -30); //posisi translasi
        //koordinat object - target atas
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.setPaint(new Color(218, 165, 32));
        g2d.translate(0, -30); //posisi translasi
        //koordinat object - target atas
        g2d.fillRect(20, 20, 20, 20);
        
        g2d.dispose();
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}