package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1001, "user01", 'M', LocalDate.of(1971,1,1), 42));
        forumUserList.add(new ForumUser(1002, "user02", 'F', LocalDate.of(1979,12,18), 33));
        forumUserList.add(new ForumUser(1003, "user03", 'M', LocalDate.of(2004,6,29), 100));
        forumUserList.add(new ForumUser(1004, "user04", 'M', LocalDate.of(1992,8,6), 0));
        forumUserList.add(new ForumUser(1005, "user05", 'F', LocalDate.of(2002,3,21), 2));
        forumUserList.add(new ForumUser(1006, "user06", 'F', LocalDate.of(1988,11,17), 144));
        forumUserList.add(new ForumUser(1007, "user07", 'M', LocalDate.of(1988,05,03), 79));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}