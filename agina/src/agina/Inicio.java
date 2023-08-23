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

public class inicio {
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

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    inicio window = new inicio();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public inicio() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(240, 240, 240));
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
        		inicio newframe = new inicio();
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
        		this.dipose();
        		
        		
        	}

			private void dipose() {
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

        btnNewButton_2 = new JButton("reseñas");
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
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(370, 105, 145, 35);
        frame.getContentPane().add(lblNewLabel_1);
        
        lblNewLabel_2 = new JLabel("<html>En Travel Discover, no solo creamos reseñas; creamos conexiones entre los viajeros y los lugares que desean explorar. Nuestra misión es llevar a los viajeros más allá de las postales y las descripciones superficiales, sumergiéndolos en la autenticidad de cada lugar. Ya sea que estés planeando unas vacaciones en familia, una escapada romántica o una aventura en solitario, nuestras reseñas están diseñadas para inspirar y brindarte una visión realista de lo que te espera.</html>");
        lblNewLabel_2.setToolTipText("");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNewLabel_2.setBounds(10, 127, 885, 145);
        frame.getContentPane().add(lblNewLabel_2);
        
        
        
        lblNewLabel_3 = new JLabel("Destinos");
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setBounds(370, 241, 145, 30);
        frame.getContentPane().add(lblNewLabel_3);
        
        button = new JButton("");
        button.setIcon(new ImageIcon("E:\\5\u00B02\\LPOO\\proyecto pagina\\Imagenes\\francia (1).jpg"));
        button.setBounds(10, 301, 157, 81);
        frame.getContentPane().add(button);
        button.setActionCommand("");
        button.setBackground(new Color(255, 255, 255));
        button.setBorder(null);
        button.setFont(new Font("Arial", Font.BOLD, 30));
        
        button_1 = new JButton("");
        button_1.setIcon(new ImageIcon("E:\\5\u00B02\\LPOO\\proyecto pagina\\Imagenes\\egipto (1).jpg"));
        button_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        button_1.setBounds(190, 301, 157, 81);
        frame.getContentPane().add(button_1);
        button_1.setActionCommand("");
        button_1.setBackground(new Color(255, 255, 255));
        button_1.setBorder(null);
        button_1.setFont(new Font("Arial", Font.BOLD, 30));
        
        button_2 = new JButton("");
        button_2.setIcon(new ImageIcon("E:\\5\u00B02\\LPOO\\proyecto pagina\\Imagenes\\Italia (1).jpg"));
        button_2.setBounds(370, 301, 157, 81);
        frame.getContentPane().add(button_2);
        button_2.setActionCommand("");
        button_2.setBackground(new Color(255, 255, 255));
        button_2.setBorder(null);
        button_2.setFont(new Font("Arial", Font.BOLD, 30));
        
        button_3 = new JButton("");
        button_3.setIcon(new ImageIcon("E:\\5\u00B02\\LPOO\\proyecto pagina\\Imagenes\\brasil (1).jpg"));
        button_3.setBounds(543, 301, 157, 81);
        frame.getContentPane().add(button_3);
        button_3.setActionCommand("");
        button_3.setBackground(new Color(255, 255, 255));
        button_3.setBorder(null);
        button_3.setFont(new Font("Arial", Font.BOLD, 30));
        
        button_4 = new JButton("");
        button_4.setIcon(new ImageIcon("E:\\5\u00B02\\LPOO\\proyecto pagina\\Imagenes\\espania (3).jpg"));
        button_4.setBounds(720, 301, 171, 81);
        frame.getContentPane().add(button_4);
        button_4.setActionCommand("");
        button_4.setBackground(new Color(255, 255, 255));
        button_4.setBorder(null);
        button_4.setFont(new Font("Arial", Font.BOLD, 30));
        
        lblNewLabel_10 = new JLabel("<html>Paris, la ciudad de la luz. Iconicos, arte en cada esquina y romance en el aire. Descubre la torre Eiffel, pasea por las historicas calles adoquinadas llenas de encanto e historia.</html>");
        lblNewLabel_10.setForeground(new Color(255, 255, 255));
        lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_10.setBounds(10, 382, 157, 120);
        frame.getContentPane().add(lblNewLabel_10);
        
        lblNewLabel_11 = new JLabel("<html>Sus civilizaciones milenarias, sus majestuosas piramides. Sumergete en el bullicio del zoco, navega por el Rio Nilo, y muchas cosas mas!.</html>");
        lblNewLabel_11.setForeground(new Color(255, 255, 255));
        lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_11.setBounds(190, 382, 157, 120);
        frame.getContentPane().add(lblNewLabel_11);
        
        lblNewLabel_12 = new JLabel("<html>Italia es un pais lleno de monumentos increibles, entre ellos estan el Coliseo Romano, el Vaticano como epicentro espiritual, la Fontana di Trevi y la maravillosa Venezia.</html>");
        lblNewLabel_12.setForeground(new Color(255, 255, 255));
        lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_12.setBounds(370, 382, 157, 120);
        frame.getContentPane().add(lblNewLabel_12);
        
        lblNewLabel_13 = new JLabel("<html>Rio de Janeiro, donde la playa y la samba se entrelazan. El Cristo Redentor vigila desde arriba mientras la alegria carioca llena las calles. Disfruta de sus playas, el carnaval y las vistas panoramicas.</html>");
        lblNewLabel_13.setForeground(new Color(255, 255, 255));
        lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_13.setBounds(543, 382, 157, 120);
        frame.getContentPane().add(lblNewLabel_13);
        
        lblNewLabel_14 = new JLabel("<html>Espania es una fusion de arte y arquitectura. Entre ellos Barcelona con las obras de Gaudi, que en entrelaza con la playa y la cultura catalana. La Sagrada Familia, Las Ramblas y su cultura culinaria.</html>");
        lblNewLabel_14.setForeground(new Color(255, 255, 255));
        lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_14.setBounds(720, 382, 171, 120);
        frame.getContentPane().add(lblNewLabel_14);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 62, 134));
        panel.setBounds(10, 272, 157, 230);
        frame.getContentPane().add(panel);
        
        lblNewLabel_5 = new JLabel("France/Francia");
        lblNewLabel_5.setForeground(new Color(236, 25, 32));
        panel.add(lblNewLabel_5);
        lblNewLabel_5.setFont(new Font("Perpetua", Font.BOLD, 18));
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel_1 = new JPanel();
        panel_1.setBackground(new Color(7, 78, 153));
        panel_1.setBounds(190, 272, 157, 230);
        frame.getContentPane().add(panel_1);
        
        lblNewLabel_6 = new JLabel("Egypt/Egipto");
        lblNewLabel_6.setForeground(new Color(236, 25, 32));
        panel_1.add(lblNewLabel_6);
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        panel_2 = new JPanel();
        panel_2.setBackground(new Color(15, 94, 171));
        panel_2.setBounds(370, 272, 157, 230);
        frame.getContentPane().add(panel_2);
        
        lblNewLabel_7 = new JLabel("Italy/Italia");
        lblNewLabel_7.setForeground(new Color(63, 179, 38));
        panel_2.add(lblNewLabel_7);
        lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        panel_3 = new JPanel();
        panel_3.setBackground(new Color(21, 110, 190));
        panel_3.setBounds(543, 272, 157, 230);
        frame.getContentPane().add(panel_3);
        
        lblNewLabel_8 = new JLabel("Brazil/Brasil");
        lblNewLabel_8.setForeground(new Color(63, 179, 38));
        panel_3.add(lblNewLabel_8);
        lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_8.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        panel_4 = new JPanel();
        panel_4.setBackground(new Color(28, 126, 208));
        panel_4.setBounds(720, 272, 171, 230);
        frame.getContentPane().add(panel_4);
        
        lblNewLabel_9 = new JLabel("Spain/Espania");
        lblNewLabel_9.setForeground(new Color(243, 148, 19));
        panel_4.add(lblNewLabel_9);
        lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_9.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        button_5 = new JButton("");
        button_5.setIcon(new ImageIcon("E:\\5\u00B02\\LPOO\\proyecto pagina\\Imagenes\\grecia.jpg"));
        button_5.setFont(new Font("Arial", Font.BOLD, 30));
        button_5.setBorder(null);
        button_5.setBackground(Color.WHITE);
        button_5.setActionCommand("");
        button_5.setBounds(10, 549, 157, 81);
        frame.getContentPane().add(button_5);
        
        JLabel lblNewLabel_10_1 = new JLabel("<html>Sumérgete en la magia de Grecia: templos ancestrales, playas paradisíacas y la huella de los dioses te esperan. Explora su historia, disfruta de la belleza de las islas y déjate cautivar por su cultura legendaria.</html>");
        lblNewLabel_10_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_10_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_10_1.setBounds(10, 632, 157, 120);
        frame.getContentPane().add(lblNewLabel_10_1);
        
        JButton button_1_1 = new JButton("");
        button_1_1.setIcon(new ImageIcon("E:\\5\u00B02\\LPOO\\proyecto pagina\\Imagenes\\inglaterra.jpg"));
        button_1_1.setFont(new Font("Arial", Font.BOLD, 30));
        button_1_1.setBorder(null);
        button_1_1.setBackground(Color.WHITE);
        button_1_1.setActionCommand("");
        button_1_1.setBounds(190, 549, 157, 81);
        frame.getContentPane().add(button_1_1);
        
        JLabel lblNewLabel_11_1 = new JLabel("<html>Sus civilizaciones milenarias, sus majestuosas piramides. Sumergete en el bullicio del zoco, navega por el Rio Nilo, y muchas cosas mas!.</html>");
        lblNewLabel_11_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_11_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_11_1.setBounds(190, 632, 157, 120);
        frame.getContentPane().add(lblNewLabel_11_1);
        
        JButton button_2_1 = new JButton("");
        button_2_1.setIcon(new ImageIcon("E:\\5\u00B02\\LPOO\\proyecto pagina\\Imagenes\\peru.jpg"));
        button_2_1.setFont(new Font("Arial", Font.BOLD, 30));
        button_2_1.setBorder(null);
        button_2_1.setBackground(Color.WHITE);
        button_2_1.setActionCommand("");
        button_2_1.setBounds(370, 549, 157, 81);
        frame.getContentPane().add(button_2_1);
        
        JLabel lblNewLabel_12_1 = new JLabel("<html>Italia es un pais lleno de monumentos increibles, entre ellos estan el Coliseo Romano, el Vaticano como epicentro espiritual, la Fontana di Trevi y la maravillosa Venezia.</html>");
        lblNewLabel_12_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_12_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_12_1.setBounds(370, 632, 157, 120);
        frame.getContentPane().add(lblNewLabel_12_1);
        
        JButton button_3_1 = new JButton("");
        button_3_1.setIcon(new ImageIcon("E:\\5\u00B02\\LPOO\\proyecto pagina\\Imagenes\\australia.jpg"));
        button_3_1.setFont(new Font("Arial", Font.BOLD, 30));
        button_3_1.setBorder(null);
        button_3_1.setBackground(Color.WHITE);
        button_3_1.setActionCommand("");
        button_3_1.setBounds(543, 549, 157, 81);
        frame.getContentPane().add(button_3_1);
        
        JLabel lblNewLabel_13_1 = new JLabel("<html>Rio de Janeiro, donde la playa y la samba se entrelazan. El Cristo Redentor vigila desde arriba mientras la alegria carioca llena las calles. Disfruta de sus playas, el carnaval y las vistas panoramicas.</html>");
        lblNewLabel_13_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_13_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_13_1.setBounds(543, 632, 157, 120);
        frame.getContentPane().add(lblNewLabel_13_1);
        
        JButton button_4_1 = new JButton("");
        button_4_1.setIcon(new ImageIcon("E:\\5\u00B02\\LPOO\\proyecto pagina\\Imagenes\\japon.jpg"));
        button_4_1.setFont(new Font("Arial", Font.BOLD, 30));
        button_4_1.setBorder(null);
        button_4_1.setBackground(Color.WHITE);
        button_4_1.setActionCommand("");
        button_4_1.setBounds(718, 549, 173, 81);
        frame.getContentPane().add(button_4_1);
        
        JLabel lblNewLabel_14_1 = new JLabel("<html>Espania es una fusion de arte y arquitectura. Entre ellos Barcelona con las obras de Gaudi, que en entrelaza con la playa y la cultura catalana. La Sagrada Familia, Las Ramblas y su cultura culinaria.</html>");
        lblNewLabel_14_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_14_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblNewLabel_14_1.setBounds(720, 632, 171, 120);
        frame.getContentPane().add(lblNewLabel_14_1);
        
        JPanel panel_5 = new JPanel();
        panel_5.setBackground(new Color(0, 62, 134));
        panel_5.setBounds(10, 522, 157, 230);
        frame.getContentPane().add(panel_5);
        
        JLabel lblNewLabel_5_1 = new JLabel("Greece/Grecia");
        lblNewLabel_5_1.setForeground(new Color(255, 255, 255));
        panel_5.add(lblNewLabel_5_1);
        lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5_1.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        JPanel panel_6 = new JPanel();
        panel_6.setBackground(new Color(7, 78, 153));
        panel_6.setBounds(190, 522, 157, 230);
        frame.getContentPane().add(panel_6);
        
        JLabel lblNewLabel_6_1 = new JLabel("England/Inglaterra");
        lblNewLabel_6_1.setForeground(new Color(236, 25, 32));
        panel_6.add(lblNewLabel_6_1);
        lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_6_1.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        JPanel panel_7 = new JPanel();
        panel_7.setBackground(new Color(15, 94, 171));
        panel_7.setBounds(370, 522, 157, 230);
        frame.getContentPane().add(panel_7);
        
        JLabel lblNewLabel_7_1 = new JLabel("Peru");
        lblNewLabel_7_1.setForeground(new Color(236, 25, 32));
        panel_7.add(lblNewLabel_7_1);
        lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_1.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        JPanel panel_8 = new JPanel();
        panel_8.setBackground(new Color(21, 110, 190));
        panel_8.setBounds(543, 522, 157, 230);
        frame.getContentPane().add(panel_8);
        
        JLabel lblNewLabel_7_2 = new JLabel("Australia");
        lblNewLabel_7_2.setForeground(new Color(231, 217, 12));
        panel_8.add(lblNewLabel_7_2);
        lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_2.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        JPanel panel_9 = new JPanel();
        panel_9.setBackground(new Color(28, 126, 208));
        panel_9.setBounds(718, 522, 173, 230);
        frame.getContentPane().add(panel_9);
        
        JLabel lblNewLabel_7_3 = new JLabel("Japan/Japon");
        lblNewLabel_7_3.setForeground(new Color(236, 25, 32));
        panel_9.add(lblNewLabel_7_3);
        lblNewLabel_7_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_7_3.setFont(new Font("Perpetua", Font.BOLD, 18));
        
        JPanel panel_10 = new JPanel();
        panel_10.setBackground(new Color(109, 119, 146));
        panel_10.setForeground(new Color(109, 119, 146));
        panel_10.setBounds(-4, 0, 919, 81);
        frame.getContentPane().add(panel_10);
        panel_10.setLayout(null);
        
        btnNewButton_4 = new JButton();
        btnNewButton_4.setBounds(803, 11, 89, 58);
        panel_10.add(btnNewButton_4);
        btnNewButton_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_4.setForeground(new Color(255, 255, 255));
        btnNewButton_4.setActionCommand("");
        btnNewButton_4.setIcon(new ImageIcon("E:\\5\u00B02\\LPOO\\proyecto pagina\\Imagenes\\registrarse (1).jpg"));
        btnNewButton_4.setBackground(new Color(109, 119, 146));
        btnNewButton_4.setBorder(null);
        btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 30));
        
    }

	protected void setVisible(boolean b) {
		frame.setVisible(true);		
	}
}
