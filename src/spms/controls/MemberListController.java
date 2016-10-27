package spms.controls;

import java.util.Map;

import spms.dao.MemberDao;

public class MemberListController implements Controller {
	MemberDao memberDao;
	
	public MemberListController setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
		return this;
	}
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		// �ܺο��� MemberDao ��ü�� ���Թ��� ���̶� �ʿ������
		// MemberDao memberDao = (MemberDao)model.get("memberDao"); // Map ��ü���� MemberDao�� ������.
		model.put("members", memberDao.selectList()); // ȸ�� ��� �����͸� Map ��ü�� �����Ѵ�.

		return "/member/MemberList.jsp"; // ȭ���� ����� �������� URL�� ��ȯ�Ѵ�.
	}
	
}
