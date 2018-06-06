package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatsAnalytics implements Statistics {

    @Override
    public List<String> usersNames() {
        return null;
    }

    public int usersCount() {
        return usersNames().size();
    }

    public List<String> postsList() {
        return null;
    }

    @Override
    public int postsCount() {
        return postsList().size();
    }

    public List<String> commentsList() {
        return null;
    }

    @Override
    public int commentsCount() {
        return commentsList().size();
    }

    public int calculateAdvStatistics(Statistics statistics) {
        int averagePostsPerUser = postsCount() / usersCount();

        int averageCommentsPerUser = commentsCount() / usersCount();

        int averageCommentsPerPost = commentsCount() / postsCount();

        return List<int> advStatistics = new ArrayList<>(){
            advStatistics.add(averagePostsPerUser);
            advStatistics.add(averageCommentsPerUser);
            advStatistics.add(averageCommentsPerPost);
        };
    }

    public void showStatistics() {
        System.out.println("Currently there are:\n\n- " + averagePostsPerUser + " posts per user.\n- " + averageCommentsPerUser + " comments per user.\n- " + averageCommentsPerPost + " comments per post.");
    }
}
