package LeetCode;

import java.util.Scanner;

/**
 * Created by Kai on 2017/11/18.
 * 假設機器人可以走上下左右四種方向，輸入字元U、L、R、D分別代表上、左、又、下，任意輸入字元組合，並檢查是否回到原點
 */
public class JudgeRobetDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Robet action = new Robet();
        System.out.print("請輸入U L R D 四種字元 : ");
        String text = sc.nextLine();
        char[] operation = text.toCharArray();
        for (int i = 0; i < operation.length; i++) {
            switch (operation[i]) {
                case 'U':
                    action.setUp();
                    break;
                case 'L':
                    action.setLeft();
                    break;
                case 'R':
                    action.setRight();
                    break;
                case 'D':
                    action.setDown();
                    break;
                default:
            }
        }
        if (action.isOrigin()) {
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }

    }
}
class Robet{
    private int up;
    private int right;
    private int left;
    private int down;
    public Robet(){
        this.up = 0;
        this.right = 0;
        this.left = 0;
        this.down = 0;
    }
    public void setUp(){
        this.up++;
    }
    public void setRight(){
        this.right++;
    }
    public void setLeft(){
        this.left--;
    }
    public void setDown(){
        this.down--;
    }
    public boolean isOrigin(){
        if((up+down)==0 && (right+left)==0){
            return true;
        }
        return false;
    }
}