package pagina;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class registrarse {
    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JButton btnNewButton_1;
    private JTextField textField_3;
    private JButton btnNewButton_2;
    private JTextField textField_4;
    private JTextField textFieldSearch;
    private JTextField textField_5;
    private JButton btnNewButton_4;
    private JLabel lblNewLabel_1;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JPanel panel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	registrarse window = new registrarse();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public registrarse() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 928, 744);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Travel Discover");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(-4, 10, 171, 56);
        frame.getContentPane().add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(164, 0, 3, 81);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(-4, 78, 936, 3);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JButton btnNewButton = new JButton("Inicio");
        btnNewButton.setBackground(new Color(14, 94, 171));
        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnNewButton.setBounds(177, 23, 102, 30);
        frame.getContentPane().add(btnNewButton);

        textField_2 = new JTextField();
        textField_2.setBounds(293, 0, 3, 81);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);

        btnNewButton_1 = new JButton("Servicios");
        btnNewButton_1.setBackground(new Color(14, 94, 171));
        btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnNewButton_1.setBounds(312, 24, 114, 30);
        frame.getContentPane().add(btnNewButton_1);

        textField_3 = new JTextField();
        textField_3.setBounds(436, 0, 3, 81);
        frame.getContentPane().add(textField_3);
        textField_3.setColumns(10);

        btnNewButton_2 = new JButton("Reseñas");
        btnNewButton_2.setBackground(new Color(14, 94, 171));
        btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnNewButton_2.setBounds(457, 24, 114, 30);
        frame.getContentPane().add(btnNewButton_2);

        textField_4 = new JTextField();
        textField_4.setBounds(581, 0, 3, 81);
        frame.getContentPane().add(textField_4);
        textField_4.setColumns(10);
        
        textFieldSearch = new JTextField();
        textFieldSearch.setText("Buscador..");
        textFieldSearch.setBounds(600, 24, 171, 30);
        frame.getContentPane().add(textFieldSearch);
        textFieldSearch.setColumns(10);
        
        textField_5 = new JTextField();
        textField_5.setBounds(782, 0, 3, 81);
        frame.getContentPane().add(textField_5);
        textField_5.setColumns(10);
        
        btnNewButton_4 = new JButton();
        btnNewButton_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_4.setForeground(new Color(255, 255, 255));
        btnNewButton_4.setBounds(806, 11, 89, 58);
        frame.getContentPane().add(btnNewButton_4);
        btnNewButton_4.setActionCommand("");
        btnNewButton_4.setIcon(new ImageIcon("D:\\5 °2\\LPOO\\proyecto pagina\\Imagenes\\registrarse (1).jpg"));
        btnNewButton_4.setBackground(new Color(255, 255, 255));
        btnNewButton_4.setBorder(null);
        btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 30));
        
        lblNewLabel_1 = new JLabel("Contraseña:");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(250, 338, 145, 35);
        frame.getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Nombre y apellido:");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel_1_1.setBounds(260, 137, 183, 35);
        frame.getContentPane().add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("Telefono:\r\n");
        lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel_1_2.setBounds(239, 204, 145, 35);
        frame.getContentPane().add(lblNewLabel_1_2);
        
        JLabel lblNewLabel_1_3 = new JLabel("Correo Electronico:");
        lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel_1_3.setBounds(260, 271, 188, 35);
        frame.getContentPane().add(lblNewLabel_1_3);
        
        JLabel lblNewLabel_2 = new JLabel("Registrarse");
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblNewLabel_2.setBounds(381, 92, 145, 30);
        frame.getContentPane().add(lblNewLabel_2);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los terminos y condiciones\r\n");
        chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        chckbxNewCheckBox.setBounds(271, 476, 338, 23);
        frame.getContentPane().add(chckbxNewCheckBox);
        
        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(473, 141, 171, 30);
        frame.getContentPane().add(textField_6);
        
        textField_7 = new JTextField();
        textField_7.setText("\r\n");
        textField_7.setColumns(10);
        textField_7.setBounds(473, 208, 171, 30);
        frame.getContentPane().add(textField_7);
        
        textField_8 = new JTextField();
        textField_8.setColumns(10);
        textField_8.setBounds(473, 275, 171, 30);
        frame.getContentPane().add(textField_8);
        
        textField_9 = new JTextField();
        textField_9.setColumns(10);
        textField_9.setBounds(473, 342, 171, 30);
        frame.getContentPane().add(textField_9);
        
        JLabel lblNewLabel_1_4 = new JLabel("Confirmar contraseña:");
        lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel_1_4.setBounds(271, 405, 193, 35);
        frame.getContentPane().add(lblNewLabel_1_4);
        
        textField_10 = new JTextField();
        textField_10.setColumns(10);
        textField_10.setBounds(473, 409, 171, 30);
        frame.getContentPane().add(textField_10);
        
        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnEnviar.setBounds(387, 610, 102, 30);
        frame.getContentPane().add(btnEnviar);
        
        JCheckBox chckbxEnviarNotificacionesAl = new JCheckBox("Enviar notificaciones al correo electronico");
        chckbxEnviarNotificacionesAl.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        chckbxEnviarNotificacionesAl.setBounds(271, 543, 455, 23);
        frame.getContentPane().add(chckbxEnviarNotificacionesAl);
        
        panel = new JPanel();
        panel.setBackground(new Color(109, 119, 146));
        panel.setBounds(-4, 0, 916, 81);
        frame.getContentPane().add(panel);
        
    }
}

