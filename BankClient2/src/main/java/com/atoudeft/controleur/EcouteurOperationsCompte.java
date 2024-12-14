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
        this.panneau.setModeDefault();
        this.panneau.setListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        String nomAction;
        int currentmode = panneau.getmode();
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
                    panneau.setModeDepot();
                    panneau.resetvalues();
                    break;
                case "RETRAIT":
                    panneau.setModeRetrait();
                    panneau.resetvalues();
                    break;
                case "FACTURE":
                    panneau.setModeFacture();
                    panneau.resetvalues();
                    break;
                case "TRANSFER":
                    panneau.setModeTransfert();
                    panneau.resetvalues();
                    break;
                case"EFFECTUER":
                    switch(currentmode) {
                        case 0:
                            client.envoyer("DEPOT " + panneau.getMontant());
                            System.out.println("Depoed lmao");
                            panneau.resetvalues();
                            break;
                        case 1:
                            client.envoyer("RETRAIT " + panneau.getMontant());
                            panneau.resetvalues();
                            break;
                        case 2:
                            client.envoyer("TRANSFER " + panneau.getMontant() + " " + panneau.getNumCompte());
                            panneau.resetvalues();
                            break;
                        case 3:
                            client.envoyer("FACTURE " + panneau.getMontant() + " " + panneau.getNumFacture() + " " + panneau.getDescFacture());
                            panneau.resetvalues();
                            break;
                    }
            }
        }
    }
}