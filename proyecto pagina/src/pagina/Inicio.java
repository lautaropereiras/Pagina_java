package pagina;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio {
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
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    int contador;
    private JPanel cardPanel;
    private int currentCardIndex = 0;
    private String[] cardContents = {
            "Contenido de la tarjeta 1",
            "Contenido de la tarjeta 2",
            "Contenido de la tarjeta 3",
            "Contenido de la tarjeta 4",
            "Contenido de la tarjeta 5",
            "Contenido de la tarjeta 6",
            "Contenido de la tarjeta 7",
            "Contenido de la tarjeta 8",
            "Contenido de la tarjeta 9",
            "Contenido de la tarjeta 10"
        };

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Inicio window = new Inicio();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Inicio() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(109, 119, 146));
        frame.setBounds(0, 0, 913, 813);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Travel Discover");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBackground(new Color(109, 119, 146));
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(-4, 0, 171, 81);
        frame.getContentPane().add(lblNewLabel);

        textField = new JTextField();
        textField.setForeground(new Color(109, 119, 146));
        textField.setBackground(new Color(109, 119, 146));
        textField.setBounds(164, 0, 3, 81);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setForeground(new Color(109, 119, 146));
        textField_1.setBackground(new Color(109, 119, 146));
        textField_1.setBounds(-4, 78, 936, 3);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JButton btnNewButton = new JButton("Inicio");
        btnNewButton.setForeground(new Color(255, 255, 255));
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
        textField_2.setForeground(new Color(109, 119, 146));
        textField_2.setBackground(new Color(109, 119, 146));
        textField_2.setBounds(293, 0, 3, 81);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);

        btnNewButton_1 = new JButton("Servicios");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                servi newframe = new servi();
                newframe.setVisble(true);
                this.dispose();
            }

            private void dispose() {
                frame.setVisible(false);
            }
        });
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBackground(new Color(14, 94, 171));
        btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnNewButton_1.setBounds(312, 24, 114, 30);
        frame.getContentPane().add(btnNewButton_1);

        textField_3 = new JTextField();
        textField_3.setForeground(new Color(109, 119, 146));
        textField_3.setBackground(new Color(109, 119, 146));
        textField_3.setBounds(436, 0, 3, 81);
        frame.getContentPane().add(textField_3);
        textField_3.setColumns(10);

        btnNewButton_2 = new JButton("Resenias");
        btnNewButton_2.setForeground(new Color(255, 255, 255));
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reseñas newframe1 = new reseñas();
                newframe1.setVisble(true);
                this.dispose();
            }

            private void dispose() {
                frame.setVisible(false);
            }
        });
        btnNewButton_2.setBackground(new Color(14, 94, 171));
        btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btnNewButton_2.setBounds(457, 24, 114, 30);
        frame.getContentPane().add(btnNewButton_2);

        textField_4 = new JTextField();
        textField_4.setForeground(new Color(109, 119, 146));
        textField_4.setBackground(new Color(109, 119, 146));
        textField_4.setBounds(581, 0, 3, 81);
        frame.getContentPane().add(textField_4);
        textField_4.setColumns(10);

        textFieldSearch = new JTextField();
        textFieldSearch.setText("Buscador..");
        textFieldSearch.setBounds(600, 24, 171, 30);
        frame.getContentPane().add(textFieldSearch);
        textFieldSearch.setColumns(10);

        textField_5 = new JTextField();
        textField_5.setForeground(new Color(109, 119, 146));
        textField_5.setBackground(new Color(109, 119, 146));
        textField_5.setBounds(782, 0, 3, 81);
        frame.getContentPane().add(textField_5);
        textField_5.setColumns(10);

        lblNewLabel_1 = new JLabel("Travel Discover");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(342, 107, 197, 59);
        frame.getContentPane().add(lblNewLabel_1);

        lblNewLabel_2 = new JLabel("<html>En Travel Discover, no solo creamos resenias; creamos conexiones entre los viajeros y los lugares que desean explorar. Nuestra mision es llevar a los viajeros mas alla de las postales y las descripciones superficiales, sumergiendolos en la autenticidad de cada lugar. Ya sea que estes planeando unas vacaciones en familia, una escapada romantica o una aventura en solitario, nuestras resenias estan diseñadas para inspirar y brindarte una vision realista de lo que te espera.</html>");
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setToolTipText("");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNewLabel_2.setBounds(10, 132, 885, 193);
        frame.getContentPane().add(lblNewLabel_2);

        lblNewLabel_3 = new JLabel("Destinos");
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setBounds(234, 299, 421, 41);
        frame.getContentPane().add(lblNewLabel_3);

        cardPanel = new JPanel();
        cardPanel.setBackground(new Color(109, 119, 146));
        cardPanel.setBounds(0, 334, 899, 429);
        frame.getContentPane().add(cardPanel);
        cardPanel.setLayout(null);

        showCurrentCard();
    }

    private void showCurrentCard() {
        cardPanel.removeAll();

        JPanel card = new JPanel();
        card.setLayout(null);
        card.setBackground(new Color(14, 94, 171));
        card.setBounds(235, 11, 421, 407);
        cardPanel.add(card);
        if (currentCardIndex == 0) {
        JLabel lblParis = new JLabel("Francia");
        lblParis.setForeground(new Color(255, 255,255));
        lblParis.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblParis.setBounds(129, 0, 160, 30);
        lblParis.setHorizontalAlignment(SwingConstants.CENTER);

        card.add(lblParis);

        JLabel lblNewLabel_10 = new JLabel("<html>Francia, la joya de Europa, es un país lleno de encanto y diversidad. Desde la majestuosa París hasta los viñedos de Burdeos y las playas de la Riviera Francesa, ofrece una experiencia cultural, gastronómica y natural inigualable. Descubre la Ciudad de la Luz, saborea su deliciosa cocina, y sumérgete en su rica historia y elegante estilo de vida. ¡Un viaje a Francia es un viaje inolvidable!</html>");
        lblNewLabel_10.setForeground(new Color(255, 255, 255));
        lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNewLabel_10.setBounds(0, 174, 393, 233);
        card.add(lblNewLabel_10);
        
        JButton btnNewButton_3 = new JButton("");
        btnNewButton_3.setIcon(new ImageIcon("proyecto pagina/bin/Imagenes/francia (1) (1).jpg"));
        btnNewButton_3.setBounds(0, 27, 421, 147);
        card.add(btnNewButton_3);
        }
        else if (currentCardIndex == 1) {
            JLabel lblEgipto = new JLabel("Egipto");
            lblEgipto.setForeground(new Color(255, 255, 255));
            lblEgipto.setFont(new Font("Times New Roman", Font.BOLD, 20));
            lblEgipto.setBounds(129, 0, 160, 30);
            lblEgipto.setHorizontalAlignment(SwingConstants.CENTER);

            card.add(lblEgipto);

            JLabel lblNewLabel_11 = new JLabel("<html>Egipto, tierra de los faraones y misterios ancestrales. Explora las pirámides, navega por el Nilo, sumérgete en la cultura y el desierto, y descubre la historia en museos. ¡Un viaje a Egipto es un viaje a la antigüedad y la maravilla!</html>");
            lblNewLabel_11.setForeground(new Color(255, 255, 255));
            lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 18));
            lblNewLabel_11.setBounds(0, 149, 393, 258);
            card.add(lblNewLabel_11);

            JButton btnNewButton_4 = new JButton("");
            btnNewButton_4.setIcon(new ImageIcon("proyecto pagina/bin/Imagenes/egipto (2).jpg"));
            btnNewButton_4.setBounds(0, 27, 421, 147);
            card.add(btnNewButton_4);
        }
        else if (currentCardIndex == 2) {
            JLabel lblItalia = new JLabel("Italia");
            lblItalia.setForeground(new Color(255, 255, 255));
            lblItalia.setFont(new Font("Times New Roman", Font.BOLD, 20));
            lblItalia.setBounds(129, 0, 160, 30);
            lblItalia.setHorizontalAlignment(SwingConstants.CENTER);
            card.add(lblItalia);

            JLabel lblNewLabel_11 = new JLabel("<html>Italia, un país de arte, historia y comida deliciosa. Explora Roma, Florencia y Venecia, disfruta de la pizza y el gelato, y sumérgete en la belleza de sus paisajes. ¡Un viaje a Italia es una experiencia inolvidable!</html>");
            lblNewLabel_11.setForeground(new Color(255, 255, 255));
            lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 18));
            lblNewLabel_11.setBounds(0, 149, 393, 258);
            card.add(lblNewLabel_11);

            JButton btnNewButton_4 = new JButton("");
            btnNewButton_4.setIcon(new ImageIcon("proyecto pagina/bin/Imagenes/italia (2).jpg"));
            btnNewButton_4.setBounds(0, 27, 421, 147);
            card.add(btnNewButton_4);
        }
        else if (currentCardIndex == 3) {
            JLabel lblBrasil = new JLabel("Brasil");
            lblBrasil.setForeground(new Color(255, 255, 255));
            lblBrasil.setFont(new Font("Times New Roman", Font.BOLD, 20));
            lblBrasil.setBounds(129, 0, 160, 30);
            lblBrasil.setHorizontalAlignment(SwingConstants.CENTER);

            card.add(lblBrasil);

            JLabel lblNewLabel_11 = new JLabel("<html>Brasil, un país de playas, Carnaval, selva amazónica, ciudades vibrantes y una cultura diversa. Descubre la belleza natural y la pasión de la vida brasileña en tu viaje. ¡Brasil te espera con los brazos abiertos!</html>");
            lblNewLabel_11.setForeground(new Color(255,255, 255));
            lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 18));
            lblNewLabel_11.setBounds(0, 149, 393, 258);
            card.add(lblNewLabel_11);

            JButton btnNewButton_4 = new JButton("");
            btnNewButton_4.setIcon(new ImageIcon("proyecto pagina/bin/Imagenes/brasil (1).jpg"));
            btnNewButton_4.setBounds(0, 27, 421, 147);
            card.add(btnNewButton_4);
        }
        else if (currentCardIndex == 4) {
            JLabel lblEspania = new JLabel("Espania");
            lblEspania.setForeground(new Color(255, 255, 255));
            lblEspania.setFont(new Font("Times New Roman", Font.BOLD, 20));
            lblEspania.setBounds(129, 0, 160, 30);
            lblEspania.setHorizontalAlignment(SwingConstants.CENTER);

            card.add(lblEspania);

            JLabel lblNewLabel_11 = new JLabel("<html>España, país de arte, gastronomía, festividades y paisajes variados. Explora su historia, cultura y hospitalidad en tu viaje. ¡España te espera con los brazos abiertos!</html>");
            lblNewLabel_11.setForeground(new Color(255, 255, 255));
            lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 18));
            lblNewLabel_11.setBounds(0, 149, 393, 258);
            card.add(lblNewLabel_11);

            JButton btnNewButton_4 = new JButton("");
            btnNewButton_4.setIcon(new ImageIcon("proyecto pagina/bin/Imagenes/spain.jpg"));
            btnNewButton_4.setBounds(0, 27, 421, 147);
            card.add(btnNewButton_4);
        }
        else if (currentCardIndex == 5) {
            JLabel lblGrecia = new JLabel("Grecia");
            lblGrecia.setForeground(new Color(255, 255, 255));
            lblGrecia.setFont(new Font("Times New Roman", Font.BOLD, 20));
            lblGrecia.setBounds(129, 0, 160, 30);
            lblGrecia.setHorizontalAlignment(SwingConstants.CENTER);

            card.add(lblGrecia);

            JLabel lblNewLabel_11 = new JLabel("<html>Grecia es un país que ofrece una mezcla única de historia, belleza natural y cultura. Un viaje aquí te llevará a través de los siglos y te permitirá disfrutar de las delicias mediterráneas en un entorno de postal. ¡Ven y descubre el encanto de Grecia en tu próximo viaje!</html>");
            lblNewLabel_11.setForeground(new Color(255, 255, 255));
            lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 18));
            lblNewLabel_11.setBounds(0, 149, 393, 258);
            card.add(lblNewLabel_11);

            JButton btnNewButton_4 = new JButton("");
            btnNewButton_4.setIcon(new ImageIcon("proyecto pagina/bin/Imagenes/greciaaa (1).jpg"));
            btnNewButton_4.setBounds(0, 27, 421, 147);
            card.add(btnNewButton_4);
        }
        else if (currentCardIndex == 6) {
            JLabel lblPeru = new JLabel("Peru");
            lblPeru.setForeground(new Color(255, 255,255));
            lblPeru.setFont(new Font("Times New Roman", Font.BOLD, 20));
            lblPeru.setBounds(129, 0, 160, 30);
            lblPeru.setHorizontalAlignment(SwingConstants.CENTER);

            card.add(lblPeru);

            JLabel lblNewLabel_11 = new JLabel("<html>Perú es un país que te llevará desde las alturas de los Andes hasta las profundidades de la selva amazónica, y te mostrará una historia rica y una cultura vibrante en cada paso del camino. ¡Ven a descubrir las maravillas de Perú en tu próximo viaje!</html>");
            lblNewLabel_11.setForeground(new Color(255,255, 255));
            lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 18));
            lblNewLabel_11.setBounds(0, 149, 393, 258);
            card.add(lblNewLabel_11);

            JButton btnNewButton_4 = new JButton("");
            btnNewButton_4.setIcon(new ImageIcon("proyecto pagina/bin/Imagenes/lima peru (1).jpg"));
            btnNewButton_4.setBounds(0, 27, 421, 147);
            card.add(btnNewButton_4);
        }
        else if (currentCardIndex == 7) {
            JLabel lblAustralia = new JLabel( "Australia");
            lblAustralia.setForeground(new Color(255, 255, 255));
            lblAustralia.setFont(new Font("Times New Roman", Font.BOLD, 20));
            lblAustralia.setBounds(129, 0, 160, 30);
            lblAustralia.setHorizontalAlignment(SwingConstants.CENTER);

            card.add(lblAustralia);

            JLabel lblNewLabel_11 = new JLabel("<html>Australia es un continente de contrastes que ofrece aventuras al aire libre, una rica diversidad cultural y una belleza natural impresionante. ¡Descubre la magia de Australia en tu próximo viaje!</html>");
            lblNewLabel_11.setForeground(new Color(255, 255, 255));
            lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 18));
            lblNewLabel_11.setBounds(0, 149, 393, 258);
            card.add(lblNewLabel_11);

            JButton btnNewButton_4 = new JButton("");
            btnNewButton_4.setIcon(new ImageIcon("proyecto pagina/bin/Imagenes/australia wo (1).jpg"));
            btnNewButton_4.setBounds(0, 27, 421, 147);
            card.add(btnNewButton_4);
        }
        else if (currentCardIndex == 8) {
            JLabel lblJapon = new JLabel("Japon");
            lblJapon.setForeground(new Color(255, 255,255));
            lblJapon.setFont(new Font("Times New Roman", Font.BOLD, 20));
            lblJapon.setBounds(129, 0, 160, 30);
            lblJapon.setHorizontalAlignment(SwingConstants.CENTER);

            card.add(lblJapon);

            JLabel lblNewLabel_11 = new JLabel("<html>Japón es una tierra de contrastes, donde la espiritualidad y la tecnología conviven en perfecta armonía. Un viaje a Japón te llevará a través de un mundo de maravillas culturales y naturales. ¡Descubre la fascinación de Japón en tu próximo viaje!</html>");
            lblNewLabel_11.setForeground(new Color(255, 255,255));
            lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 18));
            lblNewLabel_11.setBounds(0, 149, 393, 258);
            card.add(lblNewLabel_11);

            JButton btnNewButton_4 = new JButton("");
            btnNewButton_4.setIcon(new ImageIcon("proyecto pagina/bin/Imagenes/japonn (1).jpg"));
            btnNewButton_4.setBounds(0, 27, 421, 147);
            card.add(btnNewButton_4);
        }
        else if (currentCardIndex == 9) {
            JLabel lblInglaterra = new JLabel("Inglaterra");
            lblInglaterra.setForeground(new Color(255, 255, 255));
            lblInglaterra.setFont(new Font("Times New Roman", Font.BOLD, 20));
            lblInglaterra.setBounds(129, 0, 160, 30);
            lblInglaterra.setHorizontalAlignment(SwingConstants.CENTER);

            card.add(lblInglaterra);

            JLabel lblNewLabel_11 = new JLabel("<html>Inglaterra es una tierra de contrastes, donde lo antiguo y lo nuevo conviven en armonía. Un viaje a Inglaterra te llevará a través de una fascinante mezcla de cultura, historia y belleza natural. ¡Descubre el encanto de Inglaterra en tu próximo viaje!</html>");
            lblNewLabel_11.setForeground(new Color(255, 255, 255));
            lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 18));
            lblNewLabel_11.setBounds(0, 149, 393, 258);
            card.add(lblNewLabel_11);

            JButton btnNewButton_4 = new JButton("");
            btnNewButton_4.setIcon(new ImageIcon("proyecto pagina/bin/Imagenes/london (1).jpg"));
            btnNewButton_4.setBounds(0, 27, 421, 147);
            card.add(btnNewButton_4);
        }
        
        cardPanel.add(card);

        JButton prevButton = new JButton("Anterior");
        prevButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        prevButton.setBounds(32, 180, 163, 68);
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

    protected void setVisible(boolean b) {
        frame.setVisible(true);
    }
}
