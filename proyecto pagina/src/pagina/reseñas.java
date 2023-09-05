package pagina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class reseñas extends JFrame {
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

    public reseñas() {
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

        ImageIcon icono = new ImageIcon("C:\\Users\\Alumno\\Desktop\\pato.png");
        Image imagen = icono.getImage();
        ImageIcon iconoAchicado = new ImageIcon(imagen.getScaledInstance(100, 100, Image.SCALE_SMOOTH));

        btnNewButton_4 = new JButton();
        btnNewButton_4.setBounds(809, 11, 65, 58);
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
            JButton starButton = new JButton(); 
            starButton.setFont(new Font("Arial", Font.PLAIN, 24));
            starButton.setIcon(new ImageIcon("C:\\Users\\Lautaro\\Downloads\\ester.png"));
            starButton.setBackground(new Color(109, 119, 146));
            starButton.setBounds(361 + i * 61, 223, 43, 43);
            int finalI = i + 1;
            starButton.addActionListener(new ActionListener() {
                
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
        panel_1.setBounds(0, 0, 914, 81);
        panel_1.setBackground(new Color(109, 119, 146));
        panel.add(panel_1);
        panel_1.setLayout(null);
        
                JLabel lblNewLabel = new JLabel("Travel Discover");
                lblNewLabel.setBounds(0, 0, 162, 81);
                panel_1.add(lblNewLabel);
                lblNewLabel.setForeground(new Color(255, 255, 255));
                lblNewLabel.setBackground(new Color(109, 119, 146));
                lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
                lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
                
                        JButton btnNewButton = new JButton("Inicio");
                        btnNewButton.setBounds(181, 25, 102, 30);
                        panel_1.add(btnNewButton);
                        btnNewButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                Inicio newframe = new Inicio();
                                newframe.setVisible(true);
                                dispose();
                            }
                        });
                        btnNewButton.setForeground(new Color(255, 255, 255));
                        
                                btnNewButton.setBackground(new Color(14, 94, 171));
                                btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                
                                        btnNewButton_1 = new JButton("Servicios");
                                        btnNewButton_1.setBounds(312, 25, 114, 30);
                                        panel_1.add(btnNewButton_1);
                                        btnNewButton_1.addActionListener(new ActionListener() {
                                            public void actionPerformed(ActionEvent e) {
                                                servi newframe = new servi();
                                                newframe.setVisble(true);
                                                dispose();
                                            }
                                        });
                                        btnNewButton_1.setForeground(new Color(255, 255, 255));
                                        btnNewButton_1.setBackground(new Color(14, 94, 171));
                                        btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                        
                                                btnNewButton_2 = new JButton("Reseñas");
                                                btnNewButton_2.setBounds(457, 25, 114, 30);
                                                panel_1.add(btnNewButton_2);
                                                btnNewButton_2.setForeground(new Color(255, 255, 255));
                                                btnNewButton_2.addActionListener(new ActionListener() {
                                                    public void actionPerformed(ActionEvent e) {
                                                        reseñas newframe = new reseñas();
                                                        newframe.setVisible(true);
                                                        dispose();
                                                    }
                                                });
                                                btnNewButton_2.setBackground(new Color(14, 94, 171));
                                                btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                                                
                                                        textFieldSearch = new JTextField();
                                                        textFieldSearch.setBounds(607, 27, 171, 30);
                                                        panel_1.add(textFieldSearch);
                                                        textFieldSearch.setText("Buscador..");
                                                        textFieldSearch.setColumns(10);
                                                        
                                                                JSeparator separator_4 = new JSeparator();
                                                                separator_4.setBounds(798, 0, 12, 81);
                                                                panel_1.add(separator_4);
                                                                separator_4.setForeground(Color.WHITE);
                                                                separator_4.setOrientation(SwingConstants.VERTICAL);
                                                                
                                                                        JSeparator separator_3 = new JSeparator();
                                                                        separator_3.setBounds(585, 0, 12, 81);
                                                                        panel_1.add(separator_3);
                                                                        separator_3.setForeground(Color.WHITE);
                                                                        separator_3.setOrientation(SwingConstants.VERTICAL);
                                                                        
                                                                                JSeparator separator_2 = new JSeparator();
                                                                                separator_2.setBounds(435, 0, 12, 81);
                                                                                panel_1.add(separator_2);
                                                                                separator_2.setOrientation(SwingConstants.VERTICAL);
                                                                                separator_2.setForeground(Color.WHITE);
                                                                                
                                                                                        JSeparator separator_1 = new JSeparator();
                                                                                        separator_1.setBounds(293, 0, 12, 81);
                                                                                        panel_1.add(separator_1);
                                                                                        separator_1.setOrientation(SwingConstants.VERTICAL);
                                                                                        separator_1.setBackground(Color.WHITE);
                                                                                        separator_1.setForeground(Color.WHITE);
                                                                                        
                                                                                                JSeparator separator = new JSeparator();
                                                                                                separator.setBounds(172, 0, 9, 81);
                                                                                                panel_1.add(separator);
                                                                                                separator.setOrientation(SwingConstants.VERTICAL);
                                                                                                separator.setToolTipText("aaaa");
                                                                                                separator.setForeground(Color.WHITE);
                                                                                                separator.setBackground(Color.WHITE);
        
        JSeparator separator_5 = new JSeparator();
        separator_5.setBounds(0, 79, 884, 2);
        panel_1.add(separator_5);

        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                reseñas window = new reseñas();
                window.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

