package com.svp.feedback.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import com.svp.feedback.entity.FeedbackEntity;


@ComponentScan("org.hibernate")
@Component
public class FeedbackDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public FeedbackDao() {
		super();		
	}

	public void addFeedback(FeedbackEntity feedbackEntity) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(feedbackEntity);
	}
}
