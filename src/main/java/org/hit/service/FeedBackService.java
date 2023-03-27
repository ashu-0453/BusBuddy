package org.hit.service;

import java.util.List;

import org.hit.model.FeedBack;

public interface FeedBackService {
	public FeedBack addFeedBack(FeedBack feedBack);
	public FeedBack updateFeedBack(FeedBack feedBack);
	public FeedBack deleteFeedBack(int feedBackId);
	public FeedBack viewFeedBack(int feedBackId);
	public List<FeedBack> viewAllFeedBack();
	
}
