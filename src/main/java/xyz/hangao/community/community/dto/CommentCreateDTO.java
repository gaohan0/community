package xyz.hangao.community.community.dto;

import lombok.Data;

/**
 * Created By gh
 */
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
