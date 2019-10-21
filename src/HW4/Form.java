package HW4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    private JPanel panel1;
    private JList listText;
    private JTextField inputText;
    private JButton sender;

    public Form(){
        DefaultListModel listModel = new DefaultListModel();
        listText.setModel(listModel);

        sender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.addElement(inputText.getText());
                inputText.setText("");
            }
        });

        inputText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.addElement(inputText.getText());
                inputText.setText("");
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ChatTest");
        frame.setContentPane(new Form().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
