package Blog;


//Reuse your BlogPost class
//Create a Blog class which can
//        store a list of BlogPosts
//        add BlogPosts to the list
//        delete(int) one item at given index
//        update(int, BlogPost) one item at the given index and update it with another BlogPost
//

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blogPostList;


    public Blog() {
        this.blogPostList = new ArrayList<>();
    }

    public void add(BlogPost blogPost) {
        blogPostList.add(blogPost);
    }

    public void delete(int indexNum) {
        if (indexNum <= blogPostList.size() - 1) {
            System.out.println("Deleted item: " + blogPostList.get(indexNum));
            blogPostList.remove(indexNum);
        } else System.out.println("ERROR, index doesn't exist");
    }

    public void update(int indexNum, BlogPost updatedPost) {
        if (indexNum <= blogPostList.size() - 1) {
            blogPostList.set(indexNum, updatedPost);
            System.out.println("updated blog post: " +blogPostList.get(indexNum));
        }


    }


}





