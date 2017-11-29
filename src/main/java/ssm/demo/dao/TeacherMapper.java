package ssm.demo.dao;


import ssm.demo.model.Teacher;

public interface TeacherMapper {
    int insert(Teacher record);

    int insertSelective(Teacher record);
}