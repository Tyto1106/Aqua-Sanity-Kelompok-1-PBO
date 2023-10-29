/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aquasanitykelompok1pbo;

/**
 *
 * @author ACER
 */
public class Report extends User {
    private int reportID;
    private int kumpulanLaporan;
    private InteractiveMap daerah;
    private int level;
    private String komen;
    
    

    public int getKumpulanLaporan() {
        return kumpulanLaporan;
    }

    public void setKumpulanLaporan(int kumpulanLaporan) {
        this.kumpulanLaporan = kumpulanLaporan;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getKomen() {
        return komen;
    }

    public void setKomen(String komen) {
        this.komen = komen;
    }
}

