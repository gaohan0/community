package xyz.hangao.community.community.dto;

import lombok.Data;

/**
 * Created By gh
 */
@Data
public class AccesstokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
