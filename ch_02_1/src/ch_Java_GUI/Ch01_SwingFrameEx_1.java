package ch_Java_GUI;
import javax.swing.*;

public class Ch01_SwingFrameEx_1 extends JFrame {
    public Ch01_SwingFrameEx_1(){
        setTitle("프레임 만들기 예제");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기버튼 클릭시 종료
    }
    static public void main(String[] args) {
        Ch01_SwingFrameEx_1 frame = new Ch01_SwingFrameEx_1();

    }

}
