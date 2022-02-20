package guessingGame;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/question")
public class Question extends HttpServlet {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
	String one = req.getParameter("one");
	String two = req.getParameter("two");
	String three = req.getParameter("three");
	PrintWriter out = res.getWriter();
	out.print(one + two + three);
	//System.out.println(three);
	//RequestDispatcher rd = req.getRequestDispatcher("error.jsp");
	//rd.forward(req,res);
	try {
		if (one == null || two == null || three == null ) {
			RequestDispatcher rd = req.getRequestDispatcher("error.jsp");
			rd.forward(req,res);
		}
	/*	else if(two == null) {
			RequestDispatcher rd = req.getRequestDispatcher("error.jsp");
			rd.forward(req,res);	
		}
		else if(three==null) {
			RequestDispatcher rd = req.getRequestDispatcher("error.jsp");
			rd.forward(req,res);
		}*/
		
		else {
	
	if ((one.equals("red") && two.equals("dessert"))&& three.equals("action")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","Adventure Lover");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("red") && two.equals("dessert"))&& three.equals("horror")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","faithful");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("red") && two.equals("dessert"))&& three.equals("drama")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","wise");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("red") && two.equals("dessert"))&& three.equals("fantasy")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","thoughtful");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("red") && two.equals("polar night"))&& three.equals("action")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","skillful");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("red") && two.equals("polar night"))&& three.equals("horror")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","sly");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("red") && two.equals("polar night"))&& three.equals("drama")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","talented");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("red") && two.equals("polar night"))&& three.equals("fantasy")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","misesrable");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("red") && two.equals("rain forest"))&& three.equals("action")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","grumpy");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("red") && two.equals("rain forest"))&& three.equals("horror")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","foolish");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("red") && two.equals("rain forest"))&& three.equals("drama")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","Annoyed");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("red") && two.equals("rain forest"))&& three.equals("fantasy")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","strict");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("red") && two.equals("sea"))&& three.equals("action")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","rude");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("red") && two.equals("sea"))&& three.equals("horror")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","mannerly");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("red") && two.equals("sea"))&& three.equals("drama")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","calm");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("red") && two.equals("sea"))&& three.equals("fantasy")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","energitic");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	
	
	else if ((one.equals("black") && two.equals("dessert"))&& three.equals("action")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","witty");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("black") && two.equals("dessert"))&& three.equals("horror")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","mature");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("black") && two.equals("dessert"))&& three.equals("drama")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","curious");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("black") && two.equals("dessert"))&& three.equals("fanstasy")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","quiet");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("black") && two.equals("polar night"))&& three.equals("action")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","ambitious");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("black") && two.equals("polar night"))&& three.equals("horror")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","cooperative");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("black") && two.equals("polar night"))&& three.equals("drama")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","lucky");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("black") && two.equals("polar night"))&& three.equals("fantasy")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","helpful");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("black") && two.equals("rain forest"))&& three.equals("action")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","eager");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("black") && two.equals("rain forest"))&& three.equals("horror")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","mysterious");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("black") && two.equals("rain forest"))&& three.equals("drama")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","proud");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("black") && two.equals("rain forest"))&& three.equals("fantasy")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","loving");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("black") && two.equals("sea"))&& three.equals("action")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","gentle");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("black") && two.equals("sea"))&& three.equals("horror")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","bossy");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("black") && two.equals("sea"))&& three.equals("drama")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","demanding");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("black") && two.equals("sea"))&& three.equals("fantasy")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","leader");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	
	
	
	else if ((one.equals("green") && two.equals("dessert"))&& three.equals("action")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","conceited");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("green") && two.equals("dessert"))&& three.equals("horror")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","polite");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("green") && two.equals("dessert"))&& three.equals("drama")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","cautious");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("green") && two.equals("dessert"))&& three.equals("fanstasy")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","helpful");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("green") && two.equals("polar night"))&& three.equals("action")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","responsible");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("green") && two.equals("polar night"))&& three.equals("horror")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","successful");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("green") && two.equals("polar night"))&& three.equals("drama")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","patriotic");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("green") && two.equals("polar night"))&& three.equals("fantasy")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","lazy");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("green") && two.equals("rain forest"))&& three.equals("action")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","charming");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("green") && two.equals("rain forest"))&& three.equals("horror")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","daring");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("green") && two.equals("rain forest"))&& three.equals("drama")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","hard working");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("green") && two.equals("rain forest"))&& three.equals("fantasy")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","mischievous");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("green") && two.equals("sea"))&& three.equals("action")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","honest");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("green") && two.equals("sea"))&& three.equals("horror")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","intelligent");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("green") && two.equals("sea"))&& three.equals("drama")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","studious");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("green") && two.equals("sea"))&& three.equals("fantasy")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","carefree");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	
	
	else if ((one.equals("blue") && two.equals("dessert"))&& three.equals("action")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","independent");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("blue") && two.equals("dessert"))&& three.equals("horror")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","creative");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("blue") && two.equals("dessert"))&& three.equals("drama")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","brilliant");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("blue") && two.equals("dessert"))&& three.equals("fanstasy")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","imaginative");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("blue") && two.equals("polar night"))&& three.equals("action")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","considerate");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("blue") && two.equals("polar night"))&& three.equals("horror")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","respectful");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("blue") && two.equals("polar night"))&& three.equals("drama")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","self-confident");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("blue") && two.equals("polar night"))&& three.equals("fantasy")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","generous");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("blue") && two.equals("rain forest"))&& three.equals("action")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","selfish");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("blue") && two.equals("rain forest"))&& three.equals("horror")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","gullible");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("blue") && two.equals("rain forest"))&& three.equals("drama")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","stubborn");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("blue") && two.equals("rain forest"))&& three.equals("fantasy")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","resourceful");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("blue") && two.equals("sea"))&& three.equals("action")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","serious");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("blue") && two.equals("sea"))&& three.equals("horror")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","courageous");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("blue") && two.equals("sea"))&& three.equals("drama")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","brave");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	else if ((one.equals("blue") && two.equals("sea"))&& three.equals("fantasy")) {
		HttpSession session = req.getSession(); 
		session.setAttribute("answer","humble");
		res.sendRedirect("result.jsp");
		//RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
		//rd.forward(req,res);
		System.out.println("get");
	}
	
		}
	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
