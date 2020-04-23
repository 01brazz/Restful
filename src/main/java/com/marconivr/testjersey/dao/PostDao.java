/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marconivr.testjersey.dao;

import com.marconivr.testjersey.domain.Post;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author david
 */
public class PostDao {

    private static final List<Post> posts = new ArrayList<Post>();

    public PostDao() {
        if (posts.isEmpty()) {
            this.addPost();
        }
    }

    private List<Post> addPost() {
        Post post = new Post(1, "Serata", "David", "Ieri e' stata una bella serata", "01/01/2020");
        posts.add(post);

        post = new Post(2, "Londra", "Luca", "Partiti per le vacanze", "06/10/2019");
        posts.add(post);

        post = new Post(3, "Torta", "Giovanni", "Oggi ho fatto una torta", "15/09/2019");
        posts.add(post);

        return posts;
    }

    public Post getPost(int id) {
        return posts.get(id - 1);
    }

    public List<Post> getPost() {
        return posts;
    }

    public void insertPost(Post p) {
        posts.add(p);
    }
}
