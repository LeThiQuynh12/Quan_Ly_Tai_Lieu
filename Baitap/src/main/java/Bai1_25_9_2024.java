import java.awt.*;
import java.awt.event.*;

class MyListener1 implements ActionListener {
    Frame frm;
    Label lbStatus;
    Button blueButton, whiteButton, helloButton;

    public MyListener1(Frame frm, Label lbStatus, Button helloButton, Button blueButton, Button whiteButton) {
        this.frm = frm;
        this.lbStatus = lbStatus;
        this.helloButton = helloButton;
        this.blueButton = blueButton;
        this.whiteButton = whiteButton;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == helloButton) {
            javax.swing.JOptionPane.showMessageDialog(frm, "Hello !");
        } else if (event.getSource() == blueButton) {
            frm.setBackground(Color.BLUE);
        } else if (event.getSource() == whiteButton) {
            frm.setBackground(Color.WHITE);
        }
    }
}

// Không cần từ khóa public
class AFrame extends Frame {

    private Button blueButton;
    private Button whiteButton;
    private Button helloButton;
    private Label lbStatus;

    public AFrame() {
        // Sử dụng FlowLayout với khoảng cách giữa các thành phần
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

       
       

        blueButton = new Button("Blue");
        whiteButton = new Button("White");
        helloButton = new Button("Hello");
         lbStatus = new Label("You pressed Maybe button");
        add(blueButton);
        add(whiteButton);
        add(helloButton);
         add(lbStatus);
        MyListener1 listener = new MyListener1(this, lbStatus, helloButton, blueButton, whiteButton);
        blueButton.addActionListener(listener);
        whiteButton.addActionListener(listener);
        helloButton.addActionListener(listener);

        setSize(300, 200);
        setVisible(true);
    }
}

public class Bai1_25_9_2024 {
    public static void main(String[] args) {
        AFrame frame = new AFrame();
        frame.setTitle("My Frame");
       
        frame.addWindowListener(new WindowAdapter() {
             @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
