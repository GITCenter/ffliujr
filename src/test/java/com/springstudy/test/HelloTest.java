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
package com.springstudy.test;

import org.springframework.web.servlet.ModelAndView;

import com.springstudy.service.facade.impl.HelloFacadeImpl;

import junit.framework.TestCase;

/**
 * .
 * 
 * @版权：福富软件 版权所有 (c) 2015
 * @author Administrator
 * @version Revision 1.0.0
 * @see:
 * @创建日期：2016年4月25日
 * @功能说明：
 * 
 */
public class HelloTest extends TestCase {

	/**
	 * {@inheritDoc}
	 * @see junit.framework.TestCase#setUp()
	 * @author Administrator
	 * 2016年4月25日 Administrator
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * {@inheritDoc}
	 * @see junit.framework.TestCase#tearDown()
	 * @author Administrator
	 * 2016年4月25日 Administrator
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link com.springstudy.service.facade.impl.HelloFacadeImpl#sayHello()}.
	 */
	public void testSayHello() {
		//fail("Not yet implemented");
		HelloFacadeImpl he = new HelloFacadeImpl();
		he.sayHello();
	}

	/**
	 * Test method for {@link com.springstudy.service.facade.impl.HelloFacadeImpl#sayHello(java.lang.String)}.
	 */
	public void testSayHelloString() {
		//fail("Not yet implemented");
		HelloFacadeImpl he = new HelloFacadeImpl();
		String str="hello facade!";
		String ret=he.sayHello("");
		System.out.println(ret);
		assertEquals("return value", str, ret);
	}

	/**
	 * Test method for {@link com.springstudy.service.facade.impl.HelloFacadeImpl#hello()}.
	 */
	public void testHello() {
		//fail("Not yet implemented");
		HelloFacadeImpl he = new HelloFacadeImpl();
		ModelAndView mav = new ModelAndView();
		mav = he.hello();
		System.out.println(mav);
	}

}
