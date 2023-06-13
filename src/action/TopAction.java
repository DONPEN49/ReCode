package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import Calender.CalenderView;

public class TopAction extends Action {

	@Override
	public String execute(HttpServletRequest request) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		HttpSession session = request.getSession();
		int month = 1;
		CalenderView calendar = new CalenderView();

		//リストにその月の情報取得
		ArrayList<ArrayList<Integer>> matrix = calendar.getCalederData(month);

		request.setAttribute("calender", matrix);

		return "/top.jsp";
	}

}
