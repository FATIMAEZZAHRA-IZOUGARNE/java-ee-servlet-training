package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CalculDeMonImc")
public class CalculDeMonImc extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // 🔹 Récupération des paramètres
            double poids = Double.parseDouble(request.getParameter("poids"));
            double taille = Double.parseDouble(request.getParameter("taille"));

            // 🔹 Calcul IMC
            double imc = poids / (taille * taille);

            out.println("<html><body>");
            out.println("<h2>Votre IMC est : " + imc + "</h2>");
            out.println("</body></html>");

        } catch (Exception e) {
            out.println("<html><body>");
            out.println("<h2>Erreur : veuillez saisir des valeurs valides.</h2>");
            out.println("</body></html>");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        double poids = Double.parseDouble(request.getParameter("poids"));
        double taille = Double.parseDouble(request.getParameter("taille"));

        double imc = poids / (taille * taille);

        out.println("<html><body>");
        out.println("<h2>Votre IMC est : " + imc + "</h2>");
        out.println("</body></html>");
    }

}
