package com.atoudeft.vue;

import javax.swing.*;

public class PanneauOperationBancaire extends JPanel {

    private static final long serialVersionUID = 1L;
    private JLabel lblOpérationBancaire;
    private JLabel lblMonant;
    private JTextField textFMontant;
    private JLabel lblNBFacture;
    private JTextField textFieldFacture;
    private JLabel lblDescFacture;
    private JTextField textFieldDescription;
    private JLabel lblNumCompte;
    private JTextField textFieldNumCompte;
    private JButton btnEffectuerOperation;

    /**
     * Create the panel.
     */
    public PanneauOperationBancaire() {
        setLayout(null);

        lblMonant = new JLabel("Montant:");
        lblMonant.setFont(UIManager.getFont("Label.font"));
        lblMonant.setBounds(30, 35, 51, 17);
        add(lblMonant);

        textFMontant = new JTextField();
        textFMontant.setBounds(113, 33, 94, 20);
        add(textFMontant);
        textFMontant.setColumns(10);

        lblNBFacture = new JLabel("# Facture:");
        lblNBFacture.setFont(UIManager.getFont("Label.font"));
        lblNBFacture.setBounds(30, 63, 67, 17);
        add(lblNBFacture);

        textFieldFacture = new JTextField();
        textFieldFacture.setBounds(113, 64, 94, 20);
        add(textFieldFacture);
        textFieldFacture.setColumns(10);

        lblDescFacture = new JLabel("Description:");
        lblDescFacture.setFont(UIManager.getFont("Label.font"));
        lblDescFacture.setBounds(30, 91, 67, 17);
        add(lblDescFacture);

        textFieldDescription = new JTextField();
        textFieldDescription.setBounds(113, 95, 144, 20);
        add(textFieldDescription);
        textFieldDescription.setColumns(10);

        lblNumCompte = new JLabel("#Compte destinataire:");
        lblNumCompte.setFont(UIManager.getFont("Label.font"));
        lblNumCompte.setBounds(30, 126, 123, 17);
        add(lblNumCompte);

        textFieldNumCompte = new JTextField();
        textFieldNumCompte.setBounds(163, 126, 94, 20);
        add(textFieldNumCompte);
        textFieldNumCompte.setColumns(10);

        lblOpérationBancaire = new JLabel("Opération Bancaire:");
        lblOpérationBancaire.setFont(UIManager.getFont("Menu.font"));
        lblOpérationBancaire.setBounds(105, 11, 182, 17);
        add(lblOpérationBancaire);

        //btnEffectuerOperation = new JButton("Effectuer opération");
        //btnEffectuerOperation.setBounds(88, 167, 156, 23);
        //add(btnEffectuerOperation);

    }

    public void setModeDepot() {
        lblOpérationBancaire.setText("Depot:");
        lblNBFacture.setVisible(false);
        textFieldFacture.setVisible(false);
        lblDescFacture.setVisible(false);
        textFieldDescription.setVisible(false);
        lblNumCompte.setVisible(false);
        textFieldNumCompte.setVisible(false);
    }

    public void setModeRetrait() {
        lblOpérationBancaire.setText("Retrait:");
        lblNBFacture.setVisible(false);
        textFieldFacture.setVisible(false);
        lblDescFacture.setVisible(false);
        textFieldDescription.setVisible(false);
        lblNumCompte.setVisible(false);
        textFieldNumCompte.setVisible(false);
    }

    public void setModeFacture() {
        lblOpérationBancaire.setText("Payement de facture:");
    }

    public void setModeTransfert() {
        lblOpérationBancaire.setText("Transfert:");
    }

    public void setModeDefault() {
        lblOpérationBancaire.setText("Opération Bancaire:");
        lblNBFacture.setVisible(true);
        textFieldFacture.setVisible(true);
        lblDescFacture.setVisible(true);
        textFieldDescription.setVisible(true);
        lblNumCompte.setVisible(true);
        textFieldNumCompte.setVisible(true);
    }

    public String getNumFacture() {
        return textFieldFacture.getText();
    }
    public String getMontant() {
        return textFMontant.getText();
    }
    public String getDescFacture() {
        return textFieldDescription.getText();
    }

    public String getNumCompte() {
        return textFieldNumCompte.getText();
    }
}


