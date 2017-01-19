package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TestWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	//ContextLoaderListener가 로딩하는 RootApplication Context이다. 
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { RootConfig.class };
	}
	//DispatcherServlet에서 사용될 컨트롤러,뷰 리졸버, 핸들러 매핑과 같은 웹 컴포넌트가 포함된 빈을 로딩한다.
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}
	
	//기존 web.xml에서 servlet을 설정할 때 매핑 URL을 설정하는 곳이다.
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
