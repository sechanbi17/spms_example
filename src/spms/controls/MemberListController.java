package spms.controls;

import java.util.Map;

import spms.annotation.Component;
import spms.dao.MemberDao;

@Component("/member/list.do")
public class MemberListController implements Controller {
	MemberDao memberDao;
	
	public MemberListController setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
		return this;
	}
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		// 외부에서 MemberDao 객체를 주입받을 것이라 필요없어짐
		// MemberDao memberDao = (MemberDao)model.get("memberDao"); // Map 객체에서 MemberDao를 꺼낸다.
		model.put("members", memberDao.selectList()); // 회원 목록 데이터를 Map 객체에 저장한다.

		return "/member/MemberList.jsp"; // 화면을 출력할 페이지의 URL을 반환한다.
	}
	
}
