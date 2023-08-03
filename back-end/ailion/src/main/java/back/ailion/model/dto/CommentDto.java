package back.ailion.model.dto;

import back.ailion.model.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {

    private Long commentId;

    private String content;
    private String writer;

    private LocalDateTime createdDate;

    private List<CommentReplyDto> replies;

    public CommentDto(Comment comment) {
        this.commentId = comment.getId();
        this.createdDate = comment.getCreatedDate();
        this.content = comment.getContent();
        this.writer = comment.getWriter();
    }
}