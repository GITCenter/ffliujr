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
package com.springstudy.facade;

import org.springframework.web.servlet.ModelAndView;

/**
 * .
 * 
 * @版权：福富软件 版权所有 (c) 2015
 * @author Administrator
 * @version Revision 1.0.0
 * @see:
 * @创建日期：2015年12月10日
 * @功能说明：
 * 
 */
public interface IHelloFacade {
	
  public void sayHello();
  /**
   * 
   * .
   * 
   * @return
   * @author Administrator
   * 2015年12月10日 Administrator
   */
  public ModelAndView hello();
}
