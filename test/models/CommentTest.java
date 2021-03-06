package models;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.*;

public class CommentTest extends ModelTest<Comment> {

    @Test
    public void findById() {
        // Given
        // When
        // Then
        assertThat(Comment.findById(1l).authorId).isEqualTo(2l);
    }

    @Test
    public void write() throws Exception {
        // Given
        Comment comment = new Comment();
        comment.post = Post.findById(1l);
        comment.contents = "testThing";
        comment.authorId = getTestUser().id;
        // When
        long id = Comment.write(comment);
        // Then
        assertThat(Comment.findById(id)).isNotNull();
    }
}
