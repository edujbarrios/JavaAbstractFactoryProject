package gui;

import interfaces.*;
import factories.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGUI extends JFrame {
    private JComboBox<String> factorySelector;
    private JCheckBox arma_checkbox, mascota_checkbox;
    private JButton finishButton;
    private JLabel PersonajeLabel, ArmaLabel, MascotaLabel, ProblemaLabel;

    public MainGUI() {
        super("Fabrica de Personajes");
        setSize(300, 110);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Selector de fábrica
        factorySelector = new JComboBox<>(new String[]{"Selecciona", "Héroes", "Villanos", "AntiHéroes"});
        add(factorySelector);

        // CheckBoxes para armas
        arma_checkbox = new JCheckBox("Arma");
        add(arma_checkbox);
        arma_checkbox.setVisible(true);

        // CheckBoxes para mascotas
        mascota_checkbox = new JCheckBox("Mascota");
        add(mascota_checkbox);
        mascota_checkbox.setVisible(true);

        // Botón para terminar
        finishButton = new JButton("Terminar");
        finishButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (PersonajeLabel != null) {
                    PersonajeLabel.setIcon(null);
                }
                if (ArmaLabel != null) {
                    ArmaLabel.setIcon(null);
                }
                if (MascotaLabel != null) {
                    MascotaLabel.setIcon(null);
                }

                String factoryType = (String) factorySelector.getSelectedItem();
                PersonajeFactory factory = null;

                if (factoryType == "Héroes") {
                    factory = new FabricaHeroes();
                } else if (factoryType == "Villanos") {
                    factory = new FabricaVillanos();
                } else if (factoryType == "AntiHéroes") {
                    factory = new FabricaAntiHeroes();
                }

                if (factory != null) {
                    Personaje personaje = factory.crearPersonaje();
                    Arma arma = factory.crearArma();
                    Mascota mascota = factory.crearMascota();

                    ImageIcon PersonajeIcon = personaje.atacar();
                    PersonajeLabel = new JLabel(PersonajeIcon);
                    add(PersonajeLabel);

                    if (arma_checkbox.isSelected()) {
                        ImageIcon ArmaIcon = arma.usar();
                        ArmaLabel = new JLabel(ArmaIcon);
                        add(ArmaLabel);
                    }

                    if (mascota_checkbox.isSelected()) {
                        ImageIcon MascotaIcon = mascota.acompanar();
                        MascotaLabel = new JLabel(MascotaIcon);
                        add(MascotaLabel);
                    }

                    /**
                     * Reajuste de ventana para mostrar correctamente las imagenes y el texto de la interfaz
                     */
                    pack();
                    setLocationRelativeTo(null);
                }
            }
        });
        add(finishButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainGUI();
    }
}
