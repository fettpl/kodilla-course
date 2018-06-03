package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void calculateAdvStatistics() {

        // Given
        StatsAnalytics statsAnalyticsMock  = mock(StatsAnalytics.class);

        List<String> usersNames = new ArrayList<>()List<String>() {
            usersNames.add("User1");
            usersNames.add("User2");
            usersNames.add("User3");
            usersNames.add("User4");
            usersNames.add("User5");
        }
        List<String> postsList = new ArrayList<>()List<String>() {
            postsList.add("Lorem ipsum dolor 1");
            postsList.add("Lorem ipsum dolor 2");
            postsList.add("Lorem ipsum dolor 3");
            postsList.add("Lorem ipsum dolor 4");
            postsList.add("Lorem ipsum dolor 5");
        }
        List<String> commentsList = new ArrayList<>()List<String>() {
            commentsList.add("Sit amet, consectetur adipiscing elit 1");
            commentsList.add("Sit amet, consectetur adipiscing elit 2");
            commentsList.add("Sit amet, consectetur adipiscing elit 3");
            commentsList.add("Sit amet, consectetur adipiscing elit 4");
            commentsList.add("Sit amet, consectetur adipiscing elit 5");
        }

        // When
        when(statsAnalyticsMock.calculateAdvStatistic()).then()

        // Then

    }
}
