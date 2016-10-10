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
	 // 그래픽 관련 멤버변수
    private JTextArea textArea = new JTextArea();
    private JTextField textField = new JTextField();
    ////////////////////////////////////////////////////////
    // 채팅 네트워크 관련 멤버변수
    private BufferedReader br;
    private BufferedWriter bw;
    ////////////////////////////////////////////////////////
    public ServerFrame(){
        // 그래픽 환경 초기화 작업
        textArea.setEditable(false);
        textField.setBackground(Color.PINK);
         
        textField.addActionListener(new MyListener());
         
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);
         
        setSize(300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        //////////////////////////////////////////////////////
        // 네트워크 관련 서버 초기화 작업
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            textArea.setText("서버 기다리는 중 ...\n");
            Socket socket = serverSocket.accept();
            textArea.append("클라이언트 접속함!"+socket.getInetAddress()+"\n");
             
            bw = new BufferedWriter(new OutputStreamWriter(
                    socket.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            // 채팅 준비 완료! inputStream, outputStream 확보함!
            while(true){
                String receiveMsg = br.readLine();
                textArea.append("클라이언트:"+receiveMsg+"\n");
                 
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
             
            textArea.append("나:"+writeMsg+"\n");
            textField.setText("");
             
            // 클라이언트가 접속했는지 검사한 후
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