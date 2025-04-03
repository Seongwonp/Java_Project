package ch_Java_GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ch03_SwingFrame_textBox extends JFrame {

    public Ch03_SwingFrame_textBox(){
        Dimension dim = new Dimension(400, 150);
        setTitle("프레임 택스트박스 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200,400);
        setPreferredSize(dim);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        panel1.add(new JLabel("이름: "));
        panel1.add(new JTextField());

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        panel2.add(new JLabel("나이: "));
        panel2.add(new JTextField());

        JPanel panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
        panel3.add(new JLabel("주소: "));
        panel3.add(new JTextField());

        JPanel panel4 = new JPanel();
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
        panel4.add(panel1);
        panel4.add(panel2);
        panel4.add(panel3);



        add(panel4, BorderLayout.CENTER);
        JButton button = new JButton("입력하기✅");
        add(button, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 버튼이 클릭되었을 때 실행할 동작
                JOptionPane.showMessageDialog(button, "등록되었습니다! 🎉", "SUCCESS!", JOptionPane.INFORMATION_MESSAGE);

            }
        });


        pack();
        setVisible(true);
    }


    public static void main(String[] args) {
        Ch03_SwingFrame_textBox frame = new Ch03_SwingFrame_textBox();
    }
}
