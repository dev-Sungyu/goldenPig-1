package com.goldenPig.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.goldenPig.Action;
import com.goldenPig.Result;
import com.goldenPig.board.dao.BoardDAO;
import com.goldenPig.board.domain.BoardDTO;
import com.goldenPig.member.dao.MemberDAO;
import com.goldenPig.member.domain.MemberVO;

public class DetailOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();

		try {
			detailOk(req, resp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		result.setPath("/templates/board/board_detail.jsp");
		result.setRedirect(FORWORD);

		return result;
	}

	public void detailOk(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException, JSONException {
		BoardDAO boardDAO = new BoardDAO();
		MemberDAO memberDAO = new MemberDAO();
		Long boardId = Long.parseLong(req.getParameter("boardId"));
		System.out.println(boardId);
		BoardDTO dto = boardDAO.selectOneByBoardId(boardId);
		System.out.println(dto);
		JSONArray replyJsons = new JSONArray();
		JSONObject dtoJson = new JSONObject(dto);
		Long memberId = (Long)req.getSession().getAttribute("memberId");
		memberId = memberId == null ? 1L : memberId;
		System.out.println("memberId : "+ memberId);
		MemberVO memberVO = memberDAO.select(memberId);
		String memberVOJson = new JSONObject(memberVO).toString();
		
		boardDAO.selectAllRepliesByBoardId(boardId).stream().map(reply -> new JSONObject(reply)).forEach(replyJsons::put);

		
//		board의 게시자 및 게시글 정보
		System.out.println(dtoJson.toString());
		req.setAttribute("boardInfo", dtoJson.toString());
		
//		세션 아이디 정보
		req.setAttribute("memberVO", memberVOJson);
		
//		댓글 정보
		req.setAttribute("replyDTOs", replyJsons.toString());
	}

}
