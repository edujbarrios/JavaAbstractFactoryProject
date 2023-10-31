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
    private JLabel resultLabel, imgLabel;

    public MainGUI() {
        super("Fabrica de Personajes");
        setSize(2000, 2000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Selector de fábrica
        factorySelector = new JComboBox<>(new String[]{"Selecciona", "Héroes", "Villanos", "AntiHéroes"});
        factorySelector.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    updateOptions((String) e.getItem());
                }
            }
        });
        add(factorySelector);

        // CheckBoxes para armas
        arma_checkbox = new JCheckBox("Arma");
        add(arma_checkbox);

        // CheckBoxes para mascotas
        mascota_checkbox = new JCheckBox("Mascota");
        add(mascota_checkbox);

        // Botón para terminar
        finishButton = new JButton("Terminar");
        finishButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String factoryType = (String) factorySelector.getSelectedItem();
                PersonajeFactory factory = new FabricaHeroes();

                if (factoryType.toLowerCase() == "heroe") {
                    factory = new FabricaHeroes();
                } else if (factoryType.toLowerCase() == "villano") {
                    factory = new FabricaVillanos();
                } else if (factoryType.toLowerCase() == "antiheroe") {
                    factory = new FabricaAntiHeroes();
                }

                Personaje personaje = factory.crearPersonaje();
                Arma arma = factory.crearArma();
                Mascota mascota = factory.crearMascota();

                ImageIcon icon = personaje.atacar();
                imgLabel = new JLabel(icon);
                add(imgLabel);

                if (arma_checkbox.isSelected()) arma.usar();
                if (mascota_checkbox.isSelected()) mascota.acompanar();
            }
        });
        add(finishButton);

        // Etiqueta para mostrar el resultado
        resultLabel = new JLabel("Selecciona una fábrica y las opciones para crear tu personaje.");
        add(resultLabel);

        setVisible(true);
    }

    private void updateOptions(String factoryType) {
        arma_checkbox.setVisible(true);
        mascota_checkbox.setVisible(true);
    }

    public static void main(String[] args) {
        new MainGUI();
    }
}
