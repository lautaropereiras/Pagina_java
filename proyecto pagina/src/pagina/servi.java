package pagina;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class servi {
    private JPanel panel;
    private JFrame frame;
    private JPanel cardPanel;
    private JPanel cardPanel2;
    private int currentCardIndex = 0;
    private int currentCardIndex2 = 0;
    private String[] cardContents = {
        "Contenido de la tarjeta 1",
        "Contenido de la tarjeta 2",
        "Contenido de la tarjeta 3",
        "Contenido de la tarjeta 4",
        "Contenido de la tarjeta 5"
    };
    private String[] cardContents2 = {
        "Contenido de la tarjeta 1",
        "Contenido de la tarjeta 2",
        "Contenido de la tarjeta 3",
        "Contenido de la tarjeta 4",
        "Contenido de la tarjeta 5"
    };

    public static void main(String[] args) {
    	servi window = new servi();
        window.frame.setVisible(true);
    }

    public servi() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(109, 119, 146));
        frame.setBounds(0, 0, 912, 841);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
                
                        cardPanel2 = new JPanel();
                        cardPanel2.setBackground(new Color(109, 119, 146));
                        cardPanel2.setBounds(0, 482, 899, 320);
                        frame.getContentPane().add(cardPanel2);
                        cardPanel2.setLayout(null);
                        JPanel card2 = new JPanel();
                        card2.setLayout(null);
                        card2.setBackground(Color.blue);
                        card2.setBounds(253, 11, 393, 298);
                        cardPanel2.add(card2);
                        
                                JButton prevButton2 = new JButton("Anterior");
                                prevButton2.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                prevButton2.setBounds(10, 135, 163, 68);
                                cardPanel2.add(prevButton2);
                                
                                        JButton nextButton2 = new JButton("Siguiente");
                                        nextButton2.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                        nextButton2.setBounds(701, 135, 163, 68);
                                        cardPanel2.add(nextButton2);
                                        
                                                nextButton2.addActionListener(new ActionListener() {
                                                    public void actionPerformed(ActionEvent e) {
                                                        showNextCard2();
                                                    }
                                                });
                                                prevButton2.addActionListener(new ActionListener() {
                                                    public void actionPerformed(ActionEvent e) {
                                                        showPreviousCard2();
                                                    }
                                                });
        
                cardPanel = new JPanel();
                cardPanel.setBackground(new Color(109, 119, 146));
                cardPanel.setBounds(0, 120, 899, 320);
                frame.getContentPane().add(cardPanel);
                cardPanel.setLayout(null);
                
                
                        JButton prevButton = new JButton("Anterior");
                        prevButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
                        prevButton.setBounds(10, 111, 163, 68);
                        cardPanel.add(prevButton);
                        
                                JButton nextButton = new JButton("Siguiente");
                                nextButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                nextButton.setBounds(697, 111, 163, 68);
                                cardPanel.add(nextButton);
                                

                                 nextButton.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                         showNextCard();
                                     }
                                 });
                                 prevButton.addActionListener(new ActionListener() {
                                     public void actionPerformed(ActionEvent e) {
                                         showPreviousCard();
                                     }
                                 });
                                 JPanel card = new JPanel();
                                 card.setLayout(null);
                                 card.setBackground(Color.blue);
                                 card.setBounds(235, 11, 421, 407);
                                 cardPanel.add(card);

        panel = new JPanel(); 
        panel.setBackground(new Color(109, 119, 146));
        panel.setBounds(0, 0, 914, 81);
        panel.setBackground(new Color(109, 119, 146));
        frame.getContentPane().add(panel); 
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Travel Discover");
        lblNewLabel.setBounds(0, 0, 162, 81);
        panel.add(lblNewLabel);
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBackground(new Color(109, 119, 146));
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JButton btnNewButton = new JButton("Inicio");
        btnNewButton.setBounds(181, 25, 102, 30);
        panel.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Inicio newframe = new Inicio();
                newframe.setVisible(true);
                frame.dispose();
            }
        });
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(14, 94, 171));
        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        JButton btnNewButton_1 = new JButton("Servicios");
        btnNewButton_1.setBounds(312, 25, 114, 30);
        panel.add(btnNewButton_1);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                servi newframe = new servi();
                newframe.setVisble(true);
                frame.dispose();
            }
        });
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBackground(new Color(14, 94, 171));
        btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        JButton btnNewButton_2 = new JButton("Reseñas");
        btnNewButton_2.setBounds(457, 25, 114, 30);
        panel.add(btnNewButton_2);
        btnNewButton_2.setForeground(new Color(255, 255, 255));
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rese�as newframe = new rese�as();
                newframe.setVisble(true);
                frame.dispose();
            }
        });
        btnNewButton_2.setBackground(new Color(14, 94, 171));
        btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        JTextField textFieldSearch = new JTextField();
        textFieldSearch.setBounds(607, 27, 171, 30);
        panel.add(textFieldSearch);
        textFieldSearch.setText("Buscador..");
        textFieldSearch.setColumns(10);

        JSeparator separator_4 = new JSeparator();
        separator_4.setBounds(798, 0, 12, 81);
        panel.add(separator_4);
        separator_4.setForeground(Color.WHITE);
        separator_4.setOrientation(SwingConstants.VERTICAL);

        JSeparator separator_3 = new JSeparator();
        separator_3.setBounds(585, 0, 12, 81);
        panel.add(separator_3);
        separator_3.setForeground(Color.WHITE);
        separator_3.setOrientation(SwingConstants.VERTICAL);

        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(435, 0, 12, 81);
        panel.add(separator_2);
        separator_2.setOrientation(SwingConstants.VERTICAL);
        separator_2.setForeground(Color.WHITE);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(293, 0, 12, 81);
        panel.add(separator_1);
        separator_1.setOrientation(SwingConstants.VERTICAL);
        separator_1.setBackground(Color.WHITE);
        separator_1.setForeground(Color.WHITE);

        JSeparator separator = new JSeparator();
        separator.setBounds(172, 0, 9, 81);
        panel.add(separator);
        separator.setOrientation(SwingConstants.VERTICAL);
        separator.setToolTipText("aaaa");
        separator.setForeground(Color.WHITE);
        separator.setBackground(Color.WHITE);

        JSeparator separator_5 = new JSeparator();
        separator_5.setBounds(0, 79, 884, 2);
        panel.add(separator_5);

        frame.setVisible(true);

        JLabel lblNewLabel_1 = new JLabel("Hoteles");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(367, 81, 135, 39);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Sitios turisticos");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel_1_1.setBounds(367, 437, 147, 45);
        frame.getContentPane().add(lblNewLabel_1_1);

        showCurrentCard();
        showCurrentCard2();
    }

    protected void setVisble(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private void showCurrentCard() {
    	
    	
        cardPanel.removeAll();
        JPanel card = new JPanel();
        card.setLayout(null);
        card.setBackground(Color.blue);
        card.setBounds(253, 11, 393, 407);
        cardPanel.add(card);
        
        if (currentCardIndex == 0) {
            JLabel lblNewLabel_5 = new JLabel("Greece/Grecia");
            lblNewLabel_5.setForeground(new Color(255, 0, 0));
            lblNewLabel_5.setFont(new Font("Perpetua", Font.BOLD, 18));
            lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_5.setBounds(129, 0, 160, 30);

            
            JButton button_5_1 = new JButton("");
            button_5_1.setIcon(new ImageIcon("E:\\5to a\u00F1o\\Paradigma\\proyecto pagina\\Imagenes\\astarte.jpg"));
            button_5_1.setFont(new Font("Arial", Font.BOLD, 30));
            button_5_1.setBorder(null);
            button_5_1.setBackground(Color.WHITE);
            button_5_1.setBounds(0, 27, 421, 147);
            frame.getContentPane().add(button_5_1);
            
            JLabel lblNewLabel_10 = new JLabel("<html>El hotel Astarte Suites ha creado un lujoso escape romantico con una impresionante vista del volcan y la mitica Caldera de Santorini, en Grecia. Es una eleccion favorita para vacaciones y lunas de miel en todo el mundo.</html>");
            lblNewLabel_10.setForeground(new Color(255, 255, 255));
            lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 12));
            lblNewLabel_10.setBounds(0, 75, 393, 258);
            frame.getContentPane().add(lblNewLabel_10);
            
            JButton btnNewButton_3 = new JButton("Ver mas");
            btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
            btnNewButton_3.setBounds(40, 441, 95, 23);
            frame.getContentPane().add(btnNewButton_3);
            card.add(lblNewLabel_5);
            card.add(button_5_1);
            card.add(lblNewLabel_10);
            card.add(btnNewButton_3);
        }
        else if(currentCardIndex == 1)
        {
            JLabel lblNewLabel_6 = new JLabel("England/Inglaterra");
            lblNewLabel_6.setForeground(new Color(255, 0, 0));
            lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_6.setFont(new Font("Perpetua", Font.BOLD, 18));
            
            JButton button_5_1_1 = new JButton("");
            button_5_1_1.setIcon(new ImageIcon("E:\\5to a\u00F1o\\Paradigma\\proyecto pagina\\Imagenes\\bovey hotel.jpg"));
            button_5_1_1.setFont(new Font("Arial", Font.BOLD, 30));
            button_5_1_1.setBorder(null);
            button_5_1_1.setBackground(Color.WHITE);
            button_5_1_1.setBounds(0, 10, 393, 150);
            frame.getContentPane().add(button_5_1_1);
            
            JLabel lblNewLabel_11 = new JLabel("<html>Inaugurado en 1930, Bovey Castle Hotel y Spa es un encantador destino. Es perfecto para relajarse en  un ambiente lujoso, ya sea en familia, con amigos o en pareja.\r\n</html>");
            lblNewLabel_11.setForeground(new Color(255, 255, 255));
            lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 12));
            lblNewLabel_11.setBounds(0, 130, 393, 121);
            frame.getContentPane().add(lblNewLabel_11);
            
            JButton btnNewButton_5 = new JButton("Ver mas");
            btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
            btnNewButton_5.setBounds(219, 441, 95, 23);
            frame.getContentPane().add(btnNewButton_5);
            card.add(lblNewLabel_6);
            card.add(button_5_1_1);
            card.add(lblNewLabel_11);
            card.add(btnNewButton_5);
        }
        else if(currentCardIndex == 2)
        {
            JLabel lblNewLabel_7 = new JLabel("Italy/Italia");
            lblNewLabel_7.setForeground(new Color(0, 143, 57));
            lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_7.setFont(new Font("Perpetua", Font.BOLD, 18));
            
            JButton button_5_1_2 = new JButton("");
            button_5_1_2.setIcon(new ImageIcon("E:\\5to a\u00F1o\\Paradigma\\proyecto pagina\\Imagenes\\eden.jpg"));
            button_5_1_2.setFont(new Font("Arial", Font.BOLD, 30));
            button_5_1_2.setBorder(null);
            button_5_1_2.setBackground(Color.WHITE);
            button_5_1_2.setBounds(0, 10, 393, 150);
            frame.getContentPane().add(button_5_1_2);
            
            JLabel lblNewLabel_12 = new JLabel("<html>Un autentico espiritu romano impregna este radiante 'Hotel Eden', lleno de historias de una ciudad legendaria y la hospitalidad de su gente extraordinaria.</html>");
            lblNewLabel_12.setForeground(new Color(255, 255, 255));
            lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 12));
            lblNewLabel_12.setBounds(0, 130, 393, 121);
            frame.getContentPane().add(lblNewLabel_12);
            
            JButton btnNewButton_6 = new JButton("Ver mas");
            btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
            btnNewButton_6.setBounds(396, 441, 95, 23);
            frame.getContentPane().add(btnNewButton_6);
            
            card.add(lblNewLabel_7);
            card.add(button_5_1_2);
            card.add(lblNewLabel_12);
            card.add(btnNewButton_6);
        }
        else if(currentCardIndex == 3)
        {
            JLabel lblNewLabel_8 = new JLabel("Brazil/Brasil");
            lblNewLabel_8.setForeground(new Color(0, 255, 0));
            lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_8.setFont(new Font("Perpetua", Font.BOLD, 18));
            
            JButton button_5_1_3 = new JButton("");
            button_5_1_3.setIcon(new ImageIcon("E:\\5to a\u00F1o\\Paradigma\\proyecto pagina\\Imagenes\\gran palladium.jpg"));
            button_5_1_3.setFont(new Font("Arial", Font.BOLD, 30));
            button_5_1_3.setBorder(null);
            button_5_1_3.setBackground(Color.WHITE);
            button_5_1_3.setBounds(0, 10, 393, 150);
            frame.getContentPane().add(button_5_1_3);
            
            JLabel lblNewLabel_13 = new JLabel("<html>El Grand Palladium Imbassai Resort & Spa es un hotel de 5 estrellas con todo incluido. Disfrute de una reserva natural exuberante en este hotel con una playa de arena dorada y cristalina. Para relajarse de pies a cabeza.</html>");
            lblNewLabel_13.setForeground(new Color(255, 255, 255));
            lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 12));
            lblNewLabel_13.setBounds(0, 130, 393, 121);
            frame.getContentPane().add(lblNewLabel_13);
            
            JButton btnNewButton_7 = new JButton("Ver mas");
            btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
            btnNewButton_7.setBounds(576, 441, 95, 23);
            frame.getContentPane().add(btnNewButton_7);
            card.add(lblNewLabel_8);
            card.add(button_5_1_3);
            card.add(lblNewLabel_13);
            card.add(btnNewButton_7);
        }
        else if(currentCardIndex == 4)
        {
            JLabel lblNewLabel_9 = new JLabel("Spain/Espania");
            lblNewLabel_9.setForeground(new Color(255, 128, 0));
            lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_9.setFont(new Font("Perpetua", Font.BOLD, 18));
            
            JButton button_5_1_4 = new JButton("");
            button_5_1_4.setIcon(new ImageIcon("E:\\5to a\u00F1o\\Paradigma\\proyecto pagina\\Imagenes\\la florida.jpg"));
            button_5_1_4.setFont(new Font("Arial", Font.BOLD, 30));
            button_5_1_4.setBorder(null);
            button_5_1_4.setBackground(Color.WHITE);
            button_5_1_4.setBounds(0, 10, 393, 150);
            frame.getContentPane().add(button_5_1_4);
            
            JLabel lblNewLabel_14 = new JLabel("<html>El Gran Hotel La Florida, de 5 estrellas, se encuentra en la monta\u00F1a del Tibidabo y ofrece vistas espectaculares a Barcelona y al Mar Mediterraneo.</html>");
            lblNewLabel_14.setForeground(new Color(255, 255, 255));
            lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 12));
            lblNewLabel_14.setBounds(0, 130, 393, 121);
            frame.getContentPane().add(lblNewLabel_14);
            
            JButton btnNewButton_8 = new JButton("Ver mas");
            btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
            btnNewButton_8.setBounds(761, 441, 95, 23);
            frame.getContentPane().add(btnNewButton_8);
            
            card.add(lblNewLabel_9);
            card.add(button_5_1_4);
            card.add(lblNewLabel_14);
            card.add(btnNewButton_8);
        }
        JButton prevButton = new JButton("Anterior");
        prevButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        prevButton.setBounds(10, 180, 163, 68);
        cardPanel.add(prevButton);

        JButton nextButton = new JButton("Siguiente");
        nextButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        nextButton.setBounds(698, 180, 163, 68);
        cardPanel.add(nextButton);

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showNextCard();
            }
        });
        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPreviousCard();
            }
        });
        frame.validate();
        frame.repaint();
    }

    private void showCurrentCard2() {
        cardPanel2.removeAll();
        JPanel card2 = new JPanel();
        card2.setLayout(null);
        card2.setBackground(Color.blue);
        card2.setBounds(253, 11, 393, 407);
        cardPanel2.add(card2);
        if (currentCardIndex2 == 0) {
            JLabel lblNewLabel_5_1 = new JLabel("cccccc");
            lblNewLabel_5_1.setForeground(new Color(255, 255, 255));
            lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_5_1.setFont(new Font("Perpetua", Font.BOLD, 18));
            
            JButton button_5 = new JButton("");
            button_5.setIcon(new ImageIcon(""));
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
            
            JButton btnNewButton_9 = new JButton("Ver mas");
            btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
            btnNewButton_9.setBounds(40, 752, 95, 23);
            frame.getContentPane().add(btnNewButton_9);
            card2.add(lblNewLabel_5_1);
            card2.add(button_5);
            card2.add(lblNewLabel_10_1);
            card2.add(btnNewButton_9);
        }
        else if(currentCardIndex2 == 1)
        {
            JLabel lblNewLabel_6_1 = new JLabel("Big Ben");
            lblNewLabel_6_1.setForeground(new Color(255, 255, 255));
            lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_6_1.setFont(new Font("Perpetua", Font.BOLD, 18));
            
            JButton button_1_1 = new JButton("");
            button_1_1.setIcon(new ImageIcon(""));
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
            
            JButton btnNewButton_10 = new JButton("Ver mas");
            btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
            btnNewButton_10.setBounds(219, 752, 95, 23);
            frame.getContentPane().add(btnNewButton_10);
            
            card2.add(lblNewLabel_6_1);
            card2.add(button_1_1);
            card2.add(lblNewLabel_11_1);
            card2.add(btnNewButton_10);
        }
        else if(currentCardIndex2 == 2)
        {
            JLabel lblNewLabel_7_1 = new JLabel("Coliseo");
            lblNewLabel_7_1.setForeground(new Color(255, 255, 255));
            lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_7_1.setFont(new Font("Perpetua", Font.BOLD, 18));
            
            JButton button_2_1 = new JButton("");
            button_2_1.setIcon(new ImageIcon(""));
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
            
            JButton btnNewButton_11 = new JButton("Ver mas");
            btnNewButton_11.setFont(new Font("Times New Roman", Font.BOLD, 15));
            btnNewButton_11.setBounds(396, 752, 95, 23);
            frame.getContentPane().add(btnNewButton_11);
            
            card2.add(lblNewLabel_7_1);
            card2.add(button_2_1);
            card2.add(lblNewLabel_12_1);
            card2.add(btnNewButton_11);
        }
        else if(currentCardIndex2 == 3)
        {
            JLabel lblNewLabel_7_2 = new JLabel("Cristo Redentor");
            lblNewLabel_7_2.setForeground(new Color(255, 255, 255));
            lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_7_2.setFont(new Font("Perpetua", Font.BOLD, 18));
            
            JButton button_3_1 = new JButton("");
            button_3_1.setIcon(new ImageIcon(""));
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
            
            JButton btnNewButton_12 = new JButton("Ver mas");
            btnNewButton_12.setFont(new Font("Times New Roman", Font.BOLD, 15));
            btnNewButton_12.setBounds(576, 752, 95, 23);
            frame.getContentPane().add(btnNewButton_12);
            
            card2.add(lblNewLabel_7_2);
            card2.add(button_3_1);
            card2.add(lblNewLabel_13_1);
            card2.add(btnNewButton_12);
        }
        else if(currentCardIndex2 == 4)
        {
            JLabel lblNewLabel_7_3 = new JLabel("La Sagrada Familia");
            lblNewLabel_7_3.setForeground(new Color(255, 255, 255));
            lblNewLabel_7_3.setHorizontalAlignment(SwingConstants.CENTER);
            lblNewLabel_7_3.setFont(new Font("Perpetua", Font.BOLD, 18));
            
            JButton button_4_1 = new JButton("");
            button_4_1.setIcon(new ImageIcon(""));
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
            
            JButton btnNewButton_13 = new JButton("Ver mas");
            btnNewButton_13.setFont(new Font("Times New Roman", Font.BOLD, 15));
            btnNewButton_13.setBounds(761, 752, 95, 23);
            frame.getContentPane().add(btnNewButton_13);
            
            card2.add(lblNewLabel_7_3);
            card2.add(button_4_1);
            card2.add(lblNewLabel_14_1);
            card2.add(btnNewButton_13);
        }
        
        JButton prevButton2 = new JButton("Anterior");
        prevButton2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        prevButton2.setBounds(10, 180, 163, 68);
        cardPanel2.add(prevButton2);

        JButton nextButton2 = new JButton("Siguiente");
        nextButton2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        nextButton2.setBounds(698, 180, 163, 68);
        cardPanel2.add(nextButton2);

        nextButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showNextCard2();
            }
        });
        prevButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPreviousCard2();
            }
        });
        frame.validate();
        frame.repaint();
    }

    private void showNextCard() {
        if (currentCardIndex < cardContents.length - 1) {
            currentCardIndex++;
            showCurrentCard();
        }
    }

    private void showPreviousCard() {
        if (currentCardIndex > 0) {
            currentCardIndex--;
            showCurrentCard();
        }
    }

    private void showNextCard2() {
        if (currentCardIndex2 < cardContents2.length - 1) {
            currentCardIndex2++;
            showCurrentCard2();
        }
    }

    private void showPreviousCard2() {
        if (currentCardIndex2 > 0) {
            currentCardIndex2--;
            showCurrentCard2();
        }
    }
}
