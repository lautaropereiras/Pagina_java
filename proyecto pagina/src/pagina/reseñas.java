package pagina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RESE extends JFrame {
    private JPanel panel;
    private JTextField textFieldEmail;
    private JTextArea textAreaResena;
    private JLabel lblCalificacion;
    private JLabel lblTitulo;
    private JButton btnEnviar;
    private JPanel panel_1;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;
    private JTextField textFieldSearch;
    private JButton btnNewButton_4;
    private JPanel panel2;

    public RESE() {
        setTitle("Reseñas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(109, 119, 146));
        
        
        
        
        
        panel2 = new JPanel();
        panel2.setBackground(new Color(109, 119, 146));
        panel2.setBounds(-4, 0, 919, 79);
        panel.getRootPane().add(panel2);
        panel.setLayout(null);
        
        ImageIcon icono = new ImageIcon("C:\\Users\\Alumno\\Desktop\\pato.png");
        Image imagen = icono.getImage();
        ImageIcon iconoAchicado = new ImageIcon(imagen.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        
                JButton btnNewButton = new JButton("Inicio");
                btnNewButton.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		
                		Inicio newframe = new Inicio();
                		
                		newframe.setVisible(true);
                		this.dispose();
                	}

					private void dispose() {
						panel.setVisible(false);						
					}
                });
                btnNewButton.setBounds(184, 24, 102, 30);
                panel.add(btnNewButton);
                btnNewButton.setForeground(new Color(255, 255, 255));
                
                btnNewButton.setBackground(new Color(14, 94, 171));
                btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                
                        btnNewButton_1 = new JButton("Servicios");
                        btnNewButton_1.addActionListener(new ActionListener() {
                        	public void actionPerformed(ActionEvent e) {
                        		
                        		servi newframe = new servi();
                        		newframe.setVisble(true);
                        		this.dispose();
                        		
                        	}

							private void dispose() {
								panel.setVisible(false);								
							}
                        	
                        	
                        });
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
                                		
                                		RESE newframe = new RESE();
                                		newframe.setVisible(true);
                                		this.dispose();
                                		
                                	}

        							private void dispose() {
        								panel.setVisible(false);								
        							}
                                	
                                	}
                                );
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
        

        lblTitulo = new JLabel("Travel Discover");
        lblTitulo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
        lblTitulo.setBounds(344, 151, 200, 40);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setForeground(Color.WHITE);
        panel.add(lblTitulo);

        lblCalificacion = new JLabel("Calificación:");
        lblCalificacion.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblCalificacion.setBounds(192, 221, 192, 30);
        lblCalificacion.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(lblCalificacion);
        
     

        for (int i = 0; i < 5; i++) {
            JButton starButton = new JButton(""); // Carácter Unicode de una estrella
            starButton.setFont(new Font("Arial", Font.PLAIN, 24));
            starButton.setBounds(361 + i * 61, 223, 40, 30);
            int finalI = i + 1;
            starButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lblCalificacion.setText("Calificación: " + finalI + " estrellas:");
                }
            });
            panel.add(starButton);
        }

        JLabel lblResena = new JLabel("Cuerpo de la reseña:");
        lblResena.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblResena.setBounds(149, 278, 200, 30);
        lblResena.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(lblResena);

        textAreaResena = new JTextArea();
        textAreaResena.setBounds(359, 283, 300, 150);
        panel.add(textAreaResena);

        JLabel lblEmail = new JLabel("Correo electrónico o usuario:");
        lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblEmail.setBounds(150, 444, 240, 30);
        lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(lblEmail);

        textFieldEmail = new JTextField();
        textFieldEmail.setBounds(399, 446, 260, 30);
        panel.add(textFieldEmail);

        btnEnviar = new JButton("Enviar");
        btnEnviar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnEnviar.setBounds(377, 528, 120, 40);
        panel.add(btnEnviar);

        getContentPane().add(panel, BorderLayout.CENTER);
        
        panel_1 = new JPanel();
        panel_1.setBackground(new Color(0, 0, 0));
        panel_1.setBounds(-2, 0, 914, 81);
        panel.setBackground(new Color(109, 119, 146));
        panel.add(panel_1);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                RESE window = new RESE();
                window.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
