package ImageProcess;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by Kai on 2017/11/18.
 */
public class NewImage {
    public static void main(String[] args) {
        ImageCom imageCom = new ImageCom("D:\\Olsen\\ohhh.jpg");
        imageCom.show();
    }
    public static class ImageCom implements Runnable{
        private String fileName;
        BufferedImage image;
        JFrame jFrame;
        public ImageCom(String fileName){
            this.fileName = fileName;
            image = LoadingImage(this.fileName);
        }
        public static BufferedImage LoadingImage(String fileName){
            BufferedImage image;
            try{
                image = ImageIO.read(new File(fileName));
            }catch (Exception e){
                javax.swing.JOptionPane.showMessageDialog(null,"載入圖檔錯誤"+fileName);
                image = null;
            }
            return image;
        }
        public void show(){
            SwingUtilities.invokeLater(this);
        }
        public void run(){
            jFrame = new JFrame();
            JScrollPane jScrollPane = new JScrollPane(new JLabel(new ImageIcon(image)));
            jFrame.getContentPane().add(jScrollPane);
            jFrame.pack();

            jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
            jFrame.setTitle(fileName+" "+image.getWidth()+" x "+image.getHeight());
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);

        }
    }
}
