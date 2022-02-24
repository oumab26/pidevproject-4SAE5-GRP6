package tn.esprit.pidev.controllers.forum;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tn.esprit.pidev.entities.Comment;
import tn.esprit.pidev.repositories.forum.CommentRepository;
import tn.esprit.pidev.services.forum.ICommentService;

import java.io.IOException;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
public class CommentController {

    @Autowired
    private ICommentService commentService;

    @Autowired
    private CommentRepository commentRepository;

    @RequestMapping(value = "/addComment" ,method = RequestMethod.POST )
    public void addMultiPartComment(@RequestParam("file") MultipartFile file){
        commentService.saveMultiPartComment(file);
    }

    @GetMapping(path = { "/getComment/{commentId}" })
    public Comment getVideoByName(@PathVariable("commentId") String commentId){
        Comment retrievedComment = commentService.retrieveCommentById(commentId);
        //return ResponseEntity.ok().contentType(MediaType.asMediaType(MimeType.valueOf("video/mp4"))).body(retrievedComment.getCommentContent());
        return retrievedComment;
    }

    @GetMapping(path = { "/getImage/{commentId}" })
    public Optional<Comment> getImage(@PathVariable("commentId") String commentId) throws IOException {

        final Optional<Comment> retrievedImage = commentRepository.findById(commentId);
        return retrievedImage;
    }

    @RequestMapping(path = { "/deleteComment/{commentId}" },method = RequestMethod.DELETE)
    public void deleteCommentById(@PathVariable("commentId") String commentId){

            commentService.removeCommentById(commentId);
    }


    @RequestMapping(path = { "/updateComment/{commentId}" },method = RequestMethod.PUT)
    public ResponseEntity<Comment>  modifyComment(@PathVariable("commentId") String commentId,@RequestBody Comment comment){
        return new ResponseEntity(commentService.updateComment(commentId,comment), HttpStatus.OK);
    }




}
