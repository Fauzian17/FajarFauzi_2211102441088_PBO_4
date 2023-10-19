import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class greenRocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class greenRocket extends Enemy
{
    /**
     * Act - do whatever the greenRocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public greenRocket() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 50, image.getHeight() / 50); // Mengubah ukuran gambar menjadi setengah ukuran aslinya
        setImage(image);
    }
    void cetakBaru(){
        greenRocket grenRkt= new greenRocket();
        getWorld().addObject(grenRkt,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(),getY()+2);
    }
    public void act()
    {
        // Add your action code here.
        super.act();
    }
}
