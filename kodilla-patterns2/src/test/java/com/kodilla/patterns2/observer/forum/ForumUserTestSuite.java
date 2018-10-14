package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        // Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivonneSanchez = new ForumUser("Ivonne Sanchez");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman;");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivonneSanchez);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);

        // When
        javaHelpForum.addPost("Post #1");
        javaHelpForum.addPost("Post #2");
        javaToolsForum.addPost("Post #3");
        javaHelpForum.addPost("Post #4");
        javaToolsForum.addPost("Post #5");

        // Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivonneSanchez.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
