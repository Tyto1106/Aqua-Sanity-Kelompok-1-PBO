/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aquasanitykelompok1pbo;

/**
 *
 * @author ACER
 */
public class InteractiveMapPage {
    private int mapWidth;
    private int mapHeight;
    private String mapData;

    public InteractiveMapPage(int mapWidth, int mapHeight, String mapData) {
        this.mapWidth = mapWidth;
        this.mapHeight = mapHeight;
        this.mapData = mapData;
    }

    public void displayMap() {
        System.out.println("Map Width: " + mapWidth + " pixels");
        System.out.println("Map Height: " + mapHeight + " pixels");
        System.out.println("Map Data: " + mapData);
    }
}
