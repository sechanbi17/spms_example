package spms.controls;

import java.util.HashMap;
import java.util.Map;

import spms.annotation.Component;
import spms.bind.DataBinding;
import spms.dao.MemberDao;

@Component("/member/list.do")
public class MemberListController implements Controller, DataBinding {
	MemberDao memberDao;
	
	public MemberListController setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
		return this;
	}
	
	@Override
	public Object[] getDataBinders() {
		return new Object[] {
				"orderCond", String.class
		};
	}
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("orderCond", model.get("orderCond"));
		model.put("members", memberDao.selectList(paramMap)); // 회원 목록 데이터를 Map 객체에 저장한다.

		return "/member/MemberList.jsp"; // 화면을 출력할 페이지의 URL을 반환한다.
	}

	
	
}
