package com.yqw.hr.control;

import java.sql.SQLException;

import com.yqw.hr.dao.ResumeDao;
import com.yqw.hr.data.Resume;

public class HrControl {

	private static HrControl hrControl;
	private static ResumeDao resumeDao;

	private HrControl() {

	}

	public static HrControl getInstance() {
		if (hrControl == null) {
			resumeDao = new ResumeDao();
			hrControl = new HrControl();
		}
		return hrControl;
	}

	public boolean addResume(Resume resume) {
		try {
			resumeDao.add(resume);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
