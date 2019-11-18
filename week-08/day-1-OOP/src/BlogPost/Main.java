package BlogPost;

public class Main {
    public static void main(String[] args) {

        BlogPost blogPost1 = new BlogPost("John Doe: ", "Lorem Ipsum: ", "\"Lorem ipsum dolor sit amet.\" ", "2000.05.04.");
        System.out.println(blogPost1.authorName + blogPost1.title + blogPost1.text + blogPost1.publicationDate);

        BlogPost blogPost2 = new BlogPost("Tim Urban: ", "Wait but why: ", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2017.03.28.");
        System.out.println(blogPost2.authorName + blogPost2.title + blogPost2.text + blogPost2.publicationDate);

        BlogPost blogPost3 = new BlogPost("William Turton: ", "One Engineer Is Trying to Get IBM to Reckon With Trump: ", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");
        System.out.println(blogPost3.authorName + blogPost3.title + blogPost3.text + blogPost3.publicationDate);

    }
}
//   "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//    Lorem ipsum dolor sit amet.
//    "Wait but why" titled by Tim Urban posted at "2010.10.10."
//    A popular long-form, stick-figure-illustrated blog about almost everything.
//    "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//    Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.
        //}