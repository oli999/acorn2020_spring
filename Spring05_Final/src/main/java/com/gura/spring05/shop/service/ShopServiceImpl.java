package com.gura.spring05.shop.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring05.shop.dao.OrderDao;
import com.gura.spring05.shop.dao.ShopDao;

@Service
public class ShopServiceImpl implements ShopService{
	@Autowired
	private ShopDao shopDao;
	@Autowired
	private OrderDao orderDao;
	
	@Override
	public void getList(ModelAndView mView) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void buy(HttpServletRequest request, ModelAndView mView) {
		//1. 구입할 상품의 번호를 읽어온다.
		
		//2. 상품의 가격을 얻어온다.
		
		//3. 상품의 가격만큼 계좌 잔액을 줄인다.
		
		//4. 가격의 10% 를 포인트로 적립한다.
		
		//5. 재고의 갯수를 1 줄인다.
		
		//6. 주문 테이블(배송) 에 정보를 추가 한다. 
	}
	
}
