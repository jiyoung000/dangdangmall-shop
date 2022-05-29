package com.spring.mall.cart.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mall.cart.dao.CartDAO;
import com.spring.mall.cart.service.CartService;
import com.spring.mall.cart.vo.CartVO;

@Service("cartService")
public class CartServiceImpl implements CartService{
	

	@Autowired
	private CartDAO cartDAO;
	
	public CartServiceImpl() {
		System.out.println(">> CartServiceImpl() 객체 생성 ");
	}
	

    // 1. 장바구니 추가
    @Override
    public void insert(CartVO vo) {
        cartDAO.insert(vo);
    }
    // 2. 장바구니 목록
//    @Override
//    public List<CartVO> listCart(String user_id) {
//        return cartDAO.listCart(user_id);
//    }
    @Override
    public List<CartVO> listCart(CartVO vo) {
    	return cartDAO.listCart(vo);
    }
    // 3. 장바구니 삭제
    @Override
    public void delete(int cart_id) {
        cartDAO.delete(cart_id);
    }
    // 4. 장바구니 수정
    @Override
    public void modifyCart(CartVO vo) {
        cartDAO.modifyCart(vo);
    }
    // 5. 장바구니 금액 합계
    @Override
    public int sumMoney(String user_id) {
        return cartDAO.sumMoney(user_id);
    }
    // 6. 장바구니 상품 확인
    @Override
    public int countCart(int product_id, String user_id) {
        return cartDAO.countCart(product_id, user_id);
    }
    // 7. 장바구니 상품 수량 변경
    @Override
    public void updateCart(CartVO vo) {
        cartDAO.updateCart(vo);
    }

}