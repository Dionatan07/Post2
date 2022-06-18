package application;

import entities.Comment;
import entities.Post;

import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("New Post:");
        System.out.print("title: ");
        String title = key.nextLine();

        System.out.print("Content: ");
        String content = key.nextLine();

        System.out.print("Likes: ");
        int likes = key.nextInt();

        Post post = new Post(new Date(), title, content, likes);

        System.out.println();
        System.out.print("How many comments? ");
        int comments = key.nextInt();
        key.nextLine();

        for (int i = 0; i < comments; i++){
            System.out.print("Enter comment: ");
            String comment = key.nextLine();

            Comment listComments = new Comment(comment);

            post.addComment(listComments);
        }

        System.out.println();
        System.out.println(post);

    }
}
