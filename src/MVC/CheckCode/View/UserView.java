package MVC.CheckCode.View;

import MVC.CheckCode.Controller.Controller;

import javax.swing.*;
import java.awt.*;

public class UserView extends JFrame {
    JTextArea text;
    JLabel info;
    JButton sendButton;
    Controller controller;

    //связываем view и controller
    public UserView(Controller controller) {
        this.setTitle("Check PIN-code");
        this.controller = controller;
    }

    public void init() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);

        text = new JTextArea();
        info = new JLabel("Info");
        sendButton = new JButton("Send");
        sendButton.addActionListener(e -> {
            int pin;
            String textPin = this.text.getText();
            try {
                pin = Integer.parseInt(textPin);
                info.setText("Got it..." + pin + " waiting...");

                Thread thread = new Thread(() -> {
                    sendButton.setEnabled(false);
                    String resultMessage;
                    if (controller.checkPin(pin)) {
                        resultMessage = "Right";
                    } else {
                        resultMessage = "Error, try again";
                    }
                    info.setText(resultMessage);
                    sendButton.setEnabled(true);
                });
                thread.start();
            } catch (NumberFormatException nfe) {
                info.setText("Only number allowed");
            }
        });

        add(text, BorderLayout.CENTER);
        add(info, BorderLayout.NORTH);
        add(sendButton, BorderLayout.SOUTH);
        setVisible(true);
    }
}
