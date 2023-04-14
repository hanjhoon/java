# Insert 기능 구현

- # 서블릿을 이용하여 DB에서 employees 테이블의 데이터를 추가하는 기능을 구현
  -  doGet() 메소드는 GET 요청이 들어오면 실행되며, 응답으로 HTML 코드를 반환
  -  HTML 코드 내에는 employees 테이블의 모든 데이터가 테이블 형태로 출력
  -  doPost() 메소드는 POST 요청이 들어오면 실행, 클라이언트가 전송한 데이터를 받아 DB에 추가
  -  먼저, employees 테이블에서 해당 사원번호가 존재하는지 확인하고, 존재하지 않는다면 데이터를 추가
  -  데이터는 PreparedStatement를 이용하여 쿼리문에 매개변수로 전달되며, 쿼리문을 실행하여 DB에 저장

```java
package com.playdata;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(urlPatterns = "/employees")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        String sql = "SELECT * FROM employees";
        Connection con = (Connection) req.getServletContext().getAttribute("dbConnection");
        try (
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print("<head>");
            out.print("  <meta charset=\"UTF-8\">");
            out.print("  <title>Employees</title>");
            out.print("</head>");
            out.print("<body>");
            out.print("  <table>");
            out.print("    <tr>");
            out.print("      <th>사원번호</th>");
            out.print("      <th>생일</th>");
            out.print("      <th>이름</th>");
            out.print("      <th>성</th>");
            out.print("      <th>성별</th>");
            out.print("      <th>고용일</th>");
            out.print("    </tr>");
            while (rs.next()) {
                out.print("    <tr>");
                out.print("      <td>" + rs.getInt("emp_no") + "</td>");
                out.print("      <td>" + rs.getString("first_name") + "</td>");
                out.print("      <td>" + rs.getString("last_name") + "</td>");
                out.print("      <td>" + rs.getString("birth_date") + "</td>");
                out.print("      <td>" + rs.getString("gender") + "</td>");
                out.print("      <td>" + rs.getString("hire_date") + "</td>");
                out.print("    <tr>");
            }
            out.print("</table>");
            out.print("</body>");
            out.print("</html>");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        int empNo = Integer.parseInt(req.getParameter("emp_no"));
        Date birthDate = Date.valueOf(req.getParameter("birth_date"));
        String firstName = req.getParameter("first_name");
        String lastName = req.getParameter("last_name");
        String gender = req.getParameter("gender");
        Date hireDate = Date.valueOf(req.getParameter("hire_date"));

        String sql = "SELECT COUNT(*) FROM employees WHERE emp_no = ?";
        try (Connection con = (Connection) req.getServletContext().getAttribute("dbConnection");
             PreparedStatement stmt = con.prepareStatement(sql)){

            stmt.setInt(1, empNo);
            ResultSet rs = stmt.executeQuery();

            if (rs.next() && rs.getInt(1) == 0) {
                sql = "INSERT INTO employees (emp_no, birth_date, first_name, last_name, gender, hire_date) VALUES (?, ?, ?, ?, ?, ?)";

                stmt.setInt(1, empNo);
                stmt.setDate(2, birthDate);
                stmt.setString(3, firstName);
                stmt.setString(4, lastName);
                stmt.setString(5, gender);
                stmt.setDate(6, hireDate);

                stmt.executeUpdate();
            } else {
                System.out.println("값이 존재합니다");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        System.out.println("-------------------------");
//        System.out.println("empNo = " + empNo);
//        System.out.println("birthDate = " + birthDate);
//        System.out.println("firstName = " + firstName);
//        System.out.println("lastName = " + lastName);
//        System.out.println("gender = " + gender);
//        System.out.println("hireDate = " + hireDate);
    }
}

```
