package working;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EntryFinishController {

  @RequestMapping(value = "/EntryFinish", method = RequestMethod.GET)
  public ModelAndView main() {
    EntryFinish finish = new EntryFinish();
    ModelAndView mav = new ModelAndView();
    mav.addObject("finish", finishmessage(finish));
    return mav;
  }

  public String finishmessage(EntryFinish EntryFnish) {
    String finishmessage1;
    finishmessage1 = (EntryFnish.EntryFinishA());
    return finishmessage1;
  }
  
}