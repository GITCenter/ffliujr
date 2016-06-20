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
package com.springstudy.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springstudy.facade.IHelloFacade;
import com.springstudy.facade.IShowviewFacade;
import com.springstudy.facade.ITestFacade;
import com.springstudy.service.facade.impl.TestFacadeImpl;

/**
 * .
 * 
 * @��Ȩ��������� ��Ȩ���� (c) 2015
 * @author Administrator
 * @version Revision 1.0.0
 * @see:
 * @�������ڣ�2015��12��2��
 * @����˵����
 * 
 */
@SuppressWarnings("serial")
@Controller
public class HelloController implements java.io.Serializable {
	/**
	 * .
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private TestFacadeImpl testFacade2;
	
	@Autowired
	private ITestFacade testFacade;
	
	@Resource
	private IHelloFacade helloFacade;
	
	@Resource(name="showView")
	private IShowviewFacade showViewFacade;

	@RequestMapping("/hello")
	public ModelAndView hello() {

		ModelAndView mv = new ModelAndView();

		mv.addObject("spring", "spring mvc");

		mv.setViewName("/WEB-INF/views/hello");

		return mv;

	}

	@RequestMapping("/hello2")
	public ModelAndView hello2() {

		ModelAndView mv = new ModelAndView();

		mv.addObject("spring", "spring mvc");

		mv.setViewName("/hello2");

		return mv;

	}

	@RequestMapping("/testFacade")
	public void testFacade() {

		testFacade2.showView();

	}
	
	@RequestMapping("/testFacade2")
	public void testFacade2() {

		testFacade.showView();

	}	
	
	@RequestMapping("/helloFacade")
	public void helloFacade(){
		helloFacade.sayHello();
	}
	
	@RequestMapping("/sayHello")
	public ModelAndView sayHello(){
		return helloFacade.hello();
	}
	
	@RequestMapping("/showView")
	public ModelAndView showView(){
		return showViewFacade.showView();
	}

}
