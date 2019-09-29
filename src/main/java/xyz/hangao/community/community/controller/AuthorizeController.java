package xyz.hangao.community.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.hangao.community.community.mapper.UserMapper;
import xyz.hangao.community.community.dto.AccesstokenDTO;
import xyz.hangao.community.community.dto.GithubUser;
import xyz.hangao.community.community.model.User;
import xyz.hangao.community.community.privoder.GithubPrivoder;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * Created By gh
 */
@Controller
public class AuthorizeController {
    @Autowired
    private GithubPrivoder githubPrivoder;

    @Value("${github.client.id}")
    private String clientId;
    @Value("${github.client.secret}")
    private String clientSecret;
    @Value("${github.redirect.uri}")
    private String redirectUri;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state,
                           HttpServletRequest request) {
        AccesstokenDTO accesstokenDTO = new AccesstokenDTO();
        accesstokenDTO.setClient_id(clientId);
        accesstokenDTO.setClient_secret(clientSecret);
        accesstokenDTO.setCode(code);
        accesstokenDTO.setRedirect_uri(redirectUri);
        accesstokenDTO.setState(state);
        String accessToken = githubPrivoder.getAccessToken(accesstokenDTO);
        GithubUser githubUser = githubPrivoder.getUser(accessToken);
        if(githubUser != null){
            User user = new User();
            user.setToken(UUID.randomUUID().toString());
            user.setName(githubUser.getName());
            user.setAccountId(String.valueOf(githubUser.getId()));
            user.setGmtCreate(System.currentTimeMillis());
            user.setGmtModified(user.getGmtCreate());
            userMapper.insert(user);
            //登陆成功，写cookie和session
            request.getSession().setAttribute("user",user);
            return "redirect:/";
        }else{
            //登陆失败，重新登陆
            return "redirect:/";
        }
    }
}
