/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marconivr.testjersey.webservice;

import com.marconivr.testjersey.dao.CommentoDao;
import com.marconivr.testjersey.domain.Commento;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author david
 */
/**
 *
 */
@Path("/commenti")
public class CommentoDataService {

    CommentoDao commentoDao = new CommentoDao();

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Commento> getCommento() {
        List<Commento> commento = new ArrayList<Commento>();
        commento.addAll(commentoDao.getCommento());
        return commento;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Commento getCommento(@PathParam("id") String commentoId) {
        Commento c = commentoDao.getCommento(Integer.parseInt(commentoId));
        return c;
    }

    /*
	 * Questo metodo consente il salvataggio di nuovi record
	 * a fronte di una chiamata POST 
     */
    @POST
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_JSON)
    public void newCommento(Commento c)
            throws IOException {
        Commento commento = new Commento(c.getId(), c.getAutore(), c.getContenuto(), c.getDataOra());
        commentoDao.insertCommento(commento);
        // Qui si può eseguire il caricamento su database...
    }
}
