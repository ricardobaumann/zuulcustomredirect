package posts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PostsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostsApplication.class,args);
    }

    @GetMapping("/posts/{id}")
    public Post get(@PathVariable String id) {
        return new Post("title "+id,id);
    }

    public static class Post{
        private final String title;
        private final String id;

        public Post(String title, String id) {
            this.title = title;
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public String getId() {
            return id;
        }
    }

}
