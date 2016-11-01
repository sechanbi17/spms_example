package spms.controls;

import java.util.HashMap;
import java.util.Map;

import spms.annotation.Component;
import spms.bind.DataBinding;
import spms.dao.MemberDao;
import spms.dao.ProjectDao;

@Component("/project/list.do")
public class ProjectListController implements Controller, DataBinding {
	ProjectDao projectDao;
	
	public ProjectListController setMemberDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
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
		
		model.put("projects", projectDao.selectList(paramMap)); // 회원 목록 데이터를 Map 객체에 저장한다.

		return "/project/ProjectList.jsp"; // 화면을 출력할 페이지의 URL을 반환한다.
	}

	

}
