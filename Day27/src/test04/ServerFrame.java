package test04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerFrame extends JFrame {
	 // �׷��� ���� �������
    private JTextArea textArea = new JTextArea();
    private JTextField textField = new JTextField();
    ////////////////////////////////////////////////////////
    // ä�� ��Ʈ��ũ ���� �������
    private BufferedReader br;
    private BufferedWriter bw;
    ////////////////////////////////////////////////////////
    public ServerFrame(){
        // �׷��� ȯ�� �ʱ�ȭ �۾�
        textArea.setEditable(false);
        textField.setBackground(Color.PINK);
         
        textField.addActionListener(new MyListener());
         
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);
         
        setSize(300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        //////////////////////////////////////////////////////
        // ��Ʈ��ũ ���� ���� �ʱ�ȭ �۾�
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            textArea.setText("���� ��ٸ��� �� ...\n");
            Socket socket = serverSocket.accept();
            textArea.append("Ŭ���̾�Ʈ ������!"+socket.getInetAddress()+"\n");
             
            bw = new BufferedWriter(new OutputStreamWriter(
                    socket.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            // ä�� �غ� �Ϸ�! inputStream, outputStream Ȯ����!
            while(true){
                String receiveMsg = br.readLine();
                textArea.append("Ŭ���̾�Ʈ:"+receiveMsg+"\n");
                 
                textArea.setCaretPosition(textArea.getText().length());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    class MyListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String writeMsg = textField.getText();
             
            textArea.append("��:"+writeMsg+"\n");
            textField.setText("");
             
            // Ŭ���̾�Ʈ�� �����ߴ��� �˻��� ��
            if(bw!=null){
                try {
                    bw.write(writeMsg+"\n");
                    bw.flush();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            textArea.setCaretPosition(textArea.getText().length());
        }
    }
//////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        ServerFrame f = new ServerFrame();
    }
}