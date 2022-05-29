package com.spring.mall.cart.service;

import java.util.List;
import java.util.Map;

import com.spring.mall.cart.vo.CartDetailProductVO;
import com.spring.mall.cart.vo.CartVO;

public interface CartService {

	// 1. 장바구니 추가
	public void insert(CartVO vo);

	// 2. 장바구니 목록
	public List<CartVO> listCart(CartVO vo);
//	public List<CartVO> listCart(String user_id);

	// 3. 장바구니 삭제
        public void delete(int cart_id);

	// 4. 장바구니 수정
        public void modifyCart(CartVO vo);

	// 5. 장바구니 금액 합계
        public int sumMoney(String user_id);

	// 6. 장바구니 상품 확인
        public int countCart(int product_id, String user_id);

	// 7. 장바구니 상품 수량 변경
        public void updateCart(CartVO vo);
}