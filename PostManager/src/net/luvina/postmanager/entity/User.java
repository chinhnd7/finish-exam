package net.luvina.postmanager.entity;

import java.util.List;

import net.luvina.postmanager.exception.PostException;

public class User {
	private long id;
	private String fullName;
	private List<Post> posts;
	private List<Comment> comments;
	
	public User(String fullName) {
		this.fullName = fullName;
	}

	public void writePost(Post post) {
		// write some code
	}
	
	public void deletePost(Post post) throws PostException{
		// write some code
	}
	
	public long getId() {
		return id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public List<Comment> getComments() {
		return comments;
	}
}
