package working;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EntrysheetBController {

  @RequestMapping(value = "/EntrysheetViewB", method = RequestMethod.GET)
  public ModelAndView main() {
    EntrysheetB entrysheetB = new EntrysheetB();
    ModelAndView mav = new ModelAndView();
    mav.addObject("entryname", entryname(entrysheetB)); //名前
    mav.addObject("woman", woman1(entrysheetB)); //性別
    return mav;
  }

  public String entryname(EntrysheetB b) {
    String entryname1;
    entryname1 = ("こちらのエントリーシートは：" + b.name());
    return entryname1;
  }

  public String woman1(EntrysheetB a) {
    String woman1;
    woman1 = ("性別：" + a.sex());
    return woman1;
  }


}
