package ImageProcess;
/*參考資料
https://motoya363.wordpress.com/2007/03/09/在java應用程序中創建圖像的方法和技巧/
http://mypaper.pchome.com.tw/zerojudge/post/1324399343
 */
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class RotateImage extends JFrame {
    private JButton button;
    private BufferedImage image;                      //把圖像儲存在一個可以被存取的buffer
    public BufferedImage rotateThePicture(BufferedImage source){
        int width,height;
        width = source.getWidth();                       //取得來源的像素寬與像素高
        height = source.getHeight();

        BufferedImage roteteImage = new BufferedImage(height,width,source.getType());
        for(int i=0;i<height;i++){
            for(int j=width-1;j>=0;j--){
                roteteImage.setRGB(i,width-j-1,image.getRGB(j,i));             //如果要從 BufferedImage 對像獲取單個像素，可以通過調用它的 getRGB() 方法，並提供該像素的 x,y 坐標作為 int 類型的參數。而setRGB來設置單個像素，前兩個參數是座標的值
            }
        }
        return roteteImage;
    }
    public RotateImage(){
        this.setTitle("Rotate Image");
        this.setSize(800,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try{
            button = new JButton();
            image = ImageIO.read(new File("D:\\Olsen\\ohhh.jpg"));
        }catch (Exception e){
            e.printStackTrace();
        }
        button.setIcon(new ImageIcon(image));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                image = rotateThePicture(image);
                button.setIcon(new ImageIcon(image));
            }
        });

        this.add(button);
        this.setVisible(true);
        this.setResizable(false);
    }
    public static void main(String[] args){
        new RotateImage();
    }
}
