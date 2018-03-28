package com.yqw.hr.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yqw.hr.control.HrControl;
import com.yqw.hr.data.Resume;

public class AddServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("AddServlet come in");
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		String sex = req.getParameter("sex");
		System.out.println("name=" + name + " ,sex=" + sex);
		Resume resume = new Resume();
		resume.setName(name);
		resume.setSex(sex);

		HrControl.getInstance().addResume(resume);

		req.getRequestDispatcher("listResume.jsp").forward(req, resp);

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

}
