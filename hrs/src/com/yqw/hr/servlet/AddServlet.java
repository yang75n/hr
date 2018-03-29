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
		String age = req.getParameter("age");
		String company = req.getParameter("company");
		String entry_date = req.getParameter("entry_date");
		String education = req.getParameter("education");
		String position = req.getParameter("position");
		String salary = req.getParameter("salary");

		Resume resume = new Resume();
		resume.setName(name);
		resume.setSex(sex);
		resume.setAge(Integer.valueOf(age));
		resume.setCompany(company);
		resume.setEntry_date(entry_date);
		resume.setEducation(education);
		resume.setPosition(position);
		resume.setSalary(salary);

		System.out.println("add Resume resume=" + resume);

		HrControl.getInstance().addResume(resume);

		resp.sendRedirect("list");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

}
