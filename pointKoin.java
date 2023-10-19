import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pointKoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pointKoin extends ObjectSpecial
{
    /**
     * Act - do whatever the pointKoint wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public pointKoin() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 50, image.getHeight() / 50); // Mengubah ukuran gambar menjadi setengah ukuran aslinya
        setImage(image);
    }
    void cetakBaru(){
        pointKoin koin= new pointKoin();
        getWorld().addObject(koin,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(),getY()+3);
    }
    public void act()
    {
        super.act();
    }
}
