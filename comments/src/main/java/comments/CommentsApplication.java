package comments;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CommentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommentsApplication.class,args);
    }

    @GetMapping("/posts/{postId}/comments")
    public Comment get(@PathVariable String postId) {
        return new Comment("text "+postId,postId);
    }

    public static class Comment {
        private final String text;
        private final String postId;

        public Comment(String text, String postId) {
            this.text = text;
            this.postId = postId;
        }

        public String getText() {
            return text;
        }

        public String getPostId() {
            return postId;
        }
    }
}
