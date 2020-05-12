/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marconivr.testjersey.dao;

import com.marconivr.testjersey.domain.Commento;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author david
 */
public class CommentoDao {

    private static List<Commento> commenti = new ArrayList<Commento>();

    public CommentoDao() {
        commenti = this.addCommento();
    }

    private List<Commento> addCommento() {
        List<Commento> lista = new ArrayList<Commento>();
        Commento commento = new Commento(1, "David", "Fantastico!", "01/01/2020");
        lista.add(commento);

        commento = new Commento(2, "Luca", "Vorrei essercianche io", "06/10/2019");
        lista.add(commento);

        commento = new Commento(3, "Giovanni", "Hahaha", "15/09/2019");
        lista.add(commento);

        return lista;
    }

    public Commento getCommento(int id) {
        return commenti.get(id - 1);
    }

    public List<Commento> getCommento() {
        return commenti;
    }

    public void insertCommento(Commento c) {
        commenti.add(c);
    }
}
