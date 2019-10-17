package com.good.service;

import com.good.model.BoardSearch;
import com.good.model.BoardVO;
import com.good.model.Pagination;
import com.good.model.ReplyVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
public interface BoardService {
    public List<BoardVO> getBoardList(BoardSearch boardSearch) throws Exception;
    public void insertBoard(BoardVO boardVO) throws Exception;
    @Transactional
    public BoardVO updategetBoardContent(int bid) throws Exception;
    public void updateBoard(BoardVO boardVO) throws Exception;
    public BoardVO justgetBoardContent(int bid) throws Exception;
    public void deleteBoard(int bid) throws Exception;
    public int getBoardListCnt(BoardSearch boardSearch) throws Exception;
    public List<ReplyVO> getReplyList(int bid) throws Exception;
    public int saveReply(ReplyVO replyVO) throws Exception;
    public int updateReply(ReplyVO replyVO) throws Exception;
    public int deleteReply(int rid) throws Exception;
}
