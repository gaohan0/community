package xyz.hangao.community.community.dto;

import lombok.Data;

/**
 * Created By gh
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;
}
