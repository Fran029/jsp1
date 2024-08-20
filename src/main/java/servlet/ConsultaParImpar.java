package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utiles.UtilesGeneral;

import java.io.IOException;

@WebServlet("/ConsultaParImpar")
public class ConsultaParImpar extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ConsultaParImpar() {
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

        // Retorna salida de funcion
        boolean espar = utilesgeneral.esPar(num);

        // Evalua y presenta salida de mensaje
        if (espar == true) {
            response.getWriter().append("El número " + num + " es PAR");
        } else {
            response.getWriter().append("El número " + num + " es IMPAR");
        }

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
