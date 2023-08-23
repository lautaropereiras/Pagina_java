package agina;



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
import javax.swing.JPanel;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JSeparator;
import java.awt.Panel;

public class reseñas {
    private JFrame frame;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;
    private JTextField textFieldSearch;
    private JButton btnNewButton_4;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_5;
    private JLabel lblNewLabel_6;
    private JLabel lblNewLabel_7;
    private JLabel lblNewLabel_8;
    private JLabel lblNewLabel_9;
    private JButton button;
    private JButton button_1;
    private JButton button_2;
    private JButton button_3;
    private JButton button_4;
    private JLabel lblNewLabel_10;
    private JLabel lblNewLabel_11;
    private JLabel lblNewLabel_12;
    private JLabel lblNewLabel_13;
    private JLabel lblNewLabel_14;
    private JPanel panel_1;
    private JPanel panel_2;
    private JPanel panel_3;
    private JPanel panel_4;
    private JButton button_5;
    private JPanel panel;
    private JTextField textField_6;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	reseñas window = new reseñas();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public reseñas() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(240, 240, 240));
        frame.setBounds(100, 100, 931, 813);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        ImageIcon icono = new ImageIcon("C:\\Users\\Alumno\\Desktop\\pato.png");
        Image imagen = icono.getImage();
        ImageIcon iconoAchicado = new ImageIcon(imagen.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        
        ImageIcon icono1 = new ImageIcon("Imágenes\\messi.JPG");
        Image imagen1 = icono1.getImage();
        ImageIcon iconoAchicado1 = new ImageIcon(imagen1.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        
        panel = new JPanel();
        panel.setBackground(new Color(109, 119, 146));
        panel.setBounds(-4, 0, 919, 79);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
                JButton btnNewButton = new JButton("Inicio");
                btnNewButton.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		
                		inicio newframe = new inicio();
                		
                		newframe.setVisible(true);
                		this.dispose();
                	}

					private void dispose() {
						frame.setVisible(false);						
					}
                });
                btnNewButton.setBounds(184, 24, 102, 30);
                panel.add(btnNewButton);
                btnNewButton.setForeground(new Color(255, 255, 255));
                
                btnNewButton.setBackground(new Color(14, 94, 171));
                btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                
                        btnNewButton_1 = new JButton("Servicios");
                        btnNewButton_1.setBounds(318, 24, 114, 30);
                        panel.add(btnNewButton_1);
                        btnNewButton_1.setForeground(new Color(255, 255, 255));
                        btnNewButton_1.setBackground(new Color(14, 94, 171));
                        btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                        
                                btnNewButton_2 = new JButton("Resenias");
                                btnNewButton_2.setBounds(461, 24, 114, 30);
                                panel.add(btnNewButton_2);
                                btnNewButton_2.setForeground(new Color(255, 255, 255));
                                btnNewButton_2.addActionListener(new ActionListener() {
                                	public void actionPerformed(ActionEvent e) {
                                	}
                                });
                                btnNewButton_2.setBackground(new Color(14, 94, 171));
                                btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                
                                textFieldSearch = new JTextField();
                                textFieldSearch.setBounds(603, 26, 171, 30);
                                panel.add(textFieldSearch);
                                textFieldSearch.setText("Buscador..");
                                textFieldSearch.setColumns(10);
                                
                                        JLabel lblNewLabel = new JLabel("Travel Discover");
                                        lblNewLabel.setBounds(0, -1, 162, 81);
                                        panel.add(lblNewLabel);
                                        lblNewLabel.setForeground(new Color(255, 255, 255));
                                        lblNewLabel.setBackground(new Color(109, 119, 146));
                                        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
                                        
                                        btnNewButton_4 = new JButton();
                                        btnNewButton_4.setBounds(809, 11, 89, 58);
                                        panel.add(btnNewButton_4);
                                        btnNewButton_4.addActionListener(new ActionListener() {
                                        	public void actionPerformed(ActionEvent e) {
                                        	}
                                        });
                                        btnNewButton_4.setForeground(new Color(255, 255, 255));
                                        btnNewButton_4.setActionCommand("");
                                        btnNewButton_4.setIcon(iconoAchicado);
                                        btnNewButton_4.setBackground(new Color(109, 119, 146));
                                        btnNewButton_4.setBorder(null);
                                        btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 30));
                                        
                                        JSeparator separator = new JSeparator();
                                        separator.setOrientation(SwingConstants.VERTICAL);
                                        separator.setToolTipText("aaaa");
                                        separator.setForeground(Color.WHITE);
                                        separator.setBackground(Color.WHITE);
                                        separator.setBounds(165, -1, 9, 81);
                                        panel.add(separator);
                                        
                                        JSeparator separator_1 = new JSeparator();
                                        separator_1.setOrientation(SwingConstants.VERTICAL);
                                        separator_1.setBackground(Color.WHITE);
                                        separator_1.setForeground(Color.WHITE);
                                        separator_1.setBounds(296, -1, 12, 81);
                                        panel.add(separator_1);
                                        
                                        JSeparator separator_2 = new JSeparator();
                                        separator_2.setOrientation(SwingConstants.VERTICAL);
                                        separator_2.setForeground(Color.WHITE);
                                        separator_2.setBounds(442, -1, 12, 81);
                                        panel.add(separator_2);
                                        
                                        JSeparator separator_3 = new JSeparator();
                                        separator_3.setForeground(Color.WHITE);
                                        separator_3.setOrientation(SwingConstants.VERTICAL);
                                        separator_3.setBounds(585, -1, 12, 81);
                                        panel.add(separator_3);
                                        
                                        JSeparator separator_4 = new JSeparator();
                                        separator_4.setForeground(Color.WHITE);
                                        separator_4.setOrientation(SwingConstants.VERTICAL);
                                        separator_4.setBounds(792, -1, 12, 81);
                                        panel.add(separator_4);
        
        Panel panel_5 = new Panel();
        panel_5.setBounds(-4, 80, 919, 669);
        frame.getContentPane().add(panel_5);
        panel_5.setLayout(null);
        
    

        

        
      
        
        JLabel lblNewLabel_15 = new JLabel("Calificacion:");
        lblNewLabel_15.setBounds(86, 160, 145, 45);
        panel_5.add(lblNewLabel_15);
        lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        
        Label label = new Label("Correo electronico o usuario:");
        label.setBounds(183, 538, 236, 58);
        panel_5.add(label);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        
        TextField textField_7 = new TextField();
        textField_7.setBounds(425, 538, 258, 40);
        panel_5.add(textField_7);
        
        textField_6 = new JTextField();
        textField_6.setBounds(247, 315, 326, 169);
        panel_5.add(textField_6);
        textField_6.setColumns(10);
        
        JLabel lblNewLabel_16 = new JLabel("Cuerpo de la rese\u00F1a:");
        lblNewLabel_16.setBounds(86, 298, 155, 45);
        panel_5.add(lblNewLabel_16);
        lblNewLabel_16.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        
        JLabel lblNewLabel_4 = new JLabel("Rese\u00F1as");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setBounds(372, 95, 145, 45);
        panel_5.add(lblNewLabel_4);
        lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        
        lblNewLabel_1 = new JLabel("Travel Discover");
        lblNewLabel_1.setBounds(372, 26, 145, 35);
        panel_5.add(lblNewLabel_1);
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
    }

	public void setVisble(boolean b) {
frame.setVisible(true);		
	}
}
