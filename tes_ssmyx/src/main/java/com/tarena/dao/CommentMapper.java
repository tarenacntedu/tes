package com.tarena.dao;

public interface CommentMapper {
	//根据用户id删除评论
	public int deleteCommentByUserId(String userId);
	
	//根据视频的id删除评论
	public int deleteCommentByVideoId(String videoId);

}
