package com.sksalstn.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sksalstn.spring.ex.mybatis.Repository.ReviewRepository;
import com.sksalstn.spring.ex.mybatis.domain.Review;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	// id가 3인 리뷰 정보 조회
	public Review getReview(int id) {
		Review review = reviewRepository.selectReview(id);
		
		return review;
		
	}

}
