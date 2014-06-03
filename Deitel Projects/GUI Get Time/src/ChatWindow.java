
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author Scott Dykstra
 */
public class ChatWindow extends JFrame implements ActionListener {

    private JLabel fullChat;
    private JTextField hostInput;
    private JTextArea display;
    private JTextField privateHostInput;
    private JTextArea privateDisplay;
    private JButton sendButton;
    private JButton exitButton;
    private JButton privateSendButton;
    private JPanel buttonPanel;
    private static Socket socket = null;

    public static void main(String[] args) {

        ChatWindow frame = new ChatWindow();
        frame.setSize(600, 500);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent event) {

                if (socket != null) {

                    try {
                        socket.close();
                    } catch (IOException ioEx) {
                        System.out.println("unalbe to close link! \n");
                        System.exit(1);
                    }
                }// end if socekt
                System.exit(0);
            }// end windowClosing
        }//  end Window Adapter
                );// end add windowListener    
    }// end main

    public ChatWindow() {
        super("Chat Program");// adds text to title bar
        fullChat = new JLabel("                                                 "
                + "           Chat                                                "
                + "                                           Private Chat");
        add(fullChat, BorderLayout.NORTH);

        hostInput = new JTextField(80);
        add(hostInput, BorderLayout.WEST);
        display = new JTextArea(10, 35);

        display.setWrapStyleWord(true);
        display.setLineWrap(true);// setups word wrap in text box

        add(new JScrollPane(display), BorderLayout.WEST);




        privateHostInput = new JTextField(40);
        add(privateHostInput, BorderLayout.EAST);
        privateDisplay = new JTextArea(20, 15);

        privateDisplay.setWrapStyleWord(true);
        privateDisplay.setLineWrap(true);// setups word wrap in text box

        add(new JScrollPane(privateDisplay), BorderLayout.EAST);


        buttonPanel = new JPanel();

        sendButton = new JButton("Send");
        sendButton.addActionListener(this);
        buttonPanel.add(sendButton);// display button

        exitButton = new JButton("Exit");// sets text on button
        exitButton.addActionListener(this);// connects actionListener
        buttonPanel.add(exitButton);// display button

        privateSendButton = new JButton("Private Chat");// sets text on button
        privateSendButton.addActionListener(this);// connects actionListener
        buttonPanel.add(privateSendButton);// display button

        add(buttonPanel, BorderLayout.SOUTH);
    }// end GetRemoteTime GUI setup text boxes and buttons

    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == exitButton) {
            System.exit(0);
        }
        String replyFromAll;
        final int Port = 16777;// system port 

        if (event.getSource() == sendButton) {
            String host = hostInput.getText();
            try {
                socket = new Socket(host, Port);

                Scanner input = new Scanner(socket.getInputStream());
                replyFromAll = input.nextLine();

                display.append(replyFromAll + "\n");
                hostInput.setText("");
            } catch (UnknownHostException uhEx) {
                display.append("No such host!\n");
                hostInput.setText("");
            } catch (IOException ioEx) {
                display.append(ioEx.toString() + "!\n");
            } finally {
                try {
                    if (socket != null) {
                        socket.close();
                    }
                } catch (IOException ioEx) {
                    System.out.println("Unable to disconnect!");
                    System.exit(1);
                }
            }// end finally
        }// end if sendButton

        if (event.getSource() == privateSendButton) {
            String privateHost = privateHostInput.getText();
            
            String replyOne;

            try {
                socket = new Socket(privateHost, Port);

                Scanner input = new Scanner(socket.getInputStream());
                replyOne = input.nextLine();

                privateDisplay.append(replyOne+ "\n");
                hostInput.setText("");
            } catch (UnknownHostException uhEx) {
                privateDisplay.append("No such host!\n");
                hostInput.setText("");
            } catch (IOException ioEx) {
                privateDisplay.append(ioEx.toString() + "!\n");
            } finally {
                try {
                    if (socket != null) {
                        socket.close();
                    }
                } catch (IOException ioEx) {
                    System.out.println("Unable to disconnect!");
                    System.exit(1);
                }
            }// end finally
        }// end if privateSendButton

    }// end actionPerformed
}// end ChatWindow