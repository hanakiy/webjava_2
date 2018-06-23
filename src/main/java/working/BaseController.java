package working;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {

  @Autowired
  private HttpSession session;

  private final String KEY_SESSION_KOTAE   = "kotae";

  protected String getKotaeFromSession() {
    return (String) session.getAttribute(KEY_SESSION_KOTAE);
  }

  protected void setKotaeFromSession(String kotae) {
    session.setAttribute(KEY_SESSION_KOTAE, kotae);
  }

  protected void removeKotaeFromSession() {
    session.removeAttribute(KEY_SESSION_KOTAE);
  }
}