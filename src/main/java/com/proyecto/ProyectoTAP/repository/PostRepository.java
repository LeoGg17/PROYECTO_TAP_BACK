package com.proyecto.ProyectoTAP.repository;

import com.proyecto.ProyectoTAP.model.Post;
import com.proyecto.ProyectoTAP.model.Subreddit;
import com.proyecto.ProyectoTAP.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
