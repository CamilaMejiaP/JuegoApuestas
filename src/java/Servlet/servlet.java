/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Clases.Apupersonas;
import Clases.apuestas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author david
 */
@WebServlet(name = "servlet", urlPatterns = {"/servlet"})
public class servlet extends HttpServlet {

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

            //OBJETOS PERSONAS          
            Apupersonas P1 = new Apupersonas(request.getParameter("jugador1"), Integer.parseInt(request.getParameter("valorAP1")), Integer.parseInt(request.getParameter("caballoAP1")));
            Apupersonas P2 = new Apupersonas(request.getParameter("jugador2"), Integer.parseInt(request.getParameter("valorAP2")), Integer.parseInt(request.getParameter("caballoAP2")));
            Apupersonas P3 = new Apupersonas(request.getParameter("jugador3"), Integer.parseInt(request.getParameter("valorAP3")), Integer.parseInt(request.getParameter("caballoAP3")));
            Apupersonas P4 = new Apupersonas(request.getParameter("jugador4"), Integer.parseInt(request.getParameter("valorAP4")), Integer.parseInt(request.getParameter("caballoAP4")));
            //OBJETOS AUX PERSONAS          
            Apupersonas AuxP1 = new Apupersonas(request.getParameter("jugador1"), Integer.parseInt(request.getParameter("valorAP1")), Integer.parseInt(request.getParameter("caballoAP1")));
            Apupersonas AuxP2 = new Apupersonas(request.getParameter("jugador2"), Integer.parseInt(request.getParameter("valorAP2")), Integer.parseInt(request.getParameter("caballoAP2")));
            Apupersonas AuxP3 = new Apupersonas(request.getParameter("jugador3"), Integer.parseInt(request.getParameter("valorAP3")), Integer.parseInt(request.getParameter("caballoAP3")));
            Apupersonas AuxP4 = new Apupersonas(request.getParameter("jugador4"), Integer.parseInt(request.getParameter("valorAP4")), Integer.parseInt(request.getParameter("caballoAP4")));

            //OBJETO LISTA            
            ArrayList<Apupersonas> ListPer = new ArrayList<>();

            //OBJETO APUESTAS
            apuestas Apu = new apuestas();

            //VARIABLES
            //LENAR LISTA
            ListPer.add(P1);
            ListPer.add(P2);
            ListPer.add(P3);
            ListPer.add(P4);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Juego Apuestas</title>");
            out.println("</head>");
            out.println("<body style=\"font-family: Verdana, Geneva, Tahoma, sans-serif;\">");
            out.println("<main style=\"max-width: 800px; width: 90%; margin: auto; padding: 40px;\">");
            out.println("<center><h1 style=\"color: rgb(32, 148, 184);  \">BIENVENIDO AL JUEGO!</h1></center>");
            out.println("<hr>");
            Apu.AuxListPer(AuxP1, AuxP2, AuxP3, AuxP4);

            out.println("<h3 style=\"color: grey;  \">APUESTA INICIAL: " + ListPer.toString() + "</h3>");
            out.println("<hr>");
            out.println("<h2 >RONDA " + Apu.NumRound() + "</h2>");

            out.println("<h3 style=\"color: rgb(223, 91, 58);  \">Número ganador: " + Apu.NumWin() + "</h3>");

            out.println("<h3 style=\"color: grey;  \">Caballo ganador: " + Apu.NameHose() + "</h3>");

            out.println(" <p style=\"color: grey;\">Número de ganadores: " + Apu.TotalWin(ListPer) + "</p>");

            out.println("<p style=\"color: grey;\">Nombre de los ganadores: " + Apu.NameWin(ListPer) + "</p>");

            out.println("<p style=\"color: grey;\">Suma apostada: " + Apu.Suma(ListPer) + "</p>");

            out.println("<p style=\"color: grey;\">El dinero ganado es: " + Apu.MoneyWin() + "</p>");

            Apu.UpdateMoney(ListPer);

            Apu.UpdateWallet(ListPer);
            out.println("<p style=\"color: grey;\">Billetera final: " + ListPer + "</p>");

            Apu.RemovePlay(ListPer);
            out.println("<p style=\"color: grey;\">LISTA PROXIMA RONDA: " + ListPer + "</p>");
            out.println("<h3 style=\"color: rgb(223, 91, 58);\">JUGADORES RESTANTES: " + ListPer.size() + "</h3>");
            Apu.Reset();

            do {
                //SEGUNDA RONDA
               
                out.println("<hr>");
                out.println("<h2 >RONDA " + Apu.NumRound() + "</h2>");

                out.println("<h3 style=\"color: rgb(223, 91, 58);  \">Número ganador: " + Apu.NumWin() + "</h3>");

                out.println("<h3 style=\"color: grey;  \">Caballo ganador: " + Apu.NameHose() + "</h3>");

                out.println(" <p style=\"color: grey;\">Número de ganadores: " + Apu.TotalWin(ListPer) + "</p>");

                out.println("<p style=\"color: grey;\">Nombre de los ganadores: " + Apu.NameWin(ListPer) + "</p>");

                out.println("<p style=\"color: grey;\">Suma apostada: " + Apu.Suma(ListPer) + "</p>");

                out.println("<p style=\"color: grey;\">El dinero ganado es: " + Apu.MoneyWin() + "</p>");

                Apu.SUpdateMoney(ListPer);

                Apu.UpdateWallet(ListPer);
                out.println("<p style=\"color: grey;\">Billetera final: " + ListPer + "</p>");

                Apu.RemovePlay(ListPer);
                out.println("<p style=\"color: grey;\">LISTA PROXIMA RONDA: " + ListPer + "</p>");
                out.println("<h3 style=\"color: rgb(223, 91, 58);\">JUGADORES RESTANTES: " + ListPer.size() + "</h3>");
                Apu.Reset();

                

            } while (ListPer.size() > 1);
            out.println("<a href=\"index.jsp\"><center><h3>Si desea seguir jugando,Click aqui para ir al inicio</h3></center> </a>");
            out.println("</main>");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
