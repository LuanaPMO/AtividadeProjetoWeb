package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTela2Cadastro
 */
@WebServlet("/ServletTela2Cadastro")
public class dados_trabalho extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dados_trabalho() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter resposta = response.getWriter();
    	
    	resposta.write("<html>");
        resposta.write("<head>");
        resposta.write("<title>Confirmação de registro</title>");
        resposta.write("</head>");
        resposta.write("<body>");
        resposta.write("<h3>Registro realizado com sucesso!</h3><br/><br/>");
        resposta.write("<b>Seus dados pessoais:</b><br/>");
        resposta.write(request.getParameter("nome") + " " + request.getParameter("sobrenome"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("rua"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("complemento"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("cidade"));
        resposta.write(", ");
        resposta.write(request.getParameter("cep"));
        resposta.write(", ");
        resposta.write(request.getParameter("estado"));
        resposta.write("<br/>");
        resposta.write("<b>Seus dados profissionais:</b><br/>");
        resposta.write(request.getParameter("empresa"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("ruaEmpresa"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("complementoEmpresa"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("cidadeEmpresa"));
        resposta.write(", ");
        resposta.write(request.getParameter("cepEmpresa"));
        resposta.write(", ");
        resposta.write(request.getParameter("estadoEmpresa"));
        resposta.write("</body></html>");

    }

}
/**
 * Servlet implementation class dados_trabalho
 */
@WebServlet("/dados_trabalho")
public class dados_trabalho extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dados_trabalho() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static final String EMPRESA = "empresa";
    public static final String RUAEMPRESA = "ruaEmpresa";
    public static final String COMPLEMENTOEMPRESA = "complementoEmpresa";
    public static final String CIDADEEMPRESA = "cidadeEmpresa";
    public static final String CEPEMPRESA = "cepEmpresa";
    public static final String ESTADOEMPRESA = "estadoEmpresa";
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter resposta = response.getWriter();
		
		String empresa = request.getParameter("empresa");
		String ruaEmpresa = request.getParameter("ruaEmpresa");
		String complementoEmpresa = request.getParameter("complementoEmpresa");
		String cidadeEmpresa = request.getParameter("cidadeEmpresa");
		String cepEmpresa = request.getParameter("cepEmpresa");
		String estadoEmpresa = request.getParameter("estadoEmpresa");
		
		HttpSession sessao = request.getSession();
		
		String nome = (String) sessao.getAttribute("NOME");
		String sobrenome = (String) sessao.getAttribute("SOBRENOME");
		String rua = (String) sessao.getAttribute("RUA");
		String complemento = (String) sessao.getAttribute("COMPLEMENTO");
		String cidade = (String) sessao.getAttribute("CIDADE");
		String cep = (String) sessao.getAttribute("CEP");
		String estado = (String) sessao.getAttribute("ESTADO");
		
	}

}
