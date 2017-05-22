package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {
	private String characterSet;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("CharactorEncoding init()");	
		characterSet = filterConfig.getInitParameter("encoding");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException{
		//��ó��(������ �����ϱ� �� - ��û ó�� ��)
		System.out.println("CharactorEncoding doFilter() - ��ó��");
		request.setCharacterEncoding(characterSet);
		//-----------------------------
		filterChain.doFilter(request, response);
		//-----------------------------
		//��ó��(������ ������ �Ŀ� ó�� - ���� ������ ��)
		System.out.println("CharactorEncoding doFilter() - ��ó��");
	}
	


	@Override
	public void destroy() {
		System.out.println("CharactorEncoding destroy()");
	}

}
