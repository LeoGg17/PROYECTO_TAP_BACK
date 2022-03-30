package com.proyecto.ProyectoTAP.repository;

import com.proyecto.ProyectoTAP.model.Post;
import com.proyecto.ProyectoTAP.model.User;
import com.proyecto.ProyectoTAP.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
