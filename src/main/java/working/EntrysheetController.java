package working;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller

public class EntrysheetController {



  @RequestMapping(value = "/EntrysheetViewA", method = RequestMethod.GET)

  public ModelAndView main() {

    EntrysheetA entrysheetA = new EntrysheetA();

    ModelAndView mav = new ModelAndView();

    mav.addObject("entryname", entryname(entrysheetA)); //名前

    mav.addObject("man", man1(entrysheetA)); //性別

    return mav;

  }



  public String entryname(EntrysheetA b) {

    String entryname1;

    entryname1 = ("こちらのエントリーシートは：" + b.name());

    return entryname1;

  }



  public String man1(EntrysheetA a) {

    String man1;

    man1 = ("性別：" + a.sex());

    return man1;

  }

}