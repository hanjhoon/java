<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = (String) session.getAttribute("username");
%>
<style>
    nav {
      display: flex;
      justify-content: center;
      align-items: center;
    }

    nav ul {
      display: flex;
      list-style: none;
      padding: 0;
      margin: 0;
    }

    nav li {
      margin: 0 10px;
    }

</style>
<header>
    <nav>
        <ul>
            <li>Home</li>
            <li>About</li>
            <li>Board</li>
            <%
                if(username != null) {
            %>
            <li><%= username %> 님 환영합니다.</li>
            <li><a href="logout">로그아웃</a></li>
            <%
                } else {
            %>
            <li><a href="login.jsp">로그인</a></li>
            <li><a href="register.jsp">회원가입</a></li>
            <%
                }
            %>
        </ul>
    </nav>
</header>
