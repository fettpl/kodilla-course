package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(0001, "user01", 'M', 1971-1-1,
                42));
        forumUserList.add(new ForumUser(0002, "user02", 'F', 1984-6-22,
                30));
        forumUserList.add(new ForumUser(0003, "user03", 'M', 1995-12-30,
                2));
        forumUserList.add(new ForumUser(0004, "user04", 'M', 1988-2-1,
                18));
        forumUserList.add(new ForumUser(0005, "user05", 'F', 1988-6-1,
                0));
        forumUserList.add(new ForumUser(0006, "user06", 'F', 2000-11-15,
                42));
        forumUserList.add(new ForumUser(0007, "user07", 'F', 2017-1-12));
    }

    public List<Forum> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}