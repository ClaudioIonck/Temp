import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.TextField;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class TempConverter extends JFrame {

    private JPanel contentPane;
    private final ButtonGroup buttonGroup = new ButtonGroup();

    public TempConverter() {

        setTitle("Conversor de temp");
        setSize(320,220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(0, 5, 30, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);





        JTextPane txtTempIn = new JTextPane();
        txtTempIn.setBounds(12, 46, 124, 26);
        contentPane.add(txtTempIn);

        JRadioButton celRadio = new JRadioButton("Celcius");
        buttonGroup.add(celRadio);
        celRadio.setBounds(212, 34, 67, 24);
        contentPane.add(celRadio);

        JRadioButton fahrenRadio = new JRadioButton("Fahrenheit");
        buttonGroup.add(fahrenRadio);
        fahrenRadio.setBounds(212, 62, 85, 24);
        contentPane.add(fahrenRadio);

        JLabel lblTem = new JLabel("Para:");
        lblTem.setBounds(154, 49, 78, 16);
        contentPane.add(lblTem);

        JTextPane tempOutput = new JTextPane();
        tempOutput.setBackground(UIManager.getColor("Button.background"));
        tempOutput.setEditable(false);
        tempOutput.setBounds(12, 138, 267, 22);
        contentPane.add(tempOutput);

        JButton btnNewButton = new JButton("Converter");
        btnNewButton.setBounds(12, 84, 98, 26);
        contentPane.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                if(celRadio.isSelected()){
                    try{
                        double temp=Double.parseDouble(txtTempIn.getText());
                        temp = temp * 1.8 + 32;
                        tempOutput.setText(Double.toString(temp));
                    }catch(Exception e){
                        tempOutput.setText("Coloque uma temperatura valida.");
                    }
                }else{
                    try{
                        double temp=Double.parseDouble(txtTempIn.getText());
                        temp = (temp - 32) * (5.0/9.0);
                        tempOutput.setText(Double.toString(temp));
                    }catch(Exception e){
                        tempOutput.setText("Coloque uma temperatura valida.");
                    }
                }
            }
        });
    }

    private void configurarLayout() {
    }


}
