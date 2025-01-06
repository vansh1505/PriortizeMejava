package com.PriortizeMe.servlet;

import com.PriortizeMe.dao.UserDao;
import com.PriortizeMe.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        UserDao userDao = new UserDao();
        if (userDao.registerUser(user)) {
            response.sendRedirect("login.html");
        } else {
            response.getWriter().println("Error registering user!");
        }
    }
}
