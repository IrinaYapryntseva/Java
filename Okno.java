import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Okno extends JFrame {
    private JSlider slider;

    private Krug_i_slider myPanel;

    Okno() {
        super("Слайдер!!!");
        myPanel = new Krug_i_slider();
        myPanel.setBackground(Color.green);
        slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);

        slider.addChangeListener(
                new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        myPanel.setDiametr(slider.getValue());
                    }
                }
        );

        add(slider, BorderLayout.SOUTH);
        add(myPanel, BorderLayout.CENTER);
    }
}

