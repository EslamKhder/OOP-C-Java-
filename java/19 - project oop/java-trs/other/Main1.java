package com.java.other;


import net.coobird.thumbnailator.Thumbnails;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main1 {
    static BufferedImage scaleImage(BufferedImage originalImage, int targetWidth, int targetHeight) throws Exception {
        ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
        Thumbnails.of(originalImage)
                .size(targetWidth, targetHeight)
                .outputFormat("JPEG")
                .toOutputStream(byteOutputStream);
        byte[] data = byteOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        return ImageIO.read(byteArrayInputStream);
    }

        public static void main(String[] args) throws Exception {
            BufferedImage originalImage = ImageIO.read(new File("D:\\java-com\\image-64.jpg"));
            BufferedImage outputImage = scaleImage(originalImage, 400, 300);
            ImageIO.write(outputImage, "jpg", new File("D:\\java-com\\save.jpg"));
        }
}