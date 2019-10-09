package xyz.hangao.community.community.dto;

import lombok.Data;

/**
 * Created By gh
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
