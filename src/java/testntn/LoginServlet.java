package testntn;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        String em = request.getParameter("em");
        String ps = request.getParameter("ps");

        if (em.equals("testlogin@gmail.com") && ps.equals("alo")) {
            response.setContentType("text/html;charset=UTF-8");

            request.getRequestDispatcher("/checkLogin").forward(request, response);
//            response.sendRedirect("checkLogin");
        } else {
            response.setContentType("text/html;charset=UTF-8");

            out.print("Fail! aloalo");
            out.print("Email: " + em);
            request.getRequestDispatcher("/index.html").include(request, response);
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        PrintWriter out = response.getWriter();
        String em = request.getParameter("em");
        String ps = request.getParameter("ps");

        out.print("PrintWriter in Main ");

        if (em.equals("testlogin@gmail.com") && ps.equals("alo")) {
            response.setContentType("text/html;charset=UTF-8");

            request.getRequestDispatcher("/checkLogin").forward(request, response);
//            response.sendRedirect("checkLogin");
        } else {
            response.setContentType("text/html;charset=UTF-8");

            out.print("Fail! aloalo");
            out.print("Email: " + em);
            request.getRequestDispatcher("/index.html").include(request, response);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
