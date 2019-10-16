package xyz.hangao.community.community.dto;

import lombok.Data;

import java.util.List;

/**
 * Created By gh
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
