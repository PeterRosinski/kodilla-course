package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        TaskQueue taskQueue1 = new TaskQueue("Piotr");
        TaskQueue taskQueue2 = new TaskQueue("Rafał");
        Mentor mentor1 = new Mentor("Hubert");
        Mentor mentor2 = new Mentor("Roman");
        Mentor superMentor = new Mentor("Mateusz");
        taskQueue1.registerObserver(mentor1);
        taskQueue2.registerObserver(mentor2);
        taskQueue1.registerObserver(superMentor);
        taskQueue2.registerObserver(superMentor);
        //When
        taskQueue1.addTask(new Task("Moduł 20.4", "Zadanie"));
        taskQueue2.addTask(new Task("Moduł 20.4", "Zadanie"));
        //Then
        assertEquals(1,mentor1.getTaskCount());;
        assertEquals(1,mentor2.getTaskCount());
        assertEquals(2,superMentor.getTaskCount());
    }
}
