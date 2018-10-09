package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        // Given
        User user1 = new Millenials("User #1");
        User user2 = new ZGeneration("User #2");
        User user3 = new YGeneration("User #3");

        // When
        String user1Medium = user1.sharePost();
        System.out.println(user1.getName() + user1Medium);
        String user2Medium = user2.sharePost();
        System.out.println(user2.getName() + user2Medium);
        String user3Medium = user3.sharePost();
        System.out.println(user3.getName() + user3Medium);

        // Then
        Assert.assertEquals(" is using Facebook.", user1Medium);
        Assert.assertEquals(" is using Twitter.", user2Medium);
        Assert.assertEquals(" is using Snapchat.", user3Medium);
    }

    @Test
    public void testIndividualSharingStrategy() {
        // Given
        User user1 = new Millenials("User #1");

        // When
        String user1Medium = user1.sharePost();
        System.out.println(user1.getName() + user1Medium);
        user1.setSocialPublisher(new SnapchatPublisher());
        user1Medium = user1.sharePost();
        System.out.println("Now " + user1.getName() + user1Medium);

        // Then
        Assert.assertEquals(" is using Snapchat.", user1Medium);
    }
}
