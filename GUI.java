import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        Okno window = new Okno();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,400);
        window.setVisible(true);
    }
}
