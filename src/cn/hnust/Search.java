package cn.hnust;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import cn.hnust.DBConnection;

public class Search extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/plain;charset=utf-8");
		String student_id = request.getParameter("id");
		System.out.println("id:" + student_id);
		
		try {
			////////////
			// do something
			////////////
			DBConnection db = new DBConnection();
			ResultSet rs = db.executeQuery("select * from que where id = '"+ student_id +"'");
			
			String id = "";
			String question = "";
			String A = "";
			String B = "";
			String C = "";
			String D = "";
			String ans = "";
			int count=0;
			ArrayList<Question> list = new ArrayList();
			while(rs.next()){
				count++;
				id=rs.getString(1);
				question=rs.getString(2);
				A=rs.getString(3);
				B=rs.getString(4);
				C=rs.getString(5);
				D=rs.getString(6);
				ans=rs.getString(7);
				Question q=new Question(id,question,A,B,C,D,ans);
				list.add(q);
			}
			db.close();
			
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			JSONObject obj = new JSONObject();
			JSONObject obj1 = new JSONObject();
			Question q1=list.get(0);
			obj1.put("result", "ok");
			obj1.put("id", q1.id);
			obj1.put("question", q1.question);
			obj1.put("A", q1.A);
			obj1.put("B", q1.B);
			obj1.put("C", q1.C);
			obj1.put("D", q1.D);
			obj1.put("ans", q1.ans);
			obj.put("question1",obj1);
			
			JSONObject obj2 = new JSONObject();
			Question q2=list.get(1);
			obj2.put("result", "ok");
			obj2.put("id", q2.id);
			obj2.put("question", q2.question);
			obj2.put("A", q2.A);
			obj2.put("B", q2.B);
			obj2.put("C", q2.C);
			obj2.put("D", q2.D);
			obj2.put("ans", q2.ans);
			obj.put("question2",obj2);
			
			JSONObject obj3 = new JSONObject();
			Question q3=list.get(2);
			obj3.put("result", "ok");
			obj3.put("id", q3.id);
			obj3.put("question", q3.question);
			obj3.put("A", q3.A);
			obj3.put("B", q3.B);
			obj3.put("C", q3.C);
			obj3.put("D", q3.D);
			obj3.put("ans", q3.ans);
			obj.put("question3",obj3);
			
			JSONObject obj4 = new JSONObject();
			Question q4=list.get(3);
			obj4.put("result", "ok");
			obj4.put("id", q4.id);
			obj4.put("question", q4.question);
			obj4.put("A", q4.A);
			obj4.put("B", q4.B);
			obj4.put("C", q4.C);
			obj4.put("D", q4.D);
			obj4.put("ans", q4.ans);
			obj.put("question4",obj4);
			
			System.out.println(obj.toString());
			out.print(obj.toString());
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void doSearch(String student_id) {
		try {
			
			DBConnection db = new DBConnection();
			ResultSet rs = db.executeQuery("select * from que where id = '"+ student_id +"'" );
			
			String id = "";
			String question = "";
			String A = "";
			String B = "";
			String C = "";
			String D = "";
			String ans = "";
			while(rs.next()){
				id=rs.getString(1);
				question=rs.getString(2);
				A=rs.getString(3);
				B=rs.getString(4);
				C=rs.getString(5);
				D=rs.getString(6);
				ans=rs.getString(7);
			}
			db.close();
			
			JSONObject obj = new JSONObject();
			
			obj.put("result", "ok");
			obj.put("id", id);
			obj.put("question", question);
			obj.put("A", A);
			obj.put("B", B);
			obj.put("C", C);
			obj.put("D", D);
			obj.put("ans", ans);
			
			System.out.println(obj.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		doSearch("2");
	}

}
