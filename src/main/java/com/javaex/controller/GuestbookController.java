package com.javaex.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaex.dao.GuestbookDAO;

import com.javaex.vo.GuestVO;




@WebServlet("/gbc")
public class GuestbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public GuestbookController() {
       
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//작동되는지 확인용
		System.out.println("GuestbookController");
		
		String action = request.getParameter("action");
		System.out.println(action); //업무구분

		
		//리스트
		if("list".equals(action)) {
			
			System.out.println("리스트"); //확인함

			GuestbookDAO guestbookDAO = new GuestbookDAO();
			List<GuestVO> guestList = guestbookDAO.guestSelect(); 
			
			System.out.println(guestList);
			
			request.setAttribute("gList", guestList);
			
			RequestDispatcher rd = request.getRequestDispatcher("/addList.jsp");
			rd.forward(request, response);
			
			

			
		} else if("write".equals(action)) {// 얘가 등록업무
			System.out.println("등록"); //여기까지 체크 후 뒤에 코드 짜기
			
			//파라미터 3개
			//int no = Integer.parseInt(request.getParameter("no"));
			String name = request.getParameter("name");
			String pw = request.getParameter("password");
			String content = request.getParameter("content");
			//String date = request.getParameter("reg_date");
			
			GuestVO guestVO = new GuestVO(name, pw, content);
					
		
			GuestbookDAO guestbookDAO = new GuestbookDAO();
			guestbookDAO.guestInsert(guestVO);

			
			response.sendRedirect("http://localhost:8080/guestbook/gbc?action=list");
			
			
		}else if("dform".equals(action)) { //삭제폼
			
			System.out.println("삭제폼"); //확인ㅇㅋ
		

		    // 포워드
		    RequestDispatcher rd = request.getRequestDispatcher("/deleteForm.jsp");
		    rd.forward(request, response);
		
		
		
		}else if("delete".equals(action)) { //삭제
			System.out.println("삭제"); //확인오케
			
			String pw = request.getParameter("password");
			
			GuestbookDAO guestbookDAO = new GuestbookDAO();
			guestbookDAO.guestDelete(pw);
			
			response.sendRedirect("http://localhost:8080/guestbook/gbc?action=list");
		}
		

		
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
