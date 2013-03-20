import  java.awt.*;
/**
 * User: Administrator
 * Date: 13-3-20
 * Time: 下午5:36
 */
public class ChatClient extends Frame {
    TextField tfTxt = new TextField();
    TextArea taContent = new TextArea();

    public static void main(String[] args) {

        new ChatClient().launchFrame();
    }

    public void launchFrame (){
        setLocation(400,300);
        setSize(500,400);
        setVisible(true);
        add(tfTxt , BorderLayout.SOUTH);
        add(taContent , BorderLayout.NORTH);
        pack();
    }
}
