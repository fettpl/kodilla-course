package com.kodilla.testing.forum.statistics;

public class StatsAnalytics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerPost;
    private double averageCommentsPerUser;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averagePostsPerUser = (double) numberOfPosts / numberOfUsers;
        averageCommentsPerPost = (double) numberOfComments / numberOfPosts;
        averageCommentsPerUser = (double) numberOfComments / numberOfUsers;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public Double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public Double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public Double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public void showStatistics() {
        System.out.println("Currently there are:\n\n- " + averagePostsPerUser + " posts per user.\n- " + averageCommentsPerUser + " comments per user.\n- " + averageCommentsPerPost + " comments per post.");
    }
}
