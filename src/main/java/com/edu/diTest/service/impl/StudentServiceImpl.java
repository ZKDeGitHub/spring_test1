package com.edu.diTest.service.impl;

import com.edu.diTest.dao.StudenDao;
import com.edu.diTest.service.StudentService;

/**
 * @author: zk
 * @className: Server
 * @description: ToDo
 * @date: 2023/07/03/23:13
 * @since: 11
 */
public class StudentServiceImpl implements StudentService {

    private StudenDao studenDao;
    @Override
    public void addStudent() {
        studenDao.insertStudent();

    }

    @Override
    public void removeStudent(int id) {
        studenDao.deleteStudent(id);
    }

    public void setStudenDao(StudenDao studenDao) {
        this.studenDao = studenDao;
    }
}
