/**
 * Copyright (c) 1987-2015 Fujian Fujitsu Communication Software Co., 
 * Ltd. All Rights Reserved.
 * 
 * This software is the confidential and proprietary information of 
 * Fujian Fujitsu Communication Software Co., Ltd. 
 * ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with 
 * the terms of the license agreement you entered into with FFCS.
 *
 * FFCS MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. FFCS SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package com.springstudy.service.facade.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.springstudy.facade.IHelloFacade;

/**
 * .
 * 
 * @��Ȩ��������� ��Ȩ���� (c) 2015
 * @author Administrator
 * @version Revision 1.0.0
 * @see:
 * @�������ڣ�2015��12��10��
 * @����˵����
 * 
 */
@Service
public class HelloFacadeImpl implements IHelloFacade {
	public void sayHello(){
		System.out.println("Hello facade!");
	}
	
	public String sayHello(String str){
		return "Hello facade!";
	}
	
	public ModelAndView hello(){
		ModelAndView mv = new ModelAndView();

		mv.addObject("spring", "spring mvc-service(hello)");

		mv.setViewName("/hello2");

		return mv;
	}

}
