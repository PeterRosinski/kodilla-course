package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("Task One");
        board.getInProgressList().addTask("Task Two");
        board.getDoneList().addTask("Task Three");
        //Then
        Assert.assertEquals("Task One",board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Task Two",board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Task Three",board.getDoneList().getTasks().get(0));

    }

}
