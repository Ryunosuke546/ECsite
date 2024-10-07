package jp.co.internous.ECsite.model.form;

import java.io.Serializable;

public class HistoryForm implements Serializable{
	private int userId;
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId= userId;
	}
}
