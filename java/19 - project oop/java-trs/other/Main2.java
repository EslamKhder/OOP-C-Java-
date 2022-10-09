package com.java.other;
import java.awt.Graphics;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 * This class will resize all the images in a given folder
 * @author
 *
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        File folder = new File("D:\\java-com");
        File[] listOfFiles = folder.listFiles();
//        System.out.println("Total No of Files:" + listOfFiles.length);
        BufferedImage img = null;
        BufferedImage tempPNG = null;
        BufferedImage tempJPG = null;
        File newFilePNG = null;
        File newFileJPG = null;
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
                img = ImageIO.read(new File("D:\\java-com\\" + listOfFiles[i].getName()));
                tempJPG = resizeImage(img, img.getWidth(), img.getHeight());
                newFileJPG = new File("D:\\java-com\\save.jpg");
                ImageIO.write(tempJPG, "jpg", newFileJPG);
            }
        }
        System.out.println("DONE");
    }

    /**
     * This function resize the image file and returns the BufferedImage object that can be saved to file system.
     */
    public static BufferedImage resizeImage(final Image image, int width, int height) {
        int targetw = 0;
        int targeth = 75;
        if (width > height) targetw = 112;
        else targetw = 50;
        do {
            if (width > targetw) {
                width /= 2;
                if (width < targetw) width = targetw;
            }
            if (height > targeth) {
                height /= 2;
                if (height < targeth) height = targeth;
            }
        } while (width != targetw || height != targeth);
        final BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        final Graphics2D graphics2D = bufferedImage.createGraphics();
        graphics2D.setComposite(AlphaComposite.Src);
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);


        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.drawImage(image, 0, 0, width, height, null);
        graphics2D.dispose();
        return bufferedImage;
    }
}