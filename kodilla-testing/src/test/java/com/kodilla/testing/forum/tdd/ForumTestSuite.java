package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

//@DisplayName("TDD: Forum Test Suite \uD83D\uDE31")
@DisplayName("TDD: Forum Test Suite.")
class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All test are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Nested
    @DisplayName("Test for posts.")
    class TestPosts {
        @Test
        void testAddPost() {
            //Given
            ForumUser forumUser = new ForumUser("mrAdam", "Adam Pietka");

            //When
            forumUser.addPost("mrAdam",
                    "Hello wordd , it's a forst post. JUnit");

            //Then
            Assertions.assertEquals(1, forumUser.getPostQuantity());
        }

        @Test
        void testRemoveNotExisting() {
            //Given
            ForumUser forumUser = new ForumUser("mrAdam", "Adam Pietka");
            ForumPost thePost = new ForumPost("Hello Everyone, I delete post.", "mrAdam");
            //when
            boolean result = forumUser.removePost(thePost);
            //Then
            Assertions.assertFalse(result);

        }

        @Test
        void testRemovePost() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " +
                    "this is my first contribution here!", "mrsmith");
            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

            //When
            boolean result = forumUser.removePost(thePost);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0,forumUser.getPostQuantity());
        }
    }

    @Nested
    @DisplayName("Test for comments.")
    class TestComments {
        @Test
        void testAddComment() {
            //Given
            ForumUser forumUser = new ForumUser("msSylwia", "Sylwia R-P");
            ForumPost thePost = new ForumPost("Hellow everyone!!!", "msSylwia");

            //When
            forumUser.addComment(thePost, "msSylwai", "Thank you  - it's a comment.");

            //Then
            Assertions.assertEquals(1, forumUser.getCommentsQuantity());
        }

        @Test
        void testGetComment() {
            //Giben
            ForumUser forumUser = new ForumUser("mrAdam", "Adam Pietka");
            ForumPost thePost = new ForumPost("Hellow Everyone!!!", "mrAdam");
            ForumComment theComment = new ForumComment(thePost, "mrAdam", "Hellow it's my first comment. ");
            forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
            //When
            ForumComment retrievedComment = forumUser.getComment(0);
            // then
            Assertions.assertEquals(theComment, retrievedComment);

        }

        @Test
        void testRemoveCommentNotExisting() {
            //Given
            ForumUser forumUser = new ForumUser("mrAdam", "Adam Pietka");
            ForumPost thePost = new ForumPost("Hello everyone, " +
                    "this is my first contribution here!", "mrAdam");
            ForumComment theComment = new ForumComment(thePost, "mrAdam",
                    "Thank you for all good words!");

            //When
            boolean result = forumUser.removeComment(theComment);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveComment() {
            //Given
            ForumUser forumUser = new ForumUser("mrAdam", "Adam Pietka");
            ForumPost thePost = new ForumPost("Hello everyone, " +
                    "this is my first contribution here!", "mrAdam");
            ForumComment theComment = new ForumComment(thePost, "mrAdam",
                    "Thank you for all good words!");
            forumUser.addComment(thePost, theComment.getAuthor(),
                    theComment.getCommentBody());

            //When
            boolean result = forumUser.removeComment(theComment);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getCommentsQuantity());
        }
    }
}