package working;

import org.springframework.web.servlet.ModelAndView;

public class SessionView extends ModelAndView {

  public SessionView(String kotae, String yesName, String noName) {
    this.addObject("kotae", kotae);
    this.addObject("yesName", yesName);
    this.addObject("noName", noName);
  }
}
