
import java.awt.*;
import java.awt.event.*;

public class one extends WindowAdapter implements KeyListener{
    Frame f;
    Label l1,l2;
    TextArea t1;
    public one(){
        f=new Frame();
        f.setSize(500,500);
        f.setLayout(null);
        f.setTitle("KeyListener event");
        f.setLocationRelativeTo(null);
        init();
        add_component();
        register();
       
        f.setVisible(true);


    }
    public void init(){
        l1=new Label("KEYEVENT HANDLING");
        l1.setBounds(150, 80, 200, 50);
        l2=new Label();
        l2.setBounds(150, 330, 200, 50);
        t1=new TextArea();
        t1.setBounds(120, 180, 250, 75);

    } 
    public void add_component(){
        f.add(l1);
        f.add(l2);
        f.add(t1);

    }
    public void register(){
        f.addWindowListener(this);
        t1.addKeyListener(this);

    }
    public void keyPressed(KeyEvent e){
        l2.setText("Key Pressed="+e.getKeyChar());

    }
    public void keyReleased(KeyEvent e){
        l2.setText("Key Realsed="+e.getKeyChar());

    }
    public void keyTyped(KeyEvent e){
        l2.setText("Key Typed="+e.getKeyChar());

    }


    public void windowClosing(WindowEvent e){
        f.dispose();
    }
    public static  void main(String[] args) {
        new one();


        
    }
}