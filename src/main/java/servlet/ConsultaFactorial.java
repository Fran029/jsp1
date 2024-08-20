package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utiles.UtilesGeneral;

import java.io.IOException;
@WebServlet("/ConsultaFactorial")
public class ConsultaFactorial extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaFactorial() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());

        // Incluye librerias Java requeridas
        UtilesGeneral utilesgeneral = new UtilesGeneral();

        // Obtener Numero desde request
        int num = Integer.parseInt(request.getParameter("num"));

        // Llama a metodo para obtener factorial del numero indicado
        double factorial = utilesgeneral.getFactorial(num);

        // Respuesta de salida servlet
        response.getWriter().append("El factorial de " + num + " es " + factorial);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}

