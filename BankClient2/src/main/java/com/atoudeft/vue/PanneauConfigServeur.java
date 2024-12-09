package com.atoudeft.vue;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Abdelmoumène Toudeft (Abdelmoumene.Toudeft@etsmtl.ca)
 * @version 1.0
 * @since 2023-11-01
 */
public class PanneauConfigServeur extends JPanel {
    private JTextField txtAdrServeur, txtNumPort;

    public PanneauConfigServeur(String adr, int port) {
        //à compléter
        //Azouaou

        // Ajouter des marges (10px)
        setLayout(new BorderLayout(10, 10));

        //Panel principal
        JPanel PanneauConfigServeur = new JPanel(new BorderLayout(10, 10));
        PanneauConfigServeur.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Panneau des champs
        JPanel panneauChamps = new JPanel(new GridLayout(2, 2, 5, 5));


        // Ajout des champs
        panneauChamps.add(new JLabel("Adresse IP :"));
        txtAdrServeur = new JTextField(adr);
        panneauChamps.add(txtAdrServeur);
        panneauChamps.add(new JLabel("Port :"));
        txtNumPort = new JTextField(String.valueOf(port));
        panneauChamps.add(txtNumPort);



        // Panneau des boutons
        JPanel panneauBoutons = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton okButton = new JButton("OK");
        JButton annulerButton = new JButton("Annuler");
        panneauBoutons.add(okButton);
        panneauBoutons.add(annulerButton);


        // Bouton d'aide à gauche
        JButton helpButton = new JButton("?");
        helpButton.setMargin(new Insets(5, 10, 5, 10));
        panneauBoutons.add(helpButton);
        helpButton.setFocusPainted(false);

        PanneauConfigServeur.add(helpButton, BorderLayout.WEST);
        PanneauConfigServeur.add(panneauChamps, BorderLayout.CENTER);
        PanneauConfigServeur.add(panneauBoutons, BorderLayout.SOUTH);










        JFrame fenetre = new JFrame("Configuration serveur");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(300, 180);
        // Centrer la fenêtre par rapport à l'application principale
        fenetre.setLocationRelativeTo(this);


        // Ajouter le panneau à la fenêtre
        fenetre.add(PanneauConfigServeur);

        // Rendre la fenêtre visible
        fenetre.setVisible(true);


    }
    public String getAdresseServeur() {
        return txtAdrServeur.getText();
    }
    public String getPortServeur() {
        return txtNumPort.getText();
    }
}
