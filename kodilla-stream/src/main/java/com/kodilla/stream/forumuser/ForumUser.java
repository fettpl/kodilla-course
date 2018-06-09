package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int uniqueUserID;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int totalPosts;

    public ForumUser(int uniqueUserID, String username, char sex, LocalDate birthDate, int totalPosts) {
        this.uniqueUserID = uniqueUserID;
        this.username = username;
        this.sex = sex;
        this.birthDate = birthDate;
        this.totalPosts = totalPosts;
    }

    public int getUniqueUserID() {
        return uniqueUserID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getTotalPosts() {
        return totalPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueUserID=" + uniqueUserID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", totalPosts=" + totalPosts +
                '}';
    }
}
