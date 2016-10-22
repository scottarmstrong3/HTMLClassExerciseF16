/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elon.edu.events;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author scottarmstrong
 */
public class HalloweenServlet extends HttpServlet {

  @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
      String action = request.getParameter("action");
      String url = "";
      
        if (action != null) {
          
            url = "/subscribe.html";
            
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String zipCode = request.getParameter("zipCode");
            
            System.out.println("firstName=" + firstName);
            System.out.println("lastName=" + lastName);
            System.out.println("email=" + email);
            System.out.println("zipCode=" + zipCode);
          
        } else {
          url = "/index.html";
        }
              
       getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
       doPost(request, response);
    }

}
