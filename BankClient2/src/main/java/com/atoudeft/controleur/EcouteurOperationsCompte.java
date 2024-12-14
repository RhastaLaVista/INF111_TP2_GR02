package com.atoudeft.controleur;

import com.atoudeft.client.Client;
import com.atoudeft.vue.PanneauOperationBancaire;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurOperationsCompte implements ActionListener {
    private Client client;
    private PanneauOperationBancaire panneau;

    public EcouteurOperationsCompte(Client client, PanneauOperationBancaire panneauOperationBancaire) {
        this.client = client;
        this.panneau = panneauOperationBancaire;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        String nomAction;
        if (source instanceof JButton) {
            nomAction = ((JButton) source).getActionCommand();
            switch (nomAction) {
                case "EPARGNE":
                    client.envoyer(nomAction);
                    break;
                case "HIST":
                    client.envoyer(nomAction);
                    break;
                case "DEPOT":
                    client.envoyer("DEPOT "+ panneau.getMontant());
                    break;
                case "RETRAIT":
                    client.envoyer("RETRAIT "+ panneau.getMontant());
                    break;
                case "FACTURE":
                    client.envoyer("FACTURE "+ panneau.getMontant() + " "+ panneau.getNumFacture() + " "+ panneau.getDescFacture());
                    break;
                case "TRANSFER":
                    client.envoyer("TRANSFER " + panneau.getMontant() + " " + panneau.getNumCompte());
                    break;
                case "HIST":
                    client.envoyer("HIST");
                    break;
            }


        }
    }
}