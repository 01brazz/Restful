/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marconivr.testjersey.domain;

import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author david
 */
@XmlRootElement
@XmlType(propOrder = {"id", "autore", "contenuto", "dataOra"})
public class Commento {

    private int id;

    private String autore;

    private String contenuto;

    private String dataOra;

    public Commento() {
    }

    public Commento(Integer id, String autore, String contenuto, String dataOra) {
        this.id = id;
        this.autore = autore;
        this.contenuto = contenuto;
        this.dataOra = dataOra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public String getDataOra() {
        return dataOra;
    }

    public void setDataOra(String dataOra) {
        this.dataOra = dataOra;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.autore);
        hash = 71 * hash + Objects.hashCode(this.contenuto);
        return hash;
    }

    @Override
    public String toString() {
        return "Commento{" + "id = " + id + '}';
    }
}
