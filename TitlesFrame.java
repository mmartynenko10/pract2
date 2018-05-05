/*
 * Decompiled with CFR 0_123.
 */
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TitlesFrame
extends JFrame {
    /**
     * Конструктор класса TitlesFrame.
     * Создает объект класса.
     */
    public TitlesFrame() {
        this.initUI();
    }

    private void initUI() {
        this.setTitle("\u041a\u0440\u0438\u0432\u044b\u0435 \u0444\u0438\u0433\u0443\u0440\u044b");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel(53));
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
    }

    /**
     * Точка входа в программу на языке Java.
     * @param args - параметры командной строки.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                TitlesFrame ps = new TitlesFrame();
                ps.setVisible(true);
            }
        });
    }

}

