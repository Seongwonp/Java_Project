package ch_Java_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch02_SwingFrameEx_botten extends JFrame {
    public Ch02_SwingFrameEx_botten(){
        setTitle("컴포넌트 붙이기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        Container c = getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(new BorderLayout());


        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));

        JButton button = new JButton("Press This Button!😄");
        button.setPreferredSize(new Dimension(200, 50));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 버튼이 클릭되었을 때 실행할 동작
                JOptionPane.showMessageDialog(null, "버튼이 눌렸어요! 🎉", "GOOD!", JOptionPane.INFORMATION_MESSAGE);
            }
        });



        panel.add(button);
        c.add(panel, BorderLayout.CENTER);
        setVisible(true);

    }
    public static void main(String[] args) {
        Ch02_SwingFrameEx_botten frame = new Ch02_SwingFrameEx_botten();


    }
}
