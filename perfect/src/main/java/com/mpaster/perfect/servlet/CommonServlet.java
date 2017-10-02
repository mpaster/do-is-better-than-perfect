package com.mpaster.perfect.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mpaster.perfect.core.DispatchProcessor;
import com.mpaster.perfect.core.ViewModel;

/**
 * Servlet implementation class CommonServlet
 */
public class CommonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		response.setCharacterEncoding("utf-8");
		response.getWriter().append("blog list will be here.");
		String contextPath = request.getContextPath();
		String servletPath = request.getServletPath();
		System.out.println("当前请求路径为："+contextPath + servletPath);
		ViewModel viewModel = DispatchProcessor.dispatchRequest(servletPath, id);
		response.getWriter().append("当前请求路径为："+contextPath + servletPath +
				"执行后返回的内容为："+viewModel.getModel().get("id"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
