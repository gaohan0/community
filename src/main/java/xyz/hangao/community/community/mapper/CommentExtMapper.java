package xyz.hangao.community.community.mapper;

import xyz.hangao.community.community.model.Comment;

public interface CommentExtMapper {

    int incCommentCount(Comment comment);
}