package tn.esprit.pidev.repositories.forum;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.pidev.entities.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment,String> {
}
