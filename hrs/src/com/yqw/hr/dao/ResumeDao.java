package com.yqw.hr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yqw.hr.data.Resume;
import com.yqw.hr.util.DbUtil;

public class ResumeDao {

	public void add(Resume resume) throws SQLException {
		// 获取连接
		Connection conn = DbUtil.getConnection();
		// sql
		String sql = "INSERT INTO imooc_goddess(user_name, sex, age, birthday, email, mobile,"
				+ "create_user, create_date, update_user, update_date, isdel)"
				+ "values("
				+ "?,?,?,?,?,?,?,CURRENT_DATE(),?,CURRENT_DATE(),?)";
		// 预编译
		PreparedStatement ptmt = conn.prepareStatement(sql); // 预编译SQL，减少sql执行
		// 传参
		ptmt.setString(1, resume.getName());
		ptmt.setString(2, resume.getSex());
		// 执行
		ptmt.execute();
	}

	public List<Resume> listAll() throws SQLException {
		Connection conn = DbUtil.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt
				.executeQuery("SELECT user_name, age FROM imooc_goddess");

		List<Resume> gs = new ArrayList<Resume>();
		Resume g = null;
		while (rs.next()) {
			g = new Resume();
			g.setName(rs.getString("name"));
			g.setAge(rs.getInt("age"));

			gs.add(g);
		}
		return gs;
	}

	public void deleteById(int id) {

	}

	public void updateResume(Resume resume) {

	}
}
