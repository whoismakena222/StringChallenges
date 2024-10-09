/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        /* TODO: your code goes here */
        int hashIndex = post.indexOf("#");
        while(hashIndex != -1) { // as long as another hashtag can be found keep looping
            int spaceIndex = post.indexOf(" ", hashIndex);
            if(spaceIndex == -1) {
                spaceIndex = post.length(); // if theirs no space go to end of string
            }
            System.out.println("Hashtag: " + post.substring(hashIndex, spaceIndex));
            hashIndex = post.indexOf("#", spaceIndex); // look for nxt # from space index

        }
    }

}
