package org.hit.service;

import java.util.List;
import java.util.Optional;

import org.hit.model.FeedBack;
import org.hit.repository.FeedBackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedBackServiceImpl implements FeedBackService {

	@Autowired
	public FeedBackRepository feedBackRepository;
	
	@Override
	public FeedBack addFeedBack(FeedBack feedBack) {
		return feedBackRepository.save(feedBack);
	}

	@Override
	public FeedBack updateFeedBack(FeedBack feedBack) {
		return feedBackRepository.save(feedBack);
	}

	@Override
	public FeedBack deleteFeedBack(int feedBackId) {
		Optional<FeedBack> opt=feedBackRepository.findById(feedBackId);
		if(opt.isPresent()) {
			FeedBack f=opt.get();
			feedBackRepository.delete(f);
			return f; 
		}
		return null;
	}

	@Override
	public FeedBack viewFeedBack(int feedBackId) {
		Optional<FeedBack> opt=feedBackRepository.findById(feedBackId);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<FeedBack> viewAllFeedBack() {
		// TODO Auto-generated method stub
		return feedBackRepository.findAll();
	}

	

}
