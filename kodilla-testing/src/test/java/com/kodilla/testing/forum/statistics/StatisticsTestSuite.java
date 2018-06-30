package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import static java.lang.Double.NaN;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void calculateAdvStatistics() {

        // Given
        Statistics statistics = mock(Statistics.class);
        StatsAnalytics statsAnalytics = new StatsAnalytics();
        List<String> listOfUsers = new ArrayList();
        listOfUsers.add("AAA");
        listOfUsers.add("BBB");
        listOfUsers.add("CCC");
        when(statistics.usersNames()).thenReturn(listOfUsers);
        when(statistics.postsCount()).thenReturn(30);
        when(statistics.commentsCount()).thenReturn(40);

        // When
        statsAnalytics.calculateAdvStatistics(statistics);

        // Then
        assertEquals(3, statsAnalytics.getNumberOfUsers());
        assertEquals(30, statsAnalytics.getNumberOfPosts());
        assertEquals(40, statsAnalytics.getNumberOfComments());
        assertEquals(1.3, statsAnalytics.getAverageCommentsPerPost(), 0.1);
        assertEquals(13.3, statsAnalytics.getAverageCommentsPerUser(), 0.1);
        assertEquals(10.0, statsAnalytics.getAveragePostsPerUser(), 0.1);
    }

    @Test
    public void calculateAdvStatisticsWithZeros() {

        // Given
        Statistics statistics = mock(Statistics.class);
        StatsAnalytics statsAnalytics = new StatsAnalytics();
        List<String> listOfUsers = new ArrayList();
        listOfUsers.add("DDD");
        listOfUsers.add("EEE");
        listOfUsers.add("FFF");
        when(statistics.usersNames()).thenReturn(listOfUsers);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);

        // When
        statsAnalytics.calculateAdvStatistics(statistics);

        // Then
        assertEquals(3, statsAnalytics.getNumberOfUsers());
        assertEquals(0, statsAnalytics.getNumberOfPosts());
        assertEquals(0, statsAnalytics.getNumberOfComments());
        assertEquals(Optional.ofNullable(NaN), java.util.Optional.ofNullable(statsAnalytics.getAverageCommentsPerPost()));
        assertEquals(Optional.of(0.0), java.util.Optional.ofNullable(statsAnalytics.getAverageCommentsPerUser()));
        assertEquals(Optional.of(0.0), java.util.Optional.ofNullable(statsAnalytics.getAveragePostsPerUser()));
    }

    @Test
    public void calculateAdvStatisticsZeroUsers() {

        // Given
        Statistics statistics = mock(Statistics.class);
        StatsAnalytics statsAnalytics = new StatsAnalytics();
        List<String> listOfUsers = new ArrayList();
        when(statistics.usersNames()).thenReturn(listOfUsers);

        // When
        statsAnalytics.calculateAdvStatistics(statistics);

        // Then
        assertEquals(0, statsAnalytics.getNumberOfUsers());
        assertEquals(0, statsAnalytics.getNumberOfPosts());
        assertEquals(0, statsAnalytics.getNumberOfComments());
    }
}
