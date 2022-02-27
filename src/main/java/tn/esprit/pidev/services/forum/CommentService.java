package tn.esprit.pidev.services.forum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import tn.esprit.pidev.entities.Comment;
import tn.esprit.pidev.repositories.forum.CommentRepository;

import java.io.IOException;

@Service
public class CommentService implements ICommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public void saveMultiPartComment(MultipartFile file) {
        Comment c = new Comment();
        System.out.println("file is " + file.getContentType());
        try {
            c.setCommentContentType(file.getContentType());
            c.setCommentContent(file.getBytes());
            commentRepository.save(c);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public Comment retrieveCommentById(String commentId) {
        Comment retrievedComment = commentRepository.findById(commentId).orElse(null);
        return retrievedComment;
    }

    @Override
    public void removeCommentById(String commentId) {
        commentRepository.deleteById(commentId);
    }

    @Override
    public Comment updateComment(String commentId, Comment comment) {
        Comment retrievedComment = retrieveCommentById(commentId);
        retrievedComment.setCommentContentType(comment.getCommentContentType());
        retrievedComment.setCommentContent(comment.getCommentContent());
        return commentRepository.save(retrievedComment);
    }
}
