package combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox extends JFrame {

    private JComboBox comboB01;
    String[] fruits = {"apple", "pear", "peach", "banana", "pineapple"};

    public ComboBox() {
        super("Combo box házi feladat");
        initComponments();
    }

    private void initComponments() {

        this.setSize(350, 200);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        comboB01 = new JComboBox(fruits);

        comboB01.setBounds(140, 80, 90, 30);
        this.add(comboB01);

        comboB01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getComboItem(comboB01);
            }
        });
    }

    public void getComboItem(JComboBox comboB01) {
        String choosen  = comboB01.getSelectedItem().toString();
        if(choosen.matches("banana")){
            this.setTitle("Jóízű");
        }
       
    }

    public static void main(String[] args) {
        ComboBox cb = new ComboBox();
        cb.setVisible(true);
    }

}
