import  java.awt.*;
/**
 * User: Administrator
 * Date: 13-3-20
 * Time: 下午5:36
 */
public class ChatClient extends Frame {
    public static void main(String[] args) {

        new ChatClient().launchFrame();
    }

    public void launchFrame (){
        setLocation(400,300);
        setSize(500,400);
        setVisible(true);
    }
}
