<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ page import="java.util.List"%>
<%@ page import="com.javaex.vo.GuestVO" %>    
    
    
    
<%                             //모든형을 받아야 하기 때문에 형변환
	List<GuestVO> guestList = (List<GuestVO>)request.getAttribute("gList");
	System.out.println("여기는jsp");
	System.out.println(guestList);
%>
    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="http://localhost:8080/guestbook/gbc" method="get">
			<table border="1" width="540px">
				<tr>
					<td>이름</td>
					<td>
						<input type="text" name="name" value="">
					</td>
	
					<td>비밀번호</td>
	                <td>
	                	<input type="password" name="password" value="">
	                </td>
				</tr>
				<tr>
					<td colspan="4">
						<textarea cols="72" rows="5" type="hidden" name="content" value=""></textarea>
						
						
					</td>
						<input type="hidden" name="action" value="write">
				</tr>
				<tr>
					<td colspan="4">
						<button type="">등록</button>
					</td>
				</tr>
			</table>
		</form>
		<br>
	
	
		<%for(int i=0; i<guestList.size(); i++){
		%>		
		
		<table border="1" width="540px">
			<tr>
				<td><%=guestList.get(i).getNo() %></td>
				<td><%=guestList.get(i).getName() %></td>
				<td><%=guestList.get(i).getDate() %></td>
				<td>
					<a href="http://localhost:8080/guestbook/gbc?action=dform&no=<%=guestList.get(i).getNo()%>">삭제</a>
				</td>
			</tr>
			<tr>
				<td colspan="4"><%=guestList.get(i).getContent() %></td>
			</tr>
		</table>
		<br>
		<%	
		}
		%>	
		
	</body>
</html>