package com.web.userPost;

public class ManagePostForm extends org.apache.struts.action.ActionForm {
	
	String content;
	String topic;
	String title;
	
	public ManagePostForm(){
		super();
	}
	public String getTopic(){
		return topic;
	}
	public void setTopic(String topic){
		this.topic = topic;
	}
	public String getContent(){
		return content;
	}
	public void setContent(String content){
		this.content = content;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
}
