package tn.esprit.pidev.services.forum;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import tn.esprit.pidev.entities.Comment;

@Service
public interface ICommentService {


    void saveMultiPartComment(MultipartFile file);
    Comment retrieveCommentById(String commentId);
    void removeCommentById(String commentId);
    Comment updateComment(String commentId,Comment comment);


}
