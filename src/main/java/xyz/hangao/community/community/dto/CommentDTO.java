package xyz.hangao.community.community.dto;

import lombok.Data;
import xyz.hangao.community.community.model.Comment;
import xyz.hangao.community.community.model.User;

/**
 * Created By gh
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}
