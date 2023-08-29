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
import javax.swing.JPanel;
import java.awt.Desktop;
import java.net.URI;

public class servi {
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
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_5;
    private JLabel lblNewLabel_6;
    private JLabel lblNewLabel_7;
    private JLabel lblNewLabel_8;
    private JLabel lblNewLabel_9;
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
    private JLabel lblNewLabel_4;
    private JButton btnNewButton_5;
    private JButton btnNewButton_6;
    private JButton btnNewButton_7;
    private JButton btnNewButton_8;
    private JButton btnNewButton_9;
    private JButton btnNewButton_10;
    private JButton btnNewButton_11;
    private JButton btnNewButton_12;
    private JButton btnNewButton_13;
    private static boolean isWindowOpen = false;
    private JButton btnNewButton_3;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (!isWindowOpen) {
                    isWindowOpen = true;
                    try {
                        servi window = new servi();
                        window.frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
    

    public servi() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(0, 0, 912, 841);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Travel Discover");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBackground(new Color(109, 119, 146));
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(-4, 11, 171, 59);
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
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		Inicio newframe = new Inicio();
        		
        		newframe.setVisible(true);
        		
        		this.dispose();
        	}

			private void dispose() {
				frame.setVisible(false);				
			}
        });
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
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		servi newframe1 = new servi();
        		
        		newframe1.setVisble(true);
        		
        		this.dispose();
        	}

			private void dispose() {
				frame.setVisible(false);				
			}
        });

        textField_3 = new JTextField();
        textField_3.setBounds(436, 0, 3, 81);
        frame.getContentPane().add(textField_3);
        textField_3.setColumns(10);

        btnNewButton_2 = new JButton("Resenias");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		reseñas newframe = new reseñas();
        		newframe.setVisble(true);
        		this.dispose();
        		
        	}

			private void dispose() {
				frame.setVisible(false);								
			}
        	
        	}
        );
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
        btnNewButton_4.setBounds(795, 11, 91, 58);
        frame.getContentPane().add(btnNewButton_4);
        btnNewButton_4.setActionCommand("");
        btnNewButton_4.setIcon(new ImageIcon("E:\\5to a\u00F1o\\Paradigma\\proyecto pagina\\Imagenes\\registrarse (1).jpg"));
        btnNewButton_4.setBackground(new Color(255, 255, 255));
        btnNewButton_4.setBorder(null);
        btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 30));
        
        
        
        lblNewLabel_3 = new JLabel("Hoteles");
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setBounds(368, 159, 145, 30);
        frame.getContentPane().add(lblNewLabel_3);
        
        lblNewLabel_10 = new JLabel("<html>El hotel Astarte Suites ha creado un lujoso escape romantico con una impresionante vista del volcan y la mitica Caldera de Santorini, en Grecia. Es una eleccion favorita para vacaciones y lunas de miel en todo el mundo.</html>");
        lblNewLabel_10.setForeground(new Color(255, 255, 255));
        lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_10.setBounds(10, 316, 157, 121);
        frame.getContentPane().add(lblNewLabel_10);
        
        lblNewLabel_11 = new JLabel("<html>Inaugurado en 1930, Bovey Castle Hotel y Spa es un encantador destino. Es perfecto para relajarse en  un ambiente lujoso, ya sea en familia, con amigos o en pareja.\r\n</html>");
        lblNewLabel_11.setForeground(new Color(255, 255, 255));
        lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_11.setBounds(190, 316, 157, 121);
        frame.getContentPane().add(lblNewLabel_11);
        
        lblNewLabel_12 = new JLabel("<html>Un autentico espiritu romano impregna este radiante 'Hotel Eden', lleno de historias de una ciudad legendaria y la hospitalidad de su gente extraordinaria.</html>");
        lblNewLabel_12.setForeground(new Color(255, 255, 255));
        lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_12.setBounds(368, 316, 157, 121);
        frame.getContentPane().add(lblNewLabel_12);
        
        lblNewLabel_13 = new JLabel("<html>El Grand Palladium Imbassai Resort & Spa es un hotel de 5 estrellas con todo incluido. Disfrute de una reserva natural exuberante en este hotel con una playa de arena dorada y cristalina. Para relajarse de pies a cabeza.</html>");
        lblNewLabel_13.setForeground(new Color(255, 255, 255));
        lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_13.setBounds(547, 316, 153, 121);
        frame.getContentPane().add(lblNewLabel_13);
        
        lblNewLabel_14 = new JLabel("<html>El Gran Hotel La Florida, de 5 estrellas, se encuentra en la monta\u00F1a del Tibidabo y ofrece vistas espectaculares a Barcelona y al Mar Mediterraneo.</html>");
        lblNewLabel_14.setForeground(new Color(255, 255, 255));
        lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_14.setBounds(730, 316, 157, 121);
        frame.getContentPane().add(lblNewLabel_14);
        
        button_5 = new JButton("");
        button_5.setIcon(new ImageIcon("E:\\5to a\u00F1o\\Paradigma\\proyecto pagina\\Imagenes\\oia.jpg"));
        button_5.setFont(new Font("Arial", Font.BOLD, 30));
        button_5.setBorder(null);
        button_5.setBackground(Color.WHITE);
        button_5.setActionCommand("");
        button_5.setBounds(10, 550, 157, 82);
        frame.getContentPane().add(button_5);
        
        JLabel lblNewLabel_10_1 = new JLabel("<html> Este pueblo, situado al norte de Santorini, es reconocible por su ubicaci\u00F3n en la ladera de una colina con vistas al mar, pero tambi\u00E9n por sus casas blancas y de colores, sus c\u00FApulas azules y sus callejuelas serpenteantes</html>");
        lblNewLabel_10_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_10_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_10_1.setBounds(10, 632, 157, 120);
        frame.getContentPane().add(lblNewLabel_10_1);
        
        JButton button_1_1 = new JButton("");
        button_1_1.setIcon(new ImageIcon("E:\\5to a\u00F1o\\Paradigma\\proyecto pagina\\Imagenes\\big ben por la duda.jpg"));
        button_1_1.setFont(new Font("Arial", Font.BOLD, 30));
        button_1_1.setBorder(null);
        button_1_1.setBackground(Color.WHITE);
        button_1_1.setActionCommand("");
        button_1_1.setBounds(190, 551, 157, 82);
        frame.getContentPane().add(button_1_1);
        
        JLabel lblNewLabel_11_1 = new JLabel("<html>La Torre del Reloj, que alberga a Big Ben, es una estructura imponente y emblem\u00E1tica situada en el extremo norte del Palacio de Westminster, que tambi\u00E9n es conocido como el Parlamento del Reino Unido.</html>");
        lblNewLabel_11_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_11_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_11_1.setBounds(190, 632, 157, 120);
        frame.getContentPane().add(lblNewLabel_11_1);
        
        JButton button_2_1 = new JButton("");
        button_2_1.setIcon(new ImageIcon("E:\\5to a\u00F1o\\Paradigma\\proyecto pagina\\Imagenes\\coliseo loco.jpg"));
        button_2_1.setFont(new Font("Arial", Font.BOLD, 30));
        button_2_1.setBorder(null);
        button_2_1.setBackground(Color.WHITE);
        button_2_1.setActionCommand("");
        button_2_1.setBounds(368, 551, 157, 82);
        frame.getContentPane().add(button_2_1);
        
        JLabel lblNewLabel_12_1 = new JLabel("<html>Es un antiguo anfiteatro situado en el coraz\u00F3n de Roma, Italia. Esta estructura ic\u00F3nica es un s\u00EDmbolo duradero del Imperio Romano y su impresionante arquitectura y rica historia lo convierten en uno de los sitios m\u00E1s visitados del mundo.</html>");
        lblNewLabel_12_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_12_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_12_1.setBounds(370, 632, 155, 120);
        frame.getContentPane().add(lblNewLabel_12_1);
        
        JButton button_3_1 = new JButton("");
        button_3_1.setIcon(new ImageIcon("E:\\5to a\u00F1o\\Paradigma\\proyecto pagina\\Imagenes\\cristo.jpg"));
        button_3_1.setFont(new Font("Arial", Font.BOLD, 30));
        button_3_1.setBorder(null);
        button_3_1.setBackground(Color.WHITE);
        button_3_1.setActionCommand("");
        button_3_1.setBounds(547, 551, 157, 82);
        frame.getContentPane().add(button_3_1);
        
        JLabel lblNewLabel_13_1 = new JLabel("<html>El Cristo Redentor es una impresionante estatua de Jesucristo situada en la cima del cerro del Corcovado en R\u00EDo de Janeiro. Esta emblem\u00E1tica figura es un s\u00EDmbolo ic\u00F3nico de la ciudad y una de las maravillas del mundo moderno.</html>");
        lblNewLabel_13_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_13_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_13_1.setBounds(547, 631, 157, 121);
        frame.getContentPane().add(lblNewLabel_13_1);
        
        JButton button_4_1 = new JButton("");
        button_4_1.setIcon(new ImageIcon("E:\\5to a\u00F1o\\Paradigma\\proyecto pagina\\Imagenes\\familia.jpg"));
        button_4_1.setFont(new Font("Arial", Font.BOLD, 30));
        button_4_1.setBorder(null);
        button_4_1.setBackground(Color.WHITE);
        button_4_1.setActionCommand("");
        button_4_1.setBounds(730, 551, 157, 82);
        frame.getContentPane().add(button_4_1);
        
        JLabel lblNewLabel_14_1 = new JLabel("<html> Esta ic\u00F3nica iglesia dise\u00F1ada por Antoni Gaudi es uno de los puntos culminantes de Barcelona. Sus caracter\u00EDsticas \u00FAnicas y su arquitectura impresionante la convierten en un lugar imperdible.</html>");
        lblNewLabel_14_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_14_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_14_1.setBounds(730, 632, 157, 120);
        frame.getContentPane().add(lblNewLabel_14_1);
        
        lblNewLabel_4 = new JLabel("Excursiones");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
        lblNewLabel_4.setBounds(364, 481, 171, 30);
        frame.getContentPane().add(lblNewLabel_4);
        
        JButton button_5_1 = new JButton("");
        button_5_1.setIcon(new ImageIcon("E:\\5to a\u00F1o\\Paradigma\\proyecto pagina\\Imagenes\\astarte.jpg"));
        button_5_1.setFont(new Font("Arial", Font.BOLD, 30));
        button_5_1.setBorder(null);
        button_5_1.setBackground(Color.WHITE);
        button_5_1.setBounds(10, 233, 157, 82);
        frame.getContentPane().add(button_5_1);
        
        JButton button_5_1_1 = new JButton("");
        button_5_1_1.setIcon(new ImageIcon("E:\\5to a\u00F1o\\Paradigma\\proyecto pagina\\Imagenes\\bovey hotel.jpg"));
        button_5_1_1.setFont(new Font("Arial", Font.BOLD, 30));
        button_5_1_1.setBorder(null);
        button_5_1_1.setBackground(Color.WHITE);
        button_5_1_1.setBounds(190, 233, 157, 82);
        frame.getContentPane().add(button_5_1_1);
        
        JButton button_5_1_2 = new JButton("");
        button_5_1_2.setIcon(new ImageIcon("E:\\5to a\u00F1o\\Paradigma\\proyecto pagina\\Imagenes\\eden.jpg"));
        button_5_1_2.setFont(new Font("Arial", Font.BOLD, 30));
        button_5_1_2.setBorder(null);
        button_5_1_2.setBackground(Color.WHITE);
        button_5_1_2.setBounds(368, 233, 157, 82);
        frame.getContentPane().add(button_5_1_2);
        
        JButton button_5_1_3 = new JButton("");
        button_5_1_3.setIcon(new ImageIcon("E:\\5to a\u00F1o\\Paradigma\\proyecto pagina\\Imagenes\\gran palladium.jpg"));
        button_5_1_3.setFont(new Font("Arial", Font.BOLD, 30));
        button_5_1_3.setBorder(null);
        button_5_1_3.setBackground(Color.WHITE);
        button_5_1_3.setBounds(547, 233, 157, 82);
        frame.getContentPane().add(button_5_1_3);
        
        JButton button_5_1_4 = new JButton("");
        button_5_1_4.setIcon(new ImageIcon("E:\\5to a\u00F1o\\Paradigma\\proyecto pagina\\Imagenes\\la florida.jpg"));
        button_5_1_4.setFont(new Font("Arial", Font.BOLD, 30));
        button_5_1_4.setBorder(null);
        button_5_1_4.setBackground(Color.WHITE);
        button_5_1_4.setBounds(730, 232, 157, 82);
        frame.getContentPane().add(button_5_1_4);
        
        JPanel panel_10 = new JPanel();
        panel_10.setBackground(new Color(109, 119, 146));
        panel_10.setBounds(1, 0, 894, 81);
        frame.getContentPane().add(panel_10);
        
        btnNewButton_5 = new JButton("Ver mas");
        btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnNewButton_5.setBounds(219, 441, 95, 23);
        frame.getContentPane().add(btnNewButton_5);
        
        btnNewButton_6 = new JButton("Ver mas");
        btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnNewButton_6.setBounds(396, 441, 95, 23);
        frame.getContentPane().add(btnNewButton_6);
        
        btnNewButton_7 = new JButton("Ver mas");
        btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnNewButton_7.setBounds(576, 441, 95, 23);
        frame.getContentPane().add(btnNewButton_7);
        
        btnNewButton_8 = new JButton("Ver mas");
        btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnNewButton_8.setBounds(761, 441, 95, 23);
        frame.getContentPane().add(btnNewButton_8);
        
        btnNewButton_9 = new JButton("Ver mas");
        btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnNewButton_9.setBounds(40, 752, 95, 23);
        frame.getContentPane().add(btnNewButton_9);
        
        btnNewButton_10 = new JButton("Ver mas");
        btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnNewButton_10.setBounds(219, 752, 95, 23);
        frame.getContentPane().add(btnNewButton_10);
        
        btnNewButton_11 = new JButton("Ver mas");
        btnNewButton_11.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnNewButton_11.setBounds(396, 752, 95, 23);
        frame.getContentPane().add(btnNewButton_11);
        
        btnNewButton_12 = new JButton("Ver mas");
        btnNewButton_12.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnNewButton_12.setBounds(576, 752, 95, 23);
        frame.getContentPane().add(btnNewButton_12);
        
        btnNewButton_13 = new JButton("Ver mas");
        btnNewButton_13.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnNewButton_13.setBounds(761, 752, 95, 23);
        frame.getContentPane().add(btnNewButton_13);
        
        panel_1 = new JPanel();
        panel_1.setBackground(new Color(7, 78, 153));
        panel_1.setBounds(190, 207, 157, 257);
        frame.getContentPane().add(panel_1);
        
        lblNewLabel_6 = new JLabel("England/Inglaterra");
        lblNewLabel_6.setForeground(new Color(255, 0, 0));
        panel_1.add(lblNewLabel_6);
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        panel_2 = new JPanel();
        panel_2.setBackground(new Color(14, 94, 171));
        panel_2.setBounds(368, 207, 157, 257);
        frame.getContentPane().add(panel_2);
        
        lblNewLabel_7 = new JLabel("Italy/Italia");
        lblNewLabel_7.setForeground(new Color(0, 143, 57));
        panel_2.add(lblNewLabel_7);
        lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        panel_3 = new JPanel();
        panel_3.setBackground(new Color(21, 110, 190));
        panel_3.setBounds(547, 207, 157, 257);
        frame.getContentPane().add(panel_3);
        
        lblNewLabel_8 = new JLabel("Brazil/Brasil");
        lblNewLabel_8.setForeground(new Color(0, 255, 0));
        panel_3.add(lblNewLabel_8);
        lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_8.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        panel_4 = new JPanel();
        panel_4.setBackground(new Color(28, 126, 208));
        panel_4.setBounds(730, 207, 157, 257);
        frame.getContentPane().add(panel_4);
        
        lblNewLabel_9 = new JLabel("Spain/Espania");
        lblNewLabel_9.setForeground(new Color(255, 128, 0));
        panel_4.add(lblNewLabel_9);
        lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_9.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        JPanel panel_5 = new JPanel();
        panel_5.setBackground(new Color(128, 0, 60));
        panel_5.setBounds(10, 522, 157, 253);
        frame.getContentPane().add(panel_5);
        
        JLabel lblNewLabel_5_1 = new JLabel("Oia, Santorini\r\n\r\n");
        lblNewLabel_5_1.setForeground(new Color(255, 255, 255));
        panel_5.add(lblNewLabel_5_1);
        lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5_1.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        JPanel panel_6 = new JPanel();
        panel_6.setBackground(new Color(148, 16, 76));
        panel_6.setBounds(190, 522, 157, 253);
        frame.getContentPane().add(panel_6);
        
        JLabel lblNewLabel_6_1 = new JLabel("Big Ben");
        lblNewLabel_6_1.setForeground(new Color(255, 255, 255));
        panel_6.add(lblNewLabel_6_1);
        lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_1.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        JPanel panel_7 = new JPanel();
        panel_7.setBackground(new Color(168, 31, 93));
        panel_7.setBounds(368, 522, 157, 253);
        frame.getContentPane().add(panel_7);
        
        JLabel lblNewLabel_7_1 = new JLabel("Coliseo");
        lblNewLabel_7_1.setForeground(new Color(255, 255, 255));
        panel_7.add(lblNewLabel_7_1);
        lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_1.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        JPanel panel_8 = new JPanel();
        panel_8.setBackground(new Color(188, 47, 109));
        panel_8.setBounds(547, 522, 157, 253);
        frame.getContentPane().add(panel_8);
        
        JLabel lblNewLabel_7_2 = new JLabel("Cristo Redentor");
        lblNewLabel_7_2.setForeground(new Color(255, 255, 255));
        panel_8.add(lblNewLabel_7_2);
        lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_2.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        JPanel panel_9 = new JPanel();
        panel_9.setBackground(new Color(208, 62, 125));
        panel_9.setBounds(730, 522, 157, 253);
        frame.getContentPane().add(panel_9);
        
        JLabel lblNewLabel_7_3 = new JLabel("La Sagrada Familia\r\n");
        lblNewLabel_7_3.setForeground(new Color(255, 255, 255));
        panel_9.add(lblNewLabel_7_3);
        lblNewLabel_7_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_3.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        btnNewButton_3 = new JButton("Ver mas");
        btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnNewButton_3.setBounds(40, 441, 95, 23);
        frame.getContentPane().add(btnNewButton_3);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 62, 134));
        panel.setBounds(10, 207, 157, 257);
        frame.getContentPane().add(panel);
        
        lblNewLabel_5 = new JLabel("Greece/Grecia");
        lblNewLabel_5.setForeground(new Color(255, 0, 0));
        panel.add(lblNewLabel_5);
        lblNewLabel_5.setFont(new Font("Perpetua", Font.BOLD, 18));
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);

        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openURL("https://www.boveycastle.com/");
            }
        });
        
        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openURL("https://www.dorchestercollection.com/en/rome/hotel-eden/");
            }
        });

        btnNewButton_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openURL("https://www.palladiumhotelgroup.com/pt/hoteis/brasil/bahia/grand-palladium-imbassai-resort-spa?utm_source=mybusiness&utm_medium=organic&utm_campaign=MK_TT_gpimbassai&y_source=1_MTUwOTA4OTYtNzE1LWxvY2F0aW9uLndlYnNpdGU%3D");
            }
        });
        
        btnNewButton_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openURL("https://www.hotelfloridabarcelona.com/");
            }
        });

        btnNewButton_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openURL("https://www.getyourguide.es/-l9790/-tc1/?cmp=ga&cq_src=google_ads&cq_cmp=6656026680&cq_con=102196791780&cq_term=tour+oia+santorini&cq_med=&cq_plac=&cq_net=g&cq_pos=&cq_plt=gp&campaign_id=6656026680&adgroup_id=102196791780&target_id=aud-476515432771%3Akwd-1660401002856&loc_physical_ms=1000073&match_type=e&ad_id=439358898705&keyword=tour+oia+santorini&ad_position=&feed_item_id=&placement=&device=c&partner_id=CD951&gclid=CjwKCAjwrranBhAEEiwAzbhNtS1wgo4_ULbL4c17bCYTKB-4nMPF3TawOluh5lrhkn-xy5lEE65hsxoClH0QAvD_BwE&visitor-id=SKWRDR6LV24VC6A52Y60MGWJZIPQE9OI&locale_autoredirect_optout=true");
            }
        });
        
        btnNewButton_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openURL("https://www.getyourguide.com/-l2709/?cmp=ga&cq_src=google_ads&cq_cmp=6657268933&cq_con=79715668475&cq_term=big%20ben%20tour&cq_med=&cq_plac=&cq_net=g&cq_pos=&cq_plt=gp&campaign_id=6657268933&adgroup_id=79715668475&target_id=aud-476515432771:kwd-566211950&loc_physical_ms=1000073&match_type=e&ad_id=588561888460&keyword=big%20ben%20tour&ad_position=&feed_item_id=&placement=&device=c&partner_id=CD951&gclid=CjwKCAjwrranBhAEEiwAzbhNta7e2x7fWbPNlOLH4vhEWv3ZvNLZ8r-k9L9Zxy2lHjd2gPs4nQ0qpxoCBLMQAvD_BwE");
            }
        });

        btnNewButton_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openURL("https://www.getyourguide.com/-l2619/?cmp=ga&cq_src=google_ads&cq_cmp=6654625819&cq_con=79337056776&cq_term=tour%20colosseo&cq_med=&cq_plac=&cq_net=g&cq_pos=&cq_plt=gp&campaign_id=6654625819&adgroup_id=79337056776&target_id=aud-476515432771:kwd-6433378580&loc_physical_ms=1000073&match_type=e&ad_id=394418056027&keyword=tour%20colosseo&ad_position=&feed_item_id=&placement=&device=c&partner_id=CD951&gclid=CjwKCAjwrranBhAEEiwAzbhNtf9QddbCOuaIuiiaNOsfaa1yyjqKZT7OwkFGKWkg-CXz37-aoGAzHRoCFUsQAvD_BwE");
            }
        });
        
        btnNewButton_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openURL("https://www.tripadvisor.com.ar/AttractionToursAndTickets-g303506-d554128-Corcovado_Christ_the_Redeemer-Rio_de_Janeiro_State_of_Rio_de_Janeiro.html");
            }
        });

        btnNewButton_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openURL("https://sagradafamilia.org/es/tickets");
            }
        });
    }
    
    private void openURL(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	public void setVisble(boolean b) {
		frame.setVisible(true);
		
	}
}


