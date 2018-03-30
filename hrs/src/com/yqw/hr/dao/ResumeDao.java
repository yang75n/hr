package com.yqw.hr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.yqw.hr.data.Resume;
import com.yqw.hr.util.DbUtil;

public class ResumeDao {

	public void add(Resume resume) throws SQLException {
		// 获取连接
		Connection conn = DbUtil.getConnection();
		// sql
		String sql = "INSERT INTO resume(name,sex,age,company,entry_date,education,position,salary,"
				+ "update_date) "
				+ "values("
				+ "?,?,?,?,?,?,?,?,?);";
		// 预编译
		PreparedStatement ptmt = conn.prepareStatement(sql); // 预编译SQL，减少sql执行
		// 传参
		ptmt.setString(1, resume.getName());
		ptmt.setString(2, resume.getSex());
		ptmt.setInt(3, resume.getAge());

		ptmt.setString(4, resume.getCompany());
		ptmt.setString(5, resume.getEntry_date());
		ptmt.setString(6, resume.getEducation());

		ptmt.setString(7, resume.getPosition());
		ptmt.setString(8, resume.getSalary());
		ptmt.setString(9, new Date().toLocaleString());
		System.out.println("inset sql="+sql);
		// 执行
		ptmt.execute();
	}

	public List<Resume> listAll() throws SQLException {
		Connection conn = DbUtil.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt
				.executeQuery("SELECT name, sex,age,company,entry_date,education,position,salary,update_date FROM resume");

		List<Resume> gs = new ArrayList<Resume>();
		Resume r = null;
		while (rs.next()) {
			r = new Resume();
			r.setName(rs.getString("name"));
			r.setSex(rs.getString("sex"));
			r.setAge(rs.getInt("age"));

			r.setCompany(rs.getString("company"));
			r.setEntry_date(rs.getString("entry_date"));
			r.setEducation(rs.getString("education"));
			r.setPosition(rs.getString("position"));
			r.setSalary(rs.getString("salary"));
			r.setUpdate_date(rs.getString("update_date"));

			System.out.println("get a resume =" + r);
			gs.add(r);
		}
		return gs;
	}

	public void deleteById(int id) {

	}

	public void updateResume(Resume resume) {

	}
}
