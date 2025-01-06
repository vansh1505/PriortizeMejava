package com.PriortizeMe.servlet;

import com.PriortizeMe.dao.TaskDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteTask")
public class DeleteTaskServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int taskId = Integer.parseInt(request.getParameter("taskId"));

        TaskDao taskDao = new TaskDao();
        if (taskDao.deleteTask(taskId)) {
            response.sendRedirect("profile.html");
        } else {
            response.getWriter().println("Error deleting task!");
        }
    }
}
