package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Create TaskList";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("ToDo", DESCRIPTION);
        int id = taskList.getId();

        //When
        taskListDao.save(taskList);

        //Then
        List taskListName = taskListDao.findByListName("ToDo");
        Assert.assertEquals("ToDo", taskListName.equals(taskList.getListName()));

        //CleanUp
        taskListDao.deleteById(id);
    }
}
