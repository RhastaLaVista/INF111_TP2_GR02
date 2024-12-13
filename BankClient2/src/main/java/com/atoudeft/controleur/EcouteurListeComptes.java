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

        if(source instanceof JList) {
            ((JList<?>) source).getSelectedIndex();


            if (evt.getClickCount() == 2 && !evt.isConsumed()) {
                evt.consume();//Gestion de Click double

                int type = ((JList<?>) source).getSelectedIndex();//cheque = 0 car Il est le premier.
                                                                  //epargne = 2 car il vient toujours le deuxieme et seulement une seule peut etre cree.
                switch (type){
                    case 0:
                        this.client.envoyer("SELECT cheque");
                        break;
                    case 1:
                        this.client.envoyer("SELECT epargne");
                        break;

                }
            }
        }
    }
}