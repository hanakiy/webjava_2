package working;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WorkingController {

    @RequestMapping(value = "/WorkingView", method = RequestMethod.GET)
    public ModelAndView main() {
      SE se = new SE();
      Keiri keiri = new Keiri();
      Seshain seshain =  new Seshain();
      Keiyakushain keiyaku = new Keiyakushain();
      ModelAndView mav = new ModelAndView();
      mav.addObject("se", se(se)); //SEのPC作業
      mav.addObject("semorning", semorning(se)); //SEの朝礼
      mav.addObject("keiri", keiri(keiri)); //経理のPC作業
      mav.addObject("keirimorning", keirimorning(keiri)); //経理の朝礼
      mav.addObject("shigoto", shigoto(seshain)); //正社員の勤務地の表示
      mav.addObject("okane", okane1(seshain)); //正社員のお給料の表示
      mav.addObject("shigotokei", shigotokei(keiyaku)); //契約社員の勤務地の表示
      mav.addObject("okanekei", okanekei(keiyaku)); //契約社員のお給料の表示
      return mav;
    }
    /*
    @RequestMapping(value="/WorkingView", method = RequestMethod.POST)
    private ModelAndView order(@Valid WorkingForm workingform, BindingResult bindingResult, HttpServletRequest request) {
      StringBuilder SEMsg = new StringBuilder();
      String selectedSE = workingform.getSeletedSE();

      if (selectSE.equals(pc.getName()) {
        String shigoto = se.pc();
      } else {
        String shigoto = se.chorei();
        SEMsg.append(shigoto);
      }

      SEMsg.append("が仕事です。");
      set.shigotoFormSession()
    }*/


    public String se(SE a) {
      String se1;
      se1 = ("SEのPC作業：" + a.pc());
      return se1;
    }

    public String semorning(SE b) {
      String se2;
      se2 = ("SEの朝礼作業：" + b.chorei());
      return se2;
    }

    public String keiri(Keiri a) {
      String keiri1;
      keiri1 = ("経理のPC作業：" + a.pc());
      return keiri1;
    }

    public String keirimorning(Keiri b) {
      String keiri2;
      keiri2 = ("経理の朝礼作業：" + b.chorei());
      return keiri2;
    }

    public String shigoto(Seshain a) {
      String shigoto1;
      shigoto1 = ("勤務先：" + a.kinmusaki());
      return shigoto1;
    }

    public String okane1(Seshain b) {
      String okane1;
      okane1 = ("お給料：" + b.kyuyo() + "円");
      return okane1;
    }

    public String shigotokei(Keiyakushain a) {
      String shigoto2;
      shigoto2 = ("勤務先：" + a.kinmusaki());
      return shigoto2;
    }

    public String okanekei(Keiyakushain b) {
      String okane2;
      okane2 = ("お給料：" + b.kyuyo() + "円");
      return okane2;
    }



}
