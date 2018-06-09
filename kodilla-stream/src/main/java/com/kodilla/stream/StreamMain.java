package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Forum;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        LocalDate matureAgeDate = LocalDate.now(ZoneOffset.UTC).minusYears(18);

        System.out.println("This is the Final Lists of Users:");
        Map<int, ForumUser> theFinalListsOfUsers = theForum.getUserList().stream()
                .filter(u -> u.getSex() == 'M')
                .filter(u -> u.getBirthDate().isBefore(matureAgeDate))
                .filter(u -> u.getTotalPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUniqueUserID, u -> u));

        theFinalListsOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println("This is the Book Directory:");
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<\n", "\n>>"));

        System.out.println(theResultStringOfBooks);
    }
}