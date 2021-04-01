package com.svp.feedback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.svp.feedback.dao.FeedbackDao;
import com.svp.feedback.entity.FeedbackEntity;

@Controller
public class IndexController {

	FeedbackDao feedbackDao;
	FeedbackEntity feedbackEntity;
	@RequestMapping("/")
	public String home( ) {
		return "index.jsp";
	}
	@RequestMapping("/feedback.htm")
	public String feedback( ) {
		return "feedback.jsp";
	}

	
	
	/*
	 * @RequestMapping("/addFeedback") public String
	 * addFeedback(@RequestParam("name") String name,
	 * 
	 * @RequestParam("email") String email,
	 * 
	 * @RequestParam("reg") String reg,
	 * 
	 * @RequestParam("code") String code,
	 * 
	 * @RequestParam("msg") String msg,
	 * 
	 * @RequestParam("rating") int rating) {
	 * 
	 * feedbackEntity = new FeedbackEntity(name, email, reg, code, rating, msg);
	 * feedbackDao = new FeedbackDao(); feedbackDao.addFeedback(feedbackEntity);
	 * return "welcome.jsp"; }
	 */
	 
	 
	@RequestMapping("/addFeedback")
	public String addFeedback(@ModelAttribute("feedback") FeedbackEntity feedbackEntity) {	
		feedbackDao = new FeedbackDao();
		feedbackDao.addFeedback(feedbackEntity);
		return "welcome.jsp";
	}
}
