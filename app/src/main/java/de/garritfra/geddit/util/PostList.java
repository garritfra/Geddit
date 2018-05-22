package de.garritfra.geddit.util;

import java.util.ArrayList;

public class PostList {
    private static final PostList ourInstance = new PostList();
    private final ArrayList<String> postList;

    public static PostList getInstance() {
        return ourInstance;
    }

    private PostList() {
        this.postList = new ArrayList<>();
    }

    public ArrayList<String> getPostList() {
        return postList;
    }

    public void addPost(String post) {
        this.postList.add(post);
    }
}
