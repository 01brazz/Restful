/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marconivr.testjersey.webservice;

import com.marconivr.testjersey.dao.PostDao;
import com.marconivr.testjersey.domain.Post;
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
@Path("/posts")
public class PostDataService {

    PostDao postDao = new PostDao();

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Post> getPost() {
        List<Post> post = new ArrayList<Post>();
        post.addAll(postDao.getPost());
        return post;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Post getPost(@PathParam("id") String postId) {
        Post p = postDao.getPost(Integer.parseInt(postId));
        return p;
    }

    /*
	 * Questo metodo consente il salvataggio di nuovi record
	 * a fronte di una chiamata POST 
     */
    @POST
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_JSON)
    public void newPost(Post p)
            throws IOException {
        Post post = new Post(p.getId(), p.getTitolo(), p.getAutore(), p.getContenuto(), p.getDataOra());
        postDao.insertPost(post);
        // Qui si può eseguire il caricamento su database...
    }
}
