package com.java.other;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ImageCompressed {

    public static void main(String[] args) throws IOException {
        BufferedImage img = null;
        try
        {
            img = ImageIO.read(new File("D:\\java-com\\image.jpg")); // eventually C:\\ImageTest\\pic2.jpg
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        //Image newImage = img.getScaledInstance(700, 417, Image.SCALE_DEFAULT);
        //BufferedImage bi = new BufferedImage(newImage.getWidth(null), newImage.getHeight(null), BufferedImage.TYPE_INT_RGB);
        BufferedImage bi = resizeImage(img,400,300);
        // Draw the image on to the buffered image
        /*Graphics2D bGr = bi.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();*/
        File outputfile = new File("D:\\java-com\\saved.jpg");
        ImageIO.write(bi, "png", outputfile);



    }
    public static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) throws IOException {
        Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_DEFAULT);
        BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
        return outputImage;
    }

    // Zip a single file
    public static void zipSingleFile(String zipFileName)
            throws IOException {
        final JFileChooser fc = new JFileChooser();
        fc.setMultiSelectionEnabled(true);
        fc.setFileFilter(new FileNameExtensionFilter("Image files", "bmp", "png", "jpg"));
        fc.setAcceptAllFileFilterUsed(false);
        fc.showOpenDialog(null);

        File files[] = fc.getSelectedFiles();

        for (int i=0;i<files.length;i++) {
            try (
                    ZipOutputStream zos = new ZipOutputStream(
                            new FileOutputStream(zipFileName));
                    FileInputStream fis = new FileInputStream(files[i]);
            ) {

                ZipEntry zipEntry = new ZipEntry(files[i].getName());
                zos.putNextEntry(zipEntry);

                byte[] buffer = new byte[1024];
                int len;
                while ((len = fis.read(buffer)) > 0) {
                    zos.write(buffer, 0, len);
                }
                zos.closeEntry();
            }
        }

    }
}