package xyz.hangao.community.community.exception;

/**
 * Created By gh
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND(2001,"你找的问题不存在了，要不要换个试试？"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或评论进行回复"),
    NO_LOGIN(2003,"没有登陆不能评论，请先登录。"),
    SYS_ERROR(2004,"服务器冒烟了，请稍后再试试哦！！！"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或者不存在"),
    COMMENT_NOT_FOUND(2006,"你回复的评论不存在了，要不要换个试试？"),
    CONTENT_IS_EMPTY(2007,"输入内容不能为空！！！"),
    READ_NOTIFICATION_FILE(2008,"兄弟你这是都别人的信息吗？"),
    NOTIFICATION_NOT_FOUND(2009,"消息不见了，飞走了！");;

    private String message;
    private Integer code;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

}
