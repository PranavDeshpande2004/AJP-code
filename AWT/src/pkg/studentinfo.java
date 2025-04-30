package pkg;



import java.awt.*;
import java.awt.event.*;

public class studentinfo extends WindowAdapter implements ActionListener {
    Frame f;
    TextField nameField, rollField, t1, t2, t3, t4, t5;
    Label nameLabel, rollLabel, l1, l2, l3, l4, l5;
    Button b1, b2;
    Font font;

    studentinfo() {
        f = new Frame();
        f.setSize(550, 500);
        f.setVisible(true);
        f.setLayout(null);
        f.setTitle("Student Management System");
        f.setBackground(Color.LIGHT_GRAY);
        f.setLocationRelativeTo(null);
        init();
        add_component();
        register();
    }

    public void init() {
        font = new Font("Arial", Font.BOLD, 15);
        nameLabel = new Label("Student Name:");
        rollLabel = new Label("Roll No:");

        l1 = new Label("Subject 1:");
        l2 = new Label("Subject 2:");
        l3 = new Label("Subject 3:");
        l4 = new Label("Subject 4:");
        l5 = new Label("Subject 5:");

        nameField = new TextField(20);
        rollField = new TextField(20);
        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        t4 = new TextField(20);
        t5 = new TextField(20);

        b1 = new Button("Show Result");
        b2 = new Button("Reset");
    }

    public void add_component() {
        nameLabel.setBounds(50, 50, 120, 30);
        nameLabel.setFont(font);
        f.add(nameLabel);
        nameField.setBounds(180, 50, 200, 30);
        f.add(nameField);

        rollLabel.setBounds(50, 90, 120, 30);
        rollLabel.setFont(font);
        f.add(rollLabel);
        rollField.setBounds(180, 90, 200, 30);
        f.add(rollField);

        l1.setBounds(50, 140, 100, 30);
        l1.setFont(font);
        f.add(l1);
        t1.setBounds(180, 140, 100, 30);
        f.add(t1);

        l2.setBounds(50, 180, 100, 30);
        l2.setFont(font);
        f.add(l2);
        t2.setBounds(180, 180, 100, 30);
        f.add(t2);

        l3.setBounds(50, 220, 100, 30);
        l3.setFont(font);
        f.add(l3);
        t3.setBounds(180, 220, 100, 30);
        f.add(t3);

        l4.setBounds(50, 260, 100, 30);
        l4.setFont(font);
        f.add(l4);
        t4.setBounds(180, 260, 100, 30);
        f.add(t4);

        l5.setBounds(50, 300, 100, 30);
        l5.setFont(font);
        f.add(l5);
        t5.setBounds(180, 300, 100, 30);
        f.add(t5);

        b1.setBounds(50, 360, 100, 40);
        f.add(b1);
        b2.setBounds(180, 360, 100, 40);
        f.add(b2);

       
    }

    public void register() {
        f.addWindowListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == b1) {
           // try {
                String name = nameField.getText();
                String rollNo = rollField.getText();
                int m1 = Integer.parseInt(t1.getText());
                int m2 = Integer.parseInt(t2.getText());
                int m3 = Integer.parseInt(t3.getText());
                int m4 = Integer.parseInt(t4.getText());
                int m5 = Integer.parseInt(t5.getText());

                int total = m1 + m2 + m3 + m4 + m5;
                double average = total / 5.0;

                String result;
                if (average >= 40)
                    result = "Pass";
                else
                    result = "Fail";

                //new Frame created
                Frame resultFrame = new Frame();
                resultFrame.setSize(450, 400);
                resultFrame.setLayout(null);
                resultFrame.setTitle("Student Result");
                resultFrame.setBackground(Color.gray);

                Label res1 = new Label("Student Name: " + name);
                res1.setFont(new Font("Arial", Font.BOLD, 16));
                res1.setBounds(50, 50, 350, 30);

                Label res2 = new Label("Roll No: " + rollNo);
                res2.setFont(new Font("Arial", Font.BOLD, 16));
                res2.setBounds(50, 90, 350, 30);

                Label res3 = new Label("Total Marks: " + total);
                res3.setFont(new Font("Arial", Font.BOLD, 16));
                res3.setBounds(50, 130, 350, 30);

                Label res4 = new Label("Average Marks: " + average);
                res4.setFont(new Font("Arial", Font.BOLD, 16));
                res4.setBounds(50, 170, 350, 30);

                Label res5 = new Label("Result: " + result);
                res5.setFont(new Font("Arial", Font.BOLD, 16));
                res5.setBounds(50, 210, 350, 30);

                resultFrame.add(res1);
                resultFrame.add(res2);
                resultFrame.add(res3);
                resultFrame.add(res4);
                resultFrame.add(res5);

                resultFrame.setVisible(true);

                resultFrame.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        resultFrame.dispose();
                    }
                });

         
        } else if (src == b2) {
            nameField.setText("");
            rollField.setText("");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        }
    }

    public static void main(String[] args) {
        new  studentinfo();
    }
}
