package week1;

/**
 * Created by Kai on 2017/5/31.
 */
/*
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
 */
public class ReverseStr {
    protected String s = "abcdefg";
    protected int k = 8;
    public void StringToChar(){
        char temp;
        char[] c = s.toCharArray(); // c = {a,b,c,d,e,f,g}
        System.out.println(c);
        if(c.length<k)
            k=c.length;
        for(int i=0;i<c.length;i+=2*k){
            for(int left=i,j=i+k-1;left<j;j--,left++){
                if(j<c.length) {
                    temp = c[j];
                    c[j] = c[left];
                    c[left] = temp;
                }else
                    break;
            }
        }
        System.out.println(c);
    }
    public static void main(String args[]){
        ReverseStr test = new ReverseStr();
        test.StringToChar();
    }
}
