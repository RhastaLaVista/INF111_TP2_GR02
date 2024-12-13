package com.atoudeft.controleur;

import com.atoudeft.client.Client;
import com.atoudeft.vue.PanneauOperationsCompte;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Abdelmoumène Toudeft (Abdelmoumene.Toudeft@etsmtl.ca)
 * @version 1.0
 * @since 2023-11-01
 */
public class EcouteurListeComptes extends MouseAdapter {

    private Client client;


    public EcouteurListeComptes(Client client) {
        this.client = client;
    }

    @Override
    public void mouseClicked(MouseEvent evt) {
        Object source = evt.getSource();

        String action;

        if (source instanceof JMenuItem) {

            if (evt.getClickCount() == 1 && !evt.isConsumed()) {
                evt.consume();//Gestion de Click double
                System.out.println(source.toString());
                action = ((JMenuItem) source).getActionCommand();
                System.out.println(action);
                client.envoyer("SELECT "+ action);




            }
        }
    }
}