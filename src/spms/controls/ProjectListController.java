package spms.controls;

import java.util.Map;

import spms.annotation.Component;
import spms.dao.MemberDao;
import spms.dao.ProjectDao;

@Component("/project/list.do")
public class ProjectListController implements Controller {
	ProjectDao projectDao;
	
	public ProjectListController setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
		return this;
	}
	
	@Override
	public String execute(Map<String, Object> model) throws Exception {
		model.put("projects", projectDao.selectList()); // 회원 목록 데이터를 Map 객체에 저장한다.

		return "/project/ProjectList.jsp"; // 화면을 출력할 페이지의 URL을 반환한다.
	}

}
